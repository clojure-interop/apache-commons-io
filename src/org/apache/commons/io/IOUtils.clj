(ns org.apache.commons.io.IOUtils
  "General IO stream manipulation utilities.

  This class provides static utility methods for input/output operations.

  [Deprecated] closeQuietly - these methods close a stream ignoring nulls and exceptions
  toXxx/read - these methods read data from a stream
  write - these methods write data to a stream
  copy - these methods copy all the data from one stream to another
  contentEquals - these methods compare the content of two streams


  The byte-to-char methods and char-to-byte methods involve a conversion step.
  Two methods are provided in each case, one that uses the platform default
  encoding and the other which allows you to specify an encoding. You are
  encouraged to always specify an encoding because relying on the platform
  default can lead to unexpected results, for example when moving from
  development to production.

  All the methods in this class that read a stream are buffered internally.
  This means that there is no cause to use a BufferedInputStream
  or BufferedReader. The default buffer size of 4K has been shown
  to be efficient in tests.

  The various copy methods all delegate the actual copying to one of the following methods:

  copyLarge(InputStream, OutputStream, byte[])
  copyLarge(InputStream, OutputStream, long, long, byte[])
  copyLarge(Reader, Writer, char[])
  copyLarge(Reader, Writer, long, long, char[])

  For example, copy(InputStream, OutputStream) calls copyLarge(InputStream, OutputStream)
  which calls copy(InputStream, OutputStream, int) which creates the buffer and calls
  copyLarge(InputStream, OutputStream, byte[]).

  Applications can re-use buffers by using the underlying methods directly.
  This may improve performance for applications that need to do a lot of copying.

  Wherever possible, the methods in this class do not flush or close
  the stream. This is to avoid making non-portable assumptions about the
  streams' origin and further use. Thus the caller is still responsible for
  closing streams after use.

  Origin of code: Excalibur."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io IOUtils]))

(defn ->io-utils
  "Constructor.

  Instances should NOT be constructed in standard programming."
  (^IOUtils []
    (new IOUtils )))

(def *-eof
  "Static Constant.

  Represents the end-of-file (or stream).

  type: int"
  IOUtils/EOF)

(def *-dir-separator-unix
  "Static Constant.

  The Unix directory separator character.

  type: char"
  IOUtils/DIR_SEPARATOR_UNIX)

(def *-dir-separator-windows
  "Static Constant.

  The Windows directory separator character.

  type: char"
  IOUtils/DIR_SEPARATOR_WINDOWS)

(def *-dir-separator
  "Static Constant.

  The system directory separator character.

  type: char"
  IOUtils/DIR_SEPARATOR)

(def *-line-separator-unix
  "Static Constant.

  The Unix line separator string.

  type: java.lang.String"
  IOUtils/LINE_SEPARATOR_UNIX)

(def *-line-separator-windows
  "Static Constant.

  The Windows line separator string.

  type: java.lang.String"
  IOUtils/LINE_SEPARATOR_WINDOWS)

(def *-line-separator
  "Static Constant.

  The system line separator string.

  type: java.lang.String"
  IOUtils/LINE_SEPARATOR)

(defn *skip
  "Skips bytes from an input byte stream.
   This implementation guarantees that it will read as many bytes
   as possible before giving up; this may not always be the case for
   skip() implementations in subclasses of InputStream.

   Note that the implementation uses InputStream.read(byte[], int, int) rather
   than delegating to InputStream.skip(long).
   This means that the method may be considerably less efficient than using the actual skip implementation,
   this is done to guarantee that the correct number of bytes are skipped.

  input - byte stream to skip - `java.io.InputStream`
  to-skip - number of bytes to skip. - `long`

  returns: number of bytes actually skipped. - `long`

  throws: java.io.IOException - if there is a problem reading the file"
  (^Long [^java.io.InputStream input ^Long to-skip]
    (IOUtils/skip input to-skip)))

(defn *read-fully
  "Reads the requested number of characters or fail if there are not enough left.

   This allows for the possibility that Reader.read(char[], int, int) may
   not read as many characters as requested (most likely because of reaching EOF).

  input - where to read input from - `java.io.Reader`
  buffer - destination - `char[]`
  offset - initial offset into buffer - `int`
  length - length to read, must be >= 0 - `int`

  throws: java.io.IOException - if there is a problem reading the file"
  ([^java.io.Reader input buffer ^Integer offset ^Integer length]
    (IOUtils/readFully input buffer offset length))
  ([^java.io.Reader input buffer]
    (IOUtils/readFully input buffer)))

(defn *copy
  "Copies bytes from an InputStream to an OutputStream using an internal buffer of the
   given size.

   This method buffers the input internally, so there is no need to use a BufferedInputStream.

  input - the InputStream to read from - `java.io.InputStream`
  output - the OutputStream to write to - `java.io.OutputStream`
  buffer-size - the bufferSize used to copy from the input to the output - `int`

  returns: the number of bytes copied - `long`

  throws: java.lang.NullPointerException - if the input or output is null"
  (^Long [^java.io.InputStream input ^java.io.OutputStream output ^Integer buffer-size]
    (IOUtils/copy input output buffer-size))
  (^Integer [^java.io.InputStream input ^java.io.OutputStream output]
    (IOUtils/copy input output)))

(defn *to-string
  "Gets the contents of an InputStream as a String
   using the specified character encoding.

   This method buffers the input internally, so there is no need to use a
   BufferedInputStream.

  input - the InputStream to read from - `java.io.InputStream`
  encoding - the encoding to use, null means platform default - `java.nio.charset.Charset`

  returns: the requested String - `java.lang.String`

  throws: java.lang.NullPointerException - if the input is null"
  (^java.lang.String [^java.io.InputStream input ^java.nio.charset.Charset encoding]
    (IOUtils/toString input encoding))
  (^java.lang.String [^java.io.InputStream input]
    (IOUtils/toString input)))

(defn *read
  "Reads characters from an input character stream.
   This implementation guarantees that it will read as many characters
   as possible before giving up; this may not always be the case for
   subclasses of Reader.

  input - where to read input from - `java.io.Reader`
  buffer - destination - `char[]`
  offset - initial offset into buffer - `int`
  length - length to read, must be >= 0 - `int`

  returns: actual length read; may be less than requested if EOF was reached - `int`

  throws: java.io.IOException - if a read error occurs"
  (^Integer [^java.io.Reader input buffer ^Integer offset ^Integer length]
    (IOUtils/read input buffer offset length))
  (^Integer [^java.io.Reader input buffer]
    (IOUtils/read input buffer)))

(defn *buffer
  "Returns the given reader if it is already a BufferedReader, otherwise creates a BufferedReader from the
   given reader.

  reader - the reader to wrap or return (not null) - `java.io.Reader`
  size - the buffer size, if a new BufferedReader is created. - `int`

  returns: the given reader or a new BufferedReader for the given reader - `java.io.BufferedReader`

  throws: java.lang.NullPointerException - if the input parameter is null"
  (^java.io.BufferedReader [^java.io.Reader reader ^Integer size]
    (IOUtils/buffer reader size))
  (^java.io.BufferedReader [^java.io.Reader reader]
    (IOUtils/buffer reader)))

(defn *write-lines
  "Writes the toString() value of each item in a collection to
   an OutputStream line by line, using the specified character
   encoding and the specified line ending.

  lines - the lines to write, null entries produce blank lines - `java.util.Collection`
  line-ending - the line separator to use, null is system default - `java.lang.String`
  output - the OutputStream to write to, not null, not closed - `java.io.OutputStream`
  encoding - the encoding to use, null means platform default - `java.nio.charset.Charset`

  throws: java.lang.NullPointerException - if the output is null"
  ([^java.util.Collection lines ^java.lang.String line-ending ^java.io.OutputStream output ^java.nio.charset.Charset encoding]
    (IOUtils/writeLines lines line-ending output encoding))
  ([^java.util.Collection lines ^java.lang.String line-ending ^java.io.OutputStream output]
    (IOUtils/writeLines lines line-ending output)))

(defn *to-input-stream
  "Converts the specified CharSequence to an input stream, encoded as bytes
   using the specified character encoding.

  input - the CharSequence to convert - `java.lang.CharSequence`
  encoding - the encoding to use, null means platform default - `java.nio.charset.Charset`

  returns: an input stream - `java.io.InputStream`"
  (^java.io.InputStream [^java.lang.CharSequence input ^java.nio.charset.Charset encoding]
    (IOUtils/toInputStream input encoding))
  (^java.io.InputStream [^java.lang.CharSequence input]
    (IOUtils/toInputStream input)))

(defn *to-char-array
  "Gets the contents of an InputStream as a character array
   using the specified character encoding.

   This method buffers the input internally, so there is no need to use a
   BufferedInputStream.

  is - the InputStream to read from - `java.io.InputStream`
  encoding - the encoding to use, null means platform default - `java.nio.charset.Charset`

  returns: the requested character array - `char[]`

  throws: java.lang.NullPointerException - if the input is null"
  ([^java.io.InputStream is ^java.nio.charset.Charset encoding]
    (IOUtils/toCharArray is encoding))
  ([^java.io.InputStream is]
    (IOUtils/toCharArray is)))

(defn *copy-large
  "Copies some or all bytes from a large (over 2GB) InputStream to an
   OutputStream, optionally skipping input bytes.

   This method uses the provided buffer, so there is no need to use a
   BufferedInputStream.


   Note that the implementation uses skip(InputStream, long).
   This means that the method may be considerably less efficient than using the actual skip implementation,
   this is done to guarantee that the correct number of characters are skipped.

  input - the InputStream to read from - `java.io.InputStream`
  output - the OutputStream to write to - `java.io.OutputStream`
  input-offset - : number of bytes to skip from input before copying -ve values are ignored - `long`
  length - : number of bytes to copy. -ve means all - `long`
  buffer - the buffer to use for the copy - `byte[]`

  returns: the number of bytes copied - `long`

  throws: java.lang.NullPointerException - if the input or output is null"
  (^Long [^java.io.InputStream input ^java.io.OutputStream output ^Long input-offset ^Long length buffer]
    (IOUtils/copyLarge input output input-offset length buffer))
  (^Long [^java.io.InputStream input ^java.io.OutputStream output ^Long input-offset ^Long length]
    (IOUtils/copyLarge input output input-offset length))
  (^Long [^java.io.InputStream input ^java.io.OutputStream output buffer]
    (IOUtils/copyLarge input output buffer))
  (^Long [^java.io.InputStream input ^java.io.OutputStream output]
    (IOUtils/copyLarge input output)))

(defn *resource-to-string
  "Gets the contents of a classpath resource as a String using the
   specified character encoding.


   It is expected the given name to be absolute. The
   behavior is not well-defined otherwise.

  name - name of the desired resource - `java.lang.String`
  encoding - the encoding to use, null means platform default - `java.nio.charset.Charset`
  class-loader - the class loader that the resolution of the resource is delegated to - `java.lang.ClassLoader`

  returns: the requested String - `java.lang.String`

  throws: java.io.IOException - if an I/O error occurs"
  (^java.lang.String [^java.lang.String name ^java.nio.charset.Charset encoding ^java.lang.ClassLoader class-loader]
    (IOUtils/resourceToString name encoding class-loader))
  (^java.lang.String [^java.lang.String name ^java.nio.charset.Charset encoding]
    (IOUtils/resourceToString name encoding)))

(defn *content-equals-ignore-eol
  "Compares the contents of two Readers to determine if they are equal or
   not, ignoring EOL characters.

   This method buffers the input internally using
   BufferedReader if they are not already buffered.

  input-1 - the first reader - `java.io.Reader`
  input-2 - the second reader - `java.io.Reader`

  returns: true if the content of the readers are equal (ignoring EOL differences),  false otherwise - `boolean`

  throws: java.lang.NullPointerException - if either input is null"
  (^Boolean [^java.io.Reader input-1 ^java.io.Reader input-2]
    (IOUtils/contentEqualsIgnoreEOL input-1 input-2)))

(defn *close
  "Closes a URLConnection.

  conn - the connection to close. - `java.net.URLConnection`"
  ([^java.net.URLConnection conn]
    (IOUtils/close conn)))

(defn *read-lines
  "Gets the contents of an InputStream as a list of Strings,
   one entry per line, using the specified character encoding.

   This method buffers the input internally, so there is no need to use a
   BufferedInputStream.

  input - the InputStream to read from, not null - `java.io.InputStream`
  encoding - the encoding to use, null means platform default - `java.nio.charset.Charset`

  returns: the list of Strings, never null - `java.util.List<java.lang.String>`

  throws: java.lang.NullPointerException - if the input is null"
  (^java.util.List [^java.io.InputStream input ^java.nio.charset.Charset encoding]
    (IOUtils/readLines input encoding))
  (^java.util.List [^java.io.InputStream input]
    (IOUtils/readLines input)))

(defn *to-buffered-input-stream
  "Fetches entire contents of an InputStream and represent
   same data as result InputStream.

   This method is useful where,

   Source InputStream is slow.
   It has network resources associated, so we cannot keep it open for
   long time.
   It has network timeout associated.

   It can be used in favor of toByteArray(InputStream), since it
   avoids unnecessary allocation and copy of byte[].
   This method buffers the input internally, so there is no need to use a
   BufferedInputStream.

  input - Stream to be fully buffered. - `java.io.InputStream`
  size - the initial buffer size - `int`

  returns: A fully buffered stream. - `java.io.InputStream`

  throws: java.io.IOException - if an I/O error occurs"
  (^java.io.InputStream [^java.io.InputStream input ^Integer size]
    (IOUtils/toBufferedInputStream input size))
  (^java.io.InputStream [^java.io.InputStream input]
    (IOUtils/toBufferedInputStream input)))

(defn *to-buffered-reader
  "Returns the given reader if it is a BufferedReader, otherwise creates a BufferedReader from the given
   reader.

  reader - the reader to wrap or return (not null) - `java.io.Reader`
  size - the buffer size, if a new BufferedReader is created. - `int`

  returns: the given reader or a new BufferedReader for the given reader - `java.io.BufferedReader`

  throws: java.lang.NullPointerException - if the input parameter is null"
  (^java.io.BufferedReader [^java.io.Reader reader ^Integer size]
    (IOUtils/toBufferedReader reader size))
  (^java.io.BufferedReader [^java.io.Reader reader]
    (IOUtils/toBufferedReader reader)))

(defn *close-quietly
  "Deprecated. As of 2.6 removed without replacement. Please use the try-with-resources statement or handle
   suppressed exceptions manually.

  input - the Reader to close, may be null or already closed - `java.io.Reader`"
  ([^java.io.Reader input]
    (IOUtils/closeQuietly input)))

(defn *resource-to-byte-array
  "Gets the contents of a classpath resource as a byte array.


   It is expected the given name to be absolute. The
   behavior is not well-defined otherwise.

  name - name of the desired resource - `java.lang.String`
  class-loader - the class loader that the resolution of the resource is delegated to - `java.lang.ClassLoader`

  returns: the requested byte array - `byte[]`

  throws: java.io.IOException - if an I/O error occurs"
  ([^java.lang.String name ^java.lang.ClassLoader class-loader]
    (IOUtils/resourceToByteArray name class-loader))
  ([^java.lang.String name]
    (IOUtils/resourceToByteArray name)))

(defn *content-equals
  "Compares the contents of two Streams to determine if they are equal or
   not.

   This method buffers the input internally using
   BufferedInputStream if they are not already buffered.

  input-1 - the first stream - `java.io.InputStream`
  input-2 - the second stream - `java.io.InputStream`

  returns: true if the content of the streams are equal or they both don't
   exist, false otherwise - `boolean`

  throws: java.lang.NullPointerException - if either input is null"
  (^Boolean [^java.io.InputStream input-1 ^java.io.InputStream input-2]
    (IOUtils/contentEquals input-1 input-2)))

(defn *write
  "Writes bytes from a byte[] to chars on a Writer
   using the specified character encoding.

   This method uses String.String(byte[], String).

  data - the byte array to write, do not modify during output, null ignored - `byte[]`
  output - the Writer to write to - `java.io.Writer`
  encoding - the encoding to use, null means platform default - `java.nio.charset.Charset`

  throws: java.lang.NullPointerException - if output is null"
  ([data ^java.io.Writer output ^java.nio.charset.Charset encoding]
    (IOUtils/write data output encoding))
  ([data ^java.io.OutputStream output]
    (IOUtils/write data output)))

(defn *line-iterator
  "Returns an Iterator for the lines in an InputStream, using
   the character encoding specified (or default encoding if null).

   LineIterator holds a reference to the open
   InputStream specified here. When you have finished with
   the iterator you should close the stream to free internal resources.
   This can be done by closing the stream directly, or by calling
   LineIterator.close() or LineIterator.closeQuietly(LineIterator).

   The recommended usage pattern is:


   try {
     LineIterator it = IOUtils.lineIterator(stream, charset);
     while (it.hasNext()) {
       String line = it.nextLine();
       /// do something with line
     }
   } finally {
     IOUtils.closeQuietly(stream);
   }

  input - the InputStream to read from, not null - `java.io.InputStream`
  encoding - the encoding to use, null means platform default - `java.nio.charset.Charset`

  returns: an Iterator of the lines in the reader, never null - `org.apache.commons.io.LineIterator`

  throws: java.lang.IllegalArgumentException - if the input is null"
  (^org.apache.commons.io.LineIterator [^java.io.InputStream input ^java.nio.charset.Charset encoding]
    (IOUtils/lineIterator input encoding))
  (^org.apache.commons.io.LineIterator [^java.io.Reader reader]
    (IOUtils/lineIterator reader)))

(defn *write-chunked
  "Writes bytes from a byte[] to an OutputStream using chunked writes.
   This is intended for writing very large byte arrays which might otherwise cause excessive
   memory usage if the native code has to allocate a copy.

  data - the byte array to write, do not modify during output, null ignored - `byte[]`
  output - the OutputStream to write to - `java.io.OutputStream`

  throws: java.lang.NullPointerException - if output is null"
  ([data ^java.io.OutputStream output]
    (IOUtils/writeChunked data output)))

(defn *to-byte-array
  "Gets contents of an InputStream as a byte[].
   Use this method instead of toByteArray(InputStream)
   when InputStream size is known.
   NOTE: the method checks that the length can safely be cast to an int without truncation
   before using toByteArray(java.io.InputStream, int) to read into the byte array.
   (Arrays can have no more than Integer.MAX_VALUE entries anyway)

  input - the InputStream to read from - `java.io.InputStream`
  size - the size of InputStream - `long`

  returns: the requested byte array - `byte[]`

  throws: java.io.IOException - if an I/O error occurs or InputStream size differ from parameter size"
  ([^java.io.InputStream input ^Long size]
    (IOUtils/toByteArray input size))
  ([^java.io.InputStream input]
    (IOUtils/toByteArray input)))

(defn *skip-fully
  "Skips the requested number of bytes or fail if there are not enough left.

   This allows for the possibility that InputStream.skip(long) may
   not skip as many bytes as requested (most likely because of reaching EOF).

   Note that the implementation uses skip(InputStream, long).
   This means that the method may be considerably less efficient than using the actual skip implementation,
   this is done to guarantee that the correct number of characters are skipped.

  input - stream to skip - `java.io.InputStream`
  to-skip - the number of bytes to skip - `long`

  throws: java.io.IOException - if there is a problem reading the file"
  ([^java.io.InputStream input ^Long to-skip]
    (IOUtils/skipFully input to-skip)))

(defn *resource-to-url
  "Gets a URL pointing to the given classpath resource.


   It is expected the given name to be absolute. The
   behavior is not well-defined otherwise.

  name - name of the desired resource - `java.lang.String`
  class-loader - the class loader that the resolution of the resource is delegated to - `java.lang.ClassLoader`

  returns: the requested URL - `java.net.URL`

  throws: java.io.IOException - if an I/O error occurs"
  (^java.net.URL [^java.lang.String name ^java.lang.ClassLoader class-loader]
    (IOUtils/resourceToURL name class-loader))
  (^java.net.URL [^java.lang.String name]
    (IOUtils/resourceToURL name)))

