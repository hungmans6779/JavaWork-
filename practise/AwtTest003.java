import java.awt.*;
public class AwtTest003
{
 public static void main(String argv[])
 {
  Frame f1=new Frame("FlowerLayoutªºTest");
  Button b1=new Button("One");
  Button b2=new Button("Two");
  Button b3=new Button("Three");
  //FlowLayout fL=new FlowLayout(FlowLayout.CENTER);
  //f1.setLayout(fL);
  //f1.setLayout(new FlowLayout(FlowLayout.CENTER));
  FlowLayout fL=new FlowLayout();
  fL.setAlignment(FlowLayout.CENTER);
  f1.setLayout(fL);
  f1.add(b1);
  f1.add(b2);
  f1.add(b3);
  f1.pack();
  f1.setVisible(true);
 }
}