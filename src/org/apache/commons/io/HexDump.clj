(ns org.apache.commons.io.HexDump
  "Dumps data in hexadecimal format.

  Provides a single function to take an array of bytes and display it
  in hexadecimal form.

  Origin of code: POI."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io HexDump]))

(defn ->hex-dump
  "Constructor.

  Instances should NOT be constructed in standard programming."
  (^HexDump []
    (new HexDump )))

(def *-eol
  "Static Constant.

  The line-separator (initializes to \"line.separator\" system property.

  type: java.lang.String"
  HexDump/EOL)

(defn *dump
  "Dump an array of bytes to an OutputStream. The output is formatted
   for human inspection, with a hexadecimal offset followed by the
   hexadecimal values of the next 16 bytes of data and the printable ASCII
   characters (if any) that those bytes represent printed per each line
   of output.

   The offset argument specifies the start offset of the data array
   within a larger entity like a file or an incoming stream. For example,
   if the data array contains the third kibibyte of a file, then the
   offset argument should be set to 2048. The offset value printed
   at the beginning of each line indicates where in that larger entity
   the first byte on that line is located.

   All bytes between the given index (inclusive) and the end of the
   data array are dumped.

  data - the byte array to be dumped - `byte[]`
  offset - offset of the byte array within a larger entity - `long`
  stream - the OutputStream to which the data is to be written - `java.io.OutputStream`
  index - initial index into the byte array - `int`

  throws: java.io.IOException - is thrown if anything goes wrong writing the data to stream"
  ([data ^Long offset ^java.io.OutputStream stream ^Integer index]
    (HexDump/dump data offset stream index)))

