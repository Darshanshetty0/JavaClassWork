//7B

package Multiple_Inheritance_and_Interfaces;

class Thread1 extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("thread-1 is running...");
                System.out.println("Dept Of CSE");
                Thread.sleep(5000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("thread-2 is running...");
                System.out.println("Jain University!");
                Thread.sleep(11000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class MDemo {

    public static void main(String args[]) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }

}