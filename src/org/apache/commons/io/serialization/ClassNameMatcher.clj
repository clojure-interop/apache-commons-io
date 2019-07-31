(ns org.apache.commons.io.serialization.ClassNameMatcher
  "An object that matches a Class name to a condition."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.serialization ClassNameMatcher]))

(defn matches
  "Returns true if the supplied class name matches this object's condition.

  class-name - fully qualified class name - `java.lang.String`

  returns: true if the class name matches this object's condition - `boolean`"
  (^Boolean [^ClassNameMatcher this ^java.lang.String class-name]
    (-> this (.matches class-name))))

