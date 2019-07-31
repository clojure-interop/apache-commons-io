(ns org.apache.commons.io.FileUtils
  "General file manipulation utilities.

  Facilities are provided in the following areas:

  writing to a file
  reading from a file
  make a directory including parent directories
  copying files and directories
  deleting files and directories
  converting to and from a URL
  listing files and directories by filter and extension
  comparing file content
  file last changed date
  calculating a checksum


  Note that a specific charset should be specified whenever possible.
  Relying on the platform default means that the code is Locale-dependent.
  Only use the default if the files are known to always use the platform default.

  Origin of code: Excalibur, Alexandria, Commons-Utils"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io FileUtils]))

(defn ->file-utils
  "Constructor.

  Instances should NOT be constructed in standard programming."
  (^FileUtils []
    (new FileUtils )))

(def *-one-kb
  "Static Constant.

  The number of bytes in a kilobyte.

  type: long"
  FileUtils/ONE_KB)

(def *-one-kb-bi
  "Static Constant.

  The number of bytes in a kilobyte.

  type: java.math.BigInteger"
  FileUtils/ONE_KB_BI)

(def *-one-mb
  "Static Constant.

  The number of bytes in a megabyte.

  type: long"
  FileUtils/ONE_MB)

(def *-one-mb-bi
  "Static Constant.

  The number of bytes in a megabyte.

  type: java.math.BigInteger"
  FileUtils/ONE_MB_BI)

(def *-one-gb
  "Static Constant.

  The number of bytes in a gigabyte.

  type: long"
  FileUtils/ONE_GB)

(def *-one-gb-bi
  "Static Constant.

  The number of bytes in a gigabyte.

  type: java.math.BigInteger"
  FileUtils/ONE_GB_BI)

(def *-one-tb
  "Static Constant.

  The number of bytes in a terabyte.

  type: long"
  FileUtils/ONE_TB)

(def *-one-tb-bi
  "Static Constant.

  The number of bytes in a terabyte.

  type: java.math.BigInteger"
  FileUtils/ONE_TB_BI)

(def *-one-pb
  "Static Constant.

  The number of bytes in a petabyte.

  type: long"
  FileUtils/ONE_PB)

(def *-one-pb-bi
  "Static Constant.

  The number of bytes in a petabyte.

  type: java.math.BigInteger"
  FileUtils/ONE_PB_BI)

(def *-one-eb
  "Static Constant.

  The number of bytes in an exabyte.

  type: long"
  FileUtils/ONE_EB)

(def *-one-eb-bi
  "Static Constant.

  The number of bytes in an exabyte.

  type: java.math.BigInteger"
  FileUtils/ONE_EB_BI)

(def *-one-zb
  "Static Constant.

  The number of bytes in a zettabyte.

  type: java.math.BigInteger"
  FileUtils/ONE_ZB)

(def *-one-yb
  "Static Constant.

  The number of bytes in a yottabyte.

  type: java.math.BigInteger"
  FileUtils/ONE_YB)

(def *-empty-file-array
  "Static Constant.

  An empty array of type File.

  type: java.io.File[]"
  FileUtils/EMPTY_FILE_ARRAY)

(defn *get-temp-directory
  "Returns a File representing the system temporary directory.

  returns: the system temporary directory. - `java.io.File`"
  (^java.io.File []
    (FileUtils/getTempDirectory )))

(defn *iterate-files
  "Allows iteration over the files in given directory (and optionally
   its subdirectories).

   All files found are filtered by an IOFileFilter. This method is
   based on listFiles(File, IOFileFilter, IOFileFilter),
   which supports Iterable ('foreach' loop).

  directory - the directory to search in - `java.io.File`
  file-filter - filter to apply when finding files. - `org.apache.commons.io.filefilter.IOFileFilter`
  dir-filter - optional filter to apply when finding subdirectories. If this parameter is null, subdirectories will not be included in the search. Use TrueFileFilter.INSTANCE to match all directories. - `org.apache.commons.io.filefilter.IOFileFilter`

  returns: an iterator of java.io.File for the matching files - `java.util.Iterator<java.io.File>`"
  (^java.util.Iterator [^java.io.File directory ^org.apache.commons.io.filefilter.IOFileFilter file-filter ^org.apache.commons.io.filefilter.IOFileFilter dir-filter]
    (FileUtils/iterateFiles directory file-filter dir-filter)))

(defn *move-directory
  "Moves a directory.

   When the destination directory is on another file system, do a \"copy and delete\".

  src-dir - the directory to be moved - `java.io.File`
  dest-dir - the destination directory - `java.io.File`

  throws: java.lang.NullPointerException - if source or destination is null"
  ([^java.io.File src-dir ^java.io.File dest-dir]
    (FileUtils/moveDirectory src-dir dest-dir)))

(defn *move-file
  "Moves a file.

   When the destination file is on another file system, do a \"copy and delete\".

  src-file - the file to be moved - `java.io.File`
  dest-file - the destination file - `java.io.File`

  throws: java.lang.NullPointerException - if source or destination is null"
  ([^java.io.File src-file ^java.io.File dest-file]
    (FileUtils/moveFile src-file dest-file)))

