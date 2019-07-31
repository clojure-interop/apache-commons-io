(ns org.apache.commons.io.filefilter.NotFileFilter
  "This filter produces a logical NOT of the filters specified."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.filefilter NotFileFilter]))

(defn ->not-file-filter
  "Constructor.

  Constructs a new file filter that NOTs the result of another filter.

  filter - the filter, must not be null - `org.apache.commons.io.filefilter.IOFileFilter`

  throws: java.lang.IllegalArgumentException - if the filter is null"
  (^NotFileFilter [^org.apache.commons.io.filefilter.IOFileFilter filter]
    (new NotFileFilter filter)))

(defn accept
  "Returns the logical NOT of the underlying filter's return value for the same arguments.

  file - the File directory - `java.io.File`
  name - the filename - `java.lang.String`

  returns: true if the filter returns false - `boolean`"
  (^Boolean [^NotFileFilter this ^java.io.File file ^java.lang.String name]
    (-> this (.accept file name)))
  (^Boolean [^NotFileFilter this ^java.io.File file]
    (-> this (.accept file))))

(defn to-string
  "Provide a String representation of this file filter.

  returns: a String representation - `java.lang.String`"
  (^java.lang.String [^NotFileFilter this]
    (-> this (.toString))))

