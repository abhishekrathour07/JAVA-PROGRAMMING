import java.awt.*;
public class ch9_Lab14 extends Canvas
{
public void paint(Graphics g)
{
g.drawRect(50,75,100,50);
g.fillRect(50,75,100,50);
g.drawRoundRect(50,150,100,50,15,15);
g.fillRoundRect(50,150,100,50,15,15);
g.drawOval(50,275,100,50);
g.fillOval(50,275,100,50);
g.drawArc(20,350,100,50,25,75);
g.fillArc(20,350,100,50,25,75);
}
public static void main(String args[]){
ch9_Lab14 m=new ch9_Lab14();
Frame f =new Frame("shapes");
f.add(m);
f.setSize(300,450);
f.setVisible(true);
}
}
