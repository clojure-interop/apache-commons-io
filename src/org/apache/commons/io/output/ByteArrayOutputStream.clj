(ns org.apache.commons.io.output.ByteArrayOutputStream
  "This class implements an output stream in which the data is
  written into a byte array. The buffer automatically grows as data
  is written to it.

  The data can be retrieved using toByteArray() and
  toString().

  Closing a ByteArrayOutputStream has no effect. The methods in
  this class can be called after the stream has been closed without
  generating an IOException.

  This is an alternative implementation of the ByteArrayOutputStream
  class. The original implementation only allocates 32 bytes at the beginning.
  As this class is designed for heavy duty it starts at 1024 bytes. In contrast
  to the original it doesn't reallocate the whole memory block but allocates
  additional buffers. This way no buffers need to be garbage collected and
  the contents don't have to be copied to the new buffer. This class is
  designed to behave exactly like the original. The only exception is the
  deprecated toString(int) method that has been ignored."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.output ByteArrayOutputStream]))

(defn ->byte-array-output-stream
  "Constructor.

  Creates a new byte array output stream, with a buffer capacity of
   the specified size, in bytes.

  size - the initial size - `int`

  throws: java.lang.IllegalArgumentException - if size is negative"
  (^ByteArrayOutputStream [^Integer size]
    (new ByteArrayOutputStream size))
  (^ByteArrayOutputStream []
    (new ByteArrayOutputStream )))

(defn *to-buffered-input-stream
  "Fetches entire contents of an InputStream and represent
   same data as result InputStream.

   This method is useful where,

   Source InputStream is slow.
   It has network resources associated, so we cannot keep it open for
   long time.
   It has network timeout associated.

   It can be used in favor of toByteArray(), since it
   avoids unnecessary allocation and copy of byte[].
   This method buffers the input internally, so there is no need to use a
   BufferedInputStream.

  input - Stream to be fully buffered. - `java.io.InputStream`
  size - the initial buffer size - `int`

  returns: A fully buffered stream. - `java.io.InputStream`

  throws: java.io.IOException - if an I/O error occurs"
  (^java.io.InputStream [^java.io.InputStream input ^Integer size]
    (ByteArrayOutputStream/toBufferedInputStream input size))
  (^java.io.InputStream [^java.io.InputStream input]
    (ByteArrayOutputStream/toBufferedInputStream input)))

(defn write
  "Write the bytes to byte array.

  b - the bytes to write - `byte[]`
  off - The start offset - `int`
  len - The number of bytes to write - `int`"
  ([^ByteArrayOutputStream this b ^Integer off ^Integer len]
    (-> this (.write b off len)))
  ([^ByteArrayOutputStream this ^Integer b]
    (-> this (.write b))))

(defn size
  "Return the current size of the byte array.

  returns: the current size of the byte array - `int`"
  (^Integer [^ByteArrayOutputStream this]
    (-> this (.size))))

(defn close
  "Closing a ByteArrayOutputStream has no effect. The methods in
   this class can be called after the stream has been closed without
   generating an IOException.

  throws: java.io.IOException - never (this method should not declare this exception but it has to now due to backwards compatibility)"
  ([^ByteArrayOutputStream this]
    (-> this (.close))))

(defn reset
  ""
  ([^ByteArrayOutputStream this]
    (-> this (.reset))))

(defn write-to
  "Writes the entire contents of this byte stream to the
   specified output stream.

  out - the output stream to write to - `java.io.OutputStream`

  throws: java.io.IOException - if an I/O error occurs, such as if the stream is closed"
  ([^ByteArrayOutputStream this ^java.io.OutputStream out]
    (-> this (.writeTo out))))

(defn to-input-stream
  "Gets the current contents of this byte stream as a Input Stream. The
   returned stream is backed by buffers of this stream,
   avoiding memory allocation and copy, thus saving space and time.

  returns: the current contents of this output stream. - `java.io.InputStream`"
  (^java.io.InputStream [^ByteArrayOutputStream this]
    (-> this (.toInputStream))))

(defn to-byte-array
  "Gets the current contents of this byte stream as a byte array.
   The result is independent of this stream.

  returns: the current contents of this output stream, as a byte array - `byte[]`"
  ([^ByteArrayOutputStream this]
    (-> this (.toByteArray))))

(defn to-string
  "Gets the current contents of this byte stream as a string
   using the specified encoding.

  enc - the name of the character encoding - `java.lang.String`

  returns: the string converted from the byte array - `java.lang.String`

  throws: java.io.UnsupportedEncodingException - if the encoding is not supported"
  (^java.lang.String [^ByteArrayOutputStream this ^java.lang.String enc]
    (-> this (.toString enc)))
  (^java.lang.String [^ByteArrayOutputStream this]
    (-> this (.toString))))

