(ns org.apache.commons.io.comparator.PathFileComparator
  "Compare the path of two files for order (see File.getPath()).

  This comparator can be used to sort lists or arrays of files
  by their path either in a case-sensitive, case-insensitive or
  system dependent case sensitive way. A number of singleton instances
  are provided for the various case sensitivity options (using IOCase)
  and the reverse of those options.

  Example of a case-sensitive file path sort using the
  PATH_COMPARATOR singleton instance:


        List<File> list = ...
        ((AbstractFileComparator) PathFileComparator.PATH_COMPARATOR).sort(list);

  Example of a reverse case-insensitive file path sort using the
  PATH_INSENSITIVE_REVERSE singleton instance:


        File[] array = ...
        ((AbstractFileComparator) PathFileComparator.PATH_INSENSITIVE_REVERSE).sort(array);"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.comparator PathFileComparator]))

(defn ->path-file-comparator
  "Constructor.

  Construct a file path comparator instance with the specified case-sensitivity.

  case-sensitivity - how to handle case sensitivity, null means case-sensitive - `org.apache.commons.io.IOCase`"
  (^PathFileComparator [^org.apache.commons.io.IOCase case-sensitivity]
    (new PathFileComparator case-sensitivity))
  (^PathFileComparator []
    (new PathFileComparator )))

(def *-path-comparator
  "Static Constant.

  Case-sensitive path comparator instance (see IOCase.SENSITIVE)

  type: java.util.Comparator<java.io.File>"
  PathFileComparator/PATH_COMPARATOR)

(def *-path-reverse
  "Static Constant.

  Reverse case-sensitive path comparator instance (see IOCase.SENSITIVE)

  type: java.util.Comparator<java.io.File>"
  PathFileComparator/PATH_REVERSE)

(def *-path-insensitive-comparator
  "Static Constant.

  Case-insensitive path comparator instance (see IOCase.INSENSITIVE)

  type: java.util.Comparator<java.io.File>"
  PathFileComparator/PATH_INSENSITIVE_COMPARATOR)

(def *-path-insensitive-reverse
  "Static Constant.

  Reverse case-insensitive path comparator instance (see IOCase.INSENSITIVE)

  type: java.util.Comparator<java.io.File>"
  PathFileComparator/PATH_INSENSITIVE_REVERSE)

(def *-path-system-comparator
  "Static Constant.

  System sensitive path comparator instance (see IOCase.SYSTEM)

  type: java.util.Comparator<java.io.File>"
  PathFileComparator/PATH_SYSTEM_COMPARATOR)

(def *-path-system-reverse
  "Static Constant.

  Reverse system sensitive path comparator instance (see IOCase.SYSTEM)

  type: java.util.Comparator<java.io.File>"
  PathFileComparator/PATH_SYSTEM_REVERSE)

(defn compare
  "Compare the paths of two files the specified case sensitivity.

  file-1 - The first file to compare - `java.io.File`
  file-2 - The second file to compare - `java.io.File`

  returns: a negative value if the first file's path
   is less than the second, zero if the paths are the
   same and a positive value if the first files path
   is greater than the second file. - `int`"
  (^Integer [^PathFileComparator this ^java.io.File file-1 ^java.io.File file-2]
    (-> this (.compare file-1 file-2))))

(defn to-string
  "String representation of this file comparator.

  returns: String representation of this file comparator - `java.lang.String`"
  (^java.lang.String [^PathFileComparator this]
    (-> this (.toString))))

(defn sort
  "Sort an array of files.

   This method uses Arrays.sort(Object[], Comparator)
   and returns the original array.

  files - The files to sort, may be null - `java.io.File`

  returns: The sorted array - `java.io.File[]`"
  ([^PathFileComparator this ^java.io.File files]
    (-> this (.sort files))))

