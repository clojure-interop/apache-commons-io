(ns org.apache.commons.io.output.ProxyWriter
  "A Proxy stream which acts as expected, that is it passes the method
  calls on to the proxied stream and doesn't change which methods are
  being called. It is an alternative base class to FilterWriter
  to increase reusability, because FilterWriter changes the
  methods being called, such as write(char[]) to write(char[], int, int)
  and write(String) to write(String, int, int)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.output ProxyWriter]))

(defn ->proxy-writer
  "Constructor.

  Constructs a new ProxyWriter.

  proxy - the Writer to delegate to - `java.io.Writer`"
  (^ProxyWriter [^java.io.Writer proxy]
    (new ProxyWriter proxy)))

(defn append
  "Invokes the delegate's append(CharSequence, int, int) method.

  csq - The character sequence to write - `java.lang.CharSequence`
  start - The index of the first character to write - `int`
  end - The index of the first character to write (exclusive) - `int`

  returns: this writer - `java.io.Writer`

  throws: java.io.IOException - if an I/O error occurs"
  (^java.io.Writer [^ProxyWriter this ^java.lang.CharSequence csq ^Integer start ^Integer end]
    (-> this (.append csq start end)))
  (^java.io.Writer [^ProxyWriter this ^Character c]
    (-> this (.append c))))

(defn write
  "Invokes the delegate's write(char[], int, int) method.

  chr - the characters to write - `char[]`
  st - The start offset - `int`
  len - The number of characters to write - `int`

  throws: java.io.IOException - if an I/O error occurs"
  ([^ProxyWriter this chr ^Integer st ^Integer len]
    (-> this (.write chr st len)))
  ([^ProxyWriter this ^Integer idx]
    (-> this (.write idx))))

(defn flush
  "Invokes the delegate's flush() method.

  throws: java.io.IOException - if an I/O error occurs"
  ([^ProxyWriter this]
    (-> this (.flush))))

(defn close
  "Invokes the delegate's close() method.

  throws: java.io.IOException - if an I/O error occurs"
  ([^ProxyWriter this]
    (-> this (.close))))

