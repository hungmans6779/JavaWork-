import java.awt.*;
public class FlowLayoutTest
{
 public static void main(String argv[])
 {
  Frame f1=new Frame("FlowLayoutTest");
  //f1.setLayout(new FlowLayout(FlowLayout.LEFT,100,20));
  FlowLayout flt=new FlowLayout();
  flt.setAlignment(FlowLayout.LEFT);
  flt.setHgap(300);
  flt.setHgap(20);
  f1.setLayout(flt);
  f1.add(new Button("ONE"),FlowLayout.LEFT);
  f1.add(new Button("TWO"),FlowLayout.CENTER);
  f1.add(new Button("THREE"),FlowLayout.RIGHT);
  f1.pack();
  f1.setVisible(true);
 }
}