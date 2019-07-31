(ns org.apache.commons.io.filefilter.SizeFileFilter
  "Filters files based on size, can filter either smaller files or
  files equal to or larger than a given threshold.

  For example, to print all files and directories in the
  current directory whose size is greater than 1 MB:



  File dir = new File(\".\");
  String[] files = dir.list( new SizeFileFilter(1024 * 1024) );
  for ( int i = 0; i < files.length; i++ ) {
      System.out.println(files[i]);
  }"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.filefilter SizeFileFilter]))

(defn ->size-file-filter
  "Constructor.

  Constructs a new size file filter for files based on a certain size
   threshold.

  size - the threshold size of the files - `long`
  accept-larger - if true, files equal to or larger are accepted, otherwise smaller ones (but not equal to) - `boolean`

  throws: java.lang.IllegalArgumentException - if the size is negative"
  (^SizeFileFilter [^Long size ^Boolean accept-larger]
    (new SizeFileFilter size accept-larger))
  (^SizeFileFilter [^Long size]
    (new SizeFileFilter size)))

(defn accept
  "Checks to see if the size of the file is favorable.

   If size equals threshold and smaller files are required,
   file IS NOT selected.
   If size equals threshold and larger files are required,
   file IS selected.

  file - the File to check - `java.io.File`

  returns: true if the filename matches - `boolean`"
  (^Boolean [^SizeFileFilter this ^java.io.File file]
    (-> this (.accept file))))

(defn to-string
  "Provide a String representation of this file filter.

  returns: a String representation - `java.lang.String`"
  (^java.lang.String [^SizeFileFilter this]
    (-> this (.toString))))

