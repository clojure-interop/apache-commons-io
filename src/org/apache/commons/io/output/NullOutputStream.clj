(ns org.apache.commons.io.output.NullOutputStream
  "This OutputStream writes all data to the famous /dev/null.

  This output stream has no destination (file/socket etc.) and all
  bytes written to it are ignored and lost."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.output NullOutputStream]))

(defn ->null-output-stream
  "Constructor."
  (^NullOutputStream []
    (new NullOutputStream )))

(def *-null-output-stream
  "Static Constant.

  A singleton.

  type: org.apache.commons.io.output.NullOutputStream"
  NullOutputStream/NULL_OUTPUT_STREAM)

(defn write
  "Does nothing - output to /dev/null.

  b - The bytes to write - `byte[]`
  off - The start offset - `int`
  len - The number of bytes to write - `int`"
  ([^NullOutputStream this b ^Integer off ^Integer len]
    (-> this (.write b off len)))
  ([^NullOutputStream this ^Integer b]
    (-> this (.write b))))

