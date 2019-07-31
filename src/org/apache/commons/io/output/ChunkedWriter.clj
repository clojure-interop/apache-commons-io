(ns org.apache.commons.io.output.ChunkedWriter
  "Writer which breaks larger output blocks into chunks.
  Native code may need to copy the input array; if the write buffer
  is very large this can cause OOME."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.output ChunkedWriter]))

(defn ->chunked-writer
  "Constructor.

  Creates a new writer that uses the specified chunk size.

  writer - the writer to wrap - `java.io.Writer`
  chunk-size - the chunk size to use; must be a positive number. - `int`

  throws: java.lang.IllegalArgumentException - if the chunk size is <= 0"
  (^ChunkedWriter [^java.io.Writer writer ^Integer chunk-size]
    (new ChunkedWriter writer chunk-size))
  (^ChunkedWriter [^java.io.Writer writer]
    (new ChunkedWriter writer)))

(defn write
  "writes the data buffer in chunks to the underlying writer

  data - The data - `char[]`
  src-offset - the offset - `int`
  length - the number of bytes to write - `int`

  throws: java.io.IOException - upon error"
  ([^ChunkedWriter this data ^Integer src-offset ^Integer length]
    (-> this (.write data src-offset length))))

