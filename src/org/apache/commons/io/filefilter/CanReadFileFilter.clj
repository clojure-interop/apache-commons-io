(ns org.apache.commons.io.filefilter.CanReadFileFilter
  "This filter accepts Files that can be read.

  Example, showing how to print out a list of the
  current directory's readable files:



  File dir = new File(\".\");
  String[] files = dir.list( CanReadFileFilter.CAN_READ );
  for ( int i = 0; i < files.length; i++ ) {
      System.out.println(files[i]);
  }


  Example, showing how to print out a list of the
  current directory's un-readable files:



  File dir = new File(\".\");
  String[] files = dir.list( CanReadFileFilter.CANNOT_READ );
  for ( int i = 0; i < files.length; i++ ) {
      System.out.println(files[i]);
  }


  Example, showing how to print out a list of the
  current directory's read-only files:



  File dir = new File(\".\");
  String[] files = dir.list( CanReadFileFilter.READ_ONLY );
  for ( int i = 0; i < files.length; i++ ) {
      System.out.println(files[i]);
  }"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.filefilter CanReadFileFilter]))

(def *-can-read
  "Static Constant.

  Singleton instance of readable filter

  type: org.apache.commons.io.filefilter.IOFileFilter"
  CanReadFileFilter/CAN_READ)

(def *-cannot-read
  "Static Constant.

  Singleton instance of not readable filter

  type: org.apache.commons.io.filefilter.IOFileFilter"
  CanReadFileFilter/CANNOT_READ)

(def *-read-only
  "Static Constant.

  Singleton instance of read-only filter

  type: org.apache.commons.io.filefilter.IOFileFilter"
  CanReadFileFilter/READ_ONLY)

(defn accept
  "Checks to see if the file can be read.

  file - the File to check. - `java.io.File`

  returns: true if the file can be
    read, otherwise false. - `boolean`"
  (^Boolean [^CanReadFileFilter this ^java.io.File file]
    (-> this (.accept file))))

