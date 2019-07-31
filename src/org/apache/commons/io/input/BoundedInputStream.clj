(ns org.apache.commons.io.input.BoundedInputStream
  "This is a stream that will only supply bytes up to a certain length - if its
  position goes above that, it will stop.

  This is useful to wrap ServletInputStreams. The ServletInputStream will block
  if you try to read content from it that isn't there, because it doesn't know
  whether the content hasn't arrived yet or whether the content has finished.
  So, one of these, initialized with the Content-length sent in the
  ServletInputStream's header, will stop it blocking, providing it's been sent
  with a correct content length."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.input BoundedInputStream]))

(defn ->bounded-input-stream
  "Constructor.

  Creates a new BoundedInputStream that wraps the given input
   stream and limits it to a certain size.

  in - The wrapped input stream - `java.io.InputStream`
  size - The maximum number of bytes to return - `long`"
  (^BoundedInputStream [^java.io.InputStream in ^Long size]
    (new BoundedInputStream in size))
  (^BoundedInputStream [^java.io.InputStream in]
    (new BoundedInputStream in)))

(defn skip
  "Invokes the delegate's skip(long) method.

  n - the number of bytes to skip - `long`

  returns: the actual number of bytes skipped - `long`

  throws: java.io.IOException - if an I/O error occurs"
  (^Long [^BoundedInputStream this ^Long n]
    (-> this (.skip n))))

(defn propagate-close?
  "Indicates whether the close() method
   should propagate to the underling InputStream.

  returns: true if calling close()
   propagates to the close() method of the
   underlying stream or false if it does not. - `boolean`"
  (^Boolean [^BoundedInputStream this]
    (-> this (.isPropagateClose))))

(defn to-string
  "Invokes the delegate's toString() method.

  returns: the delegate's toString() - `java.lang.String`"
  (^java.lang.String [^BoundedInputStream this]
    (-> this (.toString))))

(defn read
  "Invokes the delegate's read(byte[], int, int) method.

  b - the buffer to read the bytes into - `byte[]`
  off - The start offset - `int`
  len - The number of bytes to read - `int`

  returns: the number of bytes read or -1 if the end of stream or
   the limit has been reached. - `int`

  throws: java.io.IOException - if an I/O error occurs"
  (^Integer [^BoundedInputStream this b ^Integer off ^Integer len]
    (-> this (.read b off len)))
  (^Integer [^BoundedInputStream this b]
    (-> this (.read b)))
  (^Integer [^BoundedInputStream this]
    (-> this (.read))))

(defn reset
  "Invokes the delegate's reset() method.

  throws: java.io.IOException - if an I/O error occurs"
  ([^BoundedInputStream this]
    (-> this (.reset))))

(defn set-propagate-close
  "Set whether the close() method
   should propagate to the underling InputStream.

  propagate-close - true if calling close() propagates to the close() method of the underlying stream or false if it does not. - `boolean`"
  ([^BoundedInputStream this ^Boolean propagate-close]
    (-> this (.setPropagateClose propagate-close))))

(defn mark-supported
  "Invokes the delegate's markSupported() method.

  returns: true if mark is supported, otherwise false - `boolean`"
  (^Boolean [^BoundedInputStream this]
    (-> this (.markSupported))))

(defn close
  "Invokes the delegate's close() method
   if isPropagateClose() is true.

  throws: java.io.IOException - if an I/O error occurs"
  ([^BoundedInputStream this]
    (-> this (.close))))

(defn mark
  "Invokes the delegate's mark(int) method.

  readlimit - read ahead limit - `int`"
  ([^BoundedInputStream this ^Integer readlimit]
    (-> this (.mark readlimit))))

(defn available
  "returns: `int`

  throws: java.io.IOException"
  (^Integer [^BoundedInputStream this]
    (-> this (.available))))

