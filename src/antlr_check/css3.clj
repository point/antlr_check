(ns antlr-check.css3
   (:gen-class)
   (:import 
      (org.antlr.v4.runtime ANTLRInputStream CommonTokenStream BaseErrorListener)
      css3Lexer
      css3Parser
      AST
      ))
(defn css3 []
  (let [error-h (proxy [org.antlr.v4.runtime.BaseErrorListener] []
                  (syntaxError [& args]
                    (throw (ex-info "syntaxError" {}))))
        files (->> 
                "code/css3" 
                clojure.java.io/file 
                file-seq 
                (filter #(->> % .toString (re-find #"\.css"))))
        pos (atom 0)
        neg (atom 0)]
    (doseq [f files]
      (let [parser (->
                     (.toString f)
                     slurp
                     ANTLRInputStream.
                     css3Lexer.
                     CommonTokenStream.
                     css3Parser.)]
        (.removeErrorListeners parser)
        (.addErrorListener parser error-h)
        (try
          (.stylesheet parser)
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
