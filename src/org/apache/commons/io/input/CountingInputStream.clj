(ns org.apache.commons.io.input.CountingInputStream
  "A decorating input stream that counts the number of bytes that have passed
  through the stream so far.

  A typical use case would be during debugging, to ensure that data is being
  read as expected."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.input CountingInputStream]))

(defn ->counting-input-stream
  "Constructor.

  Constructs a new CountingInputStream.

  in - the InputStream to delegate to - `java.io.InputStream`"
  (^CountingInputStream [^java.io.InputStream in]
    (new CountingInputStream in)))

(defn skip
  "Skips the stream over the specified number of bytes, adding the skipped
   amount to the count.

  length - the number of bytes to skip - `long`

  returns: the actual number of bytes skipped - `long`

  throws: java.io.IOException - if an I/O error occurs"
  (^Long [^CountingInputStream this ^Long length]
    (-> this (.skip length))))

(defn get-count
  "The number of bytes that have passed through this stream.

   NOTE: From v1.3 this method throws an ArithmeticException if the
   count is greater than can be expressed by an int.
   See getByteCount() for a method using a long.

  returns: the number of bytes accumulated - `int`

  throws: java.lang.ArithmeticException - if the byte count is too large"
  (^Integer [^CountingInputStream this]
    (-> this (.getCount))))

(defn reset-count
  "Set the byte count back to 0.

   NOTE: From v1.3 this method throws an ArithmeticException if the
   count is greater than can be expressed by an int.
   See resetByteCount() for a method using a long.

  returns: the count previous to resetting - `int`

  throws: java.lang.ArithmeticException - if the byte count is too large"
  (^Integer [^CountingInputStream this]
    (-> this (.resetCount))))

(defn get-byte-count
  "The number of bytes that have passed through this stream.

   NOTE: This method is an alternative for getCount()
   and was added because that method returns an integer which will
   result in incorrect count for files over 2GB.

  returns: the number of bytes accumulated - `long`"
  (^Long [^CountingInputStream this]
    (-> this (.getByteCount))))

(defn reset-byte-count
  "Set the byte count back to 0.

   NOTE: This method is an alternative for resetCount()
   and was added because that method returns an integer which will
   result in incorrect count for files over 2GB.

  returns: the count previous to resetting - `long`"
  (^Long [^CountingInputStream this]
    (-> this (.resetByteCount))))

