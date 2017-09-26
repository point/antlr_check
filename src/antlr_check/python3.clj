(ns antlr-check.python3
   (:gen-class)
   (:import 
      (org.antlr.v4.runtime ANTLRInputStream CommonTokenStream BaseErrorListener)
      Python3Lexer
      Python3Parser
      AST
      ))

(defn python3 []
  (let [error-h (proxy [org.antlr.v4.runtime.BaseErrorListener] []
                  (syntaxError [& args]
                    (throw (ex-info "syntaxError" {}))))
        files (->> 
                "code/python3" 
                clojure.java.io/file 
                file-seq 
                (filter #(->> % .toString (re-find #"\.py"))))
        pos (atom 0)
        neg (atom 0)]
    (doseq [f files]
      (let [parser (->
                     (.toString f)
                     slurp
                     ANTLRInputStream.
                     Python3Lexer.
                     CommonTokenStream.
                     Python3Parser.)]
        (.removeErrorListeners parser)
        (.addErrorListener parser error-h)
        (try
          (.file_input parser)
          (print "+")
          (flush)
          (swap! pos inc)
          (catch Exception e
            (print "-")
            (flush)
            (swap! neg inc)
            ))))
    (println "")
    (println "Success: " @pos)
    (println "Error: " @neg)
    (println "Total: " (count files))
    ))
