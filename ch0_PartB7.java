        import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
 class mouseEvent   implements MouseListener
{
Label lbl1,lbl2;
Frame fr;
mouseEvent()
{
fr = new Frame("Java Mouse Listener Example");
lbl1 = new Label("Demo for the Mouse Event", Label.CENTER);
lbl2 = new Label();
fr.setLayout(new FlowLayout());
fr.add(lbl1);
fr.add(lbl2);
fr.addMouseListener(this);
fr.setSize(250, 250);
fr.setVisible(true);
}
public void mouseClicked(MouseEvent ev)
{
lbl2.setText("Mouse Button Clicked");
fr.setVisible(true);
}
public void mouseEntered(MouseEvent ev)
{
lbl2.setText("Mouse has entered the area of window");
fr.setVisible(true);
}
public void mouseExited(MouseEvent ev)
{
lbl2.setText("Mouse has left the area of window");
fr.setVisible(true);
}
public void mousePressed(MouseEvent ev)
{
lbl2.setText("Mouse button is being pressed");
fr.setVisible(true);
}
public void mouseReleased(MouseEvent ev)
{
lbl2.setText(" Mouse Released");
fr.setVisible(true);

    }
}
 public class  ch0_PartB7{
    public static void main(String[] args) {
        new mouseEvent();
    }
 }
