(ns org.apache.commons.io.output.XmlStreamWriter
  "Character stream that handles all the necessary Voodoo to figure out the
  charset encoding of the XML document written to the stream."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.output XmlStreamWriter]))

(defn ->xml-stream-writer
  "Constructor.

  Constructs a new XML stream writer for the specified output stream
   with the specified default encoding.

  out - The output stream - `java.io.OutputStream`
  default-encoding - The default encoding if not encoding could be detected - `java.lang.String`"
  (^XmlStreamWriter [^java.io.OutputStream out ^java.lang.String default-encoding]
    (new XmlStreamWriter out default-encoding))
  (^XmlStreamWriter [^java.io.OutputStream out]
    (new XmlStreamWriter out)))

(defn get-encoding
  "Returns the detected encoding.

  returns: the detected encoding - `java.lang.String`"
  (^java.lang.String [^XmlStreamWriter this]
    (-> this (.getEncoding))))

(defn get-default-encoding
  "Returns the default encoding.

  returns: the default encoding - `java.lang.String`"
  (^java.lang.String [^XmlStreamWriter this]
    (-> this (.getDefaultEncoding))))

(defn close
  "Closes the underlying writer.

  throws: java.io.IOException - if an error occurs closing the underlying writer"
  ([^XmlStreamWriter this]
    (-> this (.close))))

(defn flush
  "Flushes the underlying writer.

  throws: java.io.IOException - if an error occurs flushing the underlying writer"
  ([^XmlStreamWriter this]
    (-> this (.flush))))

(defn write
  "Writes the characters to the underlying writer, detecting encoding.

  cbuf - the buffer to write the characters from - `char[]`
  off - The start offset - `int`
  len - The number of characters to write - `int`

  throws: java.io.IOException - if an error occurs detecting the encoding"
  ([^XmlStreamWriter this cbuf ^Integer off ^Integer len]
    (-> this (.write cbuf off len))))

