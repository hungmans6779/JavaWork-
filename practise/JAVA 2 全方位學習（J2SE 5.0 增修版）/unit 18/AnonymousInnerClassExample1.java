import java.awt.*;
import java.awt.event.*;
public class AnonymousInnerClassExample1 extends WindowAdapter
{
 public static void main(String argv[])
 {
  Frame f=new Frame("AnonymousInnerClassExample1");
  f.addWindowListener(new AnonymousInnerClassExample1() );
  f.pack();
  f.setVisible(true);   
 }
 public void windowClosing(WindowEvent e)
  {
   System.exit(0);	
  }	
}	