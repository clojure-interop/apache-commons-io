(ns org.apache.commons.io.filefilter.DirectoryFileFilter
  "This filter accepts Files that are directories.

  For example, here is how to print out a list of the
  current directory's subdirectories:



  File dir = new File(\".\");
  String[] files = dir.list( DirectoryFileFilter.INSTANCE );
  for ( int i = 0; i < files.length; i++ ) {
      System.out.println(files[i]);
  }"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.filefilter DirectoryFileFilter]))

(def *-directory
  "Static Constant.

  Singleton instance of directory filter.

  type: org.apache.commons.io.filefilter.IOFileFilter"
  DirectoryFileFilter/DIRECTORY)

(def *-instance
  "Static Constant.

  Singleton instance of directory filter.
   Please use the identical DirectoryFileFilter.DIRECTORY constant.
   The new name is more JDK 1.5 friendly as it doesn't clash with other
   values when using static imports.

  type: org.apache.commons.io.filefilter.IOFileFilter"
  DirectoryFileFilter/INSTANCE)

(defn accept
  "Checks to see if the file is a directory.

  file - the File to check - `java.io.File`

  returns: true if the file is a directory - `boolean`"
  (^Boolean [^DirectoryFileFilter this ^java.io.File file]
    (-> this (.accept file))))

