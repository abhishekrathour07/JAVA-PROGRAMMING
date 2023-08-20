import java.util.Random;

interface facebook {
    void feed();

    void messenger();

}

interface snapchat {
    void newSnap();

    void massage();

    void disappear();

}

interface watsapp {
    void chats();

    void status();

}

class Rand {
    void displaymsg() {
        String[] messages = {
                "hey",
                "How are you?",
                " where r u",
                ".Goodbye!",
                "Ram Ram bhiayo !"
        };

        Random random = new Random();

        int randomIndex = random.nextInt(messages.length);

        String randomMessage = messages[randomIndex];

        System.out.println(randomMessage);
    }
}

class Rand2 extends Rand implements facebook, snapchat, watsapp {
    public void feed() {
        System.out.println("Slide to new post");
    }

    public void messenger() {
        System.out.println("new massage on massanger");
        super.displaymsg();

    }

    public void newSnap() {
        System.out.println("YOu have a new Snap");
    }

    public void massage() {
        System.out.println("new massage");
        super.displaymsg();

    }

    public void disappear() {
        System.out.println("Massage dissapper immediately");
    }

    public void chats() {
        System.out.println("new massage on watsapp");
        super.displaymsg();
    }

    public void status() {
        System.out.println("Uploaded a new status ");

    }

}

public class ch7_interfaceInherit {
    public static void main(String[] args) {
        Rand2 r = new Rand2();
        r.chats();
        r.messenger();
        r.disappear();
        r.massage();
    }

}
