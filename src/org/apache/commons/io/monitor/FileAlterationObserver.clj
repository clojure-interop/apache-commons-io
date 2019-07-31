(ns org.apache.commons.io.monitor.FileAlterationObserver
  "FileAlterationObserver represents the state of files below a root directory,
  checking the filesystem and notifying listeners of create, change or
  delete events.

  To use this implementation:

    Create FileAlterationListener implementation(s) that process
       the file/directory create, change and delete events
    Register the listener(s) with a FileAlterationObserver for
        the appropriate directory.
    Either register the observer(s) with a FileAlterationMonitor or
        run manually.


  Basic Usage
  Create a FileAlterationObserver for the directory and register the listeners:


       File directory = new File(new File(\".\"), \"src\");
       FileAlterationObserver observer = new FileAlterationObserver(directory);
       observer.addListener(...);
       observer.addListener(...);
  To manually observe a directory, initialize the observer and invoked the
  checkAndNotify() method as required:


       // initialize
       observer.init();
       ...
       // invoke as required
       observer.checkAndNotify();
       ...
       observer.checkAndNotify();
       ...
       // finished
       observer.finish();
  Alternatively, register the observer(s) with a FileAlterationMonitor,
  which creates a new thread, invoking the observer at the specified interval:


       long interval = ...
       FileAlterationMonitor monitor = new FileAlterationMonitor(interval);
       monitor.addObserver(observer);
       monitor.start();
       ...
       monitor.stop();

  File Filters
  This implementation can monitor portions of the file system
  by using FileFilters to observe only the files and/or directories
  that are of interest. This makes it more efficient and reduces the
  noise from unwanted file system events.

  Commons IO has a good range of
  useful, ready made
  File Filter
  implementations for this purpose.

  For example, to only observe 1) visible directories and 2) files with a \".java\" suffix
  in a root directory called \"src\" you could set up a FileAlterationObserver in the following
  way:


       // Create a FileFilter
       IOFileFilter directories = FileFilterUtils.and(
                                       FileFilterUtils.directoryFileFilter(),
                                       HiddenFileFilter.VISIBLE);
       IOFileFilter files       = FileFilterUtils.and(
                                       FileFilterUtils.fileFileFilter(),
                                       FileFilterUtils.suffixFileFilter(\".java\"));
       IOFileFilter filter = FileFilterUtils.or(directories, files);

       // Create the File system observer and register File Listeners
       FileAlterationObserver observer = new FileAlterationObserver(new File(\"src\"), filter);
       observer.addListener(...);
       observer.addListener(...);

  FileEntry
  FileEntry represents the state of a file or directory, capturing
  File attributes at a point in time. Custom implementations of
  FileEntry can be used to capture additional properties that the
  basic implementation does not support. The FileEntry.refresh(File)
  method is used to determine if a file or directory has changed since the last
  check and stores the current state of the File's properties."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.monitor FileAlterationObserver]))

(defn ->file-alteration-observer
  "Constructor.

  Construct an observer for the specified directory, file filter and
   file comparator.

  directory-name - the name of the directory to observe - `java.lang.String`
  file-filter - The file filter or null if none - `java.io.FileFilter`
  case-sensitivity - what case sensitivity to use comparing file names, null means system sensitive - `org.apache.commons.io.IOCase`"
  (^FileAlterationObserver [^java.lang.String directory-name ^java.io.FileFilter file-filter ^org.apache.commons.io.IOCase case-sensitivity]
    (new FileAlterationObserver directory-name file-filter case-sensitivity))
  (^FileAlterationObserver [^java.lang.String directory-name ^java.io.FileFilter file-filter]
    (new FileAlterationObserver directory-name file-filter))
  (^FileAlterationObserver [^java.lang.String directory-name]
    (new FileAlterationObserver directory-name)))

(defn get-file-filter
  "Return the fileFilter.

  returns: the fileFilter - `java.io.FileFilter`"
  (^java.io.FileFilter [^FileAlterationObserver this]
    (-> this (.getFileFilter))))

(defn to-string
  "Provide a String representation of this observer.

  returns: a String representation of this observer - `java.lang.String`"
  (^java.lang.String [^FileAlterationObserver this]
    (-> this (.toString))))

(defn remove-listener
  "Remove a file system listener.

  listener - The file system listener - `org.apache.commons.io.monitor.FileAlterationListener`"
  ([^FileAlterationObserver this ^org.apache.commons.io.monitor.FileAlterationListener listener]
    (-> this (.removeListener listener))))

(defn destroy
  "Final processing.

  throws: java.lang.Exception - if an error occurs"
  ([^FileAlterationObserver this]
    (-> this (.destroy))))

(defn check-and-notify
  "Check whether the file and its children have been created, modified or deleted."
  ([^FileAlterationObserver this]
    (-> this (.checkAndNotify))))

(defn add-listener
  "Add a file system listener.

  listener - The file system listener - `org.apache.commons.io.monitor.FileAlterationListener`"
  ([^FileAlterationObserver this ^org.apache.commons.io.monitor.FileAlterationListener listener]
    (-> this (.addListener listener))))

(defn initialize
  "Initialize the observer.

  throws: java.lang.Exception - if an error occurs"
  ([^FileAlterationObserver this]
    (-> this (.initialize))))

(defn get-listeners
  "Returns the set of registered file system listeners.

  returns: The file system listeners - `java.lang.Iterable<org.apache.commons.io.monitor.FileAlterationListener>`"
  (^java.lang.Iterable [^FileAlterationObserver this]
    (-> this (.getListeners))))

(defn get-directory
  "Return the directory being observed.

  returns: the directory being observed - `java.io.File`"
  (^java.io.File [^FileAlterationObserver this]
    (-> this (.getDirectory))))

