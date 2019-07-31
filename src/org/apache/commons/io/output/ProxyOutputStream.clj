(ns org.apache.commons.io.output.ProxyOutputStream
  "A Proxy stream which acts as expected, that is it passes the method
  calls on to the proxied stream and doesn't change which methods are
  being called. It is an alternative base class to FilterOutputStream
  to increase reusability.

  See the protected methods for ways in which a subclass can easily decorate
  a stream with custom pre-, post- or error processing functionality."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.output ProxyOutputStream]))

(defn ->proxy-output-stream
  "Constructor.

  Constructs a new ProxyOutputStream.

  proxy - the OutputStream to delegate to - `java.io.OutputStream`"
  (^ProxyOutputStream [^java.io.OutputStream proxy]
    (new ProxyOutputStream proxy)))

(defn write
  "Invokes the delegate's write(byte[]) method.

  bts - the bytes to write - `byte[]`
  st - The start offset - `int`
  end - The number of bytes to write - `int`

  throws: java.io.IOException - if an I/O error occurs"
  ([^ProxyOutputStream this bts ^Integer st ^Integer end]
    (-> this (.write bts st end)))
  ([^ProxyOutputStream this ^Integer idx]
    (-> this (.write idx))))

(defn flush
  "Invokes the delegate's flush() method.

  throws: java.io.IOException - if an I/O error occurs"
  ([^ProxyOutputStream this]
    (-> this (.flush))))

(defn close
  "Invokes the delegate's close() method.

  throws: java.io.IOException - if an I/O error occurs"
  ([^ProxyOutputStream this]
    (-> this (.close))))

