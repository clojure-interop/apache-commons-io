(ns org.apache.commons.io.filefilter.HiddenFileFilter
  "This filter accepts Files that are hidden.

  Example, showing how to print out a list of the
  current directory's hidden files:



  File dir = new File(\".\");
  String[] files = dir.list( HiddenFileFilter.HIDDEN );
  for ( int i = 0; i < files.length; i++ ) {
      System.out.println(files[i]);
  }


  Example, showing how to print out a list of the
  current directory's visible (i.e. not hidden) files:



  File dir = new File(\".\");
  String[] files = dir.list( HiddenFileFilter.VISIBLE );
  for ( int i = 0; i < files.length; i++ ) {
      System.out.println(files[i]);
  }"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.filefilter HiddenFileFilter]))

(def *-hidden
  "Static Constant.

  Singleton instance of hidden filter

  type: org.apache.commons.io.filefilter.IOFileFilter"
  HiddenFileFilter/HIDDEN)

(def *-visible
  "Static Constant.

  Singleton instance of visible filter

  type: org.apache.commons.io.filefilter.IOFileFilter"
  HiddenFileFilter/VISIBLE)

(defn accept
  "Checks to see if the file is hidden.

  file - the File to check - `java.io.File`

  returns: true if the file is
    hidden, otherwise false. - `boolean`"
  (^Boolean [^HiddenFileFilter this ^java.io.File file]
    (-> this (.accept file))))

