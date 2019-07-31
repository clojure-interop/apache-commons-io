(ns org.apache.commons.io.filefilter.FileFilterUtils
  "Useful utilities for working with file filters. It provides access to all
  file filter implementations in this package so you don't have to import
  every class you use."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.filefilter FileFilterUtils]))

(defn ->file-filter-utils
  "Constructor.

  FileFilterUtils is not normally instantiated."
  (^FileFilterUtils []
    (new FileFilterUtils )))

(defn *magic-number-file-filter
  "Returns a filter that accepts files that contains the provided magic
   number at a specified offset within the file.

  magic-number - the magic number (byte sequence) to match at the provided offset in each file. - `java.lang.String`
  offset - the offset within the files to look for the magic number. - `long`

  returns: an IOFileFilter that accepts files containing the magic number
           at the specified offset. - `org.apache.commons.io.filefilter.IOFileFilter`

  throws: java.lang.IllegalArgumentException - if magicNumber is null or the empty String, or if offset is a negative number."
  (^org.apache.commons.io.filefilter.IOFileFilter [^java.lang.String magic-number ^Long offset]
    (FileFilterUtils/magicNumberFileFilter magic-number offset))
  (^org.apache.commons.io.filefilter.IOFileFilter [^java.lang.String magic-number]
    (FileFilterUtils/magicNumberFileFilter magic-number)))

(defn *name-file-filter
  "Returns a filter that returns true if the filename matches the specified text.

  name - the filename - `java.lang.String`
  case-sensitivity - how to handle case sensitivity, null means case-sensitive - `org.apache.commons.io.IOCase`

  returns: a name checking filter - `org.apache.commons.io.filefilter.IOFileFilter`"
  (^org.apache.commons.io.filefilter.IOFileFilter [^java.lang.String name ^org.apache.commons.io.IOCase case-sensitivity]
    (FileFilterUtils/nameFileFilter name case-sensitivity))
  (^org.apache.commons.io.filefilter.IOFileFilter [^java.lang.String name]
    (FileFilterUtils/nameFileFilter name)))

(defn *directory-file-filter
  "Returns a filter that checks if the file is a directory.

  returns: file filter that accepts only directories and not files - `org.apache.commons.io.filefilter.IOFileFilter`"
  (^org.apache.commons.io.filefilter.IOFileFilter []
    (FileFilterUtils/directoryFileFilter )))

(defn *as-file-filter
  "Returns an IOFileFilter that wraps the
   FileFilter instance.

  filter - the filter to be wrapped - `java.io.FileFilter`

  returns: a new filter that implements IOFileFilter - `org.apache.commons.io.filefilter.IOFileFilter`"
  (^org.apache.commons.io.filefilter.IOFileFilter [^java.io.FileFilter filter]
    (FileFilterUtils/asFileFilter filter)))

(defn *age-file-filter
  "Returns a filter that filters files based on a cutoff time.

  cutoff - the time threshold - `long`
  accept-older - if true, older files get accepted, if false, newer - `boolean`

  returns: an appropriately configured age file filter - `org.apache.commons.io.filefilter.IOFileFilter`"
  (^org.apache.commons.io.filefilter.IOFileFilter [^Long cutoff ^Boolean accept-older]
    (FileFilterUtils/ageFileFilter cutoff accept-older))
  (^org.apache.commons.io.filefilter.IOFileFilter [^Long cutoff]
    (FileFilterUtils/ageFileFilter cutoff)))

(defn *make-svn-aware
  "Decorates a filter to make it ignore SVN directories.
   Passing in null will return a filter that accepts everything
   except SVN directories.

  filter - the filter to decorate, null means an unrestricted filter - `org.apache.commons.io.filefilter.IOFileFilter`

  returns: the decorated filter, never null - `org.apache.commons.io.filefilter.IOFileFilter`"
  (^org.apache.commons.io.filefilter.IOFileFilter [^org.apache.commons.io.filefilter.IOFileFilter filter]
    (FileFilterUtils/makeSVNAware filter)))

(defn *filter-set
  "Applies an IOFileFilter to the provided File
   objects. The resulting set is a subset of the original file list that
   matches the provided filter.



   The Set returned by this method is not guaranteed to be thread safe.




   Set<File> allFiles = ...
   Set<File> javaFiles = FileFilterUtils.filterSet(allFiles,
       FileFilterUtils.suffixFileFilter(\".java\"));

  filter - the filter to apply to the set of files. - `org.apache.commons.io.filefilter.IOFileFilter`
  files - the collection of files to apply the filter to. - `java.io.File`

  returns: a subset of files that is accepted by the
           file filter. - `java.util.Set<java.io.File>`

  throws: java.lang.IllegalArgumentException - if the filter is null or files contains a null value."
  (^java.util.Set [^org.apache.commons.io.filefilter.IOFileFilter filter ^java.io.File files]
    (FileFilterUtils/filterSet filter files)))

(defn *size-file-filter
  "Returns a filter that filters based on file size.

  threshold - the file size threshold - `long`
  accept-larger - if true, larger files get accepted, if false, smaller - `boolean`

  returns: an appropriately configured SizeFileFilter - `org.apache.commons.io.filefilter.IOFileFilter`"
  (^org.apache.commons.io.filefilter.IOFileFilter [^Long threshold ^Boolean accept-larger]
    (FileFilterUtils/sizeFileFilter threshold accept-larger))
  (^org.apache.commons.io.filefilter.IOFileFilter [^Long threshold]
    (FileFilterUtils/sizeFileFilter threshold)))

(defn *prefix-file-filter
  "Returns a filter that returns true if the filename starts with the specified text.

  prefix - the filename prefix - `java.lang.String`
  case-sensitivity - how to handle case sensitivity, null means case-sensitive - `org.apache.commons.io.IOCase`

  returns: a prefix checking filter - `org.apache.commons.io.filefilter.IOFileFilter`"
  (^org.apache.commons.io.filefilter.IOFileFilter [^java.lang.String prefix ^org.apache.commons.io.IOCase case-sensitivity]
    (FileFilterUtils/prefixFileFilter prefix case-sensitivity))
  (^org.apache.commons.io.filefilter.IOFileFilter [^java.lang.String prefix]
    (FileFilterUtils/prefixFileFilter prefix)))

(defn *true-file-filter
  "Returns a filter that always returns true.

  returns: a true filter - `org.apache.commons.io.filefilter.IOFileFilter`"
  (^org.apache.commons.io.filefilter.IOFileFilter []
    (FileFilterUtils/trueFileFilter )))

(defn *to-list
  "Create a List of file filters.

  filters - The file filters - `org.apache.commons.io.filefilter.IOFileFilter`

  returns: The list of file filters - `java.util.List<org.apache.commons.io.filefilter.IOFileFilter>`

  throws: java.lang.IllegalArgumentException - if the filters are null or contain a null value."
  (^java.util.List [^org.apache.commons.io.filefilter.IOFileFilter filters]
    (FileFilterUtils/toList filters)))

(defn *or-file-filter
  "Deprecated. use or(IOFileFilter...)

  filter-1 - the first filter - `org.apache.commons.io.filefilter.IOFileFilter`
  filter-2 - the second filter - `org.apache.commons.io.filefilter.IOFileFilter`

  returns: a filter that ORs the two specified filters - `org.apache.commons.io.filefilter.IOFileFilter`"
  (^org.apache.commons.io.filefilter.IOFileFilter [^org.apache.commons.io.filefilter.IOFileFilter filter-1 ^org.apache.commons.io.filefilter.IOFileFilter filter-2]
    (FileFilterUtils/orFileFilter filter-1 filter-2)))

(defn *or
  "Returns a filter that ORs the specified filters.

  filters - the IOFileFilters that will be ORed together. - `org.apache.commons.io.filefilter.IOFileFilter`

  returns: a filter that ORs the specified filters - `org.apache.commons.io.filefilter.IOFileFilter`

  throws: java.lang.IllegalArgumentException - if the filters are null or contain a null value."
  (^org.apache.commons.io.filefilter.IOFileFilter [^org.apache.commons.io.filefilter.IOFileFilter filters]
    (FileFilterUtils/or filters)))

(defn *size-range-file-filter
  "Returns a filter that accepts files whose size is >= minimum size
   and <= maximum size.

  min-size-inclusive - the minimum file size (inclusive) - `long`
  max-size-inclusive - the maximum file size (inclusive) - `long`

  returns: an appropriately configured IOFileFilter - `org.apache.commons.io.filefilter.IOFileFilter`"
  (^org.apache.commons.io.filefilter.IOFileFilter [^Long min-size-inclusive ^Long max-size-inclusive]
    (FileFilterUtils/sizeRangeFileFilter min-size-inclusive max-size-inclusive)))

(defn *suffix-file-filter
  "Returns a filter that returns true if the filename ends with the specified text.

  suffix - the filename suffix - `java.lang.String`
  case-sensitivity - how to handle case sensitivity, null means case-sensitive - `org.apache.commons.io.IOCase`

  returns: a suffix checking filter - `org.apache.commons.io.filefilter.IOFileFilter`"
  (^org.apache.commons.io.filefilter.IOFileFilter [^java.lang.String suffix ^org.apache.commons.io.IOCase case-sensitivity]
    (FileFilterUtils/suffixFileFilter suffix case-sensitivity))
  (^org.apache.commons.io.filefilter.IOFileFilter [^java.lang.String suffix]
    (FileFilterUtils/suffixFileFilter suffix)))

(defn *filter
  "Applies an IOFileFilter to the provided File
   objects. The resulting array is a subset of the original file list that
   matches the provided filter.



   The Set returned by this method is not guaranteed to be thread safe.




   Set<File> allFiles = ...
   Set<File> javaFiles = FileFilterUtils.filterSet(allFiles,
       FileFilterUtils.suffixFileFilter(\".java\"));

  filter - the filter to apply to the set of files. - `org.apache.commons.io.filefilter.IOFileFilter`
  files - the array of files to apply the filter to. - `java.io.File`

  returns: a subset of files that is accepted by the
           file filter. - `java.io.File[]`

  throws: java.lang.IllegalArgumentException - if the filter is null or files contains a null value."
  ([^org.apache.commons.io.filefilter.IOFileFilter filter ^java.io.File files]
    (FileFilterUtils/filter filter files)))

(defn *make-directory-only
  "Decorates a filter so that it only applies to directories and not to files.

  filter - the filter to decorate, null means an unrestricted filter - `org.apache.commons.io.filefilter.IOFileFilter`

  returns: the decorated filter, never null - `org.apache.commons.io.filefilter.IOFileFilter`"
  (^org.apache.commons.io.filefilter.IOFileFilter [^org.apache.commons.io.filefilter.IOFileFilter filter]
    (FileFilterUtils/makeDirectoryOnly filter)))

(defn *make-cvs-aware
  "Decorates a filter to make it ignore CVS directories.
   Passing in null will return a filter that accepts everything
   except CVS directories.

  filter - the filter to decorate, null means an unrestricted filter - `org.apache.commons.io.filefilter.IOFileFilter`

  returns: the decorated filter, never null - `org.apache.commons.io.filefilter.IOFileFilter`"
  (^org.apache.commons.io.filefilter.IOFileFilter [^org.apache.commons.io.filefilter.IOFileFilter filter]
    (FileFilterUtils/makeCVSAware filter)))

(defn *and
  "Returns a filter that ANDs the specified filters.

  filters - the IOFileFilters that will be ANDed together. - `org.apache.commons.io.filefilter.IOFileFilter`

  returns: a filter that ANDs the specified filters - `org.apache.commons.io.filefilter.IOFileFilter`

  throws: java.lang.IllegalArgumentException - if the filters are null or contain a null value."
  (^org.apache.commons.io.filefilter.IOFileFilter [^org.apache.commons.io.filefilter.IOFileFilter filters]
    (FileFilterUtils/and filters)))

(defn *filter-list
  "Applies an IOFileFilter to the provided File
   objects. The resulting list is a subset of the original files that
   matches the provided filter.



   The List returned by this method is not guaranteed to be thread safe.




   List<File> filesAndDirectories = ...
   List<File> directories = FileFilterUtils.filterList(filesAndDirectories,
       FileFilterUtils.directoryFileFilter());

  filter - the filter to apply to each files in the list. - `org.apache.commons.io.filefilter.IOFileFilter`
  files - the collection of files to apply the filter to. - `java.lang.Iterable`

  returns: a subset of files that is accepted by the
           file filter. - `java.util.List<java.io.File>`

  throws: java.lang.IllegalArgumentException - if the filter is null or files contains a null value."
  (^java.util.List [^org.apache.commons.io.filefilter.IOFileFilter filter ^java.lang.Iterable files]
    (FileFilterUtils/filterList filter files)))

(defn *false-file-filter
  "Returns a filter that always returns false.

  returns: a false filter - `org.apache.commons.io.filefilter.IOFileFilter`"
  (^org.apache.commons.io.filefilter.IOFileFilter []
    (FileFilterUtils/falseFileFilter )))

(defn *file-file-filter
  "Returns a filter that checks if the file is a file (and not a directory).

  returns: file filter that accepts only files and not directories - `org.apache.commons.io.filefilter.IOFileFilter`"
  (^org.apache.commons.io.filefilter.IOFileFilter []
    (FileFilterUtils/fileFileFilter )))

(defn *and-file-filter
  "Deprecated. use and(IOFileFilter...)

  filter-1 - the first filter - `org.apache.commons.io.filefilter.IOFileFilter`
  filter-2 - the second filter - `org.apache.commons.io.filefilter.IOFileFilter`

  returns: a filter that ANDs the two specified filters - `org.apache.commons.io.filefilter.IOFileFilter`"
  (^org.apache.commons.io.filefilter.IOFileFilter [^org.apache.commons.io.filefilter.IOFileFilter filter-1 ^org.apache.commons.io.filefilter.IOFileFilter filter-2]
    (FileFilterUtils/andFileFilter filter-1 filter-2)))

(defn *make-file-only
  "Decorates a filter so that it only applies to files and not to directories.

  filter - the filter to decorate, null means an unrestricted filter - `org.apache.commons.io.filefilter.IOFileFilter`

  returns: the decorated filter, never null - `org.apache.commons.io.filefilter.IOFileFilter`"
  (^org.apache.commons.io.filefilter.IOFileFilter [^org.apache.commons.io.filefilter.IOFileFilter filter]
    (FileFilterUtils/makeFileOnly filter)))

(defn *not-file-filter
  "Returns a filter that NOTs the specified filter.

  filter - the filter to invert - `org.apache.commons.io.filefilter.IOFileFilter`

  returns: a filter that NOTs the specified filter - `org.apache.commons.io.filefilter.IOFileFilter`"
  (^org.apache.commons.io.filefilter.IOFileFilter [^org.apache.commons.io.filefilter.IOFileFilter filter]
    (FileFilterUtils/notFileFilter filter)))

