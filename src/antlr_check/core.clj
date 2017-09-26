(ns antlr-check.core
   (:gen-class)
   (:require 
     [antlr-check.php]
     [antlr-check.css3]
     [antlr-check.python3]
     [antlr-check.java]
     [antlr-check.js]
     [antlr-check.ruby]
     [antlr-check.c]
   ))



(defn- main []
  (antlr-check.java/java))
