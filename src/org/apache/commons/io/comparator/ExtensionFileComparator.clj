(ns org.apache.commons.io.comparator.ExtensionFileComparator
  "Compare the file name extensions for order
  (see FilenameUtils.getExtension(String)).

  This comparator can be used to sort lists or arrays of files
  by their file extension either in a case-sensitive, case-insensitive or
  system dependent case sensitive way. A number of singleton instances
  are provided for the various case sensitivity options (using IOCase)
  and the reverse of those options.

  Example of a case-sensitive file extension sort using the
  EXTENSION_COMPARATOR singleton instance:


        List<File> list = ...
        ((AbstractFileComparator) ExtensionFileComparator.EXTENSION_COMPARATOR).sort(list);

  Example of a reverse case-insensitive file extension sort using the
  EXTENSION_INSENSITIVE_REVERSE singleton instance:


        File[] array = ...
        ((AbstractFileComparator) ExtensionFileComparator.EXTENSION_INSENSITIVE_REVERSE).sort(array);"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.comparator ExtensionFileComparator]))

(defn ->extension-file-comparator
  "Constructor.

  Construct a file extension comparator instance with the specified case-sensitivity.

  case-sensitivity - how to handle case sensitivity, null means case-sensitive - `org.apache.commons.io.IOCase`"
  (^ExtensionFileComparator [^org.apache.commons.io.IOCase case-sensitivity]
    (new ExtensionFileComparator case-sensitivity))
  (^ExtensionFileComparator []
    (new ExtensionFileComparator )))

(def *-extension-comparator
  "Static Constant.

  Case-sensitive extension comparator instance (see IOCase.SENSITIVE)

  type: java.util.Comparator<java.io.File>"
  ExtensionFileComparator/EXTENSION_COMPARATOR)

(def *-extension-reverse
  "Static Constant.

  Reverse case-sensitive extension comparator instance (see IOCase.SENSITIVE)

  type: java.util.Comparator<java.io.File>"
  ExtensionFileComparator/EXTENSION_REVERSE)

(def *-extension-insensitive-comparator
  "Static Constant.

  Case-insensitive extension comparator instance (see IOCase.INSENSITIVE)

  type: java.util.Comparator<java.io.File>"
  ExtensionFileComparator/EXTENSION_INSENSITIVE_COMPARATOR)

(def *-extension-insensitive-reverse
  "Static Constant.

  Reverse case-insensitive extension comparator instance (see IOCase.INSENSITIVE)

  type: java.util.Comparator<java.io.File>"
  ExtensionFileComparator/EXTENSION_INSENSITIVE_REVERSE)

(def *-extension-system-comparator
  "Static Constant.

  System sensitive extension comparator instance (see IOCase.SYSTEM)

  type: java.util.Comparator<java.io.File>"
  ExtensionFileComparator/EXTENSION_SYSTEM_COMPARATOR)

(def *-extension-system-reverse
  "Static Constant.

  Reverse system sensitive path comparator instance (see IOCase.SYSTEM)

  type: java.util.Comparator<java.io.File>"
  ExtensionFileComparator/EXTENSION_SYSTEM_REVERSE)

(defn compare
  "Compare the extensions of two files the specified case sensitivity.

  file-1 - The first file to compare - `java.io.File`
  file-2 - The second file to compare - `java.io.File`

  returns: a negative value if the first file's extension
   is less than the second, zero if the extensions are the
   same and a positive value if the first files extension
   is greater than the second file. - `int`"
  (^Integer [^ExtensionFileComparator this ^java.io.File file-1 ^java.io.File file-2]
    (-> this (.compare file-1 file-2))))

(defn to-string
  "String representation of this file comparator.

  returns: String representation of this file comparator - `java.lang.String`"
  (^java.lang.String [^ExtensionFileComparator this]
    (-> this (.toString))))

(defn sort
  "Sort an array of files.

   This method uses Arrays.sort(Object[], Comparator)
   and returns the original array.

  files - The files to sort, may be null - `java.io.File`

  returns: The sorted array - `java.io.File[]`"
  ([^ExtensionFileComparator this ^java.io.File files]
    (-> this (.sort files))))

