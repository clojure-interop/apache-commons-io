(ns org.apache.commons.io.input.XmlStreamReaderException
  "The XmlStreamReaderException is thrown by the XmlStreamReader constructors if
  the charset encoding can not be determined according to the XML 1.0
  specification and RFC 3023.

  The exception returns the unconsumed InputStream to allow the application to
  do an alternate processing with the stream. Note that the original
  InputStream given to the XmlStreamReader cannot be used as that one has been
  already read."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.input XmlStreamReaderException]))

(defn ->xml-stream-reader-exception
  "Constructor.

  Creates an exception instance if the charset encoding could not be
   determined.

   Instances of this exception are thrown by the XmlStreamReader.

  msg - message describing the reason for the exception. - `java.lang.String`
  ct-mime - MIME type in the content-type. - `java.lang.String`
  ct-enc - encoding in the content-type. - `java.lang.String`
  bom-enc - BOM encoding. - `java.lang.String`
  xml-guess-enc - XML guess encoding. - `java.lang.String`
  xml-enc - XML prolog encoding. - `java.lang.String`"
  (^XmlStreamReaderException [^java.lang.String msg ^java.lang.String ct-mime ^java.lang.String ct-enc ^java.lang.String bom-enc ^java.lang.String xml-guess-enc ^java.lang.String xml-enc]
    (new XmlStreamReaderException msg ct-mime ct-enc bom-enc xml-guess-enc xml-enc))
  (^XmlStreamReaderException [^java.lang.String msg ^java.lang.String bom-enc ^java.lang.String xml-guess-enc ^java.lang.String xml-enc]
    (new XmlStreamReaderException msg bom-enc xml-guess-enc xml-enc)))

(defn get-bom-encoding
  "Returns the BOM encoding found in the InputStream.

  returns: the BOM encoding, null if none. - `java.lang.String`"
  (^java.lang.String [^XmlStreamReaderException this]
    (-> this (.getBomEncoding))))

(defn get-xml-guess-encoding
  "Returns the encoding guess based on the first bytes of the InputStream.

  returns: the encoding guess, null if it couldn't be guessed. - `java.lang.String`"
  (^java.lang.String [^XmlStreamReaderException this]
    (-> this (.getXmlGuessEncoding))))

(defn get-xml-encoding
  "Returns the encoding found in the XML prolog of the InputStream.

  returns: the encoding of the XML prolog, null if none. - `java.lang.String`"
  (^java.lang.String [^XmlStreamReaderException this]
    (-> this (.getXmlEncoding))))

(defn get-content-type-mime
  "Returns the MIME type in the content-type used to attempt determining the
   encoding.

  returns: the MIME type in the content-type, null if there was not
           content-type or the encoding detection did not involve HTTP. - `java.lang.String`"
  (^java.lang.String [^XmlStreamReaderException this]
    (-> this (.getContentTypeMime))))

(defn get-content-type-encoding
  "Returns the encoding in the content-type used to attempt determining the
   encoding.

  returns: the encoding in the content-type, null if there was not
           content-type, no encoding in it or the encoding detection did not
           involve HTTP. - `java.lang.String`"
  (^java.lang.String [^XmlStreamReaderException this]
    (-> this (.getContentTypeEncoding))))

