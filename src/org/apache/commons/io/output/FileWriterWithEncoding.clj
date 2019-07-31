(ns org.apache.commons.io.output.FileWriterWithEncoding
  "Writer of files that allows the encoding to be set.

  This class provides a simple alternative to FileWriter
  that allows an encoding to be set. Unfortunately, it cannot subclass
  FileWriter.

  By default, the file will be overwritten, but this may be changed to append.

  The encoding must be specified using either the name of the Charset,
  the Charset, or a CharsetEncoder. If the default encoding
  is required then use the FileWriter directly, rather than
  this implementation."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.output FileWriterWithEncoding]))

(defn ->file-writer-with-encoding
  "Constructor.

  Constructs a FileWriterWithEncoding with a file encoding.

  filename - the name of the file to write to, not null - `java.lang.String`
  encoding - the encoding to use, not null - `java.lang.String`
  append - true if content should be appended, false to overwrite - `boolean`

  throws: java.lang.NullPointerException - if the file name or encoding is null"
  (^FileWriterWithEncoding [^java.lang.String filename ^java.lang.String encoding ^Boolean append]
    (new FileWriterWithEncoding filename encoding append))
  (^FileWriterWithEncoding [^java.lang.String filename ^java.lang.String encoding]
    (new FileWriterWithEncoding filename encoding)))

(defn write
  "Write the specified characters from an array.

  chr - the characters to write - `char[]`
  st - The start offset - `int`
  end - The number of characters to write - `int`

  throws: java.io.IOException - if an I/O error occurs"
  ([^FileWriterWithEncoding this chr ^Integer st ^Integer end]
    (-> this (.write chr st end)))
  ([^FileWriterWithEncoding this ^Integer idx]
    (-> this (.write idx))))

(defn flush
  "Flush the stream.

  throws: java.io.IOException - if an I/O error occurs"
  ([^FileWriterWithEncoding this]
    (-> this (.flush))))

(defn close
  "Close the stream.

  throws: java.io.IOException - if an I/O error occurs"
  ([^FileWriterWithEncoding this]
    (-> this (.close))))