(defn *get-user-directory
  "Returns a File representing the user's home directory.

  returns: the user's home directory. - `java.io.File`"
  (^java.io.File []
    (FileUtils/getUserDirectory )))

(defn *copy-directory-to-directory
  "Copies a directory to within another directory preserving the file dates.

   This method copies the source directory and all its contents to a
   directory of the same name in the specified destination directory.

   The destination directory is created if it does not exist.
   If the destination directory did exist, then this method merges
   the source with the destination, with the source taking precedence.

   Note: This method tries to preserve the files' last
   modified date/times using File.setLastModified(long), however
   it is not guaranteed that those operations will succeed.
   If the modification operation fails, no indication is provided.

  src-dir - an existing directory to copy, must not be null - `java.io.File`
  dest-dir - the directory to place the copy in, must not be null - `java.io.File`

  throws: java.lang.NullPointerException - if source or destination is null"
  ([^java.io.File src-dir ^java.io.File dest-dir]
    (FileUtils/copyDirectoryToDirectory src-dir dest-dir)))

(defn *to-file
  "Convert from a URL to a File.

   From version 1.1 this method will decode the URL.
   Syntax such as file:///my%20docs/file.txt will be
   correctly decoded to /my docs/file.txt. Starting with version
   1.5, this method uses UTF-8 to decode percent-encoded octets to characters.
   Additionally, malformed percent-encoded octets are handled leniently by
   passing them through literally.

  url - the file URL to convert, null returns null - `java.net.URL`

  returns: the equivalent File object, or null
   if the URL's protocol is not file - `java.io.File`"
  (^java.io.File [^java.net.URL url]
    (FileUtils/toFile url)))

(defn *delete-directory
  "Deletes a directory recursively.

  directory - directory to delete - `java.io.File`

  throws: java.io.IOException - in case deletion is unsuccessful"
  ([^java.io.File directory]
    (FileUtils/deleteDirectory directory)))

(defn *force-delete-on-exit
  "Schedules a file to be deleted when JVM exits.
   If file is directory delete it and all sub-directories.

  file - file or directory to delete, must not be null - `java.io.File`

  throws: java.lang.NullPointerException - if the file is null"
  ([^java.io.File file]
    (FileUtils/forceDeleteOnExit file)))

(defn *size-of
  "Returns the size of the specified file or directory. If the provided
   File is a regular file, then the file's length is returned.
   If the argument is a directory, then the size of the directory is
   calculated recursively. If a directory or subdirectory is security
   restricted, its size will not be included.

   Note that overflow is not detected, and the return value may be negative if
   overflow occurs. See sizeOfAsBigInteger(File) for an alternative
   method that does not overflow.

  file - the regular file or directory to return the size of (must not be null). - `java.io.File`

  returns: the length of the file, or recursive size of the directory,
   provided (in bytes). - `long`

  throws: java.lang.NullPointerException - if the file is null"
  (^Long [^java.io.File file]
    (FileUtils/sizeOf file)))

(defn *write-byte-array-to-file
  "Writes len bytes from the specified byte array starting
   at offset off to a file, creating the file if it does
   not exist.

  file - the file to write to - `java.io.File`
  data - the content to write to the file - `byte[]`
  off - the start offset in the data - `int`
  len - the number of bytes to write - `int`
  append - if true, then bytes will be added to the end of the file rather than overwriting - `boolean`

  throws: java.io.IOException - in case of an I/O error"
  ([^java.io.File file data ^Integer off ^Integer len ^Boolean append]
    (FileUtils/writeByteArrayToFile file data off len append))
  ([^java.io.File file data ^Integer off ^Integer len]
    (FileUtils/writeByteArrayToFile file data off len))
  ([^java.io.File file data ^Boolean append]
    (FileUtils/writeByteArrayToFile file data append))
  ([^java.io.File file data]
    (FileUtils/writeByteArrayToFile file data)))

(defn *to-ur-ls
  "Converts each of an array of File to a URL.

   Returns an array of the same size as the input.

  files - the files to convert, must not be null - `java.io.File[]`

  returns: an array of URLs matching the input - `java.net.URL[]`

  throws: java.io.IOException - if a file cannot be converted"
  ([files]
    (FileUtils/toURLs files)))

