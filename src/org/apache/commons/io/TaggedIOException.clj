(ns org.apache.commons.io.TaggedIOException
  "An IOException decorator that adds a serializable tag to the
  wrapped exception. Both the tag and the original exception can be used
  to determine further processing when this exception is caught."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io TaggedIOException]))

(defn ->tagged-io-exception
  "Constructor.

  Creates a tagged wrapper for the given exception.

  original - the exception to be tagged - `java.io.IOException`
  tag - tag of this exception - `java.io.Serializable`"
  (^TaggedIOException [^java.io.IOException original ^java.io.Serializable tag]
    (new TaggedIOException original tag)))

(defn *tagged-with?
  "Checks whether the given throwable is tagged with the given tag.

   This check can only succeed if the throwable is a
   TaggedIOException and the tag is Serializable, but
   the argument types are intentionally more generic to make it easier
   to use this method without type casts.

   A typical use for this method is in a catch block to
   determine how a caught exception should be handled:


   Serializable tag = ...;
   try {
       ...;
   } catch (Throwable t) {
       if (TaggedIOExcepton.isTaggedWith(t, tag)) {
           // special processing for tagged exception
       } else {
           // handling of other kinds of exceptions
       }
   }

  throwable - The Throwable object to check - `java.lang.Throwable`
  tag - tag object - `java.lang.Object`

  returns: true if the throwable has the specified tag,
   otherwise false - `boolean`"
  (^Boolean [^java.lang.Throwable throwable ^java.lang.Object tag]
    (TaggedIOException/isTaggedWith throwable tag)))

(defn *throw-cause-if-tagged-with
  "Throws the original IOException if the given throwable is
   a TaggedIOException decorator the given tag. Does nothing
   if the given throwable is of a different type or if it is tagged
   with some other tag.

   This method is typically used in a catch block to
   selectively rethrow tagged exceptions.


   Serializable tag = ...;
   try {
       ...;
   } catch (Throwable t) {
       TaggedIOExcepton.throwCauseIfTagged(t, tag);
       // handle other kinds of exceptions
   }

  throwable - an exception - `java.lang.Throwable`
  tag - tag object - `java.lang.Object`

  throws: java.io.IOException - original exception from the tagged decorator, if any"
  ([^java.lang.Throwable throwable ^java.lang.Object tag]
    (TaggedIOException/throwCauseIfTaggedWith throwable tag)))

(defn get-tag
  "Returns the serializable tag object.

  returns: tag object - `java.io.Serializable`"
  (^java.io.Serializable [^TaggedIOException this]
    (-> this (.getTag))))

(defn get-cause
  "Returns the wrapped exception. The only difference to the overridden
   Throwable.getCause() method is the narrower return type.

  returns: wrapped exception - `java.io.IOException`"
  (^java.io.IOException [^TaggedIOException this]
    (-> this (.getCause))))

