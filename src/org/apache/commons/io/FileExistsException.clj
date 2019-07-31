(ns org.apache.commons.io.FileExistsException
  "Indicates that a file already exists."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io FileExistsException]))

(defn ->file-exists-exception
  "Constructor.

  Construct an instance with the specified message.

  message - The error message - `java.lang.String`"
  (^FileExistsException [^java.lang.String message]
    (new FileExistsException message))
  (^FileExistsException []
    (new FileExistsException )))

