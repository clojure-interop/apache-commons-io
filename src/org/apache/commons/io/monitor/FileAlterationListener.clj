(ns org.apache.commons.io.monitor.FileAlterationListener
  "A listener that receives events of file system modifications.

  Register FileAlterationListeners with a FileAlterationObserver."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.monitor FileAlterationListener]))

(defn on-start
  "File system observer started checking event.

  observer - The file system observer - `org.apache.commons.io.monitor.FileAlterationObserver`"
  ([^FileAlterationListener this ^org.apache.commons.io.monitor.FileAlterationObserver observer]
    (-> this (.onStart observer))))

(defn on-directory-create
  "Directory created Event.

  directory - The directory created - `java.io.File`"
  ([^FileAlterationListener this ^java.io.File directory]
    (-> this (.onDirectoryCreate directory))))

(defn on-directory-change
  "Directory changed Event.

  directory - The directory changed - `java.io.File`"
  ([^FileAlterationListener this ^java.io.File directory]
    (-> this (.onDirectoryChange directory))))

(defn on-directory-delete
  "Directory deleted Event.

  directory - The directory deleted - `java.io.File`"
  ([^FileAlterationListener this ^java.io.File directory]
    (-> this (.onDirectoryDelete directory))))

(defn on-file-create
  "File created Event.

  file - The file created - `java.io.File`"
  ([^FileAlterationListener this ^java.io.File file]
    (-> this (.onFileCreate file))))

(defn on-file-change
  "File changed Event.

  file - The file changed - `java.io.File`"
  ([^FileAlterationListener this ^java.io.File file]
    (-> this (.onFileChange file))))

(defn on-file-delete
  "File deleted Event.

  file - The file deleted - `java.io.File`"
  ([^FileAlterationListener this ^java.io.File file]
    (-> this (.onFileDelete file))))

(defn on-stop
  "File system observer finished checking event.

  observer - The file system observer - `org.apache.commons.io.monitor.FileAlterationObserver`"
  ([^FileAlterationListener this ^org.apache.commons.io.monitor.FileAlterationObserver observer]
    (-> this (.onStop observer))))

