(ns org.apache.commons.io.comparator.core
  (:refer-clojure :only [require comment defn ->])
  (:import ))

(require '[org.apache.commons.io.comparator.CompositeFileComparator])
(require '[org.apache.commons.io.comparator.DefaultFileComparator])
(require '[org.apache.commons.io.comparator.DirectoryFileComparator])
(require '[org.apache.commons.io.comparator.ExtensionFileComparator])
(require '[org.apache.commons.io.comparator.LastModifiedFileComparator])
(require '[org.apache.commons.io.comparator.NameFileComparator])
(require '[org.apache.commons.io.comparator.PathFileComparator])
(require '[org.apache.commons.io.comparator.SizeFileComparator])
