import java.awt.*;
import java.awt.event.*;
public class CardLayoutTest implements ActionListener
{
 Frame f;
 CardLayout cl;
 public static void main(String argv[])
 {
  new CardLayoutTest();
 }
 public CardLayoutTest()
 {
  f=new Frame("CardLayoutTest");
  Button b1=new Button("One");
  Button b2=new Button("Two");
  Button b3=new Button("Three");
  cl=new CardLayout(100,20);
  f.setLayout(cl);
  b1.addActionListener(this);
  b2.addActionListener(this);
  b3.addActionListener(this);
  f.add(b1,"1");
  f.add(b2,"2");
  f.add(b3,"3");
  f.pack();
  f.setVisible(true);

 }
 public void actionPerformed(ActionEvent e)
 {
  cl.next(f);
  //cl.show(f,"3");
 }
}