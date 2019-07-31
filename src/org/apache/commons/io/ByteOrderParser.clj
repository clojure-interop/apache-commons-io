(ns org.apache.commons.io.ByteOrderParser
  "Converts Strings to ByteOrder instances."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io ByteOrderParser]))

(defn *parse-byte-order
  "Parses the String argument as a ByteOrder.

   Returns ByteOrder.LITTLE_ENDIAN if the given value is \"LITTLE_ENDIAN\".


   Returns ByteOrder.BIG_ENDIAN if the given value is \"BIG_ENDIAN\".

   Examples:

   ByteOrderParser.parseByteOrder(\"LITTLE_ENDIAN\") returns ByteOrder.LITTLE_ENDIAN
   ByteOrderParser.parseByteOrder(\"BIG_ENDIAN\") returns ByteOrder.BIG_ENDIAN

  value - the String containing the ByteOrder representation to be parsed - `java.lang.String`

  returns: the ByteOrder represented by the string argument - `java.nio.ByteOrder`

  throws: java.lang.IllegalArgumentException - if the String containing the ByteOrder representation to be parsed is unknown."
  (^java.nio.ByteOrder [^java.lang.String value]
    (ByteOrderParser/parseByteOrder value)))

