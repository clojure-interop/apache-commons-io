(ns org.apache.commons.io.input.AutoCloseInputStream
  "Proxy stream that closes and discards the underlying stream as soon as the
  end of input has been reached or when the stream is explicitly closed.
  Not even a reference to the underlying stream is kept after it has been
  closed, so any allocated in-memory buffers can be freed even if the
  client application still keeps a reference to the proxy stream.

  This class is typically used to release any resources related to an open
  stream as soon as possible even if the client application (by not explicitly
  closing the stream when no longer needed) or the underlying stream (by not
  releasing resources once the last byte has been read) do not do that."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.input AutoCloseInputStream]))

(defn ->auto-close-input-stream
  "Constructor.

  Creates an automatically closing proxy for the given input stream.

  in - underlying input stream - `java.io.InputStream`"
  (^AutoCloseInputStream [^java.io.InputStream in]
    (new AutoCloseInputStream in)))

(defn close
  "Closes the underlying input stream and replaces the reference to it
   with a ClosedInputStream instance.

   This method is automatically called by the read methods when the end
   of input has been reached.

   Note that it is safe to call this method any number of times. The original
   underlying input stream is closed and discarded only once when this
   method is first called.

  throws: java.io.IOException - if the underlying input stream can not be closed"
  ([^AutoCloseInputStream this]
    (-> this (.close))))

