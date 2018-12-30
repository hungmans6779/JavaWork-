import java.awt.*;
public class GridLayoutTest
{
 public static void main(String argv[])
 {
  Frame f=new Frame("GridLayoutTest");
  Button b1=new Button("ONE");
  Button b2=new Button("TWO");
  Button b3=new Button("THREE");
  Button b4=new Button("FOUR");
  Button b5=new Button();
  //b5.setLabel("FIVE");
  f.setLayout(new GridLayout(2,3));
  f.add(b1);
  f.add(b2);
  f.add(b3);
  f.add(b4);
  f.add(b5);
  f.pack();
  f.setVisible(true);
 }
}