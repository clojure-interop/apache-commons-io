(ns org.apache.commons.io.input.XmlStreamReader
  "Character stream that handles all the necessary Voodoo to figure out the
  charset encoding of the XML document within the stream.

  IMPORTANT: This class is not related in any way to the org.xml.sax.XMLReader.
  This one IS a character stream.

  All this has to be done without consuming characters from the stream, if not
  the XML parser will not recognized the document as a valid XML. This is not
  100% true, but it's close enough (UTF-8 BOM is not handled by all parsers
  right now, XmlStreamReader handles it and things work in all parsers).

  The XmlStreamReader class handles the charset encoding of XML documents in
  Files, raw streams and HTTP streams by offering a wide set of constructors.

  By default the charset encoding detection is lenient, the constructor with
  the lenient flag can be used for a script (following HTTP MIME and XML
  specifications). All this is nicely explained by Mark Pilgrim in his blog,
  Determining the character encoding of a feed.

  Originally developed for ROME under
  Apache License 2.0."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.input XmlStreamReader]))

(defn ->xml-stream-reader
  "Constructor.

  Creates a Reader using an InputStream and the associated content-type
   header. This constructor is lenient regarding the encoding detection.

   First it checks if the stream has BOM. If there is not BOM checks the
   content-type encoding. If there is not content-type encoding checks the
   XML prolog encoding. If there is not XML prolog encoding uses the default
   encoding mandated by the content-type MIME type.

   If lenient detection is indicated and the detection above fails as per
   specifications it then attempts the following:

   If the content type was 'text/html' it replaces it with 'text/xml' and
   tries the detection again.

   Else if the XML prolog had a charset encoding that encoding is used.

   Else if the content type had a charset encoding that encoding is used.

   Else 'UTF-8' is used.

   If lenient detection is indicated an XmlStreamReaderException is never
   thrown.

  is - InputStream to create the reader from. - `java.io.InputStream`
  http-content-type - content-type header to use for the resolution of the charset encoding. - `java.lang.String`
  lenient - indicates if the charset encoding detection should be relaxed. - `boolean`
  default-encoding - The default encoding - `java.lang.String`

  throws: java.io.IOException - thrown if there is a problem reading the file."
  (^XmlStreamReader [^java.io.InputStream is ^java.lang.String http-content-type ^Boolean lenient ^java.lang.String default-encoding]
    (new XmlStreamReader is http-content-type lenient default-encoding))
  (^XmlStreamReader [^java.io.InputStream is ^Boolean lenient ^java.lang.String default-encoding]
    (new XmlStreamReader is lenient default-encoding))
  (^XmlStreamReader [^java.io.InputStream is ^Boolean lenient]
    (new XmlStreamReader is lenient))
  (^XmlStreamReader [^java.io.File file]
    (new XmlStreamReader file)))

(def *-encoding-pattern
  "Static Constant.

  type: java.util.regex.Pattern"
  XmlStreamReader/ENCODING_PATTERN)

(defn get-default-encoding
  "Returns the default encoding to use if none is set in HTTP content-type,
   XML prolog and the rules based on content-type are not adequate.

   If it is NULL the content-type based rules are used.

  returns: the default encoding to use. - `java.lang.String`"
  (^java.lang.String [^XmlStreamReader this]
    (-> this (.getDefaultEncoding))))

(defn get-encoding
  "Returns the charset encoding of the XmlStreamReader.

  returns: charset encoding. - `java.lang.String`"
  (^java.lang.String [^XmlStreamReader this]
    (-> this (.getEncoding))))

(defn read
  "Invokes the underlying reader's read(char[], int, int) method.

  buf - the buffer to read the characters into - `char[]`
  offset - The start offset - `int`
  len - The number of bytes to read - `int`

  returns: the number of characters read or -1 if the end of stream - `int`

  throws: java.io.IOException - if an I/O error occurs"
  (^Integer [^XmlStreamReader this buf ^Integer offset ^Integer len]
    (-> this (.read buf offset len))))

(defn close
  "Closes the XmlStreamReader stream.

  throws: java.io.IOException - thrown if there was a problem closing the stream."
  ([^XmlStreamReader this]
    (-> this (.close))))

