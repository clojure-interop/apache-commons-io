(ns org.apache.commons.io.monitor.FileEntry
  "The state of a file or directory, capturing the following File attributes at a point in time.

    File Name (see File.getName())
    Exists - whether the file exists or not (see File.exists())
    Directory - whether the file is a directory or not (see File.isDirectory())
    Last Modified Date/Time (see File.lastModified())
    Length (see File.length()) - directories treated as zero
    Children - contents of a directory (see File.listFiles(java.io.FileFilter))


  Custom Implementations

  If the state of additional File attributes is required then create a custom
  FileEntry with properties for those attributes. Override the
  newChildInstance(File) to return a new instance of the appropriate type.
  You may also want to override the refresh(File) method."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.monitor FileEntry]))

(defn ->file-entry
  "Constructor.

  Construct a new monitor for a specified File.

  parent - The parent - `org.apache.commons.io.monitor.FileEntry`
  file - The file being monitored - `java.io.File`"
  (^FileEntry [^org.apache.commons.io.monitor.FileEntry parent ^java.io.File file]
    (new FileEntry parent file))
  (^FileEntry [^java.io.File file]
    (new FileEntry file)))

(defn get-children
  "Return the directory's files.

  returns: This directory's files or an empty
   array if the file is not a directory or the
   directory is empty - `org.apache.commons.io.monitor.FileEntry[]`"
  ([^FileEntry this]
    (-> this (.getChildren))))

(defn new-child-instance
  "Create a new child instance.

   Custom implementations should override this method to return
   a new instance of the appropriate type.

  file - The child file - `java.io.File`

  returns: a new child instance - `org.apache.commons.io.monitor.FileEntry`"
  (^org.apache.commons.io.monitor.FileEntry [^FileEntry this ^java.io.File file]
    (-> this (.newChildInstance file))))

(defn set-name
  "Set the file name.

  name - the file name - `java.lang.String`"
  ([^FileEntry this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-exists
  "Set whether the file existed the last time it
   was checked.

  exists - whether the file exists or not - `boolean`"
  ([^FileEntry this ^Boolean exists]
    (-> this (.setExists exists))))

(defn set-length
  "Set the length.

  length - the length - `long`"
  ([^FileEntry this ^Long length]
    (-> this (.setLength length))))

(defn get-last-modified
  "Return the last modified time from the last time it
   was checked.

  returns: the last modified time - `long`"
  (^Long [^FileEntry this]
    (-> this (.getLastModified))))

(defn refresh
  "Refresh the attributes from the File, indicating
   whether the file has changed.

   This implementation refreshes the name, exists,
   directory, lastModified and length
   properties.

   The exists, directory, lastModified
   and length properties are compared for changes

  file - the file instance to compare to - `java.io.File`

  returns: true if the file has changed, otherwise false - `boolean`"
  (^Boolean [^FileEntry this ^java.io.File file]
    (-> this (.refresh file))))

(defn get-name
  "Return the file name.

  returns: the file name - `java.lang.String`"
  (^java.lang.String [^FileEntry this]
    (-> this (.getName))))

(defn directory?
  "Indicate whether the file is a directory or not.

  returns: whether the file is a directory or not - `boolean`"
  (^Boolean [^FileEntry this]
    (-> this (.isDirectory))))

(defn get-parent
  "Return the parent entry.

  returns: the parent entry - `org.apache.commons.io.monitor.FileEntry`"
  (^org.apache.commons.io.monitor.FileEntry [^FileEntry this]
    (-> this (.getParent))))

(defn set-last-modified
  "Return the last modified time from the last time it
   was checked.

  last-modified - The last modified time - `long`"
  ([^FileEntry this ^Long last-modified]
    (-> this (.setLastModified last-modified))))

(defn exists?
  "Indicate whether the file existed the last time it
   was checked.

  returns: whether the file existed - `boolean`"
  (^Boolean [^FileEntry this]
    (-> this (.isExists))))

(defn get-level
  "Return the level

  returns: the level - `int`"
  (^Integer [^FileEntry this]
    (-> this (.getLevel))))

(defn get-length
  "Return the length.

  returns: the length - `long`"
  (^Long [^FileEntry this]
    (-> this (.getLength))))

(defn get-file
  "Return the file being monitored.

  returns: the file being monitored - `java.io.File`"
  (^java.io.File [^FileEntry this]
    (-> this (.getFile))))

(defn set-directory
  "Set whether the file is a directory or not.

  directory - whether the file is a directory or not - `boolean`"
  ([^FileEntry this ^Boolean directory]
    (-> this (.setDirectory directory))))

(defn set-children
  "Set the directory's files.

  children - This directory's files, may be null - `org.apache.commons.io.monitor.FileEntry[]`"
  ([^FileEntry this children]
    (-> this (.setChildren children))))

