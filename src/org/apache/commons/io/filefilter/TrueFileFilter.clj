(ns org.apache.commons.io.filefilter.TrueFileFilter
  "A file filter that always returns true."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.filefilter TrueFileFilter]))

(def *-true
  "Static Constant.

  Singleton instance of true filter.

  type: org.apache.commons.io.filefilter.IOFileFilter"
  TrueFileFilter/TRUE)

(def *-instance
  "Static Constant.

  Singleton instance of true filter.
   Please use the identical TrueFileFilter.TRUE constant.
   The new name is more JDK 1.5 friendly as it doesn't clash with other
   values when using static imports.

  type: org.apache.commons.io.filefilter.IOFileFilter"
  TrueFileFilter/INSTANCE)

(defn accept
  "Returns true.

  dir - the directory to check (ignored) - `java.io.File`
  name - the filename (ignored) - `java.lang.String`

  returns: true - `boolean`"
  (^Boolean [^TrueFileFilter this ^java.io.File dir ^java.lang.String name]
    (-> this (.accept dir name)))
  (^Boolean [^TrueFileFilter this ^java.io.File file]
    (-> this (.accept file))))

