(ns org.apache.commons.io.input.CloseShieldInputStream
  "Proxy stream that prevents the underlying input stream from being closed.

  This class is typically used in cases where an input stream needs to be
  passed to a component that wants to explicitly close the stream even if
  more input would still be available to other components."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.input CloseShieldInputStream]))

(defn ->close-shield-input-stream
  "Constructor.

  Creates a proxy that shields the given input stream from being
   closed.

  in - underlying input stream - `java.io.InputStream`"
  (^CloseShieldInputStream [^java.io.InputStream in]
    (new CloseShieldInputStream in)))

(defn close
  "Replaces the underlying input stream with a ClosedInputStream
   sentinel. The original input stream will remain open, but this proxy
   will appear closed."
  ([^CloseShieldInputStream this]
    (-> this (.close))))

