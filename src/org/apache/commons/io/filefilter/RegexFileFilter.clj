(ns org.apache.commons.io.filefilter.RegexFileFilter
  "Filters files using supplied regular expression(s).

  See java.util.regex.Pattern for regex matching rules



  e.g.


  File dir = new File(\".\");
  FileFilter fileFilter = new RegexFileFilter(\"^.*[tT]est(-\\\\d+)?\\\\.java$\");
  File[] files = dir.listFiles(fileFilter);
  for (int i = 0; i < files.length; i++) {
    System.out.println(files[i]);
  }"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.filefilter RegexFileFilter]))

(defn ->regex-file-filter
  "Constructor.

  Construct a new regular expression filter with the specified flags case sensitivity.

  pattern - regular string expression to match - `java.lang.String`
  case-sensitivity - how to handle case sensitivity, null means case-sensitive - `org.apache.commons.io.IOCase`

  throws: java.lang.IllegalArgumentException - if the pattern is null"
  (^RegexFileFilter [^java.lang.String pattern ^org.apache.commons.io.IOCase case-sensitivity]
    (new RegexFileFilter pattern case-sensitivity))
  (^RegexFileFilter [^java.lang.String pattern]
    (new RegexFileFilter pattern)))

(defn accept
  "Checks to see if the filename matches one of the regular expressions.

  dir - the file directory (ignored) - `java.io.File`
  name - the filename - `java.lang.String`

  returns: true if the filename matches one of the regular expressions - `boolean`"
  (^Boolean [^RegexFileFilter this ^java.io.File dir ^java.lang.String name]
    (-> this (.accept dir name))))

