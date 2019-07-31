(ns org.apache.commons.io.EndianUtils
  "Utility code for dealing with different endian systems.

  Different computer architectures adopt different conventions for
  byte ordering. In so-called \"Little Endian\" architectures (eg Intel),
  the low-order byte is stored in memory at the lowest address, and
  subsequent bytes at higher addresses. For \"Big Endian\" architectures
  (eg Motorola), the situation is reversed.
  This class helps you solve this incompatibility.

  Origin of code: Excalibur"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io EndianUtils]))

(defn ->endian-utils
  "Constructor.

  Instances should NOT be constructed in standard programming."
  (^EndianUtils []
    (new EndianUtils )))

(defn *write-swapped-float
  "Writes a \"float\" value to a byte array at a given offset. The value is
   converted to the opposed endian system while writing.

  data - target byte array - `byte[]`
  offset - starting offset in the byte array - `int`
  value - value to write - `float`"
  ([data ^Integer offset ^Float value]
    (EndianUtils/writeSwappedFloat data offset value))
  ([^java.io.OutputStream output ^Float value]
    (EndianUtils/writeSwappedFloat output value)))

(defn *swap-long
  "Converts a \"long\" value between endian systems.

  value - value to convert - `long`

  returns: the converted value - `long`"
  (^Long [^Long value]
    (EndianUtils/swapLong value)))

(defn *write-swapped-long
  "Writes a \"long\" value to a byte array at a given offset. The value is
   converted to the opposed endian system while writing.

  data - target byte array - `byte[]`
  offset - starting offset in the byte array - `int`
  value - value to write - `long`"
  ([data ^Integer offset ^Long value]
    (EndianUtils/writeSwappedLong data offset value))
  ([^java.io.OutputStream output ^Long value]
    (EndianUtils/writeSwappedLong output value)))

(defn *swap-integer
  "Converts a \"int\" value between endian systems.

  value - value to convert - `int`

  returns: the converted value - `int`"
  (^Integer [^Integer value]
    (EndianUtils/swapInteger value)))

(defn *read-swapped-long
  "Reads a \"long\" value from a byte array at a given offset. The value is
   converted to the opposed endian system while reading.

  data - source byte array - `byte[]`
  offset - starting offset in the byte array - `int`

  returns: the value read - `long`"
  (^Long [data ^Integer offset]
    (EndianUtils/readSwappedLong data offset))
  (^Long [^java.io.InputStream input]
    (EndianUtils/readSwappedLong input)))

(defn *read-swapped-unsigned-short
  "Reads an unsigned short (16-bit) value from a byte array at a given
   offset. The value is converted to the opposed endian system while
   reading.

  data - source byte array - `byte[]`
  offset - starting offset in the byte array - `int`

  returns: the value read - `int`"
  (^Integer [data ^Integer offset]
    (EndianUtils/readSwappedUnsignedShort data offset))
  (^Integer [^java.io.InputStream input]
    (EndianUtils/readSwappedUnsignedShort input)))

(defn *read-swapped-integer
  "Reads a \"int\" value from a byte array at a given offset. The value is
   converted to the opposed endian system while reading.

  data - source byte array - `byte[]`
  offset - starting offset in the byte array - `int`

  returns: the value read - `int`"
  (^Integer [data ^Integer offset]
    (EndianUtils/readSwappedInteger data offset))
  (^Integer [^java.io.InputStream input]
    (EndianUtils/readSwappedInteger input)))

(defn *write-swapped-double
  "Writes a \"double\" value to a byte array at a given offset. The value is
   converted to the opposed endian system while writing.

  data - target byte array - `byte[]`
  offset - starting offset in the byte array - `int`
  value - value to write - `double`"
  ([data ^Integer offset ^Double value]
    (EndianUtils/writeSwappedDouble data offset value))
  ([^java.io.OutputStream output ^Double value]
    (EndianUtils/writeSwappedDouble output value)))

(defn *read-swapped-float
  "Reads a \"float\" value from a byte array at a given offset. The value is
   converted to the opposed endian system while reading.

  data - source byte array - `byte[]`
  offset - starting offset in the byte array - `int`

  returns: the value read - `float`"
  (^Float [data ^Integer offset]
    (EndianUtils/readSwappedFloat data offset))
  (^Float [^java.io.InputStream input]
    (EndianUtils/readSwappedFloat input)))

(defn *swap-short
  "Converts a \"short\" value between endian systems.

  value - value to convert - `short`

  returns: the converted value - `short`"
  (^Short [^Short value]
    (EndianUtils/swapShort value)))

(defn *read-swapped-double
  "Reads a \"double\" value from a byte array at a given offset. The value is
   converted to the opposed endian system while reading.

  data - source byte array - `byte[]`
  offset - starting offset in the byte array - `int`

  returns: the value read - `double`"
  (^Double [data ^Integer offset]
    (EndianUtils/readSwappedDouble data offset))
  (^Double [^java.io.InputStream input]
    (EndianUtils/readSwappedDouble input)))

(defn *read-swapped-unsigned-integer
  "Reads an unsigned integer (32-bit) value from a byte array at a given
   offset. The value is converted to the opposed endian system while
   reading.

  data - source byte array - `byte[]`
  offset - starting offset in the byte array - `int`

  returns: the value read - `long`"
  (^Long [data ^Integer offset]
    (EndianUtils/readSwappedUnsignedInteger data offset))
  (^Long [^java.io.InputStream input]
    (EndianUtils/readSwappedUnsignedInteger input)))

(defn *write-swapped-integer
  "Writes a \"int\" value to a byte array at a given offset. The value is
   converted to the opposed endian system while writing.

  data - target byte array - `byte[]`
  offset - starting offset in the byte array - `int`
  value - value to write - `int`"
  ([data ^Integer offset ^Integer value]
    (EndianUtils/writeSwappedInteger data offset value))
  ([^java.io.OutputStream output ^Integer value]
    (EndianUtils/writeSwappedInteger output value)))

(defn *swap-double
  "Converts a \"double\" value between endian systems.

  value - value to convert - `double`

  returns: the converted value - `double`"
  (^Double [^Double value]
    (EndianUtils/swapDouble value)))

(defn *write-swapped-short
  "Writes a \"short\" value to a byte array at a given offset. The value is
   converted to the opposed endian system while writing.

  data - target byte array - `byte[]`
  offset - starting offset in the byte array - `int`
  value - value to write - `short`"
  ([data ^Integer offset ^Short value]
    (EndianUtils/writeSwappedShort data offset value))
  ([^java.io.OutputStream output ^Short value]
    (EndianUtils/writeSwappedShort output value)))

(defn *swap-float
  "Converts a \"float\" value between endian systems.

  value - value to convert - `float`

  returns: the converted value - `float`"
  (^Float [^Float value]
    (EndianUtils/swapFloat value)))

(defn *read-swapped-short
  "Reads a \"short\" value from a byte array at a given offset. The value is
   converted to the opposed endian system while reading.

  data - source byte array - `byte[]`
  offset - starting offset in the byte array - `int`

  returns: the value read - `short`"
  (^Short [data ^Integer offset]
    (EndianUtils/readSwappedShort data offset))
  (^Short [^java.io.InputStream input]
    (EndianUtils/readSwappedShort input)))

