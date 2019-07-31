(ns org.apache.commons.io.input.DemuxInputStream
  "Data written to this stream is forwarded to a stream that has been associated
  with this thread."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.input DemuxInputStream]))

(defn ->demux-input-stream
  "Constructor."
  (^DemuxInputStream []
    (new DemuxInputStream )))

(defn bind-stream
  "Bind the specified stream to the current thread.

  input - the stream to bind - `java.io.InputStream`

  returns: the InputStream that was previously active - `java.io.InputStream`"
  (^java.io.InputStream [^DemuxInputStream this ^java.io.InputStream input]
    (-> this (.bindStream input))))

(defn close
  "Closes stream associated with current thread.

  throws: java.io.IOException - if an error occurs"
  ([^DemuxInputStream this]
    (-> this (.close))))

(defn read
  "Read byte from stream associated with current thread.

  returns: the byte read from stream - `int`

  throws: java.io.IOException - if an error occurs"
  (^Integer [^DemuxInputStream this]
    (-> this (.read))))

