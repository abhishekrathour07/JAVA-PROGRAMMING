class Myrunner1 implements Runnable {

    @Override
    public void run() {
        int i = 0;
        while (i < 400) {
            System.out.println("This is Bca  department");
            i++;
        }
    }

}

class Myrunner2 implements Runnable {

    @Override
    public void run() {
        int i = 0;
        while (i < 400) {
            System.out.println("This is Polytecnic department");
            i++;
        }
    }

}

public class ch8_IntroRunner {
    public static void main(String[] args) {
        Myrunner1 bullet1 = new Myrunner1();
        Thread gun1 = new Thread(bullet1);
        Myrunner2 bullet2 = new Myrunner2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();

    }

}
