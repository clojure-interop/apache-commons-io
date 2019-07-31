(ns org.apache.commons.io.filefilter.CanWriteFileFilter
  "This filter accepts Files that can be written to.

  Example, showing how to print out a list of the
  current directory's writable files:



  File dir = new File(\".\");
  String[] files = dir.list( CanWriteFileFilter.CAN_WRITE );
  for ( int i = 0; i < files.length; i++ ) {
      System.out.println(files[i]);
  }


  Example, showing how to print out a list of the
  current directory's un-writable files:



  File dir = new File(\".\");
  String[] files = dir.list( CanWriteFileFilter.CANNOT_WRITE );
  for ( int i = 0; i < files.length; i++ ) {
      System.out.println(files[i]);
  }


  N.B. For read-only files, use
     CanReadFileFilter.READ_ONLY."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.filefilter CanWriteFileFilter]))

(def *-can-write
  "Static Constant.

  Singleton instance of writable filter

  type: org.apache.commons.io.filefilter.IOFileFilter"
  CanWriteFileFilter/CAN_WRITE)

(def *-cannot-write
  "Static Constant.

  Singleton instance of not writable filter

  type: org.apache.commons.io.filefilter.IOFileFilter"
  CanWriteFileFilter/CANNOT_WRITE)

(defn accept
  "Checks to see if the file can be written to.

  file - the File to check - `java.io.File`

  returns: true if the file can be
    written to, otherwise false. - `boolean`"
  (^Boolean [^CanWriteFileFilter this ^java.io.File file]
    (-> this (.accept file))))

