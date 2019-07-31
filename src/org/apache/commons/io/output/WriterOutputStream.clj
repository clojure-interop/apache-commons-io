(ns org.apache.commons.io.output.WriterOutputStream
  "OutputStream implementation that transforms a byte stream to a
  character stream using a specified charset encoding and writes the resulting
  stream to a Writer. The stream is transformed using a
  CharsetDecoder object, guaranteeing that all charset
  encodings supported by the JRE are handled correctly.

  The output of the CharsetDecoder is buffered using a fixed size buffer.
  This implies that the data is written to the underlying Writer in chunks
  that are no larger than the size of this buffer. By default, the buffer is
  flushed only when it overflows or when flush() or close()
  is called. In general there is therefore no need to wrap the underlying Writer
  in a BufferedWriter. WriterOutputStream can also
  be instructed to flush the buffer after each write operation. In this case, all
  available data is written immediately to the underlying Writer, implying that
  the current position of the Writer is correlated to the current position
  of the WriterOutputStream.

  WriterOutputStream implements the inverse transformation of OutputStreamWriter;
  in the following example, writing to out2 would have the same result as writing to
  out directly (provided that the byte sequence is legal with respect to the
  charset encoding):


  OutputStream out = ...
  Charset cs = ...
  OutputStreamWriter writer = new OutputStreamWriter(out, cs);
  WriterOutputStream out2 = new WriterOutputStream(writer, cs);
  WriterOutputStream implements the same transformation as InputStreamReader,
  except that the control flow is reversed: both classes transform a byte stream
  into a character stream, but InputStreamReader pulls data from the underlying stream,
  while WriterOutputStream pushes it to the underlying stream.

  Note that while there are use cases where there is no alternative to using
  this class, very often the need to use this class is an indication of a flaw
  in the design of the code. This class is typically used in situations where an existing
  API only accepts an OutputStream object, but where the stream is known to represent
  character data that must be decoded for further use.

  Instances of WriterOutputStream are not thread safe."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.output WriterOutputStream]))

(defn ->writer-output-stream
  "Constructor.

  Constructs a new WriterOutputStream.

  writer - the target Writer - `java.io.Writer`
  decoder - the charset decoder - `java.nio.charset.CharsetDecoder`
  buffer-size - the size of the output buffer in number of characters - `int`
  write-immediately - If true the output buffer will be flushed after each write operation, i.e. all available data will be written to the underlying Writer immediately. If false, the output buffer will only be flushed when it overflows or when flush() or close() is called. - `boolean`"
  (^WriterOutputStream [^java.io.Writer writer ^java.nio.charset.CharsetDecoder decoder ^Integer buffer-size ^Boolean write-immediately]
    (new WriterOutputStream writer decoder buffer-size write-immediately))
  (^WriterOutputStream [^java.io.Writer writer ^java.nio.charset.CharsetDecoder decoder]
    (new WriterOutputStream writer decoder))
  (^WriterOutputStream [^java.io.Writer writer]
    (new WriterOutputStream writer)))

(defn write
  "Write bytes from the specified byte array to the stream.

  b - the byte array containing the bytes to write - `byte[]`
  off - the start offset in the byte array - `int`
  len - the number of bytes to write - `int`

  throws: java.io.IOException - if an I/O error occurs"
  ([^WriterOutputStream this b ^Integer off ^Integer len]
    (-> this (.write b off len)))
  ([^WriterOutputStream this b]
    (-> this (.write b))))

(defn flush
  "Flush the stream. Any remaining content accumulated in the output buffer
   will be written to the underlying Writer. After that
   Writer.flush() will be called.

  throws: java.io.IOException - if an I/O error occurs"
  ([^WriterOutputStream this]
    (-> this (.flush))))

(defn close
  "Close the stream. Any remaining content accumulated in the output buffer
   will be written to the underlying Writer. After that
   Writer.close() will be called.

  throws: java.io.IOException - if an I/O error occurs"
  ([^WriterOutputStream this]
    (-> this (.close))))

