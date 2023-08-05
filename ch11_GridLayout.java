import java.awt.*;
import java.awt.event.*;

public class ch11_GridLayout {

    public static void main(String[] args) {
        Frame frame = new Frame("Grid Layout Example");
        frame.setLayout(new GridLayout(2, 2));
        
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        Button button4 = new Button("Button 4");
        
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.setSize(300, 200);
        frame.setVisible(true);

        // Handle window closing event
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });

    }
}
