package pipe_stream_inter_thread;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStreamExample {

    public static void main(String[] args) {
        // Create PipedOutputStream and PipedInputStream
        PipedOutputStream pipedOutputStream = new PipedOutputStream();
        PipedInputStream pipedInputStream = new PipedInputStream();

        try {
            // Connect the piped output stream to the piped input stream
            pipedInputStream.connect(pipedOutputStream);
        } catch (IOException e) {
            System.out.println("Error while connecting pipes: " + e.getMessage());
            return;
        }

        // Create and start the writer thread
        Thread writerThread = new Thread(new Writer(pipedOutputStream));
        writerThread.start();

        // Create and start the reader thread
        Thread readerThread = new Thread(new Reader(pipedInputStream));
        readerThread.start();
    }

    // Writer class implements Runnable to write data to the pipe
    static class Writer implements Runnable {
        private PipedOutputStream out;

        public Writer(PipedOutputStream out) {
            this.out = out;
        }

        @Override
        public void run() {
            try {
                for (int i = 1; i <= 5; i++) {
                    // Write data to the piped output stream
                    out.write(("Message " + i).getBytes());
                    System.out.println("Written: Message " + i);
                    Thread.sleep(1000); // Simulate time taken to produce data
                }
                out.close();
            } catch (IOException | InterruptedException e) {
                System.out.println("Error in writer: " + e.getMessage());
            }
        }
    }

    // Reader class implements Runnable to read data from the pipe
    static class Reader implements Runnable {
        private PipedInputStream in;

        public Reader(PipedInputStream in) {
            this.in = in;
        }

        @Override
        public void run() {
            try {
                int data;
                while ((data = in.read()) != -1) {
                    // Read data from the piped input stream
                    System.out.print((char) data);
                }
                in.close();
            } catch (IOException e) {
                System.out.println("Error in reader: " + e.getMessage());
            }
        }
    }
}