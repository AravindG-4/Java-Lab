class Main extends Thread {
    public void run() {
        System.out.println("From thread 1");
    }
}

class Main1 implements Runnable {
    public void run() {
        System.out.println("From thread 2");
    }
}

class prob1 {
    public static void main(String[] args) {
        Thread thread1 = new Main();
        Thread thread2 = new Thread(new Main1());
        thread1.start();
        thread2.start();
    }
};