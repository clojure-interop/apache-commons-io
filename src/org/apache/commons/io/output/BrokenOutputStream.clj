(ns org.apache.commons.io.output.BrokenOutputStream
  "Broken output stream. This stream always throws an IOException from
  all OutputStream methods.

  This class is mostly useful for testing error handling in code that uses an
  output stream."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.output BrokenOutputStream]))

(defn ->broken-output-stream
  "Constructor.

  Creates a new stream that always throws the given exception.

  exception - the exception to be thrown - `java.io.IOException`"
  (^BrokenOutputStream [^java.io.IOException exception]
    (new BrokenOutputStream exception))
  (^BrokenOutputStream []
    (new BrokenOutputStream )))

(defn write
  "Throws the configured exception.

  b - ignored - `int`

  throws: java.io.IOException - always thrown"
  ([^BrokenOutputStream this ^Integer b]
    (-> this (.write b))))

(defn flush
  "Throws the configured exception.

  throws: java.io.IOException - always thrown"
  ([^BrokenOutputStream this]
    (-> this (.flush))))

(defn close
  "Throws the configured exception.

  throws: java.io.IOException - always thrown"
  ([^BrokenOutputStream this]
    (-> this (.close))))

