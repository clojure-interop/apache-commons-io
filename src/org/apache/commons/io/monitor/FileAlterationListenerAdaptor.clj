(ns org.apache.commons.io.monitor.FileAlterationListenerAdaptor
  "Convenience FileAlterationListener implementation that does nothing."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.monitor FileAlterationListenerAdaptor]))

(defn ->file-alteration-listener-adaptor
  "Constructor."
  (^FileAlterationListenerAdaptor []
    (new FileAlterationListenerAdaptor )))

(defn on-start
  "File system observer started checking event.

  observer - The file system observer (ignored) - `org.apache.commons.io.monitor.FileAlterationObserver`"
  ([^FileAlterationListenerAdaptor this ^org.apache.commons.io.monitor.FileAlterationObserver observer]
    (-> this (.onStart observer))))

(defn on-directory-create
  "Directory created Event.

  directory - The directory created (ignored) - `java.io.File`"
  ([^FileAlterationListenerAdaptor this ^java.io.File directory]
    (-> this (.onDirectoryCreate directory))))

(defn on-directory-change
  "Directory changed Event.

  directory - The directory changed (ignored) - `java.io.File`"
  ([^FileAlterationListenerAdaptor this ^java.io.File directory]
    (-> this (.onDirectoryChange directory))))

(defn on-directory-delete
  "Directory deleted Event.

  directory - The directory deleted (ignored) - `java.io.File`"
  ([^FileAlterationListenerAdaptor this ^java.io.File directory]
    (-> this (.onDirectoryDelete directory))))

(defn on-file-create
  "File created Event.

  file - The file created (ignored) - `java.io.File`"
  ([^FileAlterationListenerAdaptor this ^java.io.File file]
    (-> this (.onFileCreate file))))

(defn on-file-change
  "File changed Event.

  file - The file changed (ignored) - `java.io.File`"
  ([^FileAlterationListenerAdaptor this ^java.io.File file]
    (-> this (.onFileChange file))))

(defn on-file-delete
  "File deleted Event.

  file - The file deleted (ignored) - `java.io.File`"
  ([^FileAlterationListenerAdaptor this ^java.io.File file]
    (-> this (.onFileDelete file))))

(defn on-stop
  "File system observer finished checking event.

  observer - The file system observer (ignored) - `org.apache.commons.io.monitor.FileAlterationObserver`"
  ([^FileAlterationListenerAdaptor this ^org.apache.commons.io.monitor.FileAlterationObserver observer]
    (-> this (.onStop observer))))

