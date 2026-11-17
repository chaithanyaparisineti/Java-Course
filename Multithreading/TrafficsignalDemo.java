package Multithreading;

class TrafficSignal extends Thread {

    public void run() {

        try {
            while (true) {
                // Red Signal
                System.out.println("RED LIGHT - STOP");
                Thread.sleep(5000);

                // Yellow Signal
                System.out.println("YELLOW LIGHT - WAIT");
                Thread.sleep(2000);

                // Green Signal
                System.out.println("GREEN LIGHT - GO");
                Thread.sleep(5000);
            }

        } catch (InterruptedException e) {
            System.out.println("Traffic signal interrupted");
        }
    }
}

public class TrafficsignalDemo {

    public static void main(String[] args) {

        TrafficSignal signal = new TrafficSignal();

        signal.start();
    }
}
