(ns prob-spec.half-truth)

(defn half-truth
  [x & xs]
  (cond
    (empty? xs) false
    (and (true? x) (some false? xs)) true
    (and (false? x) (some true? xs)) true
    :else false))

