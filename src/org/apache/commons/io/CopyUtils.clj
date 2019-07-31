(ns org.apache.commons.io.CopyUtils
  "Deprecated.
 Use IOUtils. Will be removed in 2.0.
   Methods renamed to IOUtils.write() or IOUtils.copy().
   Null handling behaviour changed in IOUtils (null data does not
   throw NullPointerException)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io CopyUtils]))

(defn ->copy-utils
  "Constructor.

  Deprecated."
  (^CopyUtils []
    (new CopyUtils )))

(defn *copy
  "Deprecated.

  input - the byte array to read from - `byte[]`
  output - the Writer to write to - `java.io.Writer`
  encoding - The name of a supported character encoding. See the IANA Charset Registry for a list of valid encoding types. - `java.lang.String`

  throws: java.io.IOException - In case of an I/O problem"
  ([input ^java.io.Writer output ^java.lang.String encoding]
    (CopyUtils/copy input output encoding))
  ([input ^java.io.OutputStream output]
    (CopyUtils/copy input output)))

