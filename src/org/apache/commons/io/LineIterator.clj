(ns org.apache.commons.io.LineIterator
  "An Iterator over the lines in a Reader.

  LineIterator holds a reference to an open Reader.
  When you have finished with the iterator you should close the reader
  to free internal resources. This can be done by closing the reader directly,
  or by calling the close() or closeQuietly(LineIterator)
  method on the iterator.

  The recommended usage pattern is:


  LineIterator it = FileUtils.lineIterator(file, \"UTF-8\");
  try {
    while (it.hasNext()) {
      String line = it.nextLine();
      // do something with line
    }
  } finally {
    it.close();
  }"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io LineIterator]))

(defn ->line-iterator
  "Constructor.

  Constructs an iterator of the lines for a Reader.

  reader - the Reader to read from, not null - `java.io.Reader`

  throws: java.lang.IllegalArgumentException - if the reader is null"
  (^LineIterator [^java.io.Reader reader]
    (new LineIterator reader)))

(defn *close-quietly
  "Deprecated. As of 2.6 removed without replacement. Please use the try-with-resources statement or handle
   suppressed exceptions manually.

  iterator - The iterator to close, or null. - `org.apache.commons.io.LineIterator`"
  ([^org.apache.commons.io.LineIterator iterator]
    (LineIterator/closeQuietly iterator)))

(defn has-next?
  "Indicates whether the Reader has more lines.
   If there is an IOException then close() will
   be called on this instance.

  returns: true if the Reader has more lines - `boolean`

  throws: java.lang.IllegalStateException - if an IO exception occurs"
  (^Boolean [^LineIterator this]
    (-> this (.hasNext))))

(defn next
  "Returns the next line in the wrapped Reader.

  returns: the next line from the input - `java.lang.String`

  throws: java.util.NoSuchElementException - if there is no line to return"
  (^java.lang.String [^LineIterator this]
    (-> this (.next))))

(defn next-line
  "Returns the next line in the wrapped Reader.

  returns: the next line from the input - `java.lang.String`

  throws: java.util.NoSuchElementException - if there is no line to return"
  (^java.lang.String [^LineIterator this]
    (-> this (.nextLine))))

(defn close
  "Closes the underlying Reader.
   This method is useful if you only want to process the first few
   lines of a larger file. If you do not close the iterator
   then the Reader remains open.
   This method can safely be called multiple times.

  throws: java.io.IOException - if closing the underlying Reader fails."
  ([^LineIterator this]
    (-> this (.close))))

(defn remove
  "Unsupported.

  throws: java.lang.UnsupportedOperationException - always"
  ([^LineIterator this]
    (-> this (.remove))))

