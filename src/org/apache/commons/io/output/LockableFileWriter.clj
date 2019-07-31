(ns org.apache.commons.io.output.LockableFileWriter
  "FileWriter that will create and honor lock files to allow simple
  cross thread file lock handling.

  This class provides a simple alternative to FileWriter
  that will use a lock file to prevent duplicate writes.

  N.B. the lock file is deleted when close() is called
  - or if the main file cannot be opened initially.
  In the (unlikely) event that the lockfile cannot be deleted,
  this is not reported, and subsequent requests using
  the same lockfile will fail.

  By default, the file will be overwritten, but this may be changed to append.
  The lock directory may be specified, but defaults to the system property
  java.io.tmpdir.
  The encoding may also be specified, and defaults to the platform default."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.output LockableFileWriter]))

(defn ->lockable-file-writer
  "Constructor.

  Constructs a LockableFileWriter with a file encoding.

  file - the file to write to, not null - `java.io.File`
  encoding - the encoding to use, null means platform default - `java.nio.charset.Charset`
  append - true if content should be appended, false to overwrite - `boolean`
  lock-dir - the directory in which the lock file should be held - `java.lang.String`

  throws: java.lang.NullPointerException - if the file is null"
  (^LockableFileWriter [^java.io.File file ^java.nio.charset.Charset encoding ^Boolean append ^java.lang.String lock-dir]
    (new LockableFileWriter file encoding append lock-dir))
  (^LockableFileWriter [^java.lang.String file-name ^Boolean append ^java.lang.String lock-dir]
    (new LockableFileWriter file-name append lock-dir))
  (^LockableFileWriter [^java.lang.String file-name ^Boolean append]
    (new LockableFileWriter file-name append))
  (^LockableFileWriter [^java.lang.String file-name]
    (new LockableFileWriter file-name)))

(defn close
  "Closes the file writer and deletes the lockfile (if possible).

  throws: java.io.IOException - if an I/O error occurs"
  ([^LockableFileWriter this]
    (-> this (.close))))

(defn write
  "Write the specified characters from an array.

  chr - the characters to write - `char[]`
  st - The start offset - `int`
  end - The number of characters to write - `int`

  throws: java.io.IOException - if an I/O error occurs"
  ([^LockableFileWriter this chr ^Integer st ^Integer end]
    (-> this (.write chr st end)))
  ([^LockableFileWriter this ^Integer idx]
    (-> this (.write idx))))

(defn flush
  "Flush the stream.

  throws: java.io.IOException - if an I/O error occurs"
  ([^LockableFileWriter this]
    (-> this (.flush))))

