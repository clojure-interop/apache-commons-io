(ns org.apache.commons.io.input.TeeInputStream
  "InputStream proxy that transparently writes a copy of all bytes read
  from the proxied stream to a given OutputStream. Using ProxyInputStream.skip(long)
  or ProxyInputStream.mark(int)/ProxyInputStream.reset() on the stream will result on some
  bytes from the input stream being skipped or duplicated in the output
  stream.

  The proxied input stream is closed when the close() method is
  called on this proxy. It is configurable whether the associated output
  stream will also closed."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.input TeeInputStream]))

(defn ->tee-input-stream
  "Constructor.

  Creates a TeeInputStream that proxies the given InputStream
   and copies all read bytes to the given OutputStream. The given
   output stream will be closed when this stream gets closed if the
   closeBranch parameter is true.

  input - input stream to be proxied - `java.io.InputStream`
  branch - output stream that will receive a copy of all bytes read - `java.io.OutputStream`
  close-branch - flag for closing also the output stream when this stream is closed - `boolean`"
  (^TeeInputStream [^java.io.InputStream input ^java.io.OutputStream branch ^Boolean close-branch]
    (new TeeInputStream input branch close-branch))
  (^TeeInputStream [^java.io.InputStream input ^java.io.OutputStream branch]
    (new TeeInputStream input branch)))

(defn close
  "Closes the proxied input stream and, if so configured, the associated
   output stream. An exception thrown from one stream will not prevent
   closing of the other stream.

  throws: java.io.IOException - if either of the streams could not be closed"
  ([^TeeInputStream this]
    (-> this (.close))))

(defn read
  "Reads bytes from the proxied input stream and writes the read bytes
   to the associated output stream.

  bts - byte buffer - `byte[]`
  st - start offset within the buffer - `int`
  end - maximum number of bytes to read - `int`

  returns: number of bytes read, or -1 if the stream has ended - `int`

  throws: java.io.IOException - if the stream could not be read (or written)"
  (^Integer [^TeeInputStream this bts ^Integer st ^Integer end]
    (-> this (.read bts st end)))
  (^Integer [^TeeInputStream this bts]
    (-> this (.read bts)))
  (^Integer [^TeeInputStream this]
    (-> this (.read))))

