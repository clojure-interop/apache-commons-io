(ns org.apache.commons.io.IOCase
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io IOCase]))

(def SENSITIVE
  "Enum Constant.

  The constant for case sensitive regardless of operating system.

  type: org.apache.commons.io.IOCase"
  IOCase/SENSITIVE)

(def INSENSITIVE
  "Enum Constant.

  The constant for case insensitive regardless of operating system.

  type: org.apache.commons.io.IOCase"
  IOCase/INSENSITIVE)

(def SYSTEM
  "Enum Constant.

  The constant for case sensitivity determined by the current operating system.
   Windows is case-insensitive when comparing filenames, Unix is case-sensitive.

   Note: This only caters for Windows and Unix. Other operating
   systems (e.g. OSX and OpenVMS) are treated as case sensitive if they use the
   Unix file separator and case-insensitive if they use the Windows file separator
   (see File.separatorChar).

   If you serialize this constant on Windows, and deserialize on Unix, or vice
   versa, then the value of the case-sensitivity flag will change.

  type: org.apache.commons.io.IOCase"
  IOCase/SYSTEM)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (IOCase c : IOCase.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.apache.commons.io.IOCase[]`"
  ([]
    (IOCase/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.apache.commons.io.IOCase`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.apache.commons.io.IOCase [^java.lang.String name]
    (IOCase/valueOf name)))

(defn *for-name
  "Factory method to create an IOCase from a name.

  name - the name to find - `java.lang.String`

  returns: the IOCase object - `org.apache.commons.io.IOCase`

  throws: java.lang.IllegalArgumentException - if the name is invalid"
  (^org.apache.commons.io.IOCase [^java.lang.String name]
    (IOCase/forName name)))

(defn check-starts-with
  "Checks if one string starts with another using the case-sensitivity rule.

   This method mimics String.startsWith(String) but takes case-sensitivity
   into account.

  str - the string to check, not null - `java.lang.String`
  start - the start to compare against, not null - `java.lang.String`

  returns: true if equal using the case rules - `boolean`

  throws: java.lang.NullPointerException - if either string is null"
  (^Boolean [^IOCase this ^java.lang.String str ^java.lang.String start]
    (-> this (.checkStartsWith str start))))

(defn check-equals
  "Compares two strings using the case-sensitivity rule.

   This method mimics String.equals(java.lang.Object) but takes case-sensitivity
   into account.

  str-1 - the first string to compare, not null - `java.lang.String`
  str-2 - the second string to compare, not null - `java.lang.String`

  returns: true if equal using the case rules - `boolean`

  throws: java.lang.NullPointerException - if either string is null"
  (^Boolean [^IOCase this ^java.lang.String str-1 ^java.lang.String str-2]
    (-> this (.checkEquals str-1 str-2))))

(defn to-string
  "Gets a string describing the sensitivity.

  returns: a string describing the sensitivity - `java.lang.String`"
  (^java.lang.String [^IOCase this]
    (-> this (.toString))))

(defn check-region-matches
  "Checks if one string contains another at a specific index using the case-sensitivity rule.

   This method mimics parts of String.regionMatches(boolean, int, String, int, int)
   but takes case-sensitivity into account.

  str - the string to check, not null - `java.lang.String`
  str-start-index - the index to start at in str - `int`
  search - the start to search for, not null - `java.lang.String`

  returns: true if equal using the case rules - `boolean`

  throws: java.lang.NullPointerException - if either string is null"
  (^Boolean [^IOCase this ^java.lang.String str ^Integer str-start-index ^java.lang.String search]
    (-> this (.checkRegionMatches str str-start-index search))))

(defn get-name
  "Gets the name of the constant.

  returns: the name of the constant - `java.lang.String`"
  (^java.lang.String [^IOCase this]
    (-> this (.getName))))

(defn check-ends-with
  "Checks if one string ends with another using the case-sensitivity rule.

   This method mimics String.endsWith(java.lang.String) but takes case-sensitivity
   into account.

  str - the string to check, not null - `java.lang.String`
  end - the end to compare against, not null - `java.lang.String`

  returns: true if equal using the case rules - `boolean`

  throws: java.lang.NullPointerException - if either string is null"
  (^Boolean [^IOCase this ^java.lang.String str ^java.lang.String end]
    (-> this (.checkEndsWith str end))))

(defn check-compare-to
  "Compares two strings using the case-sensitivity rule.

   This method mimics String.compareTo(java.lang.String) but takes case-sensitivity
   into account.

  str-1 - the first string to compare, not null - `java.lang.String`
  str-2 - the second string to compare, not null - `java.lang.String`

  returns: true if equal using the case rules - `int`

  throws: java.lang.NullPointerException - if either string is null"
  (^Integer [^IOCase this ^java.lang.String str-1 ^java.lang.String str-2]
    (-> this (.checkCompareTo str-1 str-2))))

(defn check-index-of
  "Checks if one string contains another starting at a specific index using the
   case-sensitivity rule.

   This method mimics parts of String.indexOf(String, int)
   but takes case-sensitivity into account.

  str - the string to check, not null - `java.lang.String`
  str-start-index - the index to start at in str - `int`
  search - the start to search for, not null - `java.lang.String`

  returns: the first index of the search String,
    -1 if no match or null string input - `int`

  throws: java.lang.NullPointerException - if either string is null"
  (^Integer [^IOCase this ^java.lang.String str ^Integer str-start-index ^java.lang.String search]
    (-> this (.checkIndexOf str str-start-index search))))

(defn case-sensitive?
  "Does the object represent case sensitive comparison.

  returns: true if case sensitive - `boolean`"
  (^Boolean [^IOCase this]
    (-> this (.isCaseSensitive))))

