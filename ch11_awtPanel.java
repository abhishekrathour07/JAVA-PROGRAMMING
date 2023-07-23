import java.awt.*;

public class ch11_awtPanel extends Frame {
  ch11_awtPanel() {
    setLayout(new FlowLayout());
    Panel p1 = new Panel();
    Label l1 = new Label("LABEL0");
    Button b1 = new Button("Submit");
    String text1 = "HEllo MYself abhishek singh \ni am writing the text area\n in java panel program";
    TextField t = new TextField(text1);
    p1.add(l1);
    p1.add(t);
    p1.add(b1);
    add(p1);
    Panel p2 = new Panel();
    Label l2 = new Label("LAbel2");
    Button b2 = new Button("LOgIn");
    p2.add(l2);
    p2.add(b2);
    add(p2);
    setTitle("This is Title");
    setSize(200, 200);
    setVisible(true);

  }

  public static void main(String[] args) {
    new ch11_awtPanel();
  }
}
