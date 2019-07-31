(ns org.apache.commons.io.input.SwappedDataInputStream
  "DataInput for systems relying on little endian data formats.
  When read, values will be changed from little endian to big
  endian formats for internal usage.

  Origin of code: Avalon Excalibur (IO)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.input SwappedDataInputStream]))

(defn ->swapped-data-input-stream
  "Constructor.

  Constructs a SwappedDataInputStream.

  input - InputStream to read from - `java.io.InputStream`"
  (^SwappedDataInputStream [^java.io.InputStream input]
    (new SwappedDataInputStream input)))

(defn read-unsigned-byte
  "Invokes the delegate's read() method.

  returns: the byte read or -1 if the end of stream - `int`

  throws: java.io.EOFException - if an end of file is reached unexpectedly"
  (^Integer [^SwappedDataInputStream this]
    (-> this (.readUnsignedByte))))

(defn read-byte
  "Invokes the delegate's read() method.

  returns: the byte read or -1 if the end of stream - `byte`

  throws: java.io.IOException - if an I/O error occurs"
  (^Byte [^SwappedDataInputStream this]
    (-> this (.readByte))))

(defn read-fully
  "Invokes the delegate's read(byte[] data, int, int) method.

  data - the buffer to read the bytes into - `byte[]`
  offset - The start offset - `int`
  length - The number of bytes to read - `int`

  throws: java.io.EOFException - if an end of file is reached unexpectedly"
  ([^SwappedDataInputStream this data ^Integer offset ^Integer length]
    (-> this (.readFully data offset length)))
  ([^SwappedDataInputStream this data]
    (-> this (.readFully data))))

(defn read-char
  "Reads a character delegating to readShort().

  returns: the byte read or -1 if the end of stream - `char`

  throws: java.io.IOException - if an I/O error occurs"
  (^Character [^SwappedDataInputStream this]
    (-> this (.readChar))))

(defn read-float
  "Delegates to EndianUtils.readSwappedFloat(InputStream).

  returns: the read long - `float`

  throws: java.io.IOException - if an I/O error occurs"
  (^Float [^SwappedDataInputStream this]
    (-> this (.readFloat))))

(defn read-boolean
  "Return readByte() != 0

  returns: false if the byte read is zero, otherwise true - `boolean`

  throws: java.io.IOException - if an I/O error occurs"
  (^Boolean [^SwappedDataInputStream this]
    (-> this (.readBoolean))))

(defn read-int
  "Delegates to EndianUtils.readSwappedInteger(InputStream).

  returns: the read long - `int`

  throws: java.io.EOFException - if an end of file is reached unexpectedly"
  (^Integer [^SwappedDataInputStream this]
    (-> this (.readInt))))

(defn read-long
  "Delegates to EndianUtils.readSwappedLong(InputStream).

  returns: the read long - `long`

  throws: java.io.EOFException - if an end of file is reached unexpectedly"
  (^Long [^SwappedDataInputStream this]
    (-> this (.readLong))))

(defn read-short
  "Delegates to EndianUtils.readSwappedShort(InputStream).

  returns: the read long - `short`

  throws: java.io.EOFException - if an end of file is reached unexpectedly"
  (^Short [^SwappedDataInputStream this]
    (-> this (.readShort))))

(defn skip-bytes
  "Invokes the delegate's skip(int) method.

  count - the number of bytes to skip - `int`

  returns: the number of bytes to skipped or -1 if the end of stream - `int`

  throws: java.io.EOFException - if an end of file is reached unexpectedly"
  (^Integer [^SwappedDataInputStream this ^Integer count]
    (-> this (.skipBytes count))))

(defn read-utf
  "Not currently supported - throws UnsupportedOperationException.

  returns: UTF String read - `java.lang.String`

  throws: java.io.EOFException - if an end of file is reached unexpectedly"
  (^java.lang.String [^SwappedDataInputStream this]
    (-> this (.readUTF))))

(defn read-double
  "Delegates to EndianUtils.readSwappedDouble(InputStream).

  returns: the read long - `double`

  throws: java.io.IOException - if an I/O error occurs"
  (^Double [^SwappedDataInputStream this]
    (-> this (.readDouble))))

(defn read-line
  "Not currently supported - throws UnsupportedOperationException.

  returns: the line read - `java.lang.String`

  throws: java.io.EOFException - if an end of file is reached unexpectedly"
  (^java.lang.String [^SwappedDataInputStream this]
    (-> this (.readLine))))

(defn read-unsigned-short
  "Delegates to EndianUtils.readSwappedUnsignedShort(InputStream).

  returns: the read long - `int`

  throws: java.io.EOFException - if an end of file is reached unexpectedly"
  (^Integer [^SwappedDataInputStream this]
    (-> this (.readUnsignedShort))))

