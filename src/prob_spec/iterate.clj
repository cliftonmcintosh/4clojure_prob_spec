(ns prob-spec.iterate)


(defn my-iter [f x] (lazy-seq (cons x (my-iter f (f x)))))