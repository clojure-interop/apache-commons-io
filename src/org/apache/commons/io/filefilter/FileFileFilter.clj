(ns org.apache.commons.io.filefilter.FileFileFilter
  "This filter accepts Files that are files (not directories).

  For example, here is how to print out a list of the real files
  within the current directory:



  File dir = new File(\".\");
  String[] files = dir.list( FileFileFilter.FILE );
  for ( int i = 0; i < files.length; i++ ) {
      System.out.println(files[i]);
  }"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.filefilter FileFileFilter]))

(def *-file
  "Static Constant.

  Singleton instance of file filter

  type: org.apache.commons.io.filefilter.IOFileFilter"
  FileFileFilter/FILE)

(defn accept
  "Checks to see if the file is a file.

  file - the File to check - `java.io.File`

  returns: true if the file is a file - `boolean`"
  (^Boolean [^FileFileFilter this ^java.io.File file]
    (-> this (.accept file))))

