(ns org.apache.commons.io.input.Tailer
  "Simple implementation of the unix \"tail -f\" functionality.

  1. Create a TailerListener implementation

  First you need to create a TailerListener implementation
  (TailerListenerAdapter is provided for convenience so that you don't have to
  implement every method).


  For example:


   public class MyTailerListener extends TailerListenerAdapter {
       public void handle(String line) {
           System.out.println(line);
       }
   }

  2. Using a Tailer


  You can create and use a Tailer in one of three ways:


    Using one of the static helper methods:

        create(File, TailerListener)
        create(File, TailerListener, long)
        create(File, TailerListener, long, boolean)


    Using an Executor
    Using an Thread



  An example of each of these is shown below.


  2.1 Using the static helper method



       TailerListener listener = new MyTailerListener();
       Tailer tailer = Tailer.create(file, listener, delay);

  2.2 Using an Executor



       TailerListener listener = new MyTailerListener();
       Tailer tailer = new Tailer(file, listener, delay);

       // stupid executor impl. for demo purposes
       Executor executor = new Executor() {
           public void execute(Runnable command) {
               command.run();
            }
       };

       executor.execute(tailer);


  2.3 Using a Thread


       TailerListener listener = new MyTailerListener();
       Tailer tailer = new Tailer(file, listener, delay);
       Thread thread = new Thread(tailer);
       thread.setDaemon(true); // optional
       thread.start();

  3. Stopping a Tailer
  Remember to stop the tailer when you have done with it:


       tailer.stop();

  4. Interrupting a Tailer
  You can interrupt the thread a tailer is running on by calling Thread.interrupt().


       thread.interrupt();
  If you interrupt a tailer, the tailer listener is called with the InterruptedException.

  The file is read using the default charset; this can be overridden if necessary"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.io.input Tailer]))

(defn ->tailer
  "Constructor.

  Creates a Tailer for the given file, with a specified buffer size.

  file - the file to follow. - `java.io.File`
  cset - the Charset to be used for reading the file - `java.nio.charset.Charset`
  listener - the TailerListener to use. - `org.apache.commons.io.input.TailerListener`
  delay-millis - the delay between checks of the file for new content in milliseconds. - `long`
  end - Set to true to tail from the end of the file, false to tail from the beginning of the file. - `boolean`
  re-open - if true, close and reopen the file between reading chunks - `boolean`
  buf-size - Buffer size - `int`"
  (^Tailer [^java.io.File file ^java.nio.charset.Charset cset ^org.apache.commons.io.input.TailerListener listener ^Long delay-millis ^Boolean end ^Boolean re-open ^Integer buf-size]
    (new Tailer file cset listener delay-millis end re-open buf-size))
  (^Tailer [^java.io.File file ^org.apache.commons.io.input.TailerListener listener ^Long delay-millis ^Boolean end ^Boolean re-open ^Integer buf-size]
    (new Tailer file listener delay-millis end re-open buf-size))
  (^Tailer [^java.io.File file ^org.apache.commons.io.input.TailerListener listener ^Long delay-millis ^Boolean end ^Boolean re-open]
    (new Tailer file listener delay-millis end re-open))
  (^Tailer [^java.io.File file ^org.apache.commons.io.input.TailerListener listener ^Long delay-millis ^Boolean end]
    (new Tailer file listener delay-millis end))
  (^Tailer [^java.io.File file ^org.apache.commons.io.input.TailerListener listener ^Long delay-millis]
    (new Tailer file listener delay-millis))
  (^Tailer [^java.io.File file ^org.apache.commons.io.input.TailerListener listener]
    (new Tailer file listener)))

(defn *create
  "Creates and starts a Tailer for the given file.

  file - the file to follow. - `java.io.File`
  charset - the character set to use for reading the file - `java.nio.charset.Charset`
  listener - the TailerListener to use. - `org.apache.commons.io.input.TailerListener`
  delay-millis - the delay between checks of the file for new content in milliseconds. - `long`
  end - Set to true to tail from the end of the file, false to tail from the beginning of the file. - `boolean`
  re-open - whether to close/reopen the file between chunks - `boolean`
  buf-size - buffer size. - `int`

  returns: The new tailer - `org.apache.commons.io.input.Tailer`"
  (^org.apache.commons.io.input.Tailer [^java.io.File file ^java.nio.charset.Charset charset ^org.apache.commons.io.input.TailerListener listener ^Long delay-millis ^Boolean end ^Boolean re-open ^Integer buf-size]
    (Tailer/create file charset listener delay-millis end re-open buf-size))
  (^org.apache.commons.io.input.Tailer [^java.io.File file ^org.apache.commons.io.input.TailerListener listener ^Long delay-millis ^Boolean end ^Boolean re-open ^Integer buf-size]
    (Tailer/create file listener delay-millis end re-open buf-size))
  (^org.apache.commons.io.input.Tailer [^java.io.File file ^org.apache.commons.io.input.TailerListener listener ^Long delay-millis ^Boolean end ^Integer buf-size]
    (Tailer/create file listener delay-millis end buf-size))
  (^org.apache.commons.io.input.Tailer [^java.io.File file ^org.apache.commons.io.input.TailerListener listener ^Long delay-millis ^Boolean end]
    (Tailer/create file listener delay-millis end))
  (^org.apache.commons.io.input.Tailer [^java.io.File file ^org.apache.commons.io.input.TailerListener listener ^Long delay-millis]
    (Tailer/create file listener delay-millis))
  (^org.apache.commons.io.input.Tailer [^java.io.File file ^org.apache.commons.io.input.TailerListener listener]
    (Tailer/create file listener)))

(defn get-file
  "Return the file.

  returns: the file - `java.io.File`"
  (^java.io.File [^Tailer this]
    (-> this (.getFile))))

(defn get-delay
  "Return the delay in milliseconds.

  returns: the delay in milliseconds. - `long`"
  (^Long [^Tailer this]
    (-> this (.getDelay))))

(defn run
  "Follows changes in the file, calling the TailerListener's handle method for each new line."
  ([^Tailer this]
    (-> this (.run))))

(defn stop
  "Allows the tailer to complete its current loop and return."
  ([^Tailer this]
    (-> this (.stop))))

