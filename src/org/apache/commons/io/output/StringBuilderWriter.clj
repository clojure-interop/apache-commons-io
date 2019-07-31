(ns org.apache.commons.io.output.StringBuilderWriter
  "Writer implementation that outputs to a StringBuilder.

  NOTE: This implementation, as an alternative to
  java.io.StringWriter, provides an un-synchronized
  (i.e. for use in a single thread) implementation for better performance.
  For safe usage with multiple Threads then
  java.io.StringWriter should be used."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.output StringBuilderWriter]))

(defn ->string-builder-writer
  "Constructor.

  Constructs a new StringBuilder instance with the specified capacity.

  capacity - The initial capacity of the underlying StringBuilder - `int`"
  (^StringBuilderWriter [^Integer capacity]
    (new StringBuilderWriter capacity))
  (^StringBuilderWriter []
    (new StringBuilderWriter )))

(defn append
  "Appends a portion of a character sequence to the StringBuilder.

  value - The character to append - `java.lang.CharSequence`
  start - The index of the first character - `int`
  end - The index of the last character 1 - `int`

  returns: This writer instance - `java.io.Writer`"
  (^java.io.Writer [^StringBuilderWriter this ^java.lang.CharSequence value ^Integer start ^Integer end]
    (-> this (.append value start end)))
  (^java.io.Writer [^StringBuilderWriter this ^Character value]
    (-> this (.append value))))

(defn close
  "Closing this writer has no effect."
  ([^StringBuilderWriter this]
    (-> this (.close))))

(defn flush
  "Flushing this writer has no effect."
  ([^StringBuilderWriter this]
    (-> this (.flush))))

(defn write
  "Writes a portion of a character array to the StringBuilder.

  value - The value to write - `char[]`
  offset - The index of the first character - `int`
  length - The number of characters to write - `int`"
  ([^StringBuilderWriter this value ^Integer offset ^Integer length]
    (-> this (.write value offset length)))
  ([^StringBuilderWriter this ^java.lang.String value]
    (-> this (.write value))))

(defn get-builder
  "Returns the underlying builder.

  returns: The underlying builder - `java.lang.StringBuilder`"
  (^java.lang.StringBuilder [^StringBuilderWriter this]
    (-> this (.getBuilder))))

(defn to-string
  "Returns StringBuilder.toString().

  returns: The contents of the String builder. - `java.lang.String`"
  (^java.lang.String [^StringBuilderWriter this]
    (-> this (.toString))))

