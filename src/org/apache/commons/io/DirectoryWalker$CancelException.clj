(ns org.apache.commons.io.DirectoryWalker$CancelException
  "CancelException is thrown in DirectoryWalker to cancel the current
  processing."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io DirectoryWalker$CancelException]))

(defn ->cancel-exception
  "Constructor.

  Constructs a CancelException with
   an appropriate message and the file and depth when
   cancellation occurred.

  message - the detail message - `java.lang.String`
  file - the file when the operation was cancelled - `java.io.File`
  depth - the depth when the operation was cancelled - `int`"
  (^DirectoryWalker$CancelException [^java.lang.String message ^java.io.File file ^Integer depth]
    (new DirectoryWalker$CancelException message file depth))
  (^DirectoryWalker$CancelException [^java.io.File file ^Integer depth]
    (new DirectoryWalker$CancelException file depth)))

(defn get-file
  "Return the file when the operation was cancelled.

  returns: the file when the operation was cancelled - `java.io.File`"
  (^java.io.File [^DirectoryWalker$CancelException this]
    (-> this (.getFile))))

(defn get-depth
  "Return the depth when the operation was cancelled.

  returns: the depth when the operation was cancelled - `int`"
  (^Integer [^DirectoryWalker$CancelException this]
    (-> this (.getDepth))))

