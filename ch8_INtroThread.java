class thread1 extends Thread {
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("This is demo class ");
            i++;
        }
    }
}

class thread2 extends Thread {
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("This is demo class with some knowledge");
            i++;
        }
    }
}

public class ch8_INtroThread {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        t1.start();
        t2.start();

    }

}