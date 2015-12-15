(ns io.ramekin.math
  (:require [io.ramekin.units :refer [convert]]))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x (str "Hello, World!" (convert 5 :clicks :mi))))
