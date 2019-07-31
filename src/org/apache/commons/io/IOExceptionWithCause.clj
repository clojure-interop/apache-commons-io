(ns org.apache.commons.io.IOExceptionWithCause
  "Deprecated.
 (since 2.5) use IOException instead"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io IOExceptionWithCause]))

(defn ->io-exception-with-cause
  "Constructor.

  Deprecated.

  message - the message (see Throwable.getMessage()) - `java.lang.String`
  cause - the cause (see Throwable.getCause()). A null value is allowed. - `java.lang.Throwable`"
  (^IOExceptionWithCause [^java.lang.String message ^java.lang.Throwable cause]
    (new IOExceptionWithCause message cause))
  (^IOExceptionWithCause [^java.lang.Throwable cause]
    (new IOExceptionWithCause cause)))

