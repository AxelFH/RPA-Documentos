package org.rpa;

import java.io.IOException;

public class KeyPress {

    // Inner class to handle key press listening
    static class KeyPressListener extends Thread {
        private volatile boolean running = true;

        @Override
        public void run() {
            try {
                while (running) {
                    int key = System.in.read();
                    if (key == 'q' || key == 'Q') {  // Change this to your desired key
                        running = false;
                        System.out.println("Key pressed. Stopping the application.");
                        System.exit(1);  // Exit the application
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public boolean isRunning() {
            return running;
        }

        public void stopListening() {
            running = false;
        }
    }
}