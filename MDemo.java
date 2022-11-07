class Thread1 extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                System.out.println("thread-1 is Running...");
                // System.out.println("Dept of CSE");
                // Thread.sleep(5000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                System.out.println("thread-2 is Running...");
                // System.out.println("Jain University");
                // Thread.sleep(11000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class MDemo {
    public static void main(String args[]) {
        Thread1 t1 = new Thread1();
        Thread t2 = new Thread2();
        t1.start();
        t2.start();
    }
}
