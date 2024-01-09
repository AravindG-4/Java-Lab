class Main extends Thread {
    static int i = 1;
    public void run() {
        System.out.println("From thread : " +  i);
        i+=1;
    }
}

class prob2 {
    public static void main(String[] args) {
        Main thread1 = new Main();
        Main thread2 = new Main();
        Main thread3 = new Main();
        thread1.start();
        thread2.start();
        thread3.start();
    }
};