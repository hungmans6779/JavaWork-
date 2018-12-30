import java.awt.*;
public class AwtTest001 
{
 public static void main(String argv[])
 {
  Frame f1=new Frame("BorderLayout");
  Button b1=new Button("One");
  Button b2=new Button("Two");
  Button b3=new Button("Three");
  Button b4=new Button("Four");
  Button b5=new Button("Five");
  f1.add(b1,BorderLayout.EAST);
  f1.add(b2,BorderLayout.SOUTH);
  f1.add(b3,BorderLayout.WEST);
  f1.add(b4,BorderLayout.NORTH);
  f1.add(b5,BorderLayout.CENTER);
  //f1.pack();
  f1.setSize(300,300);
  f1.setVisible(true);
 }
}