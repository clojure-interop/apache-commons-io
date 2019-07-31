(ns org.apache.commons.io.output.AppendableOutputStream
  "OutputStream implementation that writes the data to an Appendable
  Object.

  For example, can be used with any Writer or a StringBuilder
  or StringBuffer."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.output AppendableOutputStream]))

(defn ->appendable-output-stream
  "Constructor.

  Construct a new instance with the specified appendable.

  appendable - the appendable to write to - `T`"
  (^AppendableOutputStream [appendable]
    (new AppendableOutputStream appendable)))

(defn write
  "Write a character to the underlying appendable.

  b - the character to write - `int`

  throws: java.io.IOException - upon error"
  ([^AppendableOutputStream this ^Integer b]
    (-> this (.write b))))

(defn get-appendable
  "Return the target appendable.

  returns: the target appendable - `T`"
  ([^AppendableOutputStream this]
    (-> this (.getAppendable))))

