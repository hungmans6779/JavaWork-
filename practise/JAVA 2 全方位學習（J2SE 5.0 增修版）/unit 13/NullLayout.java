import java.awt.*;
public class NullLayout
{
 public static void main(String argv[])
 {
  Frame f=new Frame("NullLayout");
  f.setLayout(null);
  Button b1=new Button("Button1");
  Button b2=new Button("Button2");
  Button b3=new Button("Button3");
  b1.setSize(50,50);
  b1.setLocation(50,50);
  b2.setSize(50,50);
  b2.setLocation(100,100);
  b3.setSize(50,50);
  b3.setLocation(150,150);
  f.add(b1);
  f.add(b2);
  f.add(b3);
  //f.pack();
  f.setSize(300,300);
  f.setVisible(true);
 }
}