import java.awt.*;

public class ch0_PartB3 {
    public static void main(String[] args) {
        Frame fm = new Frame();
        fm.setTitle("My First Frame");
        Label lb = new Label("Welcome to GUI Programming");
        fm.add(lb);
        fm.setSize(300, 300);
        fm.setVisible(true);

    }
}