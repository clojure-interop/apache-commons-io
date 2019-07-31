(ns org.apache.commons.io.input.TailerListener
  "Listener for events from a Tailer."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.input TailerListener]))

(defn init
  "The tailer will call this method during construction,
   giving the listener a method of stopping the tailer.

  tailer - the tailer. - `org.apache.commons.io.input.Tailer`"
  ([^TailerListener this ^org.apache.commons.io.input.Tailer tailer]
    (-> this (.init tailer))))

(defn file-not-found
  "This method is called if the tailed file is not found.

   Note: this is called from the tailer thread."
  ([^TailerListener this]
    (-> this (.fileNotFound))))

(defn file-rotated
  "Called if a file rotation is detected.

   This method is called before the file is reopened, and fileNotFound may
   be called if the new file has not yet been created.

   Note: this is called from the tailer thread."
  ([^TailerListener this]
    (-> this (.fileRotated))))

(defn handle
  "Handles a line from a Tailer.

   Note: this is called from the tailer thread.

  line - the line. - `java.lang.String`"
  ([^TailerListener this ^java.lang.String line]
    (-> this (.handle line))))

