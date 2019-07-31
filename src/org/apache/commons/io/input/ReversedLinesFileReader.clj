(ns org.apache.commons.io.input.ReversedLinesFileReader
  "Reads lines in a file reversely (similar to a BufferedReader, but starting at
  the last line). Useful for e.g. searching in log files."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.input ReversedLinesFileReader]))

(defn ->reversed-lines-file-reader
  "Constructor.

  Creates a ReversedLinesFileReader with the given block size and encoding.

  file - the file to be read - `java.io.File`
  block-size - size of the internal buffer (for ideal performance this should match with the block size of the underlying file system). - `int`
  encoding - the encoding of the file - `java.nio.charset.Charset`

  throws: java.io.IOException - if an I/O error occurs"
  (^ReversedLinesFileReader [^java.io.File file ^Integer block-size ^java.nio.charset.Charset encoding]
    (new ReversedLinesFileReader file block-size encoding))
  (^ReversedLinesFileReader [^java.io.File file ^java.nio.charset.Charset charset]
    (new ReversedLinesFileReader file charset))
  (^ReversedLinesFileReader [^java.io.File file]
    (new ReversedLinesFileReader file)))

(defn read-line
  "Returns the lines of the file from bottom to top.

  returns: the next line or null if the start of the file is reached - `java.lang.String`

  throws: java.io.IOException - if an I/O error occurs"
  (^java.lang.String [^ReversedLinesFileReader this]
    (-> this (.readLine))))

(defn close
  "Closes underlying resources.

  throws: java.io.IOException - if an I/O error occurs"
  ([^ReversedLinesFileReader this]
    (-> this (.close))))

