(ns org.apache.commons.io.filefilter.SuffixFileFilter
  "Filters files based on the suffix (what the filename ends with).
  This is used in retrieving all the files of a particular type.

  For example, to retrieve and print all *.java files
  in the current directory:



  File dir = new File(\".\");
  String[] files = dir.list( new SuffixFileFilter(\".java\") );
  for (int i = 0; i < files.length; i++) {
      System.out.println(files[i]);
  }"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.filefilter SuffixFileFilter]))

(defn ->suffix-file-filter
  "Constructor.

  Constructs a new Suffix file filter for a single extension
   specifying case-sensitivity.

  suffix - the suffix to allow, must not be null - `java.lang.String`
  case-sensitivity - how to handle case sensitivity, null means case-sensitive - `org.apache.commons.io.IOCase`

  throws: java.lang.IllegalArgumentException - if the suffix is null"
  (^SuffixFileFilter [^java.lang.String suffix ^org.apache.commons.io.IOCase case-sensitivity]
    (new SuffixFileFilter suffix case-sensitivity))
  (^SuffixFileFilter [^java.lang.String suffix]
    (new SuffixFileFilter suffix)))

(defn accept
  "Checks to see if the filename ends with the suffix.

  file - the File directory - `java.io.File`
  name - the filename - `java.lang.String`

  returns: true if the filename ends with one of our suffixes - `boolean`"
  (^Boolean [^SuffixFileFilter this ^java.io.File file ^java.lang.String name]
    (-> this (.accept file name)))
  (^Boolean [^SuffixFileFilter this ^java.io.File file]
    (-> this (.accept file))))

(defn to-string
  "Provide a String representation of this file filter.

  returns: a String representation - `java.lang.String`"
  (^java.lang.String [^SuffixFileFilter this]
    (-> this (.toString))))

