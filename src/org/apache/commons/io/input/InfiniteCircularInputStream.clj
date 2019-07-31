(ns org.apache.commons.io.input.InfiniteCircularInputStream
  "An InputStream that infinitely repeats provided bytes.

  Closing a InfiniteCircularInputStream has no effect. The methods in
  this class can be called after the stream has been closed without generating
  an IOException."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.input InfiniteCircularInputStream]))

(defn ->infinite-circular-input-stream
  "Constructor.

  Creates a InfiniteCircularStream from the specified array of chars.

  repeated-content - Input buffer to be repeated (not copied) - `byte[]`"
  (^InfiniteCircularInputStream [repeated-content]
    (new InfiniteCircularInputStream repeated-content)))

(defn read
  "returns: `int`"
  (^Integer [^InfiniteCircularInputStream this]
    (-> this (.read))))

