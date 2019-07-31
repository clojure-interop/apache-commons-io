(ns org.apache.commons.io.filefilter.WildcardFileFilter
  "Filters files using the supplied wildcards.

  This filter selects files and directories based on one or more wildcards.
  Testing is case-sensitive by default, but this can be configured.

  The wildcard matcher uses the characters '?' and '*' to represent a
  single or multiple wildcard characters.
  This is the same as often found on Dos/Unix command lines.
  The check is case-sensitive by default.
  See FilenameUtils.wildcardMatchOnSystem(java.lang.String, java.lang.String) for more information.

  For example:


  File dir = new File(\".\");
  FileFilter fileFilter = new WildcardFileFilter(\"*test*.java~*~\");
  File[] files = dir.listFiles(fileFilter);
  for (int i = 0; i < files.length; i++) {
    System.out.println(files[i]);
  }"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.filefilter WildcardFileFilter]))

(defn ->wildcard-file-filter
  "Constructor.

  Construct a new wildcard filter for a single wildcard specifying case-sensitivity.

  wildcard - the wildcard to match, not null - `java.lang.String`
  case-sensitivity - how to handle case sensitivity, null means case-sensitive - `org.apache.commons.io.IOCase`

  throws: java.lang.IllegalArgumentException - if the pattern is null"
  (^WildcardFileFilter [^java.lang.String wildcard ^org.apache.commons.io.IOCase case-sensitivity]
    (new WildcardFileFilter wildcard case-sensitivity))
  (^WildcardFileFilter [^java.lang.String wildcard]
    (new WildcardFileFilter wildcard)))

(defn accept
  "Checks to see if the filename matches one of the wildcards.

  dir - the file directory (ignored) - `java.io.File`
  name - the filename - `java.lang.String`

  returns: true if the filename matches one of the wildcards - `boolean`"
  (^Boolean [^WildcardFileFilter this ^java.io.File dir ^java.lang.String name]
    (-> this (.accept dir name)))
  (^Boolean [^WildcardFileFilter this ^java.io.File file]
    (-> this (.accept file))))

(defn to-string
  "Provide a String representation of this file filter.

  returns: a String representation - `java.lang.String`"
  (^java.lang.String [^WildcardFileFilter this]
    (-> this (.toString))))

