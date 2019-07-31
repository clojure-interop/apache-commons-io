(ns org.apache.commons.io.output.DeferredFileOutputStream
  "An output stream which will retain data in memory until a specified
  threshold is reached, and only then commit it to disk. If the stream is
  closed before the threshold is reached, the data will not be written to
  disk at all.

  This class originated in FileUpload processing. In this use case, you do
  not know in advance the size of the file being uploaded. If the file is small
  you want to store it in memory (for speed), but if the file is large you want
  to store it to file (to avoid memory issues)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.output DeferredFileOutputStream]))

(defn ->deferred-file-output-stream
  "Constructor.

  Constructs an instance of this class which will trigger an event at the
   specified threshold, and save data to a temporary file beyond that point.

  threshold - The number of bytes at which to trigger an event. - `int`
  initial-buffer-size - The initial size of the in memory buffer. - `int`
  prefix - Prefix to use for the temporary file. - `java.lang.String`
  suffix - Suffix to use for the temporary file. - `java.lang.String`
  directory - Temporary file directory. - `java.io.File`"
  (^DeferredFileOutputStream [^Integer threshold ^Integer initial-buffer-size ^java.lang.String prefix ^java.lang.String suffix ^java.io.File directory]
    (new DeferredFileOutputStream threshold initial-buffer-size prefix suffix directory))
  (^DeferredFileOutputStream [^Integer threshold ^java.lang.String prefix ^java.lang.String suffix ^java.io.File directory]
    (new DeferredFileOutputStream threshold prefix suffix directory))
  (^DeferredFileOutputStream [^Integer threshold ^Integer initial-buffer-size ^java.io.File output-file]
    (new DeferredFileOutputStream threshold initial-buffer-size output-file))
  (^DeferredFileOutputStream [^Integer threshold ^java.io.File output-file]
    (new DeferredFileOutputStream threshold output-file)))

(defn in-memory?
  "Determines whether or not the data for this output stream has been
   retained in memory.

  returns: true if the data is available in memory;
           false otherwise. - `boolean`"
  (^Boolean [^DeferredFileOutputStream this]
    (-> this (.isInMemory))))

(defn get-data
  "Returns the data for this output stream as an array of bytes, assuming
   that the data has been retained in memory. If the data was written to
   disk, this method returns null.

  returns: The data for this output stream, or null if no such
           data is available. - `byte[]`"
  ([^DeferredFileOutputStream this]
    (-> this (.getData))))

(defn get-file
  "Returns either the output file specified in the constructor or
   the temporary file created or null.

   If the constructor specifying the file is used then it returns that
   same output file, even when threshold has not been reached.

   If constructor specifying a temporary file prefix/suffix is used
   then the temporary file created once the threshold is reached is returned
   If the threshold was not reached then null is returned.

  returns: The file for this output stream, or null if no such
           file exists. - `java.io.File`"
  (^java.io.File [^DeferredFileOutputStream this]
    (-> this (.getFile))))

(defn close
  "Closes underlying output stream, and mark this as closed

  throws: java.io.IOException - if an error occurs."
  ([^DeferredFileOutputStream this]
    (-> this (.close))))

(defn write-to
  "Writes the data from this output stream to the specified output stream,
   after it has been closed.

  out - output stream to write to. - `java.io.OutputStream`

  throws: java.io.IOException - if this stream is not yet closed or an error occurs."
  ([^DeferredFileOutputStream this ^java.io.OutputStream out]
    (-> this (.writeTo out))))

