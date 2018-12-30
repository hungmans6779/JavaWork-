import java.awt.*;
public class BorderLayoutTest
{
 public static void main(String argv[])
 {
  Frame f=new Frame("BorderLayoutTest");
  Button b1=new Button("East");
  Button b2=new Button("South");
  Button b3=new Button("West");
  Button b4=new Button("North");
  Button b5=new Button("Center");
  
  //BorderLayout bb=new BorderLayout();
  //bb.setHgap(100);
  //bb.setVgap(10);
  //f.setLayout(bb);
  f.setLayout(new BorderLayout());
  
  f.add(b1,BorderLayout.EAST);
  f.add(b2,BorderLayout.SOUTH);
  f.add(b3,BorderLayout.WEST);
  f.add(b4,BorderLayout.NORTH);
  f.add(b5,BorderLayout.CENTER);
 // f.setSize(100,200);
  f.pack();
  f.setVisible(true);
 }
}