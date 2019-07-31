(ns org.apache.commons.io.monitor.FileAlterationMonitor
  "A runnable that spawns a monitoring thread triggering any
  registered FileAlterationObserver at a specified interval."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.monitor FileAlterationMonitor]))

(defn ->file-alteration-monitor
  "Constructor.

  Construct a monitor with the specified interval and set of observers.

  interval - The amount of time in milliseconds to wait between checks of the file system - `long`
  observers - The set of observers to add to the monitor. - `org.apache.commons.io.monitor.FileAlterationObserver`"
  (^FileAlterationMonitor [^Long interval ^org.apache.commons.io.monitor.FileAlterationObserver observers]
    (new FileAlterationMonitor interval observers))
  (^FileAlterationMonitor [^Long interval]
    (new FileAlterationMonitor interval))
  (^FileAlterationMonitor []
    (new FileAlterationMonitor )))

(defn get-interval
  "Return the interval.

  returns: the interval - `long`"
  (^Long [^FileAlterationMonitor this]
    (-> this (.getInterval))))

(defn set-thread-factory
  "Set the thread factory.

  thread-factory - the thread factory - `java.util.concurrent.ThreadFactory`"
  ([^FileAlterationMonitor this ^java.util.concurrent.ThreadFactory thread-factory]
    (-> this (.setThreadFactory thread-factory))))

(defn add-observer
  "Add a file system observer to this monitor.

  observer - The file system observer to add - `org.apache.commons.io.monitor.FileAlterationObserver`"
  ([^FileAlterationMonitor this ^org.apache.commons.io.monitor.FileAlterationObserver observer]
    (-> this (.addObserver observer))))

(defn remove-observer
  "Remove a file system observer from this monitor.

  observer - The file system observer to remove - `org.apache.commons.io.monitor.FileAlterationObserver`"
  ([^FileAlterationMonitor this ^org.apache.commons.io.monitor.FileAlterationObserver observer]
    (-> this (.removeObserver observer))))

(defn get-observers
  "Returns the set of FileAlterationObserver registered with
   this monitor.

  returns: The set of FileAlterationObserver - `java.lang.Iterable<org.apache.commons.io.monitor.FileAlterationObserver>`"
  (^java.lang.Iterable [^FileAlterationMonitor this]
    (-> this (.getObservers))))

(defn start
  "Start monitoring.

  throws: java.lang.Exception - if an error occurs initializing the observer"
  ([^FileAlterationMonitor this]
    (-> this (.start))))

(defn stop
  "Stop monitoring.

  stop-interval - the amount of time in milliseconds to wait for the thread to finish. A value of zero will wait until the thread is finished (see Thread.join(long)). - `long`

  throws: java.lang.Exception - if an error occurs initializing the observer"
  ([^FileAlterationMonitor this ^Long stop-interval]
    (-> this (.stop stop-interval)))
  ([^FileAlterationMonitor this]
    (-> this (.stop))))

(defn run
  "Run."
  ([^FileAlterationMonitor this]
    (-> this (.run))))

