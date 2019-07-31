(ns org.apache.commons.io.input.NullInputStream
  "A functional, light weight InputStream that emulates
  a stream of a specified size.

  This implementation provides a light weight
  object for testing with an InputStream
  where the contents don't matter.

  One use case would be for testing the handling of
  large InputStream as it can emulate that
  scenario without the overhead of actually processing
  large numbers of bytes - significantly speeding up
  test execution times.

  This implementation returns zero from the method that
  reads a byte and leaves the array unchanged in the read
  methods that are passed a byte array.
  If alternative data is required the processByte() and
  processBytes() methods can be implemented to generate
  data, for example:



   public class TestInputStream extends NullInputStream {
       public TestInputStream(int size) {
           super(size);
       }
       protected int processByte() {
           return ... // return required value here
       }
       protected void processBytes(byte[] bytes, int offset, int length) {
           for (int i = offset; i < length; i++) {
               bytes[i] = ... // set array value here
           }
       }
   }"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.input NullInputStream]))

(defn ->null-input-stream
  "Constructor.

  Create an InputStream that emulates a specified
   size with option settings.

  size - The size of the input stream to emulate. - `long`
  mark-supported - Whether this instance will support the mark() functionality. - `boolean`
  throw-eof-exception - Whether this implementation will throw an EOFException or return -1 when the end of file is reached. - `boolean`"
  (^NullInputStream [^Long size ^Boolean mark-supported ^Boolean throw-eof-exception]
    (new NullInputStream size mark-supported throw-eof-exception))
  (^NullInputStream [^Long size]
    (new NullInputStream size)))

(defn skip
  "Skip a specified number of bytes.

  number-of-bytes - The number of bytes to skip. - `long`

  returns: The number of bytes skipped or -1
   if the end of file has been reached and
   throwEofException is set to false. - `long`

  throws: java.io.EOFException - if the end of file is reached and throwEofException is set to true."
  (^Long [^NullInputStream this ^Long number-of-bytes]
    (-> this (.skip number-of-bytes))))

(defn get-position
  "Return the current position.

  returns: the current position. - `long`"
  (^Long [^NullInputStream this]
    (-> this (.getPosition))))

(defn read
  "Read the specified number bytes into an array.

  bytes - The byte array to read into. - `byte[]`
  offset - The offset to start reading bytes into. - `int`
  length - The number of bytes to read. - `int`

  returns: The number of bytes read or -1
   if the end of file has been reached and
   throwEofException is set to false. - `int`

  throws: java.io.EOFException - if the end of file is reached and throwEofException is set to true."
  (^Integer [^NullInputStream this bytes ^Integer offset ^Integer length]
    (-> this (.read bytes offset length)))
  (^Integer [^NullInputStream this bytes]
    (-> this (.read bytes)))
  (^Integer [^NullInputStream this]
    (-> this (.read))))

(defn reset
  "Reset the stream to the point when mark was last called.

  throws: java.lang.UnsupportedOperationException - if mark is not supported."
  ([^NullInputStream this]
    (-> this (.reset))))

(defn mark-supported
  "Indicates whether mark is supported.

  returns: Whether mark is supported or not. - `boolean`"
  (^Boolean [^NullInputStream this]
    (-> this (.markSupported))))

(defn close
  "Close this input stream - resets the internal state to
   the initial values.

  throws: java.io.IOException - If an error occurs."
  ([^NullInputStream this]
    (-> this (.close))))

(defn mark
  "Mark the current position.

  readlimit - The number of bytes before this marked position is invalid. - `int`

  throws: java.lang.UnsupportedOperationException - if mark is not supported."
  ([^NullInputStream this ^Integer readlimit]
    (-> this (.mark readlimit))))

(defn get-size
  "Return the size this InputStream emulates.

  returns: The size of the input stream to emulate. - `long`"
  (^Long [^NullInputStream this]
    (-> this (.getSize))))

(defn available
  "Return the number of bytes that can be read.

  returns: The number of bytes that can be read. - `int`"
  (^Integer [^NullInputStream this]
    (-> this (.available))))