(defn *copy-directory
  "Copies a filtered directory to a new location.

   This method copies the contents of the specified source directory
   to within the specified destination directory.

   The destination directory is created if it does not exist.
   If the destination directory did exist, then this method merges
   the source with the destination, with the source taking precedence.

   Note: Setting preserveFileDate to
   true tries to preserve the files' last modified
   date/times using File.setLastModified(long), however it is
   not guaranteed that those operations will succeed.
   If the modification operation fails, no indication is provided.

   Example: Copy directories only


    // only copy the directory structure
    FileUtils.copyDirectory(srcDir, destDir, DirectoryFileFilter.DIRECTORY, false);

   Example: Copy directories and txt files


    // Create a filter for \".txt\" files
    IOFileFilter txtSuffixFilter = FileFilterUtils.suffixFileFilter(\".txt\");
    IOFileFilter txtFiles = FileFilterUtils.andFileFilter(FileFileFilter.FILE, txtSuffixFilter);

    // Create a filter for either directories or \".txt\" files
    FileFilter filter = FileFilterUtils.orFileFilter(DirectoryFileFilter.DIRECTORY, txtFiles);

    // Copy using the filter
    FileUtils.copyDirectory(srcDir, destDir, filter, false);

  src-dir - an existing directory to copy, must not be null - `java.io.File`
  dest-dir - the new directory, must not be null - `java.io.File`
  filter - the filter to apply, null means copy all directories and files - `java.io.FileFilter`
  preserve-file-date - true if the file date of the copy should be the same as the original - `boolean`

  throws: java.lang.NullPointerException - if source or destination is null"
  ([^java.io.File src-dir ^java.io.File dest-dir ^java.io.FileFilter filter ^Boolean preserve-file-date]
    (FileUtils/copyDirectory src-dir dest-dir filter preserve-file-date))
  ([^java.io.File src-dir ^java.io.File dest-dir ^Boolean preserve-file-date]
    (FileUtils/copyDirectory src-dir dest-dir preserve-file-date))
  ([^java.io.File src-dir ^java.io.File dest-dir]
    (FileUtils/copyDirectory src-dir dest-dir)))

(defn *copy-to-file
  "Copies bytes from an InputStream source to a file
   destination. The directories up to destination
   will be created if they don't already exist. destination
   will be overwritten if it already exists.
   The source stream is left open, e.g. for use with ZipInputStream.
   See copyInputStreamToFile(InputStream, File) for a method that closes the input stream.

  source - the InputStream to copy bytes from, must not be null - `java.io.InputStream`
  destination - the non-directory File to write bytes to (possibly overwriting), must not be null - `java.io.File`

  throws: java.io.IOException - if an IO error occurs during copying"
  ([^java.io.InputStream source ^java.io.File destination]
    (FileUtils/copyToFile source destination)))

(defn *to-files
  "Converts each of an array of URL to a File.

   Returns an array of the same size as the input.
   If the input is null, an empty array is returned.
   If the input contains null, the output array contains null at the same
   index.

   This method will decode the URL.
   Syntax such as file:///my%20docs/file.txt will be
   correctly decoded to /my docs/file.txt.

  urls - the file URLs to convert, null returns empty array - `java.net.URL[]`

  returns: a non-null array of Files matching the input, with a null item
   if there was a null at that index in the input array - `java.io.File[]`

  throws: java.lang.IllegalArgumentException - if any file is incorrectly encoded"
  ([urls]
    (FileUtils/toFiles urls)))

(defn *open-input-stream
  "Opens a FileInputStream for the specified file, providing better
   error messages than simply calling new FileInputStream(file).

   At the end of the method either the stream will be successfully opened,
   or an exception will have been thrown.

   An exception is thrown if the file does not exist.
   An exception is thrown if the file object exists but is a directory.
   An exception is thrown if the file exists but cannot be read.

  file - the file to open for input, must not be null - `java.io.File`

  returns: a new FileInputStream for the specified file - `java.io.FileInputStream`

  throws: java.io.FileNotFoundException - if the file does not exist"
  (^java.io.FileInputStream [^java.io.File file]
    (FileUtils/openInputStream file)))

(defn *get-temp-directory-path
  "Returns the path to the system temporary directory.

  returns: the path to the system temporary directory. - `java.lang.String`"
  (^java.lang.String []
    (FileUtils/getTempDirectoryPath )))

(defn *iterate-files-and-dirs
  "Allows iteration over the files in given directory (and optionally
   its subdirectories).

   All files found are filtered by an IOFileFilter. This method is
   based on listFilesAndDirs(File, IOFileFilter, IOFileFilter),
   which supports Iterable ('foreach' loop).

   The resulting iterator includes the subdirectories themselves.

  directory - the directory to search in - `java.io.File`
  file-filter - filter to apply when finding files. - `org.apache.commons.io.filefilter.IOFileFilter`
  dir-filter - optional filter to apply when finding subdirectories. If this parameter is null, subdirectories will not be included in the search. Use TrueFileFilter.INSTANCE to match all directories. - `org.apache.commons.io.filefilter.IOFileFilter`

  returns: an iterator of java.io.File for the matching files - `java.util.Iterator<java.io.File>`"
  (^java.util.Iterator [^java.io.File directory ^org.apache.commons.io.filefilter.IOFileFilter file-filter ^org.apache.commons.io.filefilter.IOFileFilter dir-filter]
    (FileUtils/iterateFilesAndDirs directory file-filter dir-filter)))

(defn *checksum-crc-32
  "Computes the checksum of a file using the CRC32 checksum routine.
   The value of the checksum is returned.

  file - the file to checksum, must not be null - `java.io.File`

  returns: the checksum value - `long`

  throws: java.lang.NullPointerException - if the file or checksum is null"
  (^Long [^java.io.File file]
    (FileUtils/checksumCRC32 file)))

