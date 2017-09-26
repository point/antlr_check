(ns antlr-check.php
   (:import 
      (org.antlr.v4.runtime ANTLRInputStream CommonTokenStream BaseErrorListener)
      PHPLexer
      PHPParser
      AST
      ))

(defn php []
  (let [error-h (proxy [org.antlr.v4.runtime.BaseErrorListener] []
                  (syntaxError [& args]
                    (throw (ex-info "syntaxError" {}))))
        files (->> 
                "code/php" 
                clojure.java.io/file 
                file-seq 
                (filter #(->> % .toString (re-find #"\.php"))))
        pos (atom 0)
        neg (atom 0)]
    (doseq [f files]
    ;(let [f (nth files 1)]
      ;(println (.toString f))
      (let [parser (->
                     (.toString f)
                     slurp
                     ANTLRInputStream.
                     PHPLexer.
                     CommonTokenStream.
                     PHPParser.)]
        (.removeErrorListeners parser)
        (.addErrorListener parser error-h)
        (try
          ;(print (.toStringTree (.htmlDocument parser)))
          (.htmlDocument parser)
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
