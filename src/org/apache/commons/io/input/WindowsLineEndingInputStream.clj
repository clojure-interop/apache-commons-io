(ns org.apache.commons.io.input.WindowsLineEndingInputStream
  "A filtering input stream that ensures the content will have windows line endings, CRLF."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.input WindowsLineEndingInputStream]))

(defn ->windows-line-ending-input-stream
  "Constructor.

  Create an input stream that filters another stream

  in - The input stream to wrap - `java.io.InputStream`
  ensure-line-feed-at-end-of-file - true to ensure that the file ends with CRLF - `boolean`"
  (^WindowsLineEndingInputStream [^java.io.InputStream in ^Boolean ensure-line-feed-at-end-of-file]
    (new WindowsLineEndingInputStream in ensure-line-feed-at-end-of-file)))

(defn read
  "returns: `int`

  throws: java.io.IOException"
  (^Integer [^WindowsLineEndingInputStream this]
    (-> this (.read))))

(defn close
  "Closes the stream. Also closes the underlying stream.

  throws: java.io.IOException - upon error"
  ([^WindowsLineEndingInputStream this]
    (-> this (.close))))

(defn mark
  "readlimit - `int`"
  ([^WindowsLineEndingInputStream this ^Integer readlimit]
    (-> this (.mark readlimit))))

