import java.awt.*;
public class AwtTest006
{
 public static void main(String argv[])
 {
  Frame f=new Frame("GridLayout");
  GridLayout gL=new GridLayout(2,3);
  f.setLayout(gL);
  Button b1=new Button("one");
  Button b2=new Button("two");
  Button b3=new Button("three");
  Button b4=new Button("four");
  Button b5=new Button("five");
  f.add(b1);
  f.add(b2);
  f.add(b3);
  f.add(b4);
  f.add(b5);
  f.pack();
  f.setVisible(true);
 }
}