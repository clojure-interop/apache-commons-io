(ns org.apache.commons.io.filefilter.AgeFileFilter
  "Filters files based on a cutoff time, can filter either newer
  files or files equal to or older.

  For example, to print all files and directories in the
  current directory older than one day:



  File dir = new File(\".\");
  // We are interested in files older than one day
  long cutoff = System.currentTimeMillis() - (24 * 60 * 60 * 1000);
  String[] files = dir.list( new AgeFileFilter(cutoff) );
  for ( int i = 0; i < files.length; i++ ) {
      System.out.println(files[i]);
  }"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.filefilter AgeFileFilter]))

(defn ->age-file-filter
  "Constructor.

  Constructs a new age file filter for files on any one side
   of a certain cutoff.

  cutoff - the threshold age of the files - `long`
  accept-older - if true, older files (at or before the cutoff) are accepted, else newer ones (after the cutoff). - `boolean`"
  (^AgeFileFilter [^Long cutoff ^Boolean accept-older]
    (new AgeFileFilter cutoff accept-older))
  (^AgeFileFilter [^Long cutoff]
    (new AgeFileFilter cutoff)))

(defn accept
  "Checks to see if the last modification of the file matches cutoff
   favorably.

   If last modification time equals cutoff and newer files are required,
   file IS NOT selected.
   If last modification time equals cutoff and older files are required,
   file IS selected.

  file - the File to check - `java.io.File`

  returns: true if the filename matches - `boolean`"
  (^Boolean [^AgeFileFilter this ^java.io.File file]
    (-> this (.accept file))))

(defn to-string
  "Provide a String representation of this file filter.

  returns: a String representation - `java.lang.String`"
  (^java.lang.String [^AgeFileFilter this]
    (-> this (.toString))))

