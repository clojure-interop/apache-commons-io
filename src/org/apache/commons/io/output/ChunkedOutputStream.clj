(ns org.apache.commons.io.output.ChunkedOutputStream
  "OutputStream which breaks larger output blocks into chunks.
  Native code may need to copy the input array; if the write buffer
  is very large this can cause OOME."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.output ChunkedOutputStream]))

(defn ->chunked-output-stream
  "Constructor.

  Creates a new stream that uses the specified chunk size.

  stream - the stream to wrap - `java.io.OutputStream`
  chunk-size - the chunk size to use; must be a positive number. - `int`

  throws: java.lang.IllegalArgumentException - if the chunk size is <= 0"
  (^ChunkedOutputStream [^java.io.OutputStream stream ^Integer chunk-size]
    (new ChunkedOutputStream stream chunk-size))
  (^ChunkedOutputStream [^java.io.OutputStream stream]
    (new ChunkedOutputStream stream)))

(defn write
  "Writes the data buffer in chunks to the underlying stream

  data - the data to write - `byte[]`
  src-offset - the offset - `int`
  length - the length of data to write - `int`

  throws: java.io.IOException - if an I/O error occurs."
  ([^ChunkedOutputStream this data ^Integer src-offset ^Integer length]
    (-> this (.write data src-offset length))))

