(ns org.apache.commons.io.comparator.LastModifiedFileComparator
  "Compare the last modified date/time of two files for order
  (see File.lastModified()).

  This comparator can be used to sort lists or arrays of files
  by their last modified date/time.

  Example of sorting a list of files using the
  LASTMODIFIED_COMPARATOR singleton instance:


        List<File> list = ...
        ((AbstractFileComparator) LastModifiedFileComparator.LASTMODIFIED_COMPARATOR).sort(list);

  Example of doing a reverse sort of an array of files using the
  LASTMODIFIED_REVERSE singleton instance:


        File[] array = ...
        ((AbstractFileComparator) LastModifiedFileComparator.LASTMODIFIED_REVERSE).sort(array);"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.comparator LastModifiedFileComparator]))

(defn ->last-modified-file-comparator
  "Constructor."
  (^LastModifiedFileComparator []
    (new LastModifiedFileComparator )))

(def *-lastmodified-comparator
  "Static Constant.

  Last modified comparator instance

  type: java.util.Comparator<java.io.File>"
  LastModifiedFileComparator/LASTMODIFIED_COMPARATOR)

(def *-lastmodified-reverse
  "Static Constant.

  Reverse last modified comparator instance

  type: java.util.Comparator<java.io.File>"
  LastModifiedFileComparator/LASTMODIFIED_REVERSE)

(defn compare
  "Compare the last the last modified date/time of two files.

  file-1 - The first file to compare - `java.io.File`
  file-2 - The second file to compare - `java.io.File`

  returns: a negative value if the first file's lastmodified date/time
   is less than the second, zero if the lastmodified date/time are the
   same and a positive value if the first files lastmodified date/time
   is greater than the second file. - `int`"
  (^Integer [^LastModifiedFileComparator this ^java.io.File file-1 ^java.io.File file-2]
    (-> this (.compare file-1 file-2))))

(defn sort
  "Sort an array of files.

   This method uses Arrays.sort(Object[], Comparator)
   and returns the original array.

  files - The files to sort, may be null - `java.io.File`

  returns: The sorted array - `java.io.File[]`"
  ([^LastModifiedFileComparator this ^java.io.File files]
    (-> this (.sort files))))

(defn to-string
  "String representation of this file comparator.

  returns: String representation of this file comparator - `java.lang.String`"
  (^java.lang.String [^LastModifiedFileComparator this]
    (-> this (.toString))))

