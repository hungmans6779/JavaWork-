import java.awt.*;
public class AwtTest002
{
 public static void main(String argv[])
 {
  Frame f1=new Frame();
  f1.setTitle("³o¬OFrameªºBorderLayout");
  Button b1=new Button("First");
  Button b2=new Button("Second");
  Button b3=new Button("Three");
  Button b4=new Button("Four");
  Button b5=new Button("Five");
  BorderLayout brL=new BorderLayout(10,20);
  f1.setLayout(brL); 
  f1.add(b1,BorderLayout.EAST);
  f1.add(b2,BorderLayout.WEST);
  f1.add(b3,BorderLayout.CENTER);
  f1.add(b4,BorderLayout.NORTH);
  f1.add(b5,BorderLayout.SOUTH);
  f1.setSize(300,300);
  f1.setLocation(200,200);
  //f1.pack();
  f1.setVisible(true);
 }
}