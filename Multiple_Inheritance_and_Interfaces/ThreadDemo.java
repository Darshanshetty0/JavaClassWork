package Multiple_Inheritance_and_Interfaces;

class MyThread1 extends Thread {
    public void run() {

        for (int i = 0; i < 10; i++)
            System.out.println("Child Thread");
    }
}

public class ThreadDemo {

    public static void main(String args[]) {
        MyThread1 t = new MyThread1();
        t.start();
        for (int i = 0; i < 10; i++)
            System.out.println("Main Thread");
    }

}