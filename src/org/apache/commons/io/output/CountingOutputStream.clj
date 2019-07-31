(ns org.apache.commons.io.output.CountingOutputStream
  "A decorating output stream that counts the number of bytes that have passed
  through the stream so far.

  A typical use case would be during debugging, to ensure that data is being
  written as expected."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.output CountingOutputStream]))

(defn ->counting-output-stream
  "Constructor.

  Constructs a new CountingOutputStream.

  out - the OutputStream to write to - `java.io.OutputStream`"
  (^CountingOutputStream [^java.io.OutputStream out]
    (new CountingOutputStream out)))

(defn get-count
  "The number of bytes that have passed through this stream.

   NOTE: From v1.3 this method throws an ArithmeticException if the
   count is greater than can be expressed by an int.
   See getByteCount() for a method using a long.

  returns: the number of bytes accumulated - `int`

  throws: java.lang.ArithmeticException - if the byte count is too large"
  (^Integer [^CountingOutputStream this]
    (-> this (.getCount))))

(defn reset-count
  "Set the byte count back to 0.

   NOTE: From v1.3 this method throws an ArithmeticException if the
   count is greater than can be expressed by an int.
   See resetByteCount() for a method using a long.

  returns: the count previous to resetting - `int`

  throws: java.lang.ArithmeticException - if the byte count is too large"
  (^Integer [^CountingOutputStream this]
    (-> this (.resetCount))))

(defn get-byte-count
  "The number of bytes that have passed through this stream.

   NOTE: This method is an alternative for getCount().
   It was added because that method returns an integer which will
   result in incorrect count for files over 2GB.

  returns: the number of bytes accumulated - `long`"
  (^Long [^CountingOutputStream this]
    (-> this (.getByteCount))))

(defn reset-byte-count
  "Set the byte count back to 0.

   NOTE: This method is an alternative for resetCount().
   It was added because that method returns an integer which will
   result in incorrect count for files over 2GB.

  returns: the count previous to resetting - `long`"
  (^Long [^CountingOutputStream this]
    (-> this (.resetByteCount))))

