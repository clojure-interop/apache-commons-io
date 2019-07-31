(ns org.apache.commons.io.filefilter.AbstractFileFilter
  "An abstract class which implements the Java FileFilter and FilenameFilter
  interfaces via the IOFileFilter interface.

  Note that a subclass must override one of the accept methods,
  otherwise your class will infinitely loop."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.filefilter AbstractFileFilter]))

(defn ->abstract-file-filter
  "Constructor."
  (^AbstractFileFilter []
    (new AbstractFileFilter )))

(defn accept
  "Checks to see if the File should be accepted by this filter.

  dir - the directory File to check - `java.io.File`
  name - the filename within the directory to check - `java.lang.String`

  returns: true if this file matches the test - `boolean`"
  (^Boolean [^AbstractFileFilter this ^java.io.File dir ^java.lang.String name]
    (-> this (.accept dir name)))
  (^Boolean [^AbstractFileFilter this ^java.io.File file]
    (-> this (.accept file))))

(defn to-string
  "Provide a String representation of this file filter.

  returns: a String representation - `java.lang.String`"
  (^java.lang.String [^AbstractFileFilter this]
    (-> this (.toString))))

