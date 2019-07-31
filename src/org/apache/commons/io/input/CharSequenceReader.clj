(ns org.apache.commons.io.input.CharSequenceReader
  "Reader implementation that can read from String, StringBuffer,
  StringBuilder or CharBuffer.

  Note: Supports mark(int) and reset()."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.input CharSequenceReader]))

(defn ->char-sequence-reader
  "Constructor.

  Construct a new instance with the specified character sequence.

  char-sequence - The character sequence, may be null - `java.lang.CharSequence`"
  (^CharSequenceReader [^java.lang.CharSequence char-sequence]
    (new CharSequenceReader char-sequence)))

(defn close
  "Close resets the file back to the start and removes any marked position."
  ([^CharSequenceReader this]
    (-> this (.close))))

(defn mark
  "Mark the current position.

  read-ahead-limit - ignored - `int`"
  ([^CharSequenceReader this ^Integer read-ahead-limit]
    (-> this (.mark read-ahead-limit))))

(defn mark-supported
  "Mark is supported (returns true).

  returns: true - `boolean`"
  (^Boolean [^CharSequenceReader this]
    (-> this (.markSupported))))

(defn read
  "Read the specified number of characters into the array.

  array - The array to store the characters in - `char[]`
  offset - The starting position in the array to store - `int`
  length - The maximum number of characters to read - `int`

  returns: The number of characters read or -1 if there are
   no more - `int`"
  (^Integer [^CharSequenceReader this array ^Integer offset ^Integer length]
    (-> this (.read array offset length)))
  (^Integer [^CharSequenceReader this]
    (-> this (.read))))

(defn reset
  "Reset the reader to the last marked position (or the beginning if
   mark has not been called)."
  ([^CharSequenceReader this]
    (-> this (.reset))))

(defn skip
  "Skip the specified number of characters.

  n - The number of characters to skip - `long`

  returns: The actual number of characters skipped - `long`"
  (^Long [^CharSequenceReader this ^Long n]
    (-> this (.skip n))))

(defn to-string
  "Return a String representation of the underlying
   character sequence.

  returns: The contents of the character sequence - `java.lang.String`"
  (^java.lang.String [^CharSequenceReader this]
    (-> this (.toString))))