(defn *copy-file
  "Copies a file to a new location.

   This method copies the contents of the specified source file
   to the specified destination file.
   The directory holding the destination file is created if it does not exist.
   If the destination file exists, then this method will overwrite it.

   Note: Setting preserveFileDate to
   true tries to preserve the file's last modified
   date/times using File.setLastModified(long), however it is
   not guaranteed that the operation will succeed.
   If the modification operation fails, no indication is provided.

  src-file - an existing file to copy, must not be null - `java.io.File`
  dest-file - the new file, must not be null - `java.io.File`
  preserve-file-date - true if the file date of the copy should be the same as the original - `boolean`

  throws: java.lang.NullPointerException - if source or destination is null"
  ([^java.io.File src-file ^java.io.File dest-file ^Boolean preserve-file-date]
    (FileUtils/copyFile src-file dest-file preserve-file-date))
  ([^java.io.File src-file ^java.io.File dest-file]
    (FileUtils/copyFile src-file dest-file)))

(defn *file-newer?
  "Tests if the specified File is newer than the reference
   File.

  file - the File of which the modification date must be compared, must not be null - `java.io.File`
  reference - the File of which the modification date is used, must not be null - `java.io.File`

  returns: true if the File exists and has been modified more
   recently than the reference File - `boolean`

  throws: java.lang.IllegalArgumentException - if the reference file is null or doesn't exist"
  (^Boolean [^java.io.File file ^java.io.File reference]
    (FileUtils/isFileNewer file reference)))

(defn *open-output-stream
  "Opens a FileOutputStream for the specified file, checking and
   creating the parent directory if it does not exist.

   At the end of the method either the stream will be successfully opened,
   or an exception will have been thrown.

   The parent directory will be created if it does not exist.
   The file will be created if it does not exist.
   An exception is thrown if the file object exists but is a directory.
   An exception is thrown if the file exists but cannot be written to.
   An exception is thrown if the parent directory cannot be created.

  file - the file to open for output, must not be null - `java.io.File`
  append - if true, then bytes will be added to the end of the file rather than overwriting - `boolean`

  returns: a new FileOutputStream for the specified file - `java.io.FileOutputStream`

  throws: java.io.IOException - if a parent directory needs creating but that fails"
  (^java.io.FileOutputStream [^java.io.File file ^Boolean append]
    (FileUtils/openOutputStream file append))
  (^java.io.FileOutputStream [^java.io.File file]
    (FileUtils/openOutputStream file)))

(defn *byte-count-to-display-size
  "Returns a human-readable version of the file size, where the input represents a specific number of bytes.

   If the size is over 1GB, the size is returned as the number of whole GB, i.e. the size is rounded down to the
   nearest GB boundary.


   Similarly for the 1MB and 1KB boundaries.

  size - the number of bytes - `java.math.BigInteger`

  returns: a human-readable display value (includes units - EB, PB, TB, GB, MB, KB or bytes) - `java.lang.String`"
  (^java.lang.String [^java.math.BigInteger size]
    (FileUtils/byteCountToDisplaySize size)))

(defn *size-of-as-big-integer
  "Returns the size of the specified file or directory. If the provided
   File is a regular file, then the file's length is returned.
   If the argument is a directory, then the size of the directory is
   calculated recursively. If a directory or subdirectory is security
   restricted, its size will not be included.

  file - the regular file or directory to return the size of (must not be null). - `java.io.File`

  returns: the length of the file, or recursive size of the directory,
   provided (in bytes). - `java.math.BigInteger`

  throws: java.lang.NullPointerException - if the file is null"
  (^java.math.BigInteger [^java.io.File file]
    (FileUtils/sizeOfAsBigInteger file)))

(defn *touch
  "Implements the same behaviour as the \"touch\" utility on Unix. It creates
   a new file with size 0 or, if the file exists already, it is opened and
   closed without modifying it, but updating the file date and time.

   NOTE: As from v1.3, this method throws an IOException if the last
   modified date of the file cannot be set. Also, as from v1.3 this method
   creates parent directories if they do not exist.

  file - the File to touch - `java.io.File`

  throws: java.io.IOException - If an I/O problem occurs"
  ([^java.io.File file]
    (FileUtils/touch file)))

(defn *convert-file-collection-to-file-array
  "Converts a Collection containing java.io.File instanced into array
   representation. This is to account for the difference between
   File.listFiles() and FileUtils.listFiles().

  files - a Collection containing java.io.File instances - `java.util.Collection`

  returns: an array of java.io.File - `java.io.File[]`"
  ([^java.util.Collection files]
    (FileUtils/convertFileCollectionToFileArray files)))

(defn *write-lines
  "Writes the toString() value of each item in a collection to
   the specified File line by line.
   The specified character encoding and the line ending will be used.

  file - the file to write to - `java.io.File`
  encoding - the encoding to use, null means platform default - `java.lang.String`
  lines - the lines to write, null entries produce blank lines - `java.util.Collection`
  line-ending - the line separator to use, null is system default - `java.lang.String`
  append - if true, then the lines will be added to the end of the file rather than overwriting - `boolean`

  throws: java.io.IOException - in case of an I/O error"
  ([^java.io.File file ^java.lang.String encoding ^java.util.Collection lines ^java.lang.String line-ending ^Boolean append]
    (FileUtils/writeLines file encoding lines line-ending append))
  ([^java.io.File file ^java.lang.String encoding ^java.util.Collection lines ^Boolean append]
    (FileUtils/writeLines file encoding lines append))
  ([^java.io.File file ^java.lang.String encoding ^java.util.Collection lines]
    (FileUtils/writeLines file encoding lines))
  ([^java.io.File file ^java.util.Collection lines]
    (FileUtils/writeLines file lines)))

