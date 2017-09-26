(ns antlr-check.c
  (:import 
    (org.antlr.v4.runtime ANTLRInputStream CommonTokenStream BaseErrorListener)
    CLexer
    CParser
    CPP14Lexer
    CPP14Parser
    AST
    ))
(defn c []
  (let [error-h (proxy [org.antlr.v4.runtime.BaseErrorListener] []
                  (syntaxError [& args]
                    (throw (ex-info "syntaxError" {}))))
        files (->> 
                "code/c" 
                clojure.java.io/file 
                file-seq 
                (filter #(->> % .toString (re-find #"\.c"))))
        pos (atom 0)
        neg (atom 0)]
    (doseq [f files]
      (let [parser (->
                     (.toString f)
                     slurp
                     ANTLRInputStream.
                     CPP14Lexer.
                     CommonTokenStream.
                     CPP14Parser.)]
        (.removeErrorListeners parser)
        (.addErrorListener parser error-h)
        (try
          ;(-> parser .primaryExpression )
          (-> parser .primaryexpression )
          (print "+")
          (flush)
          (swap! pos inc)
          (catch Exception e
            ;(println e)
            (print "-")
            (flush)
            (swap! neg inc)
            ))))
    (println "")
    (println "Success: " @pos)
    (println "Error: " @neg)
    (println "Total: " (count files))
    ))
