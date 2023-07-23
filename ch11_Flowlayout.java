import java.awt.*;

public class ch11_Flowlayout {
    ch11_Flowlayout() {
        Frame frame = new Frame("FlowLayout Example");

        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        Button button4 = new Button("Button 4");
        Button button5 = new Button("Button 5");

        frame.setLayout(new FlowLayout(10, 230, 40));

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);

        frame.setSize(300, 150);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ch11_Flowlayout();

    }
}
