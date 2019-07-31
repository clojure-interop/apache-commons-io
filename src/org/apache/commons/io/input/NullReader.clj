(ns org.apache.commons.io.input.NullReader
  "A functional, light weight Reader that emulates
  a reader of a specified size.

  This implementation provides a light weight
  object for testing with an Reader
  where the contents don't matter.

  One use case would be for testing the handling of
  large Reader as it can emulate that
  scenario without the overhead of actually processing
  large numbers of characters - significantly speeding up
  test execution times.

  This implementation returns a space from the method that
  reads a character and leaves the array unchanged in the read
  methods that are passed a character array.
  If alternative data is required the processChar() and
  processChars() methods can be implemented to generate
  data, for example:



   public class TestReader extends NullReader {
       public TestReader(int size) {
           super(size);
       }
       protected char processChar() {
           return ... // return required value here
       }
       protected void processChars(char[] chars, int offset, int length) {
           for (int i = offset; i < length; i++) {
               chars[i] = ... // set array value here
           }
       }
   }"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.input NullReader]))

(defn ->null-reader
  "Constructor.

  Create a Reader that emulates a specified
   size with option settings.

  size - The size of the reader to emulate. - `long`
  mark-supported - Whether this instance will support the mark() functionality. - `boolean`
  throw-eof-exception - Whether this implementation will throw an EOFException or return -1 when the end of file is reached. - `boolean`"
  (^NullReader [^Long size ^Boolean mark-supported ^Boolean throw-eof-exception]
    (new NullReader size mark-supported throw-eof-exception))
  (^NullReader [^Long size]
    (new NullReader size)))

(defn get-position
  "Return the current position.

  returns: the current position. - `long`"
  (^Long [^NullReader this]
    (-> this (.getPosition))))

(defn get-size
  "Return the size this Reader emulates.

  returns: The size of the reader to emulate. - `long`"
  (^Long [^NullReader this]
    (-> this (.getSize))))

(defn close
  "Close this Reader - resets the internal state to
   the initial values.

  throws: java.io.IOException - If an error occurs."
  ([^NullReader this]
    (-> this (.close))))

(defn mark
  "Mark the current position.

  readlimit - The number of characters before this marked position is invalid. - `int`

  throws: java.lang.UnsupportedOperationException - if mark is not supported."
  ([^NullReader this ^Integer readlimit]
    (-> this (.mark readlimit))))

(defn mark-supported
  "Indicates whether mark is supported.

  returns: Whether mark is supported or not. - `boolean`"
  (^Boolean [^NullReader this]
    (-> this (.markSupported))))

(defn read
  "Read the specified number characters into an array.

  chars - The character array to read into. - `char[]`
  offset - The offset to start reading characters into. - `int`
  length - The number of characters to read. - `int`

  returns: The number of characters read or -1
   if the end of file has been reached and
   throwEofException is set to false. - `int`

  throws: java.io.EOFException - if the end of file is reached and throwEofException is set to true."
  (^Integer [^NullReader this chars ^Integer offset ^Integer length]
    (-> this (.read chars offset length)))
  (^Integer [^NullReader this chars]
    (-> this (.read chars)))
  (^Integer [^NullReader this]
    (-> this (.read))))

(defn reset
  "Reset the stream to the point when mark was last called.

  throws: java.lang.UnsupportedOperationException - if mark is not supported."
  ([^NullReader this]
    (-> this (.reset))))

(defn skip
  "Skip a specified number of characters.

  number-of-chars - The number of characters to skip. - `long`

  returns: The number of characters skipped or -1
   if the end of file has been reached and
   throwEofException is set to false. - `long`

  throws: java.io.EOFException - if the end of file is reached and throwEofException is set to true."
  (^Long [^NullReader this ^Long number-of-chars]
    (-> this (.skip number-of-chars))))

