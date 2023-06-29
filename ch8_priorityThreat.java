class MyThread1 extends Thread {
    MyThread1(String name) {
        super(name);
    }

    public void run() {
        int i =0;
        while(i<1000)
        System.out.println("name = " + getName());
        i++;
    }
}

public class ch8_priorityThreat {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1("Pablu Yadav");
        MyThread1 t2 = new MyThread1("jhatu");
        MyThread1 t3 = new MyThread1("Backbenchers");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
