import java.awt.*;

public class ch11_awtFrame {
    ch11_awtFrame() {
        Frame f = new Frame();
        f.setTitle("Webpage");
        Label l = new Label("THIS IS AWT GUI");
        f.add(l);
        f.setSize(200, 300);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new ch11_awtFrame();

    }
}
