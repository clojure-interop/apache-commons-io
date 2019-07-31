(ns org.apache.commons.io.filefilter.WildcardFilter
  "Deprecated.
 Use WildcardFileFilter. Deprecated as this class performs directory
  filtering which it shouldn't do, but that can't be removed due to compatibility."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.filefilter WildcardFilter]))

(defn ->wildcard-filter
  "Constructor.

  Deprecated.

  wildcard - the wildcard to match - `java.lang.String`

  throws: java.lang.IllegalArgumentException - if the pattern is null"
  (^WildcardFilter [^java.lang.String wildcard]
    (new WildcardFilter wildcard)))

(defn accept
  "Deprecated.

  dir - the file directory - `java.io.File`
  name - the filename - `java.lang.String`

  returns: true if the filename matches one of the wildcards - `boolean`"
  (^Boolean [^WildcardFilter this ^java.io.File dir ^java.lang.String name]
    (-> this (.accept dir name)))
  (^Boolean [^WildcardFilter this ^java.io.File file]
    (-> this (.accept file))))

