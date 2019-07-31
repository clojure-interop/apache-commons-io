(ns org.apache.commons.io.input.MessageDigestCalculatingInputStream
  "This class is an example for using an ObservableInputStream. It
  creates its own ObservableInputStream.Observer,
  which calculates a checksum using a MessageDigest, for example an MD5 sum.
  Note: Neither ObservableInputStream, nor MessageDigest,
  are thread safe. So is MessageDigestCalculatingInputStream."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.input MessageDigestCalculatingInputStream]))

(defn ->message-digest-calculating-input-stream
  "Constructor.

  Creates a new instance, which calculates a signature on the given stream,
   using the given MessageDigest.

  p-stream - the stream to calculate the message digest for - `java.io.InputStream`
  p-digest - the message digest to use - `java.security.MessageDigest`"
  (^MessageDigestCalculatingInputStream [^java.io.InputStream p-stream ^java.security.MessageDigest p-digest]
    (new MessageDigestCalculatingInputStream p-stream p-digest))
  (^MessageDigestCalculatingInputStream [^java.io.InputStream p-stream]
    (new MessageDigestCalculatingInputStream p-stream)))

(defn get-message-digest
  "Returns the MessageDigest, which is being used for generating the
   checksum.
   Note: The checksum will only reflect the data, which has been read so far.
   This is probably not, what you expect. Make sure, that the complete data has been
   read, if that is what you want. The easiest way to do so is by invoking
   ObservableInputStream.consume().

  returns: the message digest used - `java.security.MessageDigest`"
  (^java.security.MessageDigest [^MessageDigestCalculatingInputStream this]
    (-> this (.getMessageDigest))))