(defn *delete-quietly
  "Deletes a file, never throwing an exception. If file is a directory, delete it and all sub-directories.

   The difference between File.delete() and this method are:

   A directory to be deleted does not have to be empty.
   No exceptions are thrown when a file or directory cannot be deleted.

  file - file or directory to delete, can be null - `java.io.File`

  returns: true if the file or directory was deleted, otherwise
   false - `boolean`"
  (^Boolean [^java.io.File file]
    (FileUtils/deleteQuietly file)))

(defn *move-file-to-directory
  "Moves a file to a directory.

  src-file - the file to be moved - `java.io.File`
  dest-dir - the destination file - `java.io.File`
  create-dest-dir - If true create the destination directory, otherwise if false throw an IOException - `boolean`

  throws: java.lang.NullPointerException - if source or destination is null"
  ([^java.io.File src-file ^java.io.File dest-dir ^Boolean create-dest-dir]
    (FileUtils/moveFileToDirectory src-file dest-dir create-dest-dir)))

(defn *size-of-directory
  "Counts the size of a directory recursively (sum of the length of all files).

   Note that overflow is not detected, and the return value may be negative if
   overflow occurs. See sizeOfDirectoryAsBigInteger(File) for an alternative
   method that does not overflow.

  directory - directory to inspect, must not be null - `java.io.File`

  returns: size of directory in bytes, 0 if directory is security restricted, a negative number when the real total
   is greater than Long.MAX_VALUE. - `long`

  throws: java.lang.NullPointerException - if the directory is null"
  (^Long [^java.io.File directory]
    (FileUtils/sizeOfDirectory directory)))

(defn *force-delete
  "Deletes a file. If file is a directory, delete it and all sub-directories.

   The difference between File.delete() and this method are:

   A directory to be deleted does not have to be empty.
   You get exceptions when a file or directory cannot be deleted.
   (java.io.File methods returns a boolean)

  file - file or directory to delete, must not be null - `java.io.File`

  throws: java.lang.NullPointerException - if the directory is null"
  ([^java.io.File file]
    (FileUtils/forceDelete file)))

(defn *copy-to-directory
  "Copies a file or directory to within another directory preserving the file dates.

   This method copies the source file or directory, along all its contents, to a
   directory of the same name in the specified destination directory.

   The destination directory is created if it does not exist.
   If the destination directory did exist, then this method merges
   the source with the destination, with the source taking precedence.

   Note: This method tries to preserve the files' last
   modified date/times using File.setLastModified(long), however
   it is not guaranteed that those operations will succeed.
   If the modification operation fails, no indication is provided.

  src - an existing file or directory to copy, must not be null - `java.io.File`
  dest-dir - the directory to place the copy in, must not be null - `java.io.File`

  throws: java.lang.NullPointerException - if source or destination is null"
  ([^java.io.File src ^java.io.File dest-dir]
    (FileUtils/copyToDirectory src dest-dir)))

(defn *read-file-to-byte-array
  "Reads the contents of a file into a byte array.
   The file is always closed.

  file - the file to read, must not be null - `java.io.File`

  returns: the file contents, never null - `byte[]`

  throws: java.io.IOException - in case of an I/O error"
  ([^java.io.File file]
    (FileUtils/readFileToByteArray file)))

(defn *move-directory-to-directory
  "Moves a directory to another directory.

  src - the file to be moved - `java.io.File`
  dest-dir - the destination file - `java.io.File`
  create-dest-dir - If true create the destination directory, otherwise if false throw an IOException - `boolean`

  throws: java.lang.NullPointerException - if source or destination is null"
  ([^java.io.File src ^java.io.File dest-dir ^Boolean create-dest-dir]
    (FileUtils/moveDirectoryToDirectory src dest-dir create-dest-dir)))

(defn *write-string-to-file
  "Writes a String to a file creating the file if it does not exist.

  file - the file to write - `java.io.File`
  data - the content to write to the file - `java.lang.String`
  encoding - the encoding to use, null means platform default - `java.nio.charset.Charset`
  append - if true, then the String will be added to the end of the file rather than overwriting - `boolean`

  throws: java.io.IOException - in case of an I/O error"
  ([^java.io.File file ^java.lang.String data ^java.nio.charset.Charset encoding ^Boolean append]
    (FileUtils/writeStringToFile file data encoding append))
  ([^java.io.File file ^java.lang.String data ^java.nio.charset.Charset encoding]
    (FileUtils/writeStringToFile file data encoding))
  ([^java.io.File file ^java.lang.String data]
    (FileUtils/writeStringToFile file data)))

