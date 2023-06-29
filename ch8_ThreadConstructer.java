class MyThread extends Thread {
    MyThread(String name) {
        super(name);
    }

    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("CLASSES Everywhere");
            i++;
        }
    }
}

public class ch8_ThreadConstructer {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Pablu Yadav");
        MyThread t2 = new MyThread("jhatu");
        MyThread t3 = new MyThread("Backbenchers");
        t1.start();
        t2.start();
        t3.start();
        System.out.println("The name of t1 is " + t1.getName());
        System.out.println("The name of t2 is " + t2.getName());
        System.out.println("The name of t3 is " + t3.getName());
        System.out.println("The id of t1 is " + t1.threadId());
        System.out.println("The id of t2 is " + t2.threadId());
        System.out.println("The id of t3 is " + t3.threadId());
      
    }
}
