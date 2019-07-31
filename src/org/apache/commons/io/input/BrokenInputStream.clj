(ns org.apache.commons.io.input.BrokenInputStream
  "Broken input stream. This stream always throws an IOException from
  all the InputStream methods where the exception is declared.

  This class is mostly useful for testing error handling in code that uses an
  input stream."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.input BrokenInputStream]))

(defn ->broken-input-stream
  "Constructor.

  Creates a new stream that always throws the given exception.

  exception - the exception to be thrown - `java.io.IOException`"
  (^BrokenInputStream [^java.io.IOException exception]
    (new BrokenInputStream exception))
  (^BrokenInputStream []
    (new BrokenInputStream )))

(defn read
  "Throws the configured exception.

  returns: nothing - `int`

  throws: java.io.IOException - always thrown"
  (^Integer [^BrokenInputStream this]
    (-> this (.read))))

(defn available
  "Throws the configured exception.

  returns: nothing - `int`

  throws: java.io.IOException - always thrown"
  (^Integer [^BrokenInputStream this]
    (-> this (.available))))

(defn skip
  "Throws the configured exception.

  n - ignored - `long`

  returns: nothing - `long`

  throws: java.io.IOException - always thrown"
  (^Long [^BrokenInputStream this ^Long n]
    (-> this (.skip n))))

(defn reset
  "Throws the configured exception.

  throws: java.io.IOException - always thrown"
  ([^BrokenInputStream this]
    (-> this (.reset))))

(defn close
  "Throws the configured exception.

  throws: java.io.IOException - always thrown"
  ([^BrokenInputStream this]
    (-> this (.close))))