(defn *copy-input-stream-to-file
  "Copies bytes from an InputStream source to a file
   destination. The directories up to destination
   will be created if they don't already exist. destination
   will be overwritten if it already exists.
   The source stream is closed.
   See copyToFile(InputStream, File) for a method that does not close the input stream.

  source - the InputStream to copy bytes from, must not be null, will be closed - `java.io.InputStream`
  destination - the non-directory File to write bytes to (possibly overwriting), must not be null - `java.io.File`

  throws: java.io.IOException - if an IO error occurs during copying"
  ([^java.io.InputStream source ^java.io.File destination]
    (FileUtils/copyInputStreamToFile source destination)))

(defn *force-mkdir
  "Makes a directory, including any necessary but nonexistent parent
   directories. If a file already exists with specified name but it is
   not a directory then an IOException is thrown.
   If the directory cannot be created (or does not already exist)
   then an IOException is thrown.

  directory - directory to create, must not be null - `java.io.File`

  throws: java.lang.NullPointerException - if the directory is null"
  ([^java.io.File directory]
    (FileUtils/forceMkdir directory)))

(defn *force-mkdir-parent
  "Makes any necessary but nonexistent parent directories for a given File. If the parent directory cannot be
   created then an IOException is thrown.

  file - file with parent to create, must not be null - `java.io.File`

  throws: java.lang.NullPointerException - if the file is null"
  ([^java.io.File file]
    (FileUtils/forceMkdirParent file)))

(defn *content-equals-ignore-eol
  "Compares the contents of two files to determine if they are equal or not.

   This method checks to see if the two files point to the same file,
   before resorting to line-by-line comparison of the contents.

  file-1 - the first file - `java.io.File`
  file-2 - the second file - `java.io.File`
  charset-name - the character encoding to be used. May be null, in which case the platform default is used - `java.lang.String`

  returns: true if the content of the files are equal or neither exists,
   false otherwise - `boolean`

  throws: java.io.IOException - in case of an I/O error"
  (^Boolean [^java.io.File file-1 ^java.io.File file-2 ^java.lang.String charset-name]
    (FileUtils/contentEqualsIgnoreEOL file-1 file-2 charset-name)))

(defn *read-file-to-string
  "Reads the contents of a file into a String.
   The file is always closed.

  file - the file to read, must not be null - `java.io.File`
  encoding - the encoding to use, null means platform default - `java.nio.charset.Charset`

  returns: the file contents, never null - `java.lang.String`

  throws: java.io.IOException - in case of an I/O error"
  (^java.lang.String [^java.io.File file ^java.nio.charset.Charset encoding]
    (FileUtils/readFileToString file encoding))
  (^java.lang.String [^java.io.File file]
    (FileUtils/readFileToString file)))

(defn *symlink?
  "Determines whether the specified file is a Symbolic Link rather than an actual file.

   Will not return true if there is a Symbolic Link anywhere in the path,
   only if the specific file is.

   When using jdk1.7, this method delegates to boolean java.nio.file.Files.isSymbolicLink(Path path)

   Note: the current implementation always returns false if running on
   jkd1.6 and the system is detected as Windows using FilenameUtils.isSystemWindows()

   For code that runs on Java 1.7 or later, use the following method instead:

   boolean java.nio.file.Files.isSymbolicLink(Path path)

  file - the file to check - `java.io.File`

  returns: true if the file is a Symbolic Link - `boolean`

  throws: java.io.IOException - if an IO error occurs while checking the file"
  (^Boolean [^java.io.File file]
    (FileUtils/isSymlink file)))

(defn *list-files
  "Finds files within a given directory (and optionally its
   subdirectories). All files found are filtered by an IOFileFilter.

   If your search should recurse into subdirectories you can pass in
   an IOFileFilter for directories. You don't need to bind a
   DirectoryFileFilter (via logical AND) to this filter. This method does
   that for you.

   An example: If you want to search through all directories called
   \"temp\" you pass in FileFilterUtils.NameFileFilter(\"temp\")

   Another common usage of this method is find files in a directory
   tree but ignoring the directories generated CVS. You can simply pass
   in FileFilterUtils.makeCVSAware(null).

  directory - the directory to search in - `java.io.File`
  file-filter - filter to apply when finding files. Must not be null, use TrueFileFilter.INSTANCE to match all files in selected directories. - `org.apache.commons.io.filefilter.IOFileFilter`
  dir-filter - optional filter to apply when finding subdirectories. If this parameter is null, subdirectories will not be included in the search. Use TrueFileFilter.INSTANCE to match all directories. - `org.apache.commons.io.filefilter.IOFileFilter`

  returns: a collection of java.io.File with the matching files - `java.util.Collection<java.io.File>`"
  (^java.util.Collection [^java.io.File directory ^org.apache.commons.io.filefilter.IOFileFilter file-filter ^org.apache.commons.io.filefilter.IOFileFilter dir-filter]
    (FileUtils/listFiles directory file-filter dir-filter)))

