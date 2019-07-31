(ns org.apache.commons.io.input.ReaderInputStream
  "InputStream implementation that reads a character stream from a Reader
  and transforms it to a byte stream using a specified charset encoding. The stream
  is transformed using a CharsetEncoder object, guaranteeing that all charset
  encodings supported by the JRE are handled correctly. In particular for charsets such as
  UTF-16, the implementation ensures that one and only one byte order marker
  is produced.

  Since in general it is not possible to predict the number of characters to be read from the
  Reader to satisfy a read request on the ReaderInputStream, all reads from
  the Reader are buffered. There is therefore no well defined correlation
  between the current position of the Reader and that of the ReaderInputStream.
  This also implies that in general there is no need to wrap the underlying Reader
  in a BufferedReader.

  ReaderInputStream implements the inverse transformation of InputStreamReader;
  in the following example, reading from in2 would return the same byte
  sequence as reading from in (provided that the initial byte sequence is legal
  with respect to the charset encoding):


  InputStream in = ...
  Charset cs = ...
  InputStreamReader reader = new InputStreamReader(in, cs);
  ReaderInputStream in2 = new ReaderInputStream(reader, cs);
  ReaderInputStream implements the same transformation as OutputStreamWriter,
  except that the control flow is reversed: both classes transform a character stream
  into a byte stream, but OutputStreamWriter pushes data to the underlying stream,
  while ReaderInputStream pulls it from the underlying stream.

  Note that while there are use cases where there is no alternative to using
  this class, very often the need to use this class is an indication of a flaw
  in the design of the code. This class is typically used in situations where an existing
  API only accepts an InputStream, but where the most natural way to produce the data
  is as a character stream, i.e. by providing a Reader instance. An example of a situation
  where this problem may appear is when implementing the javax.activation.DataSource
  interface from the Java Activation Framework.

  Given the fact that the Reader class doesn't provide any way to predict whether the next
  read operation will block or not, it is not possible to provide a meaningful
  implementation of the InputStream.available() method. A call to this method
  will always return 0. Also, this class doesn't support InputStream.mark(int).

  Instances of ReaderInputStream are not thread safe."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.input ReaderInputStream]))

(defn ->reader-input-stream
  "Constructor.

  Construct a new ReaderInputStream.

  reader - the target Reader - `java.io.Reader`
  encoder - the charset encoder - `java.nio.charset.CharsetEncoder`
  buffer-size - the size of the input buffer in number of characters - `int`"
  (^ReaderInputStream [^java.io.Reader reader ^java.nio.charset.CharsetEncoder encoder ^Integer buffer-size]
    (new ReaderInputStream reader encoder buffer-size))
  (^ReaderInputStream [^java.io.Reader reader ^java.nio.charset.CharsetEncoder encoder]
    (new ReaderInputStream reader encoder))
  (^ReaderInputStream [^java.io.Reader reader]
    (new ReaderInputStream reader)))

(defn read
  "Read the specified number of bytes into an array.

  b - the byte array to read into - `byte[]`
  off - the offset to start reading bytes into - `int`
  len - the number of bytes to read - `int`

  returns: the number of bytes read or -1
           if the end of the stream has been reached - `int`

  throws: java.io.IOException - if an I/O error occurs"
  (^Integer [^ReaderInputStream this b ^Integer off ^Integer len]
    (-> this (.read b off len)))
  (^Integer [^ReaderInputStream this b]
    (-> this (.read b)))
  (^Integer [^ReaderInputStream this]
    (-> this (.read))))

(defn close
  "Close the stream. This method will cause the underlying Reader
   to be closed.

  throws: java.io.IOException - if an I/O error occurs"
  ([^ReaderInputStream this]
    (-> this (.close))))

