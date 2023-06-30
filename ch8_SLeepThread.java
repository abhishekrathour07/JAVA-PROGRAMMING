class SleepMethod1 extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        SleepMethod1 t1 = new SleepMethod1();
        SleepMethod1 t2 = new SleepMethod1();

        t1.start();
        t2.start();
    }
}