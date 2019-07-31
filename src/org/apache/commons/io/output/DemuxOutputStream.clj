(ns org.apache.commons.io.output.DemuxOutputStream
  "Forwards data to a stream that has been associated with this thread."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.output DemuxOutputStream]))

(defn ->demux-output-stream
  "Constructor."
  (^DemuxOutputStream []
    (new DemuxOutputStream )))

(defn bind-stream
  "Binds the specified stream to the current thread.

  output - the stream to bind - `java.io.OutputStream`

  returns: the OutputStream that was previously active - `java.io.OutputStream`"
  (^java.io.OutputStream [^DemuxOutputStream this ^java.io.OutputStream output]
    (-> this (.bindStream output))))

(defn close
  "Closes stream associated with current thread.

  throws: java.io.IOException - if an error occurs"
  ([^DemuxOutputStream this]
    (-> this (.close))))

(defn flush
  "Flushes stream associated with current thread.

  throws: java.io.IOException - if an error occurs"
  ([^DemuxOutputStream this]
    (-> this (.flush))))

(defn write
  "Writes byte to stream associated with current thread.

  ch - the byte to write to stream - `int`

  throws: java.io.IOException - if an error occurs"
  ([^DemuxOutputStream this ^Integer ch]
    (-> this (.write ch))))

