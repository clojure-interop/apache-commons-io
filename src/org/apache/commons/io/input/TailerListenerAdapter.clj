(ns org.apache.commons.io.input.TailerListenerAdapter
  "TailerListener Adapter."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.input TailerListenerAdapter]))

(defn ->tailer-listener-adapter
  "Constructor."
  (^TailerListenerAdapter []
    (new TailerListenerAdapter )))

(defn init
  "The tailer will call this method during construction,
   giving the listener a method of stopping the tailer.

  tailer - the tailer. - `org.apache.commons.io.input.Tailer`"
  ([^TailerListenerAdapter this ^org.apache.commons.io.input.Tailer tailer]
    (-> this (.init tailer))))

(defn file-not-found
  "This method is called if the tailed file is not found."
  ([^TailerListenerAdapter this]
    (-> this (.fileNotFound))))

(defn file-rotated
  "Called if a file rotation is detected.

   This method is called before the file is reopened, and fileNotFound may
   be called if the new file has not yet been created."
  ([^TailerListenerAdapter this]
    (-> this (.fileRotated))))

(defn handle
  "Handles a line from a Tailer.

  line - the line. - `java.lang.String`"
  ([^TailerListenerAdapter this ^java.lang.String line]
    (-> this (.handle line))))

(defn end-of-file-reached
  "Called each time the Tailer reaches the end of the file.

   Note: this is called from the tailer thread.

   Note: a future version of commons-io will pull this method up to the TailerListener interface,
   for now clients must subclass this class to use this feature."
  ([^TailerListenerAdapter this]
    (-> this (.endOfFileReached))))