(defn *read-lines
  "Reads the contents of a file line by line to a List of Strings.
   The file is always closed.

  file - the file to read, must not be null - `java.io.File`
  encoding - the encoding to use, null means platform default - `java.nio.charset.Charset`

  returns: the list of Strings representing each line in the file, never null - `java.util.List<java.lang.String>`

  throws: java.io.IOException - in case of an I/O error"
  (^java.util.List [^java.io.File file ^java.nio.charset.Charset encoding]
    (FileUtils/readLines file encoding))
  (^java.util.List [^java.io.File file]
    (FileUtils/readLines file)))

(defn *size-of-directory-as-big-integer
  "Counts the size of a directory recursively (sum of the length of all files).

  directory - directory to inspect, must not be null - `java.io.File`

  returns: size of directory in bytes, 0 if directory is security restricted. - `java.math.BigInteger`

  throws: java.lang.NullPointerException - if the directory is null"
  (^java.math.BigInteger [^java.io.File directory]
    (FileUtils/sizeOfDirectoryAsBigInteger directory)))

(defn *directory-contains
  "Determines whether the parent directory contains the child element (a file or directory).

   Files are normalized before comparison.


   Edge cases:

   A directory must not be null: if null, throw IllegalArgumentException
   A directory must be a directory: if not a directory, throw IllegalArgumentException
   A directory does not contain itself: return false
   A null child file is not contained in any parent: return false

  directory - the file to consider as the parent. - `java.io.File`
  child - the file to consider as the child. - `java.io.File`

  returns: true is the candidate leaf is under by the specified composite. False otherwise. - `boolean`

  throws: java.io.IOException - if an IO error occurs while checking the files."
  (^Boolean [^java.io.File directory ^java.io.File child]
    (FileUtils/directoryContains directory child)))

(defn *get-user-directory-path
  "Returns the path to the user's home directory.

  returns: the path to the user's home directory. - `java.lang.String`"
  (^java.lang.String []
    (FileUtils/getUserDirectoryPath )))

(defn *get-file
  "Construct a file from the set of name elements.

  directory - the parent directory - `java.io.File`
  names - the name elements - `java.lang.String`

  returns: the file - `java.io.File`"
  (^java.io.File [^java.io.File directory ^java.lang.String names]
    (FileUtils/getFile directory names))
  (^java.io.File [^java.lang.String names]
    (FileUtils/getFile names)))

(defn *checksum
  "Computes the checksum of a file using the specified checksum object.
   Multiple files may be checked using one Checksum instance
   if desired simply by reusing the same checksum object.
   For example:


     long csum = FileUtils.checksum(file, new CRC32()).getValue();

  file - the file to checksum, must not be null - `java.io.File`
  checksum - the checksum object to be used, must not be null - `java.util.zip.Checksum`

  returns: the checksum specified, updated with the content of the file - `java.util.zip.Checksum`

  throws: java.lang.NullPointerException - if the file or checksum is null"
  (^java.util.zip.Checksum [^java.io.File file ^java.util.zip.Checksum checksum]
    (FileUtils/checksum file checksum)))

(defn *copy-file-to-directory
  "Copies a file to a directory optionally preserving the file date.

   This method copies the contents of the specified source file
   to a file of the same name in the specified destination directory.
   The destination directory is created if it does not exist.
   If the destination file exists, then this method will overwrite it.

   Note: Setting preserveFileDate to
   true tries to preserve the file's last modified
   date/times using File.setLastModified(long), however it is
   not guaranteed that the operation will succeed.
   If the modification operation fails, no indication is provided.

  src-file - an existing file to copy, must not be null - `java.io.File`
  dest-dir - the directory to place the copy in, must not be null - `java.io.File`
  preserve-file-date - true if the file date of the copy should be the same as the original - `boolean`

  throws: java.lang.NullPointerException - if source or destination is null"
  ([^java.io.File src-file ^java.io.File dest-dir ^Boolean preserve-file-date]
    (FileUtils/copyFileToDirectory src-file dest-dir preserve-file-date))
  ([^java.io.File src-file ^java.io.File dest-dir]
    (FileUtils/copyFileToDirectory src-file dest-dir)))

(defn *clean-directory
  "Cleans a directory without deleting it.

  directory - directory to clean - `java.io.File`

  throws: java.io.IOException - in case cleaning is unsuccessful"
  ([^java.io.File directory]
    (FileUtils/cleanDirectory directory)))

(defn *move-to-directory
  "Moves a file or directory to the destination directory.

   When the destination is on another file system, do a \"copy and delete\".

  src - the file or directory to be moved - `java.io.File`
  dest-dir - the destination directory - `java.io.File`
  create-dest-dir - If true create the destination directory, otherwise if false throw an IOException - `boolean`

  throws: java.lang.NullPointerException - if source or destination is null"
  ([^java.io.File src ^java.io.File dest-dir ^Boolean create-dest-dir]
    (FileUtils/moveToDirectory src dest-dir create-dest-dir)))

(defn *file-older?
  "Tests if the specified File is older than the reference
   File.

  file - the File of which the modification date must be compared, must not be null - `java.io.File`
  reference - the File of which the modification date is used, must not be null - `java.io.File`

  returns: true if the File exists and has been modified before
   the reference File - `boolean`

  throws: java.lang.IllegalArgumentException - if the reference file is null or doesn't exist"
  (^Boolean [^java.io.File file ^java.io.File reference]
    (FileUtils/isFileOlder file reference)))

