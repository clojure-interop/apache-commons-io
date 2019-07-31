(ns org.apache.commons.io.output.TeeOutputStream
  "Classic splitter of OutputStream. Named after the unix 'tee'
  command. It allows a stream to be branched off so there
  are now two streams."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.output TeeOutputStream]))

(defn ->tee-output-stream
  "Constructor.

  Constructs a TeeOutputStream.

  out - the main OutputStream - `java.io.OutputStream`
  branch - the second OutputStream - `java.io.OutputStream`"
  (^TeeOutputStream [^java.io.OutputStream out ^java.io.OutputStream branch]
    (new TeeOutputStream out branch)))

(defn write
  "Write the specified bytes to both streams.

  b - the bytes to write - `byte[]`
  off - The start offset - `int`
  len - The number of bytes to write - `int`

  throws: java.io.IOException - if an I/O error occurs"
  ([^TeeOutputStream this b ^Integer off ^Integer len]
    (-> this (.write b off len)))
  ([^TeeOutputStream this b]
    (-> this (.write b))))

(defn flush
  "Flushes both streams.

  throws: java.io.IOException - if an I/O error occurs"
  ([^TeeOutputStream this]
    (-> this (.flush))))

(defn close
  "Closes both output streams.

   If closing the main output stream throws an exception, attempt to close the branch output stream.

   If closing the main and branch output streams both throw exceptions, which exceptions is thrown by this method is
   currently unspecified and subject to change.

  throws: java.io.IOException - if an I/O error occurs"
  ([^TeeOutputStream this]
    (-> this (.close))))

