import java.awt.*;
import java.awt.event.*;
public class ch0_PartB6
{
public static void main(String args[])
{
Frame f=new Frame("Button Example");
Label l=new Label("Welcome to My page");
//l.setFont(new Font("Calibri", Font.BOLD, 16));
Label f1=new Label();
Label f2=new Label();
Label f3=new Label();
Label f4=new Label();
Label f5=new Label();
l.setBounds(250,30,600,50);
f1.setBounds(20,120,600,30);
f2.setBounds(20,160,600,30);
f3.setBounds(20,200,600,30);
f4.setBounds(20,240,600,30);
f5.setBounds(20,280,600,30);
Button b=new Button("CLICK HERE FOR MY PERSONAL DETAILS");
//b.setFont(new Font("Calibri", Font.BOLD, 16));
b.setBounds(210,70,320,30);
b.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
f1.setText("FULL NAME: Mahananda,");
f2.setText("FATHER NAME: ANAND, MOTHER NAME: SUMA, AGE: 20,");
f3.setText("ROLL NO: 1234, COLLEGE NAME: AIGS,");
f4.setText("NATIONALITY: INDIAN, CONTACT NO: 9876543210,");
f5.setText("ADDRESS: 7th cross, Ganapathinagar, BENGALURU");
}
});
f.add(b);
f.add(l);
f.add(f1);
f.add(f2);
f.add(f3);
f.add(f4);
f.add(f5);
f.setSize(800,800);
f.setLayout(null);
f.setVisible(true);
}
}
