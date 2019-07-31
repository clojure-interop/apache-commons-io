(ns org.apache.commons.io.input.ProxyReader
  "A Proxy stream which acts as expected, that is it passes the method
  calls on to the proxied stream and doesn't change which methods are
  being called.

  It is an alternative base class to FilterReader
  to increase reusability, because FilterReader changes the
  methods being called, such as read(char[]) to read(char[], int, int)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.input ProxyReader]))

(defn ->proxy-reader
  "Constructor.

  Constructs a new ProxyReader.

  proxy - the Reader to delegate to - `java.io.Reader`"
  (^ProxyReader [^java.io.Reader proxy]
    (new ProxyReader proxy)))

(defn read
  "Invokes the delegate's read(char[], int, int) method.

  chr - the buffer to read the characters into - `char[]`
  st - The start offset - `int`
  len - The number of bytes to read - `int`

  returns: the number of characters read or -1 if the end of stream - `int`

  throws: java.io.IOException - if an I/O error occurs"
  (^Integer [^ProxyReader this chr ^Integer st ^Integer len]
    (-> this (.read chr st len)))
  (^Integer [^ProxyReader this chr]
    (-> this (.read chr)))
  (^Integer [^ProxyReader this]
    (-> this (.read))))

(defn skip
  "Invokes the delegate's skip(long) method.

  ln - the number of bytes to skip - `long`

  returns: the number of bytes to skipped or EOF if the end of stream - `long`

  throws: java.io.IOException - if an I/O error occurs"
  (^Long [^ProxyReader this ^Long ln]
    (-> this (.skip ln))))

(defn ready
  "Invokes the delegate's ready() method.

  returns: true if the stream is ready to be read - `boolean`

  throws: java.io.IOException - if an I/O error occurs"
  (^Boolean [^ProxyReader this]
    (-> this (.ready))))

(defn close
  "Invokes the delegate's close() method.

  throws: java.io.IOException - if an I/O error occurs"
  ([^ProxyReader this]
    (-> this (.close))))

(defn mark
  "Invokes the delegate's mark(int) method.

  idx - read ahead limit - `int`

  throws: java.io.IOException - if an I/O error occurs"
  ([^ProxyReader this ^Integer idx]
    (-> this (.mark idx))))

(defn reset
  "Invokes the delegate's reset() method.

  throws: java.io.IOException - if an I/O error occurs"
  ([^ProxyReader this]
    (-> this (.reset))))

(defn mark-supported
  "Invokes the delegate's markSupported() method.

  returns: true if mark is supported, otherwise false - `boolean`"
  (^Boolean [^ProxyReader this]
    (-> this (.markSupported))))

