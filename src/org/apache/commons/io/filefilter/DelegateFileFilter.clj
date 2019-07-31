(ns org.apache.commons.io.filefilter.DelegateFileFilter
  "This class turns a Java FileFilter or FilenameFilter into an IO FileFilter."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.filefilter DelegateFileFilter]))

(defn ->delegate-file-filter
  "Constructor.

  Constructs a delegate file filter around an existing FilenameFilter.

  filter - the filter to decorate - `java.io.FilenameFilter`"
  (^DelegateFileFilter [^java.io.FilenameFilter filter]
    (new DelegateFileFilter filter)))

(defn accept
  "Checks the filter.

  dir - the directory - `java.io.File`
  name - the filename in the directory - `java.lang.String`

  returns: true if the filter matches - `boolean`"
  (^Boolean [^DelegateFileFilter this ^java.io.File dir ^java.lang.String name]
    (-> this (.accept dir name)))
  (^Boolean [^DelegateFileFilter this ^java.io.File file]
    (-> this (.accept file))))

(defn to-string
  "Provide a String representation of this file filter.

  returns: a String representation - `java.lang.String`"
  (^java.lang.String [^DelegateFileFilter this]
    (-> this (.toString))))

