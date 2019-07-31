(ns org.apache.commons.io.input.ClosedInputStream
  "Closed input stream. This stream returns EOF to all attempts to read
  something from the stream.

  Typically uses of this class include testing for corner cases in methods
  that accept input streams and acting as a sentinel value instead of a
  null input stream."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.input ClosedInputStream]))

(defn ->closed-input-stream
  "Constructor."
  (^ClosedInputStream []
    (new ClosedInputStream )))

(def *-closed-input-stream
  "Static Constant.

  A singleton.

  type: org.apache.commons.io.input.ClosedInputStream"
  ClosedInputStream/CLOSED_INPUT_STREAM)

(defn read
  "Returns -1 to indicate that the stream is closed.

  returns: always -1 - `int`"
  (^Integer [^ClosedInputStream this]
    (-> this (.read))))

