(ns org.apache.commons.io.output.ThresholdingOutputStream
  "An output stream which triggers an event when a specified number of bytes of
  data have been written to it. The event can be used, for example, to throw
  an exception if a maximum has been reached, or to switch the underlying
  stream type when the threshold is exceeded.

  This class overrides all OutputStream methods. However, these
  overrides ultimately call the corresponding methods in the underlying output
  stream implementation.

  NOTE: This implementation may trigger the event before the threshold
  is actually reached, since it triggers when a pending write operation would
  cause the threshold to be exceeded."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.output ThresholdingOutputStream]))

(defn ->thresholding-output-stream
  "Constructor.

  Constructs an instance of this class which will trigger an event at the
   specified threshold.

  threshold - The number of bytes at which to trigger an event. - `int`"
  (^ThresholdingOutputStream [^Integer threshold]
    (new ThresholdingOutputStream threshold)))

(defn write
  "Writes len bytes from the specified byte array starting at
   offset off to this output stream.

  b - The byte array from which the data will be written. - `byte[]`
  off - The start offset in the byte array. - `int`
  len - The number of bytes to write. - `int`

  throws: java.io.IOException - if an error occurs."
  ([^ThresholdingOutputStream this b ^Integer off ^Integer len]
    (-> this (.write b off len)))
  ([^ThresholdingOutputStream this ^Integer b]
    (-> this (.write b))))

(defn flush
  "Flushes this output stream and forces any buffered output bytes to be
   written out.

  throws: java.io.IOException - if an error occurs."
  ([^ThresholdingOutputStream this]
    (-> this (.flush))))

(defn close
  "Closes this output stream and releases any system resources associated
   with this stream.

  throws: java.io.IOException - if an error occurs."
  ([^ThresholdingOutputStream this]
    (-> this (.close))))

(defn get-threshold
  "Returns the threshold, in bytes, at which an event will be triggered.

  returns: The threshold point, in bytes. - `int`"
  (^Integer [^ThresholdingOutputStream this]
    (-> this (.getThreshold))))

(defn get-byte-count
  "Returns the number of bytes that have been written to this output stream.

  returns: The number of bytes written. - `long`"
  (^Long [^ThresholdingOutputStream this]
    (-> this (.getByteCount))))

(defn threshold-exceeded?
  "Determines whether or not the configured threshold has been exceeded for
   this output stream.

  returns: true if the threshold has been reached;
           false otherwise. - `boolean`"
  (^Boolean [^ThresholdingOutputStream this]
    (-> this (.isThresholdExceeded))))

