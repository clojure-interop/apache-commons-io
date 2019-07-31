(ns org.apache.commons.io.output.CloseShieldOutputStream
  "Proxy stream that prevents the underlying output stream from being closed.

  This class is typically used in cases where an output stream needs to be
  passed to a component that wants to explicitly close the stream even if
  other components would still use the stream for output."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.output CloseShieldOutputStream]))

(defn ->close-shield-output-stream
  "Constructor.

  Creates a proxy that shields the given output stream from being
   closed.

  out - underlying output stream - `java.io.OutputStream`"
  (^CloseShieldOutputStream [^java.io.OutputStream out]
    (new CloseShieldOutputStream out)))

(defn close
  "Replaces the underlying output stream with a ClosedOutputStream
   sentinel. The original output stream will remain open, but this proxy
   will appear closed."
  ([^CloseShieldOutputStream this]
    (-> this (.close))))