(defn *list-files-and-dirs
  "Finds files within a given directory (and optionally its
   subdirectories). All files found are filtered by an IOFileFilter.

   The resulting collection includes the starting directory and
   any subdirectories that match the directory filter.

  directory - the directory to search in - `java.io.File`
  file-filter - filter to apply when finding files. - `org.apache.commons.io.filefilter.IOFileFilter`
  dir-filter - optional filter to apply when finding subdirectories. If this parameter is null, subdirectories will not be included in the search. Use TrueFileFilter.INSTANCE to match all directories. - `org.apache.commons.io.filefilter.IOFileFilter`

  returns: a collection of java.io.File with the matching files - `java.util.Collection<java.io.File>`"
  (^java.util.Collection [^java.io.File directory ^org.apache.commons.io.filefilter.IOFileFilter file-filter ^org.apache.commons.io.filefilter.IOFileFilter dir-filter]
    (FileUtils/listFilesAndDirs directory file-filter dir-filter)))

(defn *content-equals
  "Compares the contents of two files to determine if they are equal or not.

   This method checks to see if the two files are different lengths
   or if they point to the same file, before resorting to byte-by-byte
   comparison of the contents.

   Code origin: Avalon

  file-1 - the first file - `java.io.File`
  file-2 - the second file - `java.io.File`

  returns: true if the content of the files are equal or they both don't
   exist, false otherwise - `boolean`

  throws: java.io.IOException - in case of an I/O error"
  (^Boolean [^java.io.File file-1 ^java.io.File file-2]
    (FileUtils/contentEquals file-1 file-2)))

(defn *write
  "Writes a CharSequence to a file creating the file if it does not exist.

  file - the file to write - `java.io.File`
  data - the content to write to the file - `java.lang.CharSequence`
  encoding - the encoding to use, null means platform default - `java.nio.charset.Charset`
  append - if true, then the data will be added to the end of the file rather than overwriting - `boolean`

  throws: java.io.IOException - in case of an I/O error"
  ([^java.io.File file ^java.lang.CharSequence data ^java.nio.charset.Charset encoding ^Boolean append]
    (FileUtils/write file data encoding append))
  ([^java.io.File file ^java.lang.CharSequence data ^Boolean append]
    (FileUtils/write file data append))
  ([^java.io.File file ^java.lang.CharSequence data]
    (FileUtils/write file data)))

(defn *line-iterator
  "Returns an Iterator for the lines in a File.

   This method opens an InputStream for the file.
   When you have finished with the iterator you should close the stream
   to free internal resources. This can be done by calling the
   LineIterator.close() or
   LineIterator.closeQuietly(LineIterator) method.

   The recommended usage pattern is:


   LineIterator it = FileUtils.lineIterator(file, \"UTF-8\");
   try {
     while (it.hasNext()) {
       String line = it.nextLine();
       /// do something with line
     }
   } finally {
     LineIterator.closeQuietly(iterator);
   }

   If an exception occurs during the creation of the iterator, the
   underlying stream is closed.

  file - the file to open for input, must not be null - `java.io.File`
  encoding - the encoding to use, null means platform default - `java.lang.String`

  returns: an Iterator of the lines in the file, never null - `org.apache.commons.io.LineIterator`

  throws: java.io.IOException - in case of an I/O error (file closed)"
  (^org.apache.commons.io.LineIterator [^java.io.File file ^java.lang.String encoding]
    (FileUtils/lineIterator file encoding))
  (^org.apache.commons.io.LineIterator [^java.io.File file]
    (FileUtils/lineIterator file)))

(defn *wait-for
  "Waits for NFS to propagate a file creation, imposing a timeout.

   This method repeatedly tests File.exists() until it returns
   true up to the maximum time specified in seconds.

  file - the file to check, must not be null - `java.io.File`
  seconds - the maximum time in seconds to wait - `int`

  returns: true if file exists - `boolean`

  throws: java.lang.NullPointerException - if the file is null"
  (^Boolean [^java.io.File file ^Integer seconds]
    (FileUtils/waitFor file seconds)))

(defn *copy-url-to-file
  "Copies bytes from the URL source to a file
   destination. The directories up to destination
   will be created if they don't already exist. destination
   will be overwritten if it already exists.

  source - the URL to copy bytes from, must not be null - `java.net.URL`
  destination - the non-directory File to write bytes to (possibly overwriting), must not be null - `java.io.File`
  connection-timeout - the number of milliseconds until this method will timeout if no connection could be established to the source - `int`
  read-timeout - the number of milliseconds until this method will timeout if no data could be read from the source - `int`

  throws: java.io.IOException - if an IO error occurs during copying"
  ([^java.net.URL source ^java.io.File destination ^Integer connection-timeout ^Integer read-timeout]
    (FileUtils/copyURLToFile source destination connection-timeout read-timeout))
  ([^java.net.URL source ^java.io.File destination]
    (FileUtils/copyURLToFile source destination)))

