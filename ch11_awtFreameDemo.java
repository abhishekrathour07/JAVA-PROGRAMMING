import java.awt.*;

public class ch11_awtFreameDemo extends Frame {
    ch11_awtFreameDemo() {
        Button b = new Button("Submit");
        add(b);
       
        setSize(100, 150);
    
        setTitle("I am frame");
        setVisible(true);
    }

    public static void main(String[] args) {
        new ch11_awtFreameDemo();
    }
}
