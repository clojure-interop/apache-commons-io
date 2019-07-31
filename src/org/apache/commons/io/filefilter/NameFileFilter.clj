(ns org.apache.commons.io.filefilter.NameFileFilter
  "Filters filenames for a certain name.

  For example, to print all files and directories in the
  current directory whose name is Test:



  File dir = new File(\".\");
  String[] files = dir.list( new NameFileFilter(\"Test\") );
  for ( int i = 0; i < files.length; i++ ) {
      System.out.println(files[i]);
  }"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.filefilter NameFileFilter]))

(defn ->name-file-filter
  "Constructor.

  Construct a new name file filter specifying case-sensitivity.

  name - the name to allow, must not be null - `java.lang.String`
  case-sensitivity - how to handle case sensitivity, null means case-sensitive - `org.apache.commons.io.IOCase`

  throws: java.lang.IllegalArgumentException - if the name is null"
  (^NameFileFilter [^java.lang.String name ^org.apache.commons.io.IOCase case-sensitivity]
    (new NameFileFilter name case-sensitivity))
  (^NameFileFilter [^java.lang.String name]
    (new NameFileFilter name)))

(defn accept
  "Checks to see if the filename matches.

  dir - the File directory (ignored) - `java.io.File`
  name - the filename - `java.lang.String`

  returns: true if the filename matches - `boolean`"
  (^Boolean [^NameFileFilter this ^java.io.File dir ^java.lang.String name]
    (-> this (.accept dir name)))
  (^Boolean [^NameFileFilter this ^java.io.File file]
    (-> this (.accept file))))

(defn to-string
  "Provide a String representation of this file filter.

  returns: a String representation - `java.lang.String`"
  (^java.lang.String [^NameFileFilter this]
    (-> this (.toString))))

