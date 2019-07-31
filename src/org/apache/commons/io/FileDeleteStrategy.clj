(ns org.apache.commons.io.FileDeleteStrategy
  "Strategy for deleting files.

  There is more than one way to delete a file.
  You may want to limit access to certain directories, to only delete
  directories if they are empty, or maybe to force deletion.

  This class captures the strategy to use and is designed for user subclassing."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io FileDeleteStrategy]))

(def *-normal
  "Static Constant.

  The singleton instance for normal file deletion, which does not permit
   the deletion of directories that are not empty.

  type: org.apache.commons.io.FileDeleteStrategy"
  FileDeleteStrategy/NORMAL)

(def *-force
  "Static Constant.

  The singleton instance for forced file deletion, which always deletes,
   even if the file represents a non-empty directory.

  type: org.apache.commons.io.FileDeleteStrategy"
  FileDeleteStrategy/FORCE)

(defn delete-quietly
  "Deletes the file object, which may be a file or a directory.
   All IOExceptions are caught and false returned instead.
   If the file does not exist or is null, true is returned.

   Subclass writers should override doDelete(File), not this method.

  file-to-delete - the file to delete, null returns true - `java.io.File`

  returns: true if the file was deleted, or there was no such file - `boolean`"
  (^Boolean [^FileDeleteStrategy this ^java.io.File file-to-delete]
    (-> this (.deleteQuietly file-to-delete))))

(defn delete
  "Deletes the file object, which may be a file or a directory.
   If the file does not exist, the method just returns.

   Subclass writers should override doDelete(File), not this method.

  file-to-delete - the file to delete, not null - `java.io.File`

  throws: java.lang.NullPointerException - if the file is null"
  ([^FileDeleteStrategy this ^java.io.File file-to-delete]
    (-> this (.delete file-to-delete))))

(defn to-string
  "Gets a string describing the delete strategy.

  returns: a string describing the delete strategy - `java.lang.String`"
  (^java.lang.String [^FileDeleteStrategy this]
    (-> this (.toString))))

