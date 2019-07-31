(ns org.apache.commons.io.ByteOrderMark
  "Byte Order Mark (BOM) representation - see BOMInputStream."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io ByteOrderMark]))

(defn ->byte-order-mark
  "Constructor.

  Construct a new BOM.

  charset-name - The name of the charset the BOM represents - `java.lang.String`
  bytes - The BOM's bytes - `int`

  throws: java.lang.IllegalArgumentException - if the bytes are null or zero length"
  (^ByteOrderMark [^java.lang.String charset-name ^Integer bytes]
    (new ByteOrderMark charset-name bytes)))

(def *-utf-8
  "Static Constant.

  UTF-8 BOM

  type: org.apache.commons.io.ByteOrderMark"
  ByteOrderMark/UTF_8)

(def *-utf-16-be
  "Static Constant.

  UTF-16BE BOM (Big-Endian)

  type: org.apache.commons.io.ByteOrderMark"
  ByteOrderMark/UTF_16BE)

(def *-utf-16-le
  "Static Constant.

  UTF-16LE BOM (Little-Endian)

  type: org.apache.commons.io.ByteOrderMark"
  ByteOrderMark/UTF_16LE)

(def *-utf-32-be
  "Static Constant.

  UTF-32BE BOM (Big-Endian)

  type: org.apache.commons.io.ByteOrderMark"
  ByteOrderMark/UTF_32BE)

(def *-utf-32-le
  "Static Constant.

  UTF-32LE BOM (Little-Endian)

  type: org.apache.commons.io.ByteOrderMark"
  ByteOrderMark/UTF_32LE)

(def *-utf-bom
  "Static Constant.

  Unicode BOM character; external form depends on the encoding.

  type: char"
  ByteOrderMark/UTF_BOM)

(defn get-charset-name
  "Return the name of the Charset the BOM represents.

  returns: the character set name - `java.lang.String`"
  (^java.lang.String [^ByteOrderMark this]
    (-> this (.getCharsetName))))

(defn length
  "Return the length of the BOM's bytes.

  returns: the length of the BOM's bytes - `int`"
  (^Integer [^ByteOrderMark this]
    (-> this (.length))))

(defn get
  "The byte at the specified position.

  pos - The position - `int`

  returns: The specified byte - `int`"
  (^Integer [^ByteOrderMark this ^Integer pos]
    (-> this (.get pos))))

(defn get-bytes
  "Return a copy of the BOM's bytes.

  returns: a copy of the BOM's bytes - `byte[]`"
  ([^ByteOrderMark this]
    (-> this (.getBytes))))

(defn equals
  "Indicates if this BOM's bytes equals another.

  obj - The object to compare to - `java.lang.Object`

  returns: true if the bom's bytes are equal, otherwise
   false - `boolean`"
  (^Boolean [^ByteOrderMark this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "Return the hashcode for this BOM.

  returns: the hashcode for this BOM. - `int`"
  (^Integer [^ByteOrderMark this]
    (-> this (.hashCode))))

(defn to-string
  "Provide a String representation of the BOM.

  returns: the length of the BOM's bytes - `java.lang.String`"
  (^java.lang.String [^ByteOrderMark this]
    (-> this (.toString))))

