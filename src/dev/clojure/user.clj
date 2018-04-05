(ns user
  (:require [clojure.tools.namespace.repl :as repl]))

(defn go []
  (println "Go!"))

(defn reset []
  (repl/refresh :after 'user/go))
