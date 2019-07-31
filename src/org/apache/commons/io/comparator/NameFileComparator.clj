(ns org.apache.commons.io.comparator.NameFileComparator
  "Compare the names of two files for order (see File.getName()).

  This comparator can be used to sort lists or arrays of files
  by their name either in a case-sensitive, case-insensitive or
  system dependent case sensitive way. A number of singleton instances
  are provided for the various case sensitivity options (using IOCase)
  and the reverse of those options.

  Example of a case-sensitive file name sort using the
  NAME_COMPARATOR singleton instance:


        List<File> list = ...
        ((AbstractFileComparator) NameFileComparator.NAME_COMPARATOR).sort(list);

  Example of a reverse case-insensitive file name sort using the
  NAME_INSENSITIVE_REVERSE singleton instance:


        File[] array = ...
        ((AbstractFileComparator) NameFileComparator.NAME_INSENSITIVE_REVERSE).sort(array);"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.comparator NameFileComparator]))

(defn ->name-file-comparator
  "Constructor.

  Construct a file name comparator instance with the specified case-sensitivity.

  case-sensitivity - how to handle case sensitivity, null means case-sensitive - `org.apache.commons.io.IOCase`"
  (^NameFileComparator [^org.apache.commons.io.IOCase case-sensitivity]
    (new NameFileComparator case-sensitivity))
  (^NameFileComparator []
    (new NameFileComparator )))

(def *-name-comparator
  "Static Constant.

  Case-sensitive name comparator instance (see IOCase.SENSITIVE)

  type: java.util.Comparator<java.io.File>"
  NameFileComparator/NAME_COMPARATOR)

(def *-name-reverse
  "Static Constant.

  Reverse case-sensitive name comparator instance (see IOCase.SENSITIVE)

  type: java.util.Comparator<java.io.File>"
  NameFileComparator/NAME_REVERSE)

(def *-name-insensitive-comparator
  "Static Constant.

  Case-insensitive name comparator instance (see IOCase.INSENSITIVE)

  type: java.util.Comparator<java.io.File>"
  NameFileComparator/NAME_INSENSITIVE_COMPARATOR)

(def *-name-insensitive-reverse
  "Static Constant.

  Reverse case-insensitive name comparator instance (see IOCase.INSENSITIVE)

  type: java.util.Comparator<java.io.File>"
  NameFileComparator/NAME_INSENSITIVE_REVERSE)

(def *-name-system-comparator
  "Static Constant.

  System sensitive name comparator instance (see IOCase.SYSTEM)

  type: java.util.Comparator<java.io.File>"
  NameFileComparator/NAME_SYSTEM_COMPARATOR)

(def *-name-system-reverse
  "Static Constant.

  Reverse system sensitive name comparator instance (see IOCase.SYSTEM)

  type: java.util.Comparator<java.io.File>"
  NameFileComparator/NAME_SYSTEM_REVERSE)

(defn compare
  "Compare the names of two files with the specified case sensitivity.

  file-1 - The first file to compare - `java.io.File`
  file-2 - The second file to compare - `java.io.File`

  returns: a negative value if the first file's name
   is less than the second, zero if the names are the
   same and a positive value if the first files name
   is greater than the second file. - `int`"
  (^Integer [^NameFileComparator this ^java.io.File file-1 ^java.io.File file-2]
    (-> this (.compare file-1 file-2))))

(defn to-string
  "String representation of this file comparator.

  returns: String representation of this file comparator - `java.lang.String`"
  (^java.lang.String [^NameFileComparator this]
    (-> this (.toString))))

(defn sort
  "Sort an array of files.

   This method uses Arrays.sort(Object[], Comparator)
   and returns the original array.

  files - The files to sort, may be null - `java.io.File`

  returns: The sorted array - `java.io.File[]`"
  ([^NameFileComparator this ^java.io.File files]
    (-> this (.sort files))))

