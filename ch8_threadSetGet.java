public class ch8_threadSetGet extends Thread {

    public void run() {
        System.out.println("running...");
    }

    public static void main(String args[]) {
        ch8_threadSetGet t1 = new ch8_threadSetGet();
        ch8_threadSetGet t2 = new ch8_threadSetGet();

        t1.start();
        t2.start();

        t1.setName("SetAbhishek");
        t2.setName("GetABhishek");

        System.out.println("After changing name of t1: " + t1.getName());
        System.out.println("After changing name of t2: " + t2.getName());
    }

}
