(ns org.apache.commons.io.input.ObservableInputStream
  "The ObservableInputStream allows, that an InputStream may be consumed
  by other receivers, apart from the thread, which is reading it.
  The other consumers are implemented as instances of ObservableInputStream.Observer. A
  typical application may be the generation of a MessageDigest on the
  fly.
  Note: The ObservableInputStream is not thread safe,
  as instances of InputStream usually aren't.
  If you must access the stream from multiple threads, then synchronization, locking,
  or a similar means must be used."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.input ObservableInputStream]))

(defn ->observable-input-stream
  "Constructor.

  Creates a new ObservableInputStream for the given InputStream.

  p-proxy - the input stream to proxy - `java.io.InputStream`"
  (^ObservableInputStream [^java.io.InputStream p-proxy]
    (new ObservableInputStream p-proxy)))

(defn add
  "Adds an Observer.

  p-observer - the observer to add - `org.apache.commons.io.input.ObservableInputStream$Observer`"
  ([^ObservableInputStream this ^org.apache.commons.io.input.ObservableInputStream$Observer p-observer]
    (-> this (.add p-observer))))

(defn remove
  "Removes an Observer.

  p-observer - the observer to remove - `org.apache.commons.io.input.ObservableInputStream$Observer`"
  ([^ObservableInputStream this ^org.apache.commons.io.input.ObservableInputStream$Observer p-observer]
    (-> this (.remove p-observer))))

(defn remove-all-observers
  "Removes all Observers."
  ([^ObservableInputStream this]
    (-> this (.removeAllObservers))))

(defn read
  "Description copied from class: ProxyInputStream

  p-buffer - the buffer to read the bytes into - `byte[]`
  p-offset - The start offset - `int`
  p-length - The number of bytes to read - `int`

  returns: the number of bytes read or -1 if the end of stream - `int`

  throws: java.io.IOException - if an I/O error occurs"
  (^Integer [^ObservableInputStream this p-buffer ^Integer p-offset ^Integer p-length]
    (-> this (.read p-buffer p-offset p-length)))
  (^Integer [^ObservableInputStream this p-buffer]
    (-> this (.read p-buffer)))
  (^Integer [^ObservableInputStream this]
    (-> this (.read))))

(defn close
  "Description copied from class: ProxyInputStream

  throws: java.io.IOException - if an I/O error occurs"
  ([^ObservableInputStream this]
    (-> this (.close))))

(defn consume
  "Reads all data from the underlying InputStream, while notifying the
   observers.

  throws: java.io.IOException - The underlying InputStream, or either of the observers has thrown an exception."
  ([^ObservableInputStream this]
    (-> this (.consume))))

