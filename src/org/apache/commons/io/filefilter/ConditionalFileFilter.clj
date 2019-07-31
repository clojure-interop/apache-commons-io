(ns org.apache.commons.io.filefilter.ConditionalFileFilter
  "Defines operations for conditional file filters."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.filefilter ConditionalFileFilter]))

(defn add-file-filter
  "Adds the specified file filter to the list of file filters at the end of
   the list.

  io-file-filter - the filter to be added - `org.apache.commons.io.filefilter.IOFileFilter`"
  ([^ConditionalFileFilter this ^org.apache.commons.io.filefilter.IOFileFilter io-file-filter]
    (-> this (.addFileFilter io-file-filter))))

(defn get-file-filters
  "Returns this conditional file filter's list of file filters.

  returns: the file filter list - `java.util.List<org.apache.commons.io.filefilter.IOFileFilter>`"
  (^java.util.List [^ConditionalFileFilter this]
    (-> this (.getFileFilters))))

(defn remove-file-filter
  "Removes the specified file filter.

  io-file-filter - filter to be removed - `org.apache.commons.io.filefilter.IOFileFilter`

  returns: true if the filter was found in the list,
   false otherwise - `boolean`"
  (^Boolean [^ConditionalFileFilter this ^org.apache.commons.io.filefilter.IOFileFilter io-file-filter]
    (-> this (.removeFileFilter io-file-filter))))

(defn set-file-filters
  "Sets the list of file filters, replacing any previously configured
   file filters on this filter.

  file-filters - the list of filters - `java.util.List`"
  ([^ConditionalFileFilter this ^java.util.List file-filters]
    (-> this (.setFileFilters file-filters))))

