package consoleApplications;
class Resource {
    int i = 0;
    boolean Status = false;
    synchronized void put(int i) throws InterruptedException {
        while (Status) {
            wait();
        }
        this.i = i;
        System.out.println("PUT: " + i);

        Status = true;
        notify();
    }
    synchronized void get() throws InterruptedException {
        while (!Status) {
            wait();
        }
        System.out.println("GET: " + i);
        Status = false;
        notify();
    }
}
class Producer implements Runnable {
    Resource r;
    int i = 0;
    Producer(Resource r) {
        this.r = r;
    }
    public void run() {
        while (true) {
            try {
            	Thread.sleep(1000);
                r.put(++i);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}
class Consumer implements Runnable {
    Resource r;
    Consumer(Resource r) {
        this.r = r;
    }
    public void run() {  	
        while (true) {
            try {
            	Thread.sleep(1000);
                r.get();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}
public class ProducerConsumer {
    public static void main(String[] args) {
        Resource r = new Resource();

        Producer p = new Producer(r);
        Consumer c = new Consumer(r);

        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);

        t1.start();
        t2.start();
    }
}
