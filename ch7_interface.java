interface camera {
    void takingpic();

    void msgwhiletaking();

}

class inter implements camera {

    @Override
    public void takingpic() {
        System.out.println("I am taking picture ");
    }

    @Override
    public void msgwhiletaking() {
        System.out.println("Smile please...");

    }

}

public class ch7_interface {
    public static void main(String[] args) {
        inter s = new inter();
        s.takingpic();
        s.msgwhiletaking();
       
    }

}
