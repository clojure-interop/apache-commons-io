(ns org.apache.commons.io.input.UnixLineEndingInputStream
  "A filtering input stream that ensures the content will have unix-style line endings, LF."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.input UnixLineEndingInputStream]))

(defn ->unix-line-ending-input-stream
  "Constructor.

  Create an input stream that filters another stream

  in - The input stream to wrap - `java.io.InputStream`
  ensure-line-feed-at-end-of-file - true to ensure that the file ends with LF - `boolean`"
  (^UnixLineEndingInputStream [^java.io.InputStream in ^Boolean ensure-line-feed-at-end-of-file]
    (new UnixLineEndingInputStream in ensure-line-feed-at-end-of-file)))

(defn read
  "returns: `int`

  throws: java.io.IOException"
  (^Integer [^UnixLineEndingInputStream this]
    (-> this (.read))))

(defn close
  "Closes the stream. Also closes the underlying stream.

  throws: java.io.IOException - upon error"
  ([^UnixLineEndingInputStream this]
    (-> this (.close))))

(defn mark
  "readlimit - `int`"
  ([^UnixLineEndingInputStream this ^Integer readlimit]
    (-> this (.mark readlimit))))

