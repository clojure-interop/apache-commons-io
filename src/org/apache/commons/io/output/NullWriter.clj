(ns org.apache.commons.io.output.NullWriter
  "This Writer writes all data to the famous /dev/null.

  This Writer has no destination (file/socket etc.) and all
  characters written to it are ignored and lost."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.output NullWriter]))

(defn ->null-writer
  "Constructor.

  Constructs a new NullWriter."
  (^NullWriter []
    (new NullWriter )))

(def *-null-writer
  "Static Constant.

  A singleton.

  type: org.apache.commons.io.output.NullWriter"
  NullWriter/NULL_WRITER)

(defn append
  "Does nothing - output to /dev/null.

  csq - The character sequence to write - `java.lang.CharSequence`
  start - The index of the first character to write - `int`
  end - The index of the first character to write (exclusive) - `int`

  returns: this writer - `java.io.Writer`"
  (^java.io.Writer [^NullWriter this ^java.lang.CharSequence csq ^Integer start ^Integer end]
    (-> this (.append csq start end)))
  (^java.io.Writer [^NullWriter this ^Character c]
    (-> this (.append c))))

(defn write
  "Does nothing - output to /dev/null.

  chr - The characters to write - `char[]`
  st - The start offset - `int`
  end - The number of characters to write - `int`"
  ([^NullWriter this chr ^Integer st ^Integer end]
    (-> this (.write chr st end)))
  ([^NullWriter this ^Integer idx]
    (-> this (.write idx))))

(defn flush
  ""
  ([^NullWriter this]
    (-> this (.flush))))

(defn close
  ""
  ([^NullWriter this]
    (-> this (.close))))

