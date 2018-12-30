import java.awt.*;
public class AwtTest007
{
 public static void main(String argv[])
 {
 	Frame f=new Frame("Null Layout");
 	f.setLayout(null);
  f.setSize(500,500);
 	Button b1=new Button("one");
 	b1.setLocation(100,100);
 	b1.setSize(50,50);
 	f.add(b1);
 	Button b2=new Button("two");
 	b2.setLocation(200,200);
 	b2.setSize(200,200);
 	f.add(b2);
 	f.setVisible(true);
 }	
}