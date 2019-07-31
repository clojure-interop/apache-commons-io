(ns org.apache.commons.io.input.MessageDigestCalculatingInputStream$MessageDigestMaintainingObserver
  "Maintains the message digest."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.input MessageDigestCalculatingInputStream$MessageDigestMaintainingObserver]))

(defn ->message-digest-maintaining-observer
  "Constructor.

  Creates an MessageDigestMaintainingObserver for the given MessageDigest.

  p-md - the message digest to use - `java.security.MessageDigest`"
  (^MessageDigestCalculatingInputStream$MessageDigestMaintainingObserver [^java.security.MessageDigest p-md]
    (new MessageDigestCalculatingInputStream$MessageDigestMaintainingObserver p-md)))

