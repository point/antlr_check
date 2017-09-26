(ns antlr-check.java
   (:gen-class)
   (:import 
      (org.antlr.v4.runtime ANTLRInputStream CommonTokenStream BaseErrorListener)
      Java8Lexer
      Java8Parser
      AST
      ))
(defn java []
  (let [error-h (proxy [org.antlr.v4.runtime.BaseErrorListener] []
                  (syntaxError [& args]
                    (throw (ex-info "syntaxError" {}))))
        files (->> 
                "code/java" 
                clojure.java.io/file 
                file-seq 
                (filter #(->> % .toString (re-find #"\.java$"))))
        pos (atom 0)
        neg (atom 0)]
    (doseq [f files]
      (let [parser (->
                     (.toString f)
                     slurp
                     ANTLRInputStream.
                     Java8Lexer.
                     CommonTokenStream.
                     Java8Parser.)]
        (.removeErrorListeners parser)
        (.addErrorListener parser error-h)
        (try
          (-> parser .compilationUnit .toStringTree)
          ;(.compilationUnit parser)
          (print "+")
          (flush)
          (swap! pos inc)
          (catch Exception e
            (println e)
            (print "-")
            (flush)
            (swap! neg inc)
            ))))
    (println "")
    (println "Success: " @pos)
    (println "Error: " @neg)
    (println "Total: " (count files))
    ))
