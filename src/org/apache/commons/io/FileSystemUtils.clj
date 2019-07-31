(ns org.apache.commons.io.FileSystemUtils
  "Deprecated.
 As of 2.6 deprecated without replacement. Use equivalent
   methods in FileStore instead, e.g.
   Files.getFileStore(Paths.get(\"/home\")).getUsableSpace()
   or iterate over FileSystems.getDefault().getFileStores()"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io FileSystemUtils]))

(defn ->file-system-utils
  "Constructor.

  Deprecated."
  (^FileSystemUtils []
    (new FileSystemUtils )))

(defn *free-space
  "Deprecated. Use freeSpaceKb(String)
    Deprecated from 1.3, may be removed in 2.0

  path - the path to get free space for, not null, not empty on Unix - `java.lang.String`

  returns: the amount of free drive space on the drive or volume - `long`

  throws: java.lang.IllegalArgumentException - if the path is invalid"
  (^Long [^java.lang.String path]
    (FileSystemUtils/freeSpace path)))

(defn *free-space-kb
  "Deprecated. As of 2.6 deprecated without replacement. Please use FileStore.getUsableSpace().

  path - the path to get free space for, not null, not empty on Unix - `java.lang.String`
  timeout - The timeout amount in milliseconds or no timeout if the value is zero or less - `long`

  returns: the amount of free drive space on the drive or volume in kilobytes - `long`

  throws: java.lang.IllegalArgumentException - if the path is invalid"
  (^Long [^java.lang.String path ^Long timeout]
    (FileSystemUtils/freeSpaceKb path timeout))
  (^Long [^java.lang.String path]
    (FileSystemUtils/freeSpaceKb path))
  (^Long []
    (FileSystemUtils/freeSpaceKb )))

