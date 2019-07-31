(ns org.apache.commons.io.comparator.DirectoryFileComparator
  "Compare two files using the File.isDirectory() method.

  This comparator can be used to sort lists or arrays by directories and files.

  Example of sorting a list of files/directories using the
  DIRECTORY_COMPARATOR singleton instance:


        List<File> list = ...
        ((AbstractFileComparator) DirectoryFileComparator.DIRECTORY_COMPARATOR).sort(list);

  Example of doing a reverse sort of an array of files/directories using the
  DIRECTORY_REVERSE singleton instance:


        File[] array = ...
        ((AbstractFileComparator) DirectoryFileComparator.DIRECTORY_REVERSE).sort(array);"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.comparator DirectoryFileComparator]))

(defn ->directory-file-comparator
  "Constructor."
  (^DirectoryFileComparator []
    (new DirectoryFileComparator )))

(def *-directory-comparator
  "Static Constant.

  Singleton default comparator instance

  type: java.util.Comparator<java.io.File>"
  DirectoryFileComparator/DIRECTORY_COMPARATOR)

(def *-directory-reverse
  "Static Constant.

  Singleton reverse default comparator instance

  type: java.util.Comparator<java.io.File>"
  DirectoryFileComparator/DIRECTORY_REVERSE)

(defn compare
  "Compare the two files using the File.isDirectory() method.

  file-1 - The first file to compare - `java.io.File`
  file-2 - The second file to compare - `java.io.File`

  returns: the result of calling file1's
   File.compareTo(File) with file2 as the parameter. - `int`"
  (^Integer [^DirectoryFileComparator this ^java.io.File file-1 ^java.io.File file-2]
    (-> this (.compare file-1 file-2))))

(defn sort
  "Sort an array of files.

   This method uses Arrays.sort(Object[], Comparator)
   and returns the original array.

  files - The files to sort, may be null - `java.io.File`

  returns: The sorted array - `java.io.File[]`"
  ([^DirectoryFileComparator this ^java.io.File files]
    (-> this (.sort files))))

(defn to-string
  "String representation of this file comparator.

  returns: String representation of this file comparator - `java.lang.String`"
  (^java.lang.String [^DirectoryFileComparator this]
    (-> this (.toString))))

