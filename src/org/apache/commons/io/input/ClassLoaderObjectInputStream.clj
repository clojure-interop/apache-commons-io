(ns org.apache.commons.io.input.ClassLoaderObjectInputStream
  "A special ObjectInputStream that loads a class based on a specified
  ClassLoader rather than the system default.

  This is useful in dynamic container environments."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.input ClassLoaderObjectInputStream]))

(defn ->class-loader-object-input-stream
  "Constructor.

  Constructs a new ClassLoaderObjectInputStream.

  class-loader - the ClassLoader from which classes should be loaded - `java.lang.ClassLoader`
  input-stream - the InputStream to work on - `java.io.InputStream`

  throws: java.io.IOException - in case of an I/O error"
  (^ClassLoaderObjectInputStream [^java.lang.ClassLoader class-loader ^java.io.InputStream input-stream]
    (new ClassLoaderObjectInputStream class-loader input-stream)))

