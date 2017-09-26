(ns antlr-check.ruby
  (:import 
    (org.antlr.v4.runtime ANTLRInputStream CommonTokenStream BaseErrorListener)
    CorundumLexer
    CorundumParser
    AST
    ))
(defn ruby []
  (let [error-h (proxy [org.antlr.v4.runtime.BaseErrorListener] []
                  (syntaxError [& args]
                    (throw (ex-info "syntaxError" {}))))
        files (->> 
                "code/ruby" 
                clojure.java.io/file 
                file-seq 
                (filter #(->> % .toString (re-find #"\.rb"))))
        pos (atom 0)
        neg (atom 0)]
    (doseq [f files]
      (let [parser (->
                     (.toString f)
                     slurp
                     ANTLRInputStream.
                     CorundumLexer.
                     CommonTokenStream.
                     CorundumParser.)]
        (.removeErrorListeners parser)
        (.addErrorListener parser error-h)
        (try
          (-> parser .prog .toStringTree)
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
