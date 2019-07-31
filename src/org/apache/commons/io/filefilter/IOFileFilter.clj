(ns org.apache.commons.io.filefilter.IOFileFilter
  "An interface which brings the FileFilter and FilenameFilter
  interfaces together."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.filefilter IOFileFilter]))

(defn accept
  "Checks to see if the File should be accepted by this filter.

   Defined in FilenameFilter.

  dir - the directory File to check - `java.io.File`
  name - the filename within the directory to check - `java.lang.String`

  returns: true if this file matches the test - `boolean`"
  (^Boolean [^IOFileFilter this ^java.io.File dir ^java.lang.String name]
    (-> this (.accept dir name)))
  (^Boolean [^IOFileFilter this ^java.io.File file]
    (-> this (.accept file))))

