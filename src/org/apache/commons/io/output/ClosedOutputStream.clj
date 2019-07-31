(ns org.apache.commons.io.output.ClosedOutputStream
  "Closed output stream. This stream throws an exception on all attempts to
  write something to the stream.

  Typically uses of this class include testing for corner cases in methods
  that accept an output stream and acting as a sentinel value instead of
  a null output stream."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.output ClosedOutputStream]))

(defn ->closed-output-stream
  "Constructor."
  (^ClosedOutputStream []
    (new ClosedOutputStream )))

(def *-closed-output-stream
  "Static Constant.

  A singleton.

  type: org.apache.commons.io.output.ClosedOutputStream"
  ClosedOutputStream/CLOSED_OUTPUT_STREAM)

(defn write
  "Throws an IOException to indicate that the stream is closed.

  b - ignored - `int`

  throws: java.io.IOException - always thrown"
  ([^ClosedOutputStream this ^Integer b]
    (-> this (.write b))))

(defn flush
  "Throws an IOException to indicate that the stream is closed.

  throws: java.io.IOException - always thrown"
  ([^ClosedOutputStream this]
    (-> this (.flush))))

