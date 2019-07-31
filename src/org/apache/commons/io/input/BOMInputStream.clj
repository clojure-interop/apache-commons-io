(ns org.apache.commons.io.input.BOMInputStream
  "This class is used to wrap a stream that includes an encoded ByteOrderMark as its first bytes.

  This class detects these bytes and, if required, can automatically skip them and return the subsequent byte as the
  first byte in the stream.

  The ByteOrderMark implementation has the following pre-defined BOMs:

  UTF-8 - ByteOrderMark.UTF_8
  UTF-16BE - ByteOrderMark.UTF_16LE
  UTF-16LE - ByteOrderMark.UTF_16BE
  UTF-32BE - ByteOrderMark.UTF_32LE
  UTF-32LE - ByteOrderMark.UTF_32BE



  Example 1 - Detect and exclude a UTF-8 BOM



  BOMInputStream bomIn = new BOMInputStream(in);
  if (bomIn.hasBOM()) {
      // has a UTF-8 BOM
  }

  Example 2 - Detect a UTF-8 BOM (but don't exclude it)



  boolean include = true;
  BOMInputStream bomIn = new BOMInputStream(in, include);
  if (bomIn.hasBOM()) {
      // has a UTF-8 BOM
  }

  Example 3 - Detect Multiple BOMs



  BOMInputStream bomIn = new BOMInputStream(in,
    ByteOrderMark.UTF_16LE, ByteOrderMark.UTF_16BE,
    ByteOrderMark.UTF_32LE, ByteOrderMark.UTF_32BE
    );
  if (bomIn.hasBOM() == false) {
      // No BOM found
  } else if (bomIn.hasBOM(ByteOrderMark.UTF_16LE)) {
      // has a UTF-16LE BOM
  } else if (bomIn.hasBOM(ByteOrderMark.UTF_16BE)) {
      // has a UTF-16BE BOM
  } else if (bomIn.hasBOM(ByteOrderMark.UTF_32LE)) {
      // has a UTF-32LE BOM
  } else if (bomIn.hasBOM(ByteOrderMark.UTF_32BE)) {
      // has a UTF-32BE BOM
  }"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.input BOMInputStream]))

(defn ->bom-input-stream
  "Constructor.

  Constructs a new BOM InputStream that detects the specified BOMs and optionally includes them.

  delegate - the InputStream to delegate to - `java.io.InputStream`
  include - true to include the specified BOMs or false to exclude them - `boolean`
  boms - The BOMs to detect and optionally exclude - `org.apache.commons.io.ByteOrderMark`"
  (^BOMInputStream [^java.io.InputStream delegate ^Boolean include ^org.apache.commons.io.ByteOrderMark boms]
    (new BOMInputStream delegate include boms))
  (^BOMInputStream [^java.io.InputStream delegate ^Boolean include]
    (new BOMInputStream delegate include))
  (^BOMInputStream [^java.io.InputStream delegate]
    (new BOMInputStream delegate)))

(defn has-bom?
  "Indicates whether the stream contains the specified BOM.

  bom - The BOM to check for - `org.apache.commons.io.ByteOrderMark`

  returns: true if the stream has the specified BOM, otherwise false if it does not - `boolean`

  throws: java.lang.IllegalArgumentException - if the BOM is not one the stream is configured to detect"
  (^Boolean [^BOMInputStream this ^org.apache.commons.io.ByteOrderMark bom]
    (-> this (.hasBOM bom)))
  (^Boolean [^BOMInputStream this]
    (-> this (.hasBOM))))

(defn get-bom
  "Return the BOM (Byte Order Mark).

  returns: The BOM or null if none - `org.apache.commons.io.ByteOrderMark`

  throws: java.io.IOException - if an error reading the first bytes of the stream occurs"
  (^org.apache.commons.io.ByteOrderMark [^BOMInputStream this]
    (-> this (.getBOM))))

(defn get-bom-charset-name
  "Return the BOM charset Name - ByteOrderMark.getCharsetName().

  returns: The BOM charset Name or null if no BOM found - `java.lang.String`

  throws: java.io.IOException - if an error reading the first bytes of the stream occurs"
  (^java.lang.String [^BOMInputStream this]
    (-> this (.getBOMCharsetName))))

(defn read
  "Invokes the delegate's read(byte[], int, int) method, detecting and optionally skipping BOM.

  buf - the buffer to read the bytes into - `byte[]`
  off - The start offset - `int`
  len - The number of bytes to read (excluding BOM) - `int`

  returns: the number of bytes read or -1 if the end of stream - `int`

  throws: java.io.IOException - if an I/O error occurs"
  (^Integer [^BOMInputStream this buf ^Integer off ^Integer len]
    (-> this (.read buf off len)))
  (^Integer [^BOMInputStream this buf]
    (-> this (.read buf)))
  (^Integer [^BOMInputStream this]
    (-> this (.read))))

(defn mark
  "Invokes the delegate's mark(int) method.

  readlimit - read ahead limit - `int`"
  ([^BOMInputStream this ^Integer readlimit]
    (-> this (.mark readlimit))))

(defn reset
  "Invokes the delegate's reset() method.

  throws: java.io.IOException - if an I/O error occurs"
  ([^BOMInputStream this]
    (-> this (.reset))))

(defn skip
  "Invokes the delegate's skip(long) method, detecting and optionally skipping BOM.

  n - the number of bytes to skip - `long`

  returns: the number of bytes to skipped or -1 if the end of stream - `long`

  throws: java.io.IOException - if an I/O error occurs"
  (^Long [^BOMInputStream this ^Long n]
    (-> this (.skip n))))

