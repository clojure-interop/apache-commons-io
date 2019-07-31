(ns org.apache.commons.io.filefilter.OrFileFilter
  "A FileFilter providing conditional OR logic across a list of
  file filters. This filter returns true if any filters in the
  list return true. Otherwise, it returns false.
  Checking of the file filter list stops when the first filter returns
  true."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.filefilter OrFileFilter]))

(defn ->or-file-filter
  "Constructor.

  Constructs a new file filter that ORs the result of two other filters.

  filter-1 - the first filter, must not be null - `org.apache.commons.io.filefilter.IOFileFilter`
  filter-2 - the second filter, must not be null - `org.apache.commons.io.filefilter.IOFileFilter`

  throws: java.lang.IllegalArgumentException - if either filter is null"
  (^OrFileFilter [^org.apache.commons.io.filefilter.IOFileFilter filter-1 ^org.apache.commons.io.filefilter.IOFileFilter filter-2]
    (new OrFileFilter filter-1 filter-2))
  (^OrFileFilter [^java.util.List file-filters]
    (new OrFileFilter file-filters))
  (^OrFileFilter []
    (new OrFileFilter )))

(defn add-file-filter
  "Adds the specified file filter to the list of file filters at the end of
   the list.

  io-file-filter - the filter to be added - `org.apache.commons.io.filefilter.IOFileFilter`"
  ([^OrFileFilter this ^org.apache.commons.io.filefilter.IOFileFilter io-file-filter]
    (-> this (.addFileFilter io-file-filter))))

(defn get-file-filters
  "Returns this conditional file filter's list of file filters.

  returns: the file filter list - `java.util.List<org.apache.commons.io.filefilter.IOFileFilter>`"
  (^java.util.List [^OrFileFilter this]
    (-> this (.getFileFilters))))

(defn remove-file-filter
  "Removes the specified file filter.

  io-file-filter - filter to be removed - `org.apache.commons.io.filefilter.IOFileFilter`

  returns: true if the filter was found in the list,
   false otherwise - `boolean`"
  (^Boolean [^OrFileFilter this ^org.apache.commons.io.filefilter.IOFileFilter io-file-filter]
    (-> this (.removeFileFilter io-file-filter))))

(defn set-file-filters
  "Sets the list of file filters, replacing any previously configured
   file filters on this filter.

  file-filters - the list of filters - `java.util.List`"
  ([^OrFileFilter this ^java.util.List file-filters]
    (-> this (.setFileFilters file-filters))))

(defn accept
  "Checks to see if the File should be accepted by this filter.

  file - the directory File to check - `java.io.File`
  name - the filename within the directory to check - `java.lang.String`

  returns: true if this file matches the test - `boolean`"
  (^Boolean [^OrFileFilter this ^java.io.File file ^java.lang.String name]
    (-> this (.accept file name)))
  (^Boolean [^OrFileFilter this ^java.io.File file]
    (-> this (.accept file))))

(defn to-string
  "Provide a String representation of this file filter.

  returns: a String representation - `java.lang.String`"
  (^java.lang.String [^OrFileFilter this]
    (-> this (.toString))))

