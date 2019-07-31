(ns org.apache.commons.io.output.TaggedOutputStream
  "An output stream decorator that tags potential exceptions so that the
  stream that caused the exception can easily be identified. This is
  done by using the TaggedIOException class to wrap all thrown
  IOExceptions. See below for an example of using this class.


  TaggedOutputStream stream = new TaggedOutputStream(...);
  try {
      // Processing that may throw an IOException either from this stream
      // or from some other IO activity like temporary files, etc.
      writeToStream(stream);
  } catch (IOException e) {
      if (stream.isCauseOf(e)) {
          // The exception was caused by this stream.
          // Use e.getCause() to get the original exception.
      } else {
          // The exception was caused by something else.
      }
  }

  Alternatively, the throwIfCauseOf(Exception) method can be
  used to let higher levels of code handle the exception caused by this
  stream while other processing errors are being taken care of at this
  lower level.


  TaggedOutputStream stream = new TaggedOutputStream(...);
  try {
      writeToStream(stream);
  } catch (IOException e) {
      stream.throwIfCauseOf(e);
      // ... or process the exception that was caused by something else
  }"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.output TaggedOutputStream]))

(defn ->tagged-output-stream
  "Constructor.

  Creates a tagging decorator for the given output stream.

  proxy - output stream to be decorated - `java.io.OutputStream`"
  (^TaggedOutputStream [^java.io.OutputStream proxy]
    (new TaggedOutputStream proxy)))

(defn cause-of?
  "Tests if the given exception was caused by this stream.

  exception - an exception - `java.lang.Exception`

  returns: true if the exception was thrown by this stream,
           false otherwise - `boolean`"
  (^Boolean [^TaggedOutputStream this ^java.lang.Exception exception]
    (-> this (.isCauseOf exception))))

(defn throw-if-cause-of
  "Re-throws the original exception thrown by this stream. This method
   first checks whether the given exception is a TaggedIOException
   wrapper created by this decorator, and then unwraps and throws the
   original wrapped exception. Returns normally if the exception was
   not thrown by this stream.

  exception - an exception - `java.lang.Exception`

  throws: java.io.IOException - original exception, if any, thrown by this stream"
  ([^TaggedOutputStream this ^java.lang.Exception exception]
    (-> this (.throwIfCauseOf exception))))

