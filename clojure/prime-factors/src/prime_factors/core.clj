(ns prime-factors.core)

(defn factors-for [n]
  (loop [n n
         factors []
         divisor 2]
    (cond
      (= n 1) factors
      (= (rem n divisor) 0) (recur (int (/ n divisor)) (conj factors divisor) divisor)
      :else (recur n factors (inc divisor)))))
