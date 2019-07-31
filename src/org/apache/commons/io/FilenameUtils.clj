(ns org.apache.commons.io.FilenameUtils
  "General filename and filepath manipulation utilities.

  When dealing with filenames you can hit problems when moving from a Windows
  based development machine to a Unix based production machine.
  This class aims to help avoid those problems.

  NOTE: You may be able to avoid using this class entirely simply by
  using JDK File objects and the two argument constructor
  File(File,String).

  Most methods on this class are designed to work the same on both Unix and Windows.
  Those that don't include 'System', 'Unix' or 'Windows' in their name.

  Most methods recognise both separators (forward and back), and both
  sets of prefixes. See the javadoc of each method for details.

  This class defines six components within a filename
  (example C:\\dev\\project\\file.txt):

  the prefix - C:\\
  the path - dev\\project\\
  the full path - C:\\dev\\project\\
  the name - file.txt
  the base name - file
  the extension - txt

  Note that this class works best if directory filenames end with a separator.
  If you omit the last separator, it is impossible to determine if the filename
  corresponds to a file or a directory. As a result, we have chosen to say
  it corresponds to a file.

  This class only supports Unix and Windows style names.
  Prefixes are matched as follows:


  Windows:
  a\\b\\c.txt           --> \"\"          --> relative
  \\a\\b\\c.txt          --> \"\\\"         --> current drive absolute
  C:a\\b\\c.txt         --> \"C:\"        --> drive relative
  C:\\a\\b\\c.txt        --> \"C:\\\"       --> absolute
  \\\\server\\a\\b\\c.txt  --> \"\\\\server\\\" --> UNC

  Unix:
  a/b/c.txt           --> \"\"          --> relative
  /a/b/c.txt          --> \"/\"         --> absolute
  ~/a/b/c.txt         --> \"~/\"        --> current user
  ~                   --> \"~/\"        --> current user (slash added)
  ~user/a/b/c.txt     --> \"~user/\"    --> named user
  ~user               --> \"~user/\"    --> named user (slash added)
  Both prefix styles are matched always, irrespective of the machine that you are
  currently running on.

  Origin of code: Excalibur, Alexandria, Tomcat, Commons-Utils."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io FilenameUtils]))

(defn ->filename-utils
  "Constructor.

  Instances should NOT be constructed in standard programming."
  (^FilenameUtils []
    (new FilenameUtils )))

(def *-extension-separator
  "Static Constant.

  The extension separator character.

  type: char"
  FilenameUtils/EXTENSION_SEPARATOR)

(def *-extension-separator-str
  "Static Constant.

  The extension separator String.

  type: java.lang.String"
  FilenameUtils/EXTENSION_SEPARATOR_STR)

(defn *extension?
  "Checks whether the extension of the filename is that specified.

   This method obtains the extension as the textual part of the filename
   after the last dot. There must be no directory separator after the dot.
   The extension check is case-sensitive on all platforms.

  filename - the filename to query, null returns false - `java.lang.String`
  extension - the extension to check for, null or empty checks for no extension - `java.lang.String`

  returns: true if the filename has the specified extension - `boolean`

  throws: java.lang.IllegalArgumentException - if the supplied filename contains null bytes"
  (^Boolean [^java.lang.String filename ^java.lang.String extension]
    (FilenameUtils/isExtension filename extension)))

(defn *remove-extension
  "Removes the extension from a filename.

   This method returns the textual part of the filename before the last dot.
   There must be no directory separator after the dot.


   foo.txt    --> foo
   a\\b\\c.jpg  --> a\\b\\c
   a\\b\\c      --> a\\b\\c
   a.b\\c      --> a.b\\c

   The output will be the same irrespective of the machine that the code is running on.

  filename - the filename to query, null returns null - `java.lang.String`

  returns: the filename minus the extension - `java.lang.String`"
  (^java.lang.String [^java.lang.String filename]
    (FilenameUtils/removeExtension filename)))

(defn *normalize-no-end-separator
  "Normalizes a path, removing double and single dot path steps,
   and removing any final directory separator.

   This method normalizes a path to a standard format.
   The input may contain separators in either Unix or Windows format.
   The output will contain separators in the format specified.

   A trailing slash will be removed.
   A double slash will be merged to a single slash (but UNC names are handled).
   A single dot path segment will be removed.
   A double dot will cause that path segment and the one before to be removed.
   If the double dot has no parent path segment to work with, null
   is returned.

   The output will be the same on both Unix and Windows including
   the separator character.


   /foo//               -->   /foo
   /foo/./              -->   /foo
   /foo/../bar          -->   /bar
   /foo/../bar/         -->   /bar
   /foo/../bar/../baz   -->   /baz
   //foo//./bar         -->   /foo/bar
   /../                 -->   null
   ../foo               -->   null
   foo/bar/..           -->   foo
   foo/../../bar        -->   null
   foo/../bar           -->   bar
   //server/foo/../bar  -->   //server/bar
   //server/../bar      -->   null
   C:\\foo\\..\\bar        -->   C:\\bar
   C:\\..\\bar            -->   null
   ~/foo/../bar/        -->   ~/bar
   ~/../bar             -->   null

  filename - the filename to normalize, null returns null - `java.lang.String`
  unix-separator - true if a unix separator should be used or false if a windows separator should be used. - `boolean`

  returns: the normalized filename, or null if invalid. Null bytes inside string will be removed - `java.lang.String`"
  (^java.lang.String [^java.lang.String filename ^Boolean unix-separator]
    (FilenameUtils/normalizeNoEndSeparator filename unix-separator))
  (^java.lang.String [^java.lang.String filename]
    (FilenameUtils/normalizeNoEndSeparator filename)))

(defn *normalize
  "Normalizes a path, removing double and single dot path steps.

   This method normalizes a path to a standard format.
   The input may contain separators in either Unix or Windows format.
   The output will contain separators in the format specified.

   A trailing slash will be retained.
   A double slash will be merged to a single slash (but UNC names are handled).
   A single dot path segment will be removed.
   A double dot will cause that path segment and the one before to be removed.
   If the double dot has no parent path segment to work with, null
   is returned.

   The output will be the same on both Unix and Windows except
   for the separator character.


   /foo//               -->   /foo/
   /foo/./              -->   /foo/
   /foo/../bar          -->   /bar
   /foo/../bar/         -->   /bar/
   /foo/../bar/../baz   -->   /baz
   //foo//./bar         -->   /foo/bar
   /../                 -->   null
   ../foo               -->   null
   foo/bar/..           -->   foo/
   foo/../../bar        -->   null
   foo/../bar           -->   bar
   //server/foo/../bar  -->   //server/bar
   //server/../bar      -->   null
   C:\\foo\\..\\bar        -->   C:\\bar
   C:\\..\\bar            -->   null
   ~/foo/../bar/        -->   ~/bar/
   ~/../bar             -->   null
   The output will be the same on both Unix and Windows including
   the separator character.

  filename - the filename to normalize, null returns null - `java.lang.String`
  unix-separator - true if a unix separator should be used or false if a windows separator should be used. - `boolean`

  returns: the normalized filename, or null if invalid. Null bytes inside string will be removed - `java.lang.String`"
  (^java.lang.String [^java.lang.String filename ^Boolean unix-separator]
    (FilenameUtils/normalize filename unix-separator))
  (^java.lang.String [^java.lang.String filename]
    (FilenameUtils/normalize filename)))

(defn *get-full-path-no-end-separator
  "Gets the full path from a full filename, which is the prefix  path,
   and also excluding the final directory separator.

   This method will handle a file in either Unix or Windows format.
   The method is entirely text based, and returns the text before the
   last forward or backslash.


   C:\\a\\b\\c.txt --> C:\\a\\b
   ~/a/b/c.txt  --> ~/a/b
   a.txt        --> \"\"
   a/b/c        --> a/b
   a/b/c/       --> a/b/c
   C:           --> C:
   C:\\          --> C:\\
   ~            --> ~
   ~/           --> ~
   ~user        --> ~user
   ~user/       --> ~user

   The output will be the same irrespective of the machine that the code is running on.

  filename - the filename to query, null returns null - `java.lang.String`

  returns: the path of the file, an empty string if none exists, null if invalid - `java.lang.String`"
  (^java.lang.String [^java.lang.String filename]
    (FilenameUtils/getFullPathNoEndSeparator filename)))

(defn *get-base-name
  "Gets the base name, minus the full path and extension, from a full filename.

   This method will handle a file in either Unix or Windows format.
   The text after the last forward or backslash and before the last dot is returned.


   a/b/c.txt --> c
   a.txt     --> a
   a/b/c     --> c
   a/b/c/    --> \"\"

   The output will be the same irrespective of the machine that the code is running on.

  filename - the filename to query, null returns null - `java.lang.String`

  returns: the name of the file without the path, or an empty string if none exists. Null bytes inside string
   will be removed - `java.lang.String`"
  (^java.lang.String [^java.lang.String filename]
    (FilenameUtils/getBaseName filename)))

(defn *separators-to-system
  "Converts all separators to the system separator.

  path - the path to be changed, null ignored - `java.lang.String`

  returns: the updated path - `java.lang.String`"
  (^java.lang.String [^java.lang.String path]
    (FilenameUtils/separatorsToSystem path)))

(defn *equals-normalized-on-system
  "Checks whether two filenames are equal after both have been normalized
   and using the case rules of the system.

   Both filenames are first passed to normalize(String).
   The check is then performed case-sensitive on Unix and
   case-insensitive on Windows.

  filename-1 - the first filename to query, may be null - `java.lang.String`
  filename-2 - the second filename to query, may be null - `java.lang.String`

  returns: true if the filenames are equal, null equals null - `boolean`"
  (^Boolean [^java.lang.String filename-1 ^java.lang.String filename-2]
    (FilenameUtils/equalsNormalizedOnSystem filename-1 filename-2)))

(defn *separators-to-unix
  "Converts all separators to the Unix separator of forward slash.

  path - the path to be changed, null ignored - `java.lang.String`

  returns: the updated path - `java.lang.String`"
  (^java.lang.String [^java.lang.String path]
    (FilenameUtils/separatorsToUnix path)))

(defn *get-extension
  "Gets the extension of a filename.

   This method returns the textual part of the filename after the last dot.
   There must be no directory separator after the dot.


   foo.txt      --> \"txt\"
   a/b/c.jpg    --> \"jpg\"
   a/b.txt/c    --> \"\"
   a/b/c        --> \"\"

   The output will be the same irrespective of the machine that the code is running on.

  filename - the filename to retrieve the extension of. - `java.lang.String`

  returns: the extension of the file or an empty string if none exists or null
   if the filename is null. - `java.lang.String`"
  (^java.lang.String [^java.lang.String filename]
    (FilenameUtils/getExtension filename)))

(defn *index-of-last-separator
  "Returns the index of the last directory separator character.

   This method will handle a file in either Unix or Windows format.
   The position of the last forward or backslash is returned.

   The output will be the same irrespective of the machine that the code is running on.

  filename - the filename to find the last path separator in, null returns -1 - `java.lang.String`

  returns: the index of the last separator character, or -1 if there
   is no such character - `int`"
  (^Integer [^java.lang.String filename]
    (FilenameUtils/indexOfLastSeparator filename)))

(defn *get-path
  "Gets the path from a full filename, which excludes the prefix.

   This method will handle a file in either Unix or Windows format.
   The method is entirely text based, and returns the text before and
   including the last forward or backslash.


   C:\\a\\b\\c.txt --> a\\b\\
   ~/a/b/c.txt  --> a/b/
   a.txt        --> \"\"
   a/b/c        --> a/b/
   a/b/c/       --> a/b/c/

   The output will be the same irrespective of the machine that the code is running on.

   This method drops the prefix from the result.
   See getFullPath(String) for the method that retains the prefix.

  filename - the filename to query, null returns null - `java.lang.String`

  returns: the path of the file, an empty string if none exists, null if invalid.
   Null bytes inside string will be removed - `java.lang.String`"
  (^java.lang.String [^java.lang.String filename]
    (FilenameUtils/getPath filename)))

(defn *get-name
  "Gets the name minus the path from a full filename.

   This method will handle a file in either Unix or Windows format.
   The text after the last forward or backslash is returned.


   a/b/c.txt --> c.txt
   a.txt     --> a.txt
   a/b/c     --> c
   a/b/c/    --> \"\"

   The output will be the same irrespective of the machine that the code is running on.

  filename - the filename to query, null returns null - `java.lang.String`

  returns: the name of the file without the path, or an empty string if none exists.
   Null bytes inside string will be removed - `java.lang.String`"
  (^java.lang.String [^java.lang.String filename]
    (FilenameUtils/getName filename)))

(defn *equals-on-system
  "Checks whether two filenames are equal using the case rules of the system.

   No processing is performed on the filenames other than comparison.
   The check is case-sensitive on Unix and case-insensitive on Windows.

  filename-1 - the first filename to query, may be null - `java.lang.String`
  filename-2 - the second filename to query, may be null - `java.lang.String`

  returns: true if the filenames are equal, null equals null - `boolean`"
  (^Boolean [^java.lang.String filename-1 ^java.lang.String filename-2]
    (FilenameUtils/equalsOnSystem filename-1 filename-2)))

(defn *wildcard-match-on-system
  "Checks a filename to see if it matches the specified wildcard matcher
   using the case rules of the system.

   The wildcard matcher uses the characters '?' and '*' to represent a
   single or multiple (zero or more) wildcard characters.
   This is the same as often found on Dos/Unix command lines.
   The check is case-sensitive on Unix and case-insensitive on Windows.


   wildcardMatch(\"c.txt\", \"*.txt\")      --> true
   wildcardMatch(\"c.txt\", \"*.jpg\")      --> false
   wildcardMatch(\"a/b/c.txt\", \"a/b/*\")  --> true
   wildcardMatch(\"c.txt\", \"*.???\")      --> true
   wildcardMatch(\"c.txt\", \"*.????\")     --> false
   N.B. the sequence \"*?\" does not work properly at present in match strings.

  filename - the filename to match on - `java.lang.String`
  wildcard-matcher - the wildcard string to match against - `java.lang.String`

  returns: true if the filename matches the wildcard string - `boolean`"
  (^Boolean [^java.lang.String filename ^java.lang.String wildcard-matcher]
    (FilenameUtils/wildcardMatchOnSystem filename wildcard-matcher)))

(defn *wildcard-match
  "Checks a filename to see if it matches the specified wildcard matcher
   allowing control over case-sensitivity.

   The wildcard matcher uses the characters '?' and '*' to represent a
   single or multiple (zero or more) wildcard characters.
   N.B. the sequence \"*?\" does not work properly at present in match strings.

  filename - the filename to match on - `java.lang.String`
  wildcard-matcher - the wildcard string to match against - `java.lang.String`
  case-sensitivity - what case sensitivity rule to use, null means case-sensitive - `org.apache.commons.io.IOCase`

  returns: true if the filename matches the wildcard string - `boolean`"
  (^Boolean [^java.lang.String filename ^java.lang.String wildcard-matcher ^org.apache.commons.io.IOCase case-sensitivity]
    (FilenameUtils/wildcardMatch filename wildcard-matcher case-sensitivity))
  (^Boolean [^java.lang.String filename ^java.lang.String wildcard-matcher]
    (FilenameUtils/wildcardMatch filename wildcard-matcher)))

(defn *concat
  "Concatenates a filename to a base path using normal command line style rules.

   The effect is equivalent to resultant directory after changing
   directory to the first argument, followed by changing directory to
   the second argument.

   The first argument is the base path, the second is the path to concatenate.
   The returned path is always normalized via normalize(String),
   thus .. is handled.

   If pathToAdd is absolute (has an absolute prefix), then
   it will be normalized and returned.
   Otherwise, the paths will be joined, normalized and returned.

   The output will be the same on both Unix and Windows except
   for the separator character.


   /foo/  bar          -->   /foo/bar
   /foo  bar           -->   /foo/bar
   /foo  /bar          -->   /bar
   /foo  C:/bar        -->   C:/bar
   /foo  C:bar         -->   C:bar (*)
   /foo/a/  ../bar     -->   foo/bar
   /foo/  ../../bar    -->   null
   /foo/  /bar         -->   /bar
   /foo/..  /bar       -->   /bar
   /foo  bar/c.txt     -->   /foo/bar/c.txt
   /foo/c.txt  bar     -->   /foo/c.txt/bar (!)
   (*) Note that the Windows relative drive prefix is unreliable when
   used with this method.
   (!) Note that the first parameter must be a path. If it ends with a name, then
   the name will be built into the concatenated path. If this might be a problem,
   use getFullPath(String) on the base path argument.

  base-path - the base path to attach to, always treated as a path - `java.lang.String`
  full-filename-to-add - the filename (or path) to attach to the base - `java.lang.String`

  returns: the concatenated path, or null if invalid.  Null bytes inside string will be removed - `java.lang.String`"
  (^java.lang.String [^java.lang.String base-path ^java.lang.String full-filename-to-add]
    (FilenameUtils/concat base-path full-filename-to-add)))

(defn *get-full-path
  "Gets the full path from a full filename, which is the prefix  path.

   This method will handle a file in either Unix or Windows format.
   The method is entirely text based, and returns the text before and
   including the last forward or backslash.


   C:\\a\\b\\c.txt --> C:\\a\\b\\
   ~/a/b/c.txt  --> ~/a/b/
   a.txt        --> \"\"
   a/b/c        --> a/b/
   a/b/c/       --> a/b/c/
   C:           --> C:
   C:\\          --> C:\\
   ~            --> ~/
   ~/           --> ~/
   ~user        --> ~user/
   ~user/       --> ~user/

   The output will be the same irrespective of the machine that the code is running on.

  filename - the filename to query, null returns null - `java.lang.String`

  returns: the path of the file, an empty string if none exists, null if invalid - `java.lang.String`"
  (^java.lang.String [^java.lang.String filename]
    (FilenameUtils/getFullPath filename)))

(defn *directory-contains
  "Determines whether the parent directory contains the child element (a file or directory).

   The files names are expected to be normalized.


   Edge cases:

   A directory must not be null: if null, throw IllegalArgumentException
   A directory does not contain itself: return false
   A null child file is not contained in any parent: return false

  canonical-parent - the file to consider as the parent. - `java.lang.String`
  canonical-child - the file to consider as the child. - `java.lang.String`

  returns: true is the candidate leaf is under by the specified composite. False otherwise. - `boolean`

  throws: java.io.IOException - if an IO error occurs while checking the files."
  (^Boolean [^java.lang.String canonical-parent ^java.lang.String canonical-child]
    (FilenameUtils/directoryContains canonical-parent canonical-child)))

(defn *index-of-extension
  "Returns the index of the last extension separator character, which is a dot.

   This method also checks that there is no directory separator after the last dot. To do this it uses
   indexOfLastSeparator(String) which will handle a file in either Unix or Windows format.


   The output will be the same irrespective of the machine that the code is running on.

  filename - the filename to find the last extension separator in, null returns -1 - `java.lang.String`

  returns: the index of the last extension separator character, or -1 if there is no such character - `int`"
  (^Integer [^java.lang.String filename]
    (FilenameUtils/indexOfExtension filename)))

(defn *get-prefix-length
  "Returns the length of the filename prefix, such as C:/ or ~/.

   This method will handle a file in either Unix or Windows format.

   The prefix length includes the first slash in the full filename
   if applicable. Thus, it is possible that the length returned is greater
   than the length of the input string.


   Windows:
   a\\b\\c.txt           --> \"\"          --> relative
   \\a\\b\\c.txt          --> \"\\\"         --> current drive absolute
   C:a\\b\\c.txt         --> \"C:\"        --> drive relative
   C:\\a\\b\\c.txt        --> \"C:\\\"       --> absolute
   \\\\server\\a\\b\\c.txt  --> \"\\\\server\\\" --> UNC
   \\\\\\a\\b\\c.txt        -->  error, length = -1

   Unix:
   a/b/c.txt           --> \"\"          --> relative
   /a/b/c.txt          --> \"/\"         --> absolute
   ~/a/b/c.txt         --> \"~/\"        --> current user
   ~                   --> \"~/\"        --> current user (slash added)
   ~user/a/b/c.txt     --> \"~user/\"    --> named user
   ~user               --> \"~user/\"    --> named user (slash added)
   //server/a/b/c.txt  --> \"//server/\"
   ///a/b/c.txt        --> error, length = -1

   The output will be the same irrespective of the machine that the code is running on.
   ie. both Unix and Windows prefixes are matched regardless.

   Note that a leading // (or \\\\) is used to indicate a UNC name on Windows.
   These must be followed by a server name, so double-slashes are not collapsed
   to a single slash at the start of the filename.

  filename - the filename to find the prefix in, null returns -1 - `java.lang.String`

  returns: the length of the prefix, -1 if invalid or null - `int`"
  (^Integer [^java.lang.String filename]
    (FilenameUtils/getPrefixLength filename)))

(defn *separators-to-windows
  "Converts all separators to the Windows separator of backslash.

  path - the path to be changed, null ignored - `java.lang.String`

  returns: the updated path - `java.lang.String`"
  (^java.lang.String [^java.lang.String path]
    (FilenameUtils/separatorsToWindows path)))

(defn *get-prefix
  "Gets the prefix from a full filename, such as C:/
   or ~/.

   This method will handle a file in either Unix or Windows format.
   The prefix includes the first slash in the full filename where applicable.


   Windows:
   a\\b\\c.txt           --> \"\"          --> relative
   \\a\\b\\c.txt          --> \"\\\"         --> current drive absolute
   C:a\\b\\c.txt         --> \"C:\"        --> drive relative
   C:\\a\\b\\c.txt        --> \"C:\\\"       --> absolute
   \\\\server\\a\\b\\c.txt  --> \"\\\\server\\\" --> UNC

   Unix:
   a/b/c.txt           --> \"\"          --> relative
   /a/b/c.txt          --> \"/\"         --> absolute
   ~/a/b/c.txt         --> \"~/\"        --> current user
   ~                   --> \"~/\"        --> current user (slash added)
   ~user/a/b/c.txt     --> \"~user/\"    --> named user
   ~user               --> \"~user/\"    --> named user (slash added)

   The output will be the same irrespective of the machine that the code is running on.
   ie. both Unix and Windows prefixes are matched regardless.

  filename - the filename to query, null returns null - `java.lang.String`

  returns: the prefix of the file, null if invalid. Null bytes inside string will be removed - `java.lang.String`"
  (^java.lang.String [^java.lang.String filename]
    (FilenameUtils/getPrefix filename)))

(defn *get-path-no-end-separator
  "Gets the path from a full filename, which excludes the prefix, and
   also excluding the final directory separator.

   This method will handle a file in either Unix or Windows format.
   The method is entirely text based, and returns the text before the
   last forward or backslash.


   C:\\a\\b\\c.txt --> a\\b
   ~/a/b/c.txt  --> a/b
   a.txt        --> \"\"
   a/b/c        --> a/b
   a/b/c/       --> a/b/c

   The output will be the same irrespective of the machine that the code is running on.

   This method drops the prefix from the result.
   See getFullPathNoEndSeparator(String) for the method that retains the prefix.

  filename - the filename to query, null returns null - `java.lang.String`

  returns: the path of the file, an empty string if none exists, null if invalid.
   Null bytes inside string will be removed - `java.lang.String`"
  (^java.lang.String [^java.lang.String filename]
    (FilenameUtils/getPathNoEndSeparator filename)))

(defn *equals
  "Checks whether two filenames are equal, optionally normalizing and providing
   control over the case-sensitivity.

  filename-1 - the first filename to query, may be null - `java.lang.String`
  filename-2 - the second filename to query, may be null - `java.lang.String`
  normalized - whether to normalize the filenames - `boolean`
  case-sensitivity - what case sensitivity rule to use, null means case-sensitive - `org.apache.commons.io.IOCase`

  returns: true if the filenames are equal, null equals null - `boolean`"
  (^Boolean [^java.lang.String filename-1 ^java.lang.String filename-2 ^Boolean normalized ^org.apache.commons.io.IOCase case-sensitivity]
    (FilenameUtils/equals filename-1 filename-2 normalized case-sensitivity))
  (^Boolean [^java.lang.String filename-1 ^java.lang.String filename-2]
    (FilenameUtils/equals filename-1 filename-2)))

(defn *equals-normalized
  "Checks whether two filenames are equal after both have been normalized.

   Both filenames are first passed to normalize(String).
   The check is then performed in a case-sensitive manner.

  filename-1 - the first filename to query, may be null - `java.lang.String`
  filename-2 - the second filename to query, may be null - `java.lang.String`

  returns: true if the filenames are equal, null equals null - `boolean`"
  (^Boolean [^java.lang.String filename-1 ^java.lang.String filename-2]
    (FilenameUtils/equalsNormalized filename-1 filename-2)))

