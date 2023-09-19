import java.awt.*;
public class ch0_PartB4 extends Canvas
{
public void paint(Graphics g)
{
g.drawRect(50,75,100,50);
g.fillRect(50,75,100,50);
g.drawRoundRect(150,150,100,50,15,15);
g.fillRoundRect(150,150,100,50,15,15);
g.drawOval(250,275,100,50);
g.fillOval(250,275,100,50);
g.drawArc(320,350,100,50,25,75);
g.fillArc(320,350,100,50,25,75);
setBackground(Color.blue);
setForeground(Color.MAGENTA);

}
public static void main(String args[]){
ch0_PartB4 m=new ch0_PartB4();
Frame f =new Frame("shapes");
f.add(m);
f.setSize(600,600);
f.setVisible(true);
}
}
