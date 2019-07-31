(ns org.apache.commons.io.FileCleaner
  "Deprecated.
 Use FileCleaningTracker"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io FileCleaner]))

(defn ->file-cleaner
  "Constructor.

  Deprecated."
  (^FileCleaner []
    (new FileCleaner )))

(defn *track
  "Deprecated. Use FileCleaningTracker.track(File, Object, FileDeleteStrategy).

  file - the file to be tracked, not null - `java.io.File`
  marker - the marker object used to track the file, not null - `java.lang.Object`
  delete-strategy - the strategy to delete the file, null means normal - `org.apache.commons.io.FileDeleteStrategy`

  throws: java.lang.NullPointerException - if the file is null"
  ([^java.io.File file ^java.lang.Object marker ^org.apache.commons.io.FileDeleteStrategy delete-strategy]
    (FileCleaner/track file marker delete-strategy))
  ([^java.io.File file ^java.lang.Object marker]
    (FileCleaner/track file marker)))

(defn *get-track-count
  "Deprecated. Use FileCleaningTracker.getTrackCount().

  returns: the number of files being tracked - `int`"
  (^Integer []
    (FileCleaner/getTrackCount )))

(defn *exit-when-finished
  "Deprecated. Use FileCleaningTracker.exitWhenFinished()."
  ([]
    (FileCleaner/exitWhenFinished )))

(defn *get-instance
  "Deprecated.

  returns: the singleton instance - `org.apache.commons.io.FileCleaningTracker`"
  (^org.apache.commons.io.FileCleaningTracker []
    (FileCleaner/getInstance )))

