(ns org.apache.commons.io.filefilter.PrefixFileFilter
  "Filters filenames for a certain prefix.

  For example, to print all files and directories in the
  current directory whose name starts with Test:



  File dir = new File(\".\");
  String[] files = dir.list( new PrefixFileFilter(\"Test\") );
  for ( int i = 0; i < files.length; i++ ) {
      System.out.println(files[i]);
  }"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.filefilter PrefixFileFilter]))

(defn ->prefix-file-filter
  "Constructor.

  Constructs a new Prefix file filter for a single prefix
   specifying case-sensitivity.

  prefix - the prefix to allow, must not be null - `java.lang.String`
  case-sensitivity - how to handle case sensitivity, null means case-sensitive - `org.apache.commons.io.IOCase`

  throws: java.lang.IllegalArgumentException - if the prefix is null"
  (^PrefixFileFilter [^java.lang.String prefix ^org.apache.commons.io.IOCase case-sensitivity]
    (new PrefixFileFilter prefix case-sensitivity))
  (^PrefixFileFilter [^java.lang.String prefix]
    (new PrefixFileFilter prefix)))

(defn accept
  "Checks to see if the filename starts with the prefix.

  file - the File directory - `java.io.File`
  name - the filename - `java.lang.String`

  returns: true if the filename starts with one of our prefixes - `boolean`"
  (^Boolean [^PrefixFileFilter this ^java.io.File file ^java.lang.String name]
    (-> this (.accept file name)))
  (^Boolean [^PrefixFileFilter this ^java.io.File file]
    (-> this (.accept file))))

(defn to-string
  "Provide a String representation of this file filter.

  returns: a String representation - `java.lang.String`"
  (^java.lang.String [^PrefixFileFilter this]
    (-> this (.toString))))

