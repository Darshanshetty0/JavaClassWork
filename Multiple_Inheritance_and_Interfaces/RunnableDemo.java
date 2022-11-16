package Multiple_Inheritance_and_Interfaces;

class MyThread2 implements Runnable {
    public void run() {

        for (int i = 0; i < 10; i++)
            System.out.println("Runnable Child thread ");
    }

}

public class RunnableDemo {

    public static void main(String args[]) {
        MyThread2 m1 = new MyThread2();
        Thread t1 = new Thread(m1);
        t1.start();
        for (int i = 0; i < 10; i++)
            System.out.println("Runnable Main Thread");
    }

}
