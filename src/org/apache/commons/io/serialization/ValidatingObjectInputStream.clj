(ns org.apache.commons.io.serialization.ValidatingObjectInputStream
  "An ObjectInputStream that's restricted to deserialize
  a limited set of classes.


  Various accept/reject methods allow for specifying which classes
  can be deserialized.



  Design inspired by IBM
  DeveloperWorks Article."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.serialization ValidatingObjectInputStream]))

(defn ->validating-object-input-stream
  "Constructor.

  Constructs an object to deserialize the specified input stream.
   At least one accept method needs to be called to specify which
   classes can be deserialized, as by default no classes are
   accepted.

  input - an input stream - `java.io.InputStream`

  throws: java.io.IOException - if an I/O error occurs while reading stream header"
  (^ValidatingObjectInputStream [^java.io.InputStream input]
    (new ValidatingObjectInputStream input)))

(defn accept
  "Accept the specified classes for deserialization, unless they
   are otherwise rejected.

  classes - Classes to accept - `java.lang.Class`

  returns: this object - `org.apache.commons.io.serialization.ValidatingObjectInputStream`"
  (^org.apache.commons.io.serialization.ValidatingObjectInputStream [^ValidatingObjectInputStream this ^java.lang.Class classes]
    (-> this (.accept classes))))

(defn reject
  "Reject the specified classes for deserialization, even if they
   are otherwise accepted.

  classes - Classes to reject - `java.lang.Class`

  returns: this object - `org.apache.commons.io.serialization.ValidatingObjectInputStream`"
  (^org.apache.commons.io.serialization.ValidatingObjectInputStream [^ValidatingObjectInputStream this ^java.lang.Class classes]
    (-> this (.reject classes))))

