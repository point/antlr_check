(ns antlr-check.js
   (:gen-class)
   (:import 
      (org.antlr.v4.runtime ANTLRInputStream CommonTokenStream BaseErrorListener)
      ECMAScriptLexer
      ECMAScriptParser
      AST
      ))

(defn js []
  (let [error-h (proxy [org.antlr.v4.runtime.BaseErrorListener] []
                  (syntaxError [& args]
                    (throw (ex-info "syntaxError" {}))))
        files (->> 
                "code/js" 
                clojure.java.io/file 
                file-seq 
                (filter #(->> % .toString (re-find #"\.js$"))))
        pos (atom 0)
        neg (atom 0)]
    (doseq [f files]
      (let [parser (->
                     (.toString f)
                     slurp
                     ANTLRInputStream.
                     ECMAScriptLexer.
                     CommonTokenStream.
                     ECMAScriptParser.)]
        (.removeErrorListeners parser)
        (.addErrorListener parser error-h)
        (try
          (.program parser)
          (print "+")
          (println (.toString f))
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

