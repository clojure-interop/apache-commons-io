(ns org.apache.commons.io.input.BoundedReader
  "A reader that imposes a limit to the number of characters that can be read from
  an underlying reader, returning eof when this limit is reached -regardless of state of
  underlying reader.


  One use case is to avoid overrunning the readAheadLimit supplied to
  java.io.Reader#mark(int), since reading too many characters removes the
  ability to do a successful reset."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.input BoundedReader]))

(defn ->bounded-reader
  "Constructor.

  Constructs a bounded reader

  target - The target stream that will be used - `java.io.Reader`
  max-chars-from-target-reader - The maximum number of characters that can be read from target - `int`

  throws: java.io.IOException - if mark fails"
  (^BoundedReader [^java.io.Reader target ^Integer max-chars-from-target-reader]
    (new BoundedReader target max-chars-from-target-reader)))

(defn close
  "Closes the target

  throws: java.io.IOException - If an I/O error occurs while calling the underlying reader's close method"
  ([^BoundedReader this]
    (-> this (.close))))

(defn reset
  "Resets the target to the latest mark,

  throws: java.io.IOException - If an I/O error occurs while calling the underlying reader's reset method"
  ([^BoundedReader this]
    (-> this (.reset))))

(defn mark
  "marks the target stream

  read-ahead-limit - The number of characters that can be read while still retaining the ability to do #reset(). Note that this parameter is not validated with respect to maxCharsFromTargetReader. There is no way to pass past maxCharsFromTargetReader, even if this value is greater. - `int`

  throws: java.io.IOException - If an I/O error occurs while calling the underlying reader's mark method"
  ([^BoundedReader this ^Integer read-ahead-limit]
    (-> this (.mark read-ahead-limit))))

(defn read
  "Reads into an array

  cbuf - The buffer to fill - `char[]`
  off - The offset - `int`
  len - The number of chars to read - `int`

  returns: the number of chars read - `int`

  throws: java.io.IOException - If an I/O error occurs while calling the underlying reader's read method"
  (^Integer [^BoundedReader this cbuf ^Integer off ^Integer len]
    (-> this (.read cbuf off len)))
  (^Integer [^BoundedReader this]
    (-> this (.read))))

