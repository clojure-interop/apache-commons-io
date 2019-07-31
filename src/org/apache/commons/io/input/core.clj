(ns org.apache.commons.io.input.core
  (:refer-clojure :only [require comment defn ->])
  (:import ))

(require '[org.apache.commons.io.input.AutoCloseInputStream])
(require '[org.apache.commons.io.input.BOMInputStream])
(require '[org.apache.commons.io.input.BoundedInputStream])
(require '[org.apache.commons.io.input.BoundedReader])
(require '[org.apache.commons.io.input.BrokenInputStream])
(require '[org.apache.commons.io.input.CharSequenceInputStream])
(require '[org.apache.commons.io.input.CharSequenceReader])
(require '[org.apache.commons.io.input.ClassLoaderObjectInputStream])
(require '[org.apache.commons.io.input.CloseShieldInputStream])
(require '[org.apache.commons.io.input.ClosedInputStream])
(require '[org.apache.commons.io.input.CountingInputStream])
(require '[org.apache.commons.io.input.DemuxInputStream])
(require '[org.apache.commons.io.input.InfiniteCircularInputStream])
(require '[org.apache.commons.io.input.MessageDigestCalculatingInputStream$MessageDigestMaintainingObserver])
(require '[org.apache.commons.io.input.MessageDigestCalculatingInputStream])
(require '[org.apache.commons.io.input.NullInputStream])
(require '[org.apache.commons.io.input.NullReader])
(require '[org.apache.commons.io.input.ObservableInputStream$Observer])
(require '[org.apache.commons.io.input.ObservableInputStream])
(require '[org.apache.commons.io.input.ProxyInputStream])
(require '[org.apache.commons.io.input.ProxyReader])
(require '[org.apache.commons.io.input.ReaderInputStream])
(require '[org.apache.commons.io.input.ReversedLinesFileReader])
(require '[org.apache.commons.io.input.SwappedDataInputStream])
(require '[org.apache.commons.io.input.TaggedInputStream])
(require '[org.apache.commons.io.input.Tailer])
(require '[org.apache.commons.io.input.TailerListener])
(require '[org.apache.commons.io.input.TailerListenerAdapter])
(require '[org.apache.commons.io.input.TeeInputStream])
(require '[org.apache.commons.io.input.UnixLineEndingInputStream])
(require '[org.apache.commons.io.input.WindowsLineEndingInputStream])
(require '[org.apache.commons.io.input.XmlStreamReader])
(require '[org.apache.commons.io.input.XmlStreamReaderException])