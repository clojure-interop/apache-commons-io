(ns org.apache.commons.io.input.ProxyInputStream
  "A Proxy stream which acts as expected, that is it passes the method
  calls on to the proxied stream and doesn't change which methods are
  being called.

  It is an alternative base class to FilterInputStream
  to increase reusability, because FilterInputStream changes the
  methods being called, such as read(byte[]) to read(byte[], int, int).

  See the protected methods for ways in which a subclass can easily decorate
  a stream with custom pre-, post- or error processing functionality."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.input ProxyInputStream]))

(defn ->proxy-input-stream
  "Constructor.

  Constructs a new ProxyInputStream.

  proxy - the InputStream to delegate to - `java.io.InputStream`"
  (^ProxyInputStream [^java.io.InputStream proxy]
    (new ProxyInputStream proxy)))

(defn read
  "Invokes the delegate's read(byte[], int, int) method.

  bts - the buffer to read the bytes into - `byte[]`
  off - The start offset - `int`
  len - The number of bytes to read - `int`

  returns: the number of bytes read or -1 if the end of stream - `int`

  throws: java.io.IOException - if an I/O error occurs"
  (^Integer [^ProxyInputStream this bts ^Integer off ^Integer len]
    (-> this (.read bts off len)))
  (^Integer [^ProxyInputStream this bts]
    (-> this (.read bts)))
  (^Integer [^ProxyInputStream this]
    (-> this (.read))))

(defn skip
  "Invokes the delegate's skip(long) method.

  ln - the number of bytes to skip - `long`

  returns: the actual number of bytes skipped - `long`

  throws: java.io.IOException - if an I/O error occurs"
  (^Long [^ProxyInputStream this ^Long ln]
    (-> this (.skip ln))))

(defn available
  "Invokes the delegate's available() method.

  returns: the number of available bytes - `int`

  throws: java.io.IOException - if an I/O error occurs"
  (^Integer [^ProxyInputStream this]
    (-> this (.available))))

(defn close
  "Invokes the delegate's close() method.

  throws: java.io.IOException - if an I/O error occurs"
  ([^ProxyInputStream this]
    (-> this (.close))))

(defn mark
  "Invokes the delegate's mark(int) method.

  readlimit - read ahead limit - `int`"
  ([^ProxyInputStream this ^Integer readlimit]
    (-> this (.mark readlimit))))

(defn reset
  "Invokes the delegate's reset() method.

  throws: java.io.IOException - if an I/O error occurs"
  ([^ProxyInputStream this]
    (-> this (.reset))))

(defn mark-supported
  "Invokes the delegate's markSupported() method.

  returns: true if mark is supported, otherwise false - `boolean`"
  (^Boolean [^ProxyInputStream this]
    (-> this (.markSupported))))

