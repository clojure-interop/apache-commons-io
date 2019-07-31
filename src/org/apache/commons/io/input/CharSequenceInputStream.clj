(ns org.apache.commons.io.input.CharSequenceInputStream
  "InputStream implementation that can read from String, StringBuffer,
  StringBuilder or CharBuffer.

  Note: Supports mark(int) and reset()."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.input CharSequenceInputStream]))

(defn ->char-sequence-input-stream
  "Constructor.

  Constructor.

  cs - the input character sequence - `java.lang.CharSequence`
  charset - the character set name to use - `java.nio.charset.Charset`
  buffer-size - the buffer size to use. - `int`

  throws: java.lang.IllegalArgumentException - if the buffer is not large enough to hold a complete character"
  (^CharSequenceInputStream [^java.lang.CharSequence cs ^java.nio.charset.Charset charset ^Integer buffer-size]
    (new CharSequenceInputStream cs charset buffer-size))
  (^CharSequenceInputStream [^java.lang.CharSequence cs ^java.nio.charset.Charset charset]
    (new CharSequenceInputStream cs charset)))

(defn read
  "b - `byte[]`
  off - `int`
  len - `int`

  returns: `int`

  throws: java.io.IOException"
  (^Integer [^CharSequenceInputStream this b ^Integer off ^Integer len]
    (-> this (.read b off len)))
  (^Integer [^CharSequenceInputStream this b]
    (-> this (.read b)))
  (^Integer [^CharSequenceInputStream this]
    (-> this (.read))))

(defn skip
  "n - `long`

  returns: `long`

  throws: java.io.IOException"
  (^Long [^CharSequenceInputStream this ^Long n]
    (-> this (.skip n))))

(defn available
  "Return an estimate of the number of bytes remaining in the byte stream.

  returns: the count of bytes that can be read without blocking (or returning EOF). - `int`

  throws: java.io.IOException - if an error occurs (probably not possible)"
  (^Integer [^CharSequenceInputStream this]
    (-> this (.available))))

(defn close
  "throws: java.io.IOException"
  ([^CharSequenceInputStream this]
    (-> this (.close))))

(defn mark
  "readlimit - max read limit (ignored) - `int`"
  ([^CharSequenceInputStream this ^Integer readlimit]
    (-> this (.mark readlimit))))

(defn reset
  "throws: java.io.IOException"
  ([^CharSequenceInputStream this]
    (-> this (.reset))))

(defn mark-supported
  "returns: `boolean`"
  (^Boolean [^CharSequenceInputStream this]
    (-> this (.markSupported))))

