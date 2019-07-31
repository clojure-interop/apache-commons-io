(ns org.apache.commons.io.comparator.DefaultFileComparator
  "Compare two files using the default File.compareTo(File) method.

  This comparator can be used to sort lists or arrays of files
  by using the default file comparison.

  Example of sorting a list of files using the
  DEFAULT_COMPARATOR singleton instance:


        List<File> list = ...
        ((AbstractFileComparator) DefaultFileComparator.DEFAULT_COMPARATOR).sort(list);

  Example of doing a reverse sort of an array of files using the
  DEFAULT_REVERSE singleton instance:


        File[] array = ...
        ((AbstractFileComparator) DefaultFileComparator.DEFAULT_REVERSE).sort(array);"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.comparator DefaultFileComparator]))

(defn ->default-file-comparator
  "Constructor."
  (^DefaultFileComparator []
    (new DefaultFileComparator )))

(def *-default-comparator
  "Static Constant.

  Singleton default comparator instance

  type: java.util.Comparator<java.io.File>"
  DefaultFileComparator/DEFAULT_COMPARATOR)

(def *-default-reverse
  "Static Constant.

  Singleton reverse default comparator instance

  type: java.util.Comparator<java.io.File>"
  DefaultFileComparator/DEFAULT_REVERSE)

(defn compare
  "Compare the two files using the File.compareTo(File) method.

  file-1 - The first file to compare - `java.io.File`
  file-2 - The second file to compare - `java.io.File`

  returns: the result of calling file1's
   File.compareTo(File) with file2 as the parameter. - `int`"
  (^Integer [^DefaultFileComparator this ^java.io.File file-1 ^java.io.File file-2]
    (-> this (.compare file-1 file-2))))

(defn sort
  "Sort an array of files.

   This method uses Arrays.sort(Object[], Comparator)
   and returns the original array.

  files - The files to sort, may be null - `java.io.File`

  returns: The sorted array - `java.io.File[]`"
  ([^DefaultFileComparator this ^java.io.File files]
    (-> this (.sort files))))

(defn to-string
  "String representation of this file comparator.

  returns: String representation of this file comparator - `java.lang.String`"
  (^java.lang.String [^DefaultFileComparator this]
    (-> this (.toString))))

