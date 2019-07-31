(ns org.apache.commons.io.FileCleaningTracker
  "Keeps track of files awaiting deletion, and deletes them when an associated
  marker object is reclaimed by the garbage collector.

  This utility creates a background thread to handle file deletion.
  Each file to be deleted is registered with a handler object.
  When the handler object is garbage collected, the file is deleted.

  In an environment with multiple class loaders (a servlet container, for
  example), you should consider stopping the background thread if it is no
  longer needed. This is done by invoking the method
  exitWhenFinished, typically in
  javax.servlet.ServletContextListener.contextDestroyed(javax.servlet.ServletContextEvent) or similar."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io FileCleaningTracker]))

(defn ->file-cleaning-tracker
  "Constructor."
  (^FileCleaningTracker []
    (new FileCleaningTracker )))

(defn track
  "Track the specified file, using the provided marker, deleting the file
   when the marker instance is garbage collected.
   The specified deletion strategy is used.

  file - the file to be tracked, not null - `java.io.File`
  marker - the marker object used to track the file, not null - `java.lang.Object`
  delete-strategy - the strategy to delete the file, null means normal - `org.apache.commons.io.FileDeleteStrategy`

  throws: java.lang.NullPointerException - if the file is null"
  ([^FileCleaningTracker this ^java.io.File file ^java.lang.Object marker ^org.apache.commons.io.FileDeleteStrategy delete-strategy]
    (-> this (.track file marker delete-strategy)))
  ([^FileCleaningTracker this ^java.io.File file ^java.lang.Object marker]
    (-> this (.track file marker))))

(defn get-track-count
  "Retrieve the number of files currently being tracked, and therefore
   awaiting deletion.

  returns: the number of files being tracked - `int`"
  (^Integer [^FileCleaningTracker this]
    (-> this (.getTrackCount))))

(defn get-delete-failures
  "Return the file paths that failed to delete.

  returns: the file paths that failed to delete - `java.util.List<java.lang.String>`"
  (^java.util.List [^FileCleaningTracker this]
    (-> this (.getDeleteFailures))))

(defn exit-when-finished
  "Call this method to cause the file cleaner thread to terminate when
   there are no more objects being tracked for deletion.

   In a simple environment, you don't need this method as the file cleaner
   thread will simply exit when the JVM exits. In a more complex environment,
   with multiple class loaders (such as an application server), you should be
   aware that the file cleaner thread will continue running even if the class
   loader it was started from terminates. This can constitute a memory leak.

   For example, suppose that you have developed a web application, which
   contains the commons-io jar file in your WEB-INF/lib directory. In other
   words, the FileCleaner class is loaded through the class loader of your
   web application. If the web application is terminated, but the servlet
   container is still running, then the file cleaner thread will still exist,
   posing a memory leak.

   This method allows the thread to be terminated. Simply call this method
   in the resource cleanup code, such as
   javax.servlet.ServletContextListener.contextDestroyed(javax.servlet.ServletContextEvent).
   Once called, no new objects can be tracked by the file cleaner."
  ([^FileCleaningTracker this]
    (-> this (.exitWhenFinished))))

