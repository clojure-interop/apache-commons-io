(ns org.apache.commons.io.filefilter.MagicNumberFileFilter
  " File filter for matching files containing a \"magic number\". A magic number
  is a unique series of bytes common to all files of a specific file format.
  For instance, all Java class files begin with the bytes
  0xCAFEBABE.




  File dir = new File(\".\");
  MagicNumberFileFilter javaClassFileFilter =
      MagicNumberFileFilter(new byte[] {(byte) 0xCA, (byte) 0xFE,
        (byte) 0xBA, (byte) 0xBE});
  String[] javaClassFiles = dir.list(javaClassFileFilter);
  for (String javaClassFile : javaClassFiles) {
      System.out.println(javaClassFile);
  }


  Sometimes, such as in the case of TAR files, the
  magic number will be offset by a certain number of bytes in the file. In the
  case of TAR archive files, this offset is 257 bytes.




  File dir = new File(\".\");
  MagicNumberFileFilter tarFileFilter =
      MagicNumberFileFilter(\"ustar\", 257);
  String[] tarFiles = dir.list(tarFileFilter);
  for (String tarFile : tarFiles) {
      System.out.println(tarFile);
  }"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.filefilter MagicNumberFileFilter]))

(defn ->magic-number-file-filter
  "Constructor.

  Constructs a new MagicNumberFileFilter and associates it with the magic
   number to test for in files and the byte offset location in the file to
   to look for that magic number.




   MagicNumberFileFilter tarFileFilter =
       MagicNumberFileFilter(\"ustar\", 257);

  magic-number - the magic number to look for in the file. The string is converted to bytes using the platform default charset. - `java.lang.String`
  offset - the byte offset in the file to start comparing bytes. - `long`

  throws: java.lang.IllegalArgumentException - if magicNumber is null or the empty String, or offset is a negative number."
  (^MagicNumberFileFilter [^java.lang.String magic-number ^Long offset]
    (new MagicNumberFileFilter magic-number offset))
  (^MagicNumberFileFilter [magic-number]
    (new MagicNumberFileFilter magic-number)))

(defn accept
  "Accepts the provided file if the file contains the file filter's magic
   number at the specified offset.



   If any IOExceptions occur while reading the file, the file will
   be rejected.

  file - the file to accept or reject. - `java.io.File`

  returns: true if the file contains the filter's magic number
           at the specified offset, false otherwise. - `boolean`"
  (^Boolean [^MagicNumberFileFilter this ^java.io.File file]
    (-> this (.accept file))))

(defn to-string
  "Returns a String representation of the file filter, which includes the
   magic number bytes and byte offset.

  returns: a String representation of the file filter. - `java.lang.String`"
  (^java.lang.String [^MagicNumberFileFilter this]
    (-> this (.toString))))

