(ns apogee.util)

(defn ^:export format
"A Terrible replacement for clojure.core/format needed for trivial formatting requirement"
  ([n float-number] (.toFixed float-number n)))

