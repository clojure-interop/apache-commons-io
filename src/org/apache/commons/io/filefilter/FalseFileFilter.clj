(ns org.apache.commons.io.filefilter.FalseFileFilter
  "A file filter that always returns false."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.filefilter FalseFileFilter]))

(def *-false
  "Static Constant.

  Singleton instance of false filter.

  type: org.apache.commons.io.filefilter.IOFileFilter"
  FalseFileFilter/FALSE)

(def *-instance
  "Static Constant.

  Singleton instance of false filter.
   Please use the identical FalseFileFilter.FALSE constant.
   The new name is more JDK 1.5 friendly as it doesn't clash with other
   values when using static imports.

  type: org.apache.commons.io.filefilter.IOFileFilter"
  FalseFileFilter/INSTANCE)

(defn accept
  "Returns false.

  dir - the directory to check (ignored) - `java.io.File`
  name - the filename (ignored) - `java.lang.String`

  returns: false - `boolean`"
  (^Boolean [^FalseFileFilter this ^java.io.File dir ^java.lang.String name]
    (-> this (.accept dir name)))
  (^Boolean [^FalseFileFilter this ^java.io.File file]
    (-> this (.accept file))))

