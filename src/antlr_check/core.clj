(ns antlr-check.core
   (:gen-class)
   (:require 
     [antlr-check.php]
     [antlr-check.css3]
     [antlr-check.python3]
     [antlr-check.java]
     [antlr-check.js]
   ))



(defn- main []
  (antlr-check.java/java))
