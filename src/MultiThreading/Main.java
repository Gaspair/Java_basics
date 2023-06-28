package MultiThreading;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable runnable1 = new MyRunnable();
        Thread thread1 = new Thread(runnable1);

        MyThread thread2 = new MyThread();
        thread1.start();
//        thread1.join(3000);
        thread2.start();
    }
}
