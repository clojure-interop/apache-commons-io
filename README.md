# Apache Commons IO Bindings for Clojure.

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/apache-commons-io "1.0.0"]
```

## Class Members Naming Conventions

| Class Member | Java | Clojure |
|:--|:--|:--|
| constructor | new File() | (->file) |
| instance method | getAnyValue() | (get-any-value) |
| instance field | instanceField | (-instance-field) |
| static method | staticMethod() | (*static-method) |
| static field | ANY_STATIC_FIELD | (*-any-static-field) |
| boolean field/method | isExists(), canUse() | (exists?), (can-use?) |

## Classes

- class **org.apache.commons.io.ByteOrderMark**
- class **org.apache.commons.io.ByteOrderParser**
- class **org.apache.commons.io.Charsets**
- class **org.apache.commons.io.CopyUtils**
- class **org.apache.commons.io.DirectoryWalker$CancelException**
- class **org.apache.commons.io.DirectoryWalker**
- class **org.apache.commons.io.EndianUtils**
- class **org.apache.commons.io.FileCleaner**
- class **org.apache.commons.io.FileCleaningTracker**
- class **org.apache.commons.io.FileDeleteStrategy**
- class **org.apache.commons.io.FileExistsException**
- class **org.apache.commons.io.FileSystemUtils**
- class **org.apache.commons.io.FileUtils**
- class **org.apache.commons.io.FilenameUtils**
- class **org.apache.commons.io.HexDump**
- enum **org.apache.commons.io.IOCase**
- class **org.apache.commons.io.IOExceptionWithCause**
- class **org.apache.commons.io.IOUtils**
- class **org.apache.commons.io.LineIterator**
- class **org.apache.commons.io.TaggedIOException**
- class **org.apache.commons.io.comparator.CompositeFileComparator**
- class **org.apache.commons.io.comparator.DefaultFileComparator**
- class **org.apache.commons.io.comparator.DirectoryFileComparator**
- class **org.apache.commons.io.comparator.ExtensionFileComparator**
- class **org.apache.commons.io.comparator.LastModifiedFileComparator**
- class **org.apache.commons.io.comparator.NameFileComparator**
- class **org.apache.commons.io.comparator.PathFileComparator**
- class **org.apache.commons.io.comparator.SizeFileComparator**
- class **org.apache.commons.io.filefilter.AbstractFileFilter**
- class **org.apache.commons.io.filefilter.AgeFileFilter**
- class **org.apache.commons.io.filefilter.AndFileFilter**
- class **org.apache.commons.io.filefilter.CanReadFileFilter**
- class **org.apache.commons.io.filefilter.CanWriteFileFilter**
- interface **org.apache.commons.io.filefilter.ConditionalFileFilter**
- class **org.apache.commons.io.filefilter.DelegateFileFilter**
- class **org.apache.commons.io.filefilter.DirectoryFileFilter**
- class **org.apache.commons.io.filefilter.EmptyFileFilter**
- class **org.apache.commons.io.filefilter.FalseFileFilter**
- class **org.apache.commons.io.filefilter.FileFileFilter**
- class **org.apache.commons.io.filefilter.FileFilterUtils**
- class **org.apache.commons.io.filefilter.HiddenFileFilter**
- interface **org.apache.commons.io.filefilter.IOFileFilter**
- class **org.apache.commons.io.filefilter.MagicNumberFileFilter**
- class **org.apache.commons.io.filefilter.NameFileFilter**
- class **org.apache.commons.io.filefilter.NotFileFilter**
- class **org.apache.commons.io.filefilter.OrFileFilter**
- class **org.apache.commons.io.filefilter.PrefixFileFilter**
- class **org.apache.commons.io.filefilter.RegexFileFilter**
- class **org.apache.commons.io.filefilter.SizeFileFilter**
- class **org.apache.commons.io.filefilter.SuffixFileFilter**
- class **org.apache.commons.io.filefilter.TrueFileFilter**
- class **org.apache.commons.io.filefilter.WildcardFileFilter**
- class **org.apache.commons.io.filefilter.WildcardFilter**
- class **org.apache.commons.io.input.AutoCloseInputStream**
- class **org.apache.commons.io.input.BOMInputStream**
- class **org.apache.commons.io.input.BoundedInputStream**
- class **org.apache.commons.io.input.BoundedReader**
- class **org.apache.commons.io.input.BrokenInputStream**
- class **org.apache.commons.io.input.CharSequenceInputStream**
- class **org.apache.commons.io.input.CharSequenceReader**
- class **org.apache.commons.io.input.ClassLoaderObjectInputStream**
- class **org.apache.commons.io.input.CloseShieldInputStream**
- class **org.apache.commons.io.input.ClosedInputStream**
- class **org.apache.commons.io.input.CountingInputStream**
- class **org.apache.commons.io.input.DemuxInputStream**
- class **org.apache.commons.io.input.InfiniteCircularInputStream**
- class **org.apache.commons.io.input.MessageDigestCalculatingInputStream$MessageDigestMaintainingObserver**
- class **org.apache.commons.io.input.MessageDigestCalculatingInputStream**
- class **org.apache.commons.io.input.NullInputStream**
- class **org.apache.commons.io.input.NullReader**
- class **org.apache.commons.io.input.ObservableInputStream$Observer**
- class **org.apache.commons.io.input.ObservableInputStream**
- class **org.apache.commons.io.input.ProxyInputStream**
- class **org.apache.commons.io.input.ProxyReader**
- class **org.apache.commons.io.input.ReaderInputStream**
- class **org.apache.commons.io.input.ReversedLinesFileReader**
- class **org.apache.commons.io.input.SwappedDataInputStream**
- class **org.apache.commons.io.input.TaggedInputStream**
- class **org.apache.commons.io.input.Tailer**
- interface **org.apache.commons.io.input.TailerListener**
- class **org.apache.commons.io.input.TailerListenerAdapter**
- class **org.apache.commons.io.input.TeeInputStream**
- class **org.apache.commons.io.input.UnixLineEndingInputStream**
- class **org.apache.commons.io.input.WindowsLineEndingInputStream**
- class **org.apache.commons.io.input.XmlStreamReader**
- class **org.apache.commons.io.input.XmlStreamReaderException**
- interface **org.apache.commons.io.monitor.FileAlterationListener**
- class **org.apache.commons.io.monitor.FileAlterationListenerAdaptor**
- class **org.apache.commons.io.monitor.FileAlterationMonitor**
- class **org.apache.commons.io.monitor.FileAlterationObserver**
- class **org.apache.commons.io.monitor.FileEntry**
- class **org.apache.commons.io.output.AppendableOutputStream**
- class **org.apache.commons.io.output.BrokenOutputStream**
- class **org.apache.commons.io.output.ByteArrayOutputStream**
- class **org.apache.commons.io.output.ChunkedOutputStream**
- class **org.apache.commons.io.output.ChunkedWriter**
- class **org.apache.commons.io.output.CloseShieldOutputStream**
- class **org.apache.commons.io.output.ClosedOutputStream**
- class **org.apache.commons.io.output.CountingOutputStream**
- class **org.apache.commons.io.output.DeferredFileOutputStream**
- class **org.apache.commons.io.output.DemuxOutputStream**
- class **org.apache.commons.io.output.FileWriterWithEncoding**
- class **org.apache.commons.io.output.LockableFileWriter**
- class **org.apache.commons.io.output.NullOutputStream**
- class **org.apache.commons.io.output.NullWriter**
- class **org.apache.commons.io.output.ProxyOutputStream**
- class **org.apache.commons.io.output.ProxyWriter**
- class **org.apache.commons.io.output.StringBuilderWriter**
- class **org.apache.commons.io.output.TaggedOutputStream**
- class **org.apache.commons.io.output.TeeOutputStream**
- class **org.apache.commons.io.output.ThresholdingOutputStream**
- class **org.apache.commons.io.output.WriterOutputStream**
- class **org.apache.commons.io.output.XmlStreamWriter**
- interface **org.apache.commons.io.serialization.ClassNameMatcher**
- class **org.apache.commons.io.serialization.ValidatingObjectInputStream**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
