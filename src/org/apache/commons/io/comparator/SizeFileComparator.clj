(ns org.apache.commons.io.comparator.SizeFileComparator
  "Compare the length/size of two files for order (see
  File.length() and FileUtils.sizeOfDirectory(File)).

  This comparator can be used to sort lists or arrays of files
  by their length/size.

  Example of sorting a list of files using the
  SIZE_COMPARATOR singleton instance:


        List<File> list = ...
        ((AbstractFileComparator) SizeFileComparator.SIZE_COMPARATOR).sort(list);

  Example of doing a reverse sort of an array of files using the
  SIZE_REVERSE singleton instance:


        File[] array = ...
        ((AbstractFileComparator) SizeFileComparator.SIZE_REVERSE).sort(array);

  N.B. Directories are treated as zero size unless
  sumDirectoryContents is true."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.comparator SizeFileComparator]))

(defn ->size-file-comparator
  "Constructor.

  Construct a file size comparator instance specifying whether the size of
   the directory contents should be aggregated.

   If the sumDirectoryContents is true The size of
   directories is calculated using  FileUtils.sizeOfDirectory(File).

  sum-directory-contents - true if the sum of the directories' contents should be calculated, otherwise false if directories should be treated as size zero (see FileUtils.sizeOfDirectory(File)). - `boolean`"
  (^SizeFileComparator [^Boolean sum-directory-contents]
    (new SizeFileComparator sum-directory-contents))
  (^SizeFileComparator []
    (new SizeFileComparator )))

(def *-size-comparator
  "Static Constant.

  Size comparator instance - directories are treated as zero size

  type: java.util.Comparator<java.io.File>"
  SizeFileComparator/SIZE_COMPARATOR)

(def *-size-reverse
  "Static Constant.

  Reverse size comparator instance - directories are treated as zero size

  type: java.util.Comparator<java.io.File>"
  SizeFileComparator/SIZE_REVERSE)

(def *-size-sumdir-comparator
  "Static Constant.

  Size comparator instance which sums the size of a directory's contents
   using FileUtils.sizeOfDirectory(File)

  type: java.util.Comparator<java.io.File>"
  SizeFileComparator/SIZE_SUMDIR_COMPARATOR)

(def *-size-sumdir-reverse
  "Static Constant.

  Reverse size comparator instance which sums the size of a directory's contents
   using FileUtils.sizeOfDirectory(File)

  type: java.util.Comparator<java.io.File>"
  SizeFileComparator/SIZE_SUMDIR_REVERSE)

(defn compare
  "Compare the length of two files.

  file-1 - The first file to compare - `java.io.File`
  file-2 - The second file to compare - `java.io.File`

  returns: a negative value if the first file's length
   is less than the second, zero if the lengths are the
   same and a positive value if the first files length
   is greater than the second file. - `int`"
  (^Integer [^SizeFileComparator this ^java.io.File file-1 ^java.io.File file-2]
    (-> this (.compare file-1 file-2))))

(defn to-string
  "String representation of this file comparator.

  returns: String representation of this file comparator - `java.lang.String`"
  (^java.lang.String [^SizeFileComparator this]
    (-> this (.toString))))

(defn sort
  "Sort an array of files.

   This method uses Arrays.sort(Object[], Comparator)
   and returns the original array.

  files - The files to sort, may be null - `java.io.File`

  returns: The sorted array - `java.io.File[]`"
  ([^SizeFileComparator this ^java.io.File files]
    (-> this (.sort files))))

