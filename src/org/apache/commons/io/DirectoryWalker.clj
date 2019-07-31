(ns org.apache.commons.io.DirectoryWalker
  "Abstract class that walks through a directory hierarchy and provides
  subclasses with convenient hooks to add specific behaviour.

  This class operates with a FileFilter and maximum depth to
  limit the files and directories visited.
  Commons IO supplies many common filter implementations in the
   filefilter package.

  The following sections describe:

       1. Example Implementation - example
           FileCleaner implementation.
       2. Filter Example - using
           FileFilter(s) with DirectoryWalker.
       3. Cancellation - how to implement cancellation
           behaviour.



  1. Example Implementation

  There are many possible extensions, for example, to delete all
  files and '.svn' directories, and return a list of deleted files:


   public class FileCleaner extends DirectoryWalker {

     public FileCleaner() {
       super();
     }

     public List clean(File startDirectory) {
       List results = new ArrayList();
       walk(startDirectory, results);
       return results;
     }

     protected boolean handleDirectory(File directory, int depth, Collection results) {
       // delete svn directories and then skip
       if (\".svn\".equals(directory.getName())) {
         directory.delete();
         return false;
       } else {
         return true;
       }

     }

     protected void handleFile(File file, int depth, Collection results) {
       // delete file and add to list of deleted
       file.delete();
       results.add(file);
     }
   }


  2. Filter Example

  Choosing which directories and files to process can be a key aspect
  of using this class. This information can be setup in three ways,
  via three different constructors.

  The first option is to visit all directories and files.
  This is achieved via the no-args constructor.

  The second constructor option is to supply a single FileFilter
  that describes the files and directories to visit. Care must be taken
  with this option as the same filter is used for both directories
  and files.

  For example, if you wanted all directories which are not hidden
  and files which end in \".txt\":


   public class FooDirectoryWalker extends DirectoryWalker {
     public FooDirectoryWalker(FileFilter filter) {
       super(filter, -1);
     }
   }

   // Build up the filters and create the walker
     // Create a filter for Non-hidden directories
     IOFileFilter fooDirFilter =
         FileFilterUtils.andFileFilter(FileFilterUtils.directoryFileFilter,
                                       HiddenFileFilter.VISIBLE);

     // Create a filter for Files ending in \".txt\"
     IOFileFilter fooFileFilter =
         FileFilterUtils.andFileFilter(FileFilterUtils.fileFileFilter,
                                       FileFilterUtils.suffixFileFilter(\".txt\"));

     // Combine the directory and file filters using an OR condition
     java.io.FileFilter fooFilter =
         FileFilterUtils.orFileFilter(fooDirFilter, fooFileFilter);

     // Use the filter to construct a DirectoryWalker implementation
     FooDirectoryWalker walker = new FooDirectoryWalker(fooFilter);

  The third constructor option is to specify separate filters, one for
  directories and one for files. These are combined internally to form
  the correct FileFilter, something which is very easy to
  get wrong when attempted manually, particularly when trying to
  express constructs like 'any file in directories named docs'.

  For example, if you wanted all directories which are not hidden
  and files which end in \".txt\":


   public class FooDirectoryWalker extends DirectoryWalker {
     public FooDirectoryWalker(IOFileFilter dirFilter, IOFileFilter fileFilter) {
       super(dirFilter, fileFilter, -1);
     }
   }

   // Use the filters to construct the walker
   FooDirectoryWalker walker = new FooDirectoryWalker(
     HiddenFileFilter.VISIBLE,
     FileFilterUtils.suffixFileFilter(\".txt\"),
   );
  This is much simpler than the previous example, and is why it is the preferred
  option for filtering.


  3. Cancellation

  The DirectoryWalker contains some of the logic required for cancel processing.
  Subclasses must complete the implementation.

  What DirectoryWalker does provide for cancellation is:

     DirectoryWalker.CancelException which can be thrown in any of the
         lifecycle methods to stop processing.
     The walk() method traps thrown DirectoryWalker.CancelException
         and calls the handleCancelled() method, providing
         a place for custom cancel processing.


  Implementations need to provide:

     The decision logic on whether to cancel processing or not.
     Constructing and throwing a DirectoryWalker.CancelException.
     Custom cancel processing in the handleCancelled() method.


  Two possible scenarios are envisaged for cancellation:

     3.1 External / Multi-threaded - cancellation being
         decided/initiated by an external process.
     3.2 Internal - cancellation being decided/initiated
         from within a DirectoryWalker implementation.


  The following sections provide example implementations for these two different
  scenarios.


  3.1 External / Multi-threaded

  This example provides a public cancel() method that can be
  called by another thread to stop the processing. A typical example use-case
  would be a cancel button on a GUI. Calling this method sets a

  volatile flag to ensure it will work properly in a multi-threaded environment.
  The flag is returned by the handleIsCancelled() method, which
  will cause the walk to stop immediately. The handleCancelled()
  method will be the next, and last, callback method received once cancellation
  has occurred.



   public class FooDirectoryWalker extends DirectoryWalker {

     private volatile boolean cancelled = false;

     public void cancel() {
         cancelled = true;
     }

     protected boolean handleIsCancelled(File file, int depth, Collection results) {
         return cancelled;
     }

     protected void handleCancelled(File startDirectory, Collection results, CancelException cancel) {
         // implement processing required when a cancellation occurs
     }
   }


  3.2 Internal

  This shows an example of how internal cancellation processing could be implemented.
  Note the decision logic and throwing a DirectoryWalker.CancelException could be implemented
  in any of the lifecycle methods.



   public class BarDirectoryWalker extends DirectoryWalker {

     protected boolean handleDirectory(File directory, int depth, Collection results) throws IOException {
         // cancel if hidden directory
         if (directory.isHidden()) {
             throw new CancelException(file, depth);
         }
         return true;
     }

     protected void handleFile(File file, int depth, Collection results) throws IOException {
         // cancel if read-only file
         if (!file.canWrite()) {
             throw new CancelException(file, depth);
         }
         results.add(file);
     }

     protected void handleCancelled(File startDirectory, Collection results, CancelException cancel) {
         // implement processing required when a cancellation occurs
     }
   }"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io DirectoryWalker]))

