(ns org.apache.commons.io.comparator.CompositeFileComparator
  "Compare two files using a set of delegate file Comparator.

  This comparator can be used to sort lists or arrays of files
  by combining a number other comparators.

  Example of sorting a list of files by type (i.e. directory or file)
  and then by name:


        CompositeFileComparator comparator =
                        new CompositeFileComparator(
                                  (AbstractFileComparator) DirectoryFileComparator.DIRECTORY_COMPARATOR,
                                  (AbstractFileComparator) NameFileComparator.NAME_COMPARATOR);
        List<File> list = ...
        comparator.sort(list);"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.comparator CompositeFileComparator]))

(defn ->composite-file-comparator
  "Constructor.

  Create a composite comparator for the set of delegate comparators.

  delegates - The delegate file comparators - `java.util.Comparator`"
  (^CompositeFileComparator [^java.util.Comparator delegates]
    (new CompositeFileComparator delegates)))

(defn compare
  "Compare the two files using delegate comparators.

  file-1 - The first file to compare - `java.io.File`
  file-2 - The second file to compare - `java.io.File`

  returns: the first non-zero result returned from
   the delegate comparators or zero. - `int`"
  (^Integer [^CompositeFileComparator this ^java.io.File file-1 ^java.io.File file-2]
    (-> this (.compare file-1 file-2))))

(defn to-string
  "String representation of this file comparator.

  returns: String representation of this file comparator - `java.lang.String`"
  (^java.lang.String [^CompositeFileComparator this]
    (-> this (.toString))))

(defn sort
  "Sort an array of files.

   This method uses Arrays.sort(Object[], Comparator)
   and returns the original array.

  files - The files to sort, may be null - `java.io.File`

  returns: The sorted array - `java.io.File[]`"
  ([^CompositeFileComparator this ^java.io.File files]
    (-> this (.sort files))))

