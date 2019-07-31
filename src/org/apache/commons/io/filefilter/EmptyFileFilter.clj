(ns org.apache.commons.io.filefilter.EmptyFileFilter
  "This filter accepts files or directories that are empty.

  If the File is a directory it checks that
  it contains no files.

  Example, showing how to print out a list of the
  current directory's empty files/directories:



  File dir = new File(\".\");
  String[] files = dir.list( EmptyFileFilter.EMPTY );
  for ( int i = 0; i < files.length; i++ ) {
      System.out.println(files[i]);
  }


  Example, showing how to print out a list of the
  current directory's non-empty files/directories:



  File dir = new File(\".\");
  String[] files = dir.list( EmptyFileFilter.NOT_EMPTY );
  for ( int i = 0; i < files.length; i++ ) {
      System.out.println(files[i]);
  }"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.filefilter EmptyFileFilter]))

(def *-empty
  "Static Constant.

  Singleton instance of empty filter

  type: org.apache.commons.io.filefilter.IOFileFilter"
  EmptyFileFilter/EMPTY)

(def *-not-empty
  "Static Constant.

  Singleton instance of not-empty filter

  type: org.apache.commons.io.filefilter.IOFileFilter"
  EmptyFileFilter/NOT_EMPTY)

(defn accept
  "Checks to see if the file is empty.

  file - the file or directory to check - `java.io.File`

  returns: true if the file or directory
    is empty, otherwise false. - `boolean`"
  (^Boolean [^EmptyFileFilter this ^java.io.File file]
    (-> this (.accept file))))

