class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

    class RunnableExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable(), "Thread-A");
        Thread t2 = new Thread(new MyRunnable(), "Thread-B");

        t1.start();
        t2.start();
    }
}
