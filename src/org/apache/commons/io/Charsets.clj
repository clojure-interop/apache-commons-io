(ns org.apache.commons.io.Charsets
  "Charsets required of every implementation of the Java platform.

  From the Java documentation
  Standard charsets:

  Every implementation of the Java platform is required to support the following character encodings. Consult
  the release documentation for your implementation to see if any other encodings are supported. Consult the release
  documentation for your implementation to see if any other encodings are supported.



  US-ASCII
  Seven-bit ASCII, a.k.a. ISO646-US, a.k.a. the Basic Latin block of the Unicode character set.
  ISO-8859-1
  ISO Latin Alphabet No. 1, a.k.a. ISO-LATIN-1.
  UTF-8
  Eight-bit Unicode Transformation Format.
  UTF-16BE
  Sixteen-bit Unicode Transformation Format, big-endian byte order.
  UTF-16LE
  Sixteen-bit Unicode Transformation Format, little-endian byte order.
  UTF-16
  Sixteen-bit Unicode Transformation Format, byte order specified by a mandatory initial byte-order mark (either order
  accepted on input, big-endian used on output.)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io Charsets]))

(defn ->charsets
  "Constructor."
  (^Charsets []
    (new Charsets )))

(def *-iso-8859-1
  "Static Constant.

  Deprecated. Use Java 7's StandardCharsets

  type: java.nio.charset.Charset"
  Charsets/ISO_8859_1)

(def *-us-ascii
  "Static Constant.

  Deprecated. Use Java 7's StandardCharsets

  type: java.nio.charset.Charset"
  Charsets/US_ASCII)

(def *-utf-16
  "Static Constant.

  Deprecated. Use Java 7's StandardCharsets

  type: java.nio.charset.Charset"
  Charsets/UTF_16)

(def *-utf-16-be
  "Static Constant.

  Deprecated. Use Java 7's StandardCharsets

  type: java.nio.charset.Charset"
  Charsets/UTF_16BE)

(def *-utf-16-le
  "Static Constant.

  Deprecated. Use Java 7's StandardCharsets

  type: java.nio.charset.Charset"
  Charsets/UTF_16LE)

(def *-utf-8
  "Static Constant.

  Deprecated. Use Java 7's StandardCharsets

  type: java.nio.charset.Charset"
  Charsets/UTF_8)

(defn *required-charsets
  "Constructs a sorted map from canonical charset names to charset objects required of every implementation of the
   Java platform.

   From the Java documentation
   Standard charsets:

  returns: An immutable, case-insensitive map from canonical charset names to charset objects. - `java.util.SortedMap<java.lang.String,java.nio.charset.Charset>`"
  (^java.util.SortedMap []
    (Charsets/requiredCharsets )))

(defn *to-charset
  "Returns the given Charset or the default Charset if the given Charset is null.

  charset - A charset or null. - `java.nio.charset.Charset`

  returns: the given Charset or the default Charset if the given Charset is null - `java.nio.charset.Charset`"
  (^java.nio.charset.Charset [^java.nio.charset.Charset charset]
    (Charsets/toCharset charset)))

