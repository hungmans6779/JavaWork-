import java.awt.*;
import java.awt.event.*;
public class AnonymousInnerClassExample extends WindowAdapter
{
 public static void main(String argv[])
 {
  Frame f=new Frame("AnonymousInnerClassExample");
  f.addWindowListener(new WindowAdapter()
  {
   public void windowClosing(WindowEvent e)
   {
   	System.exit(0);
   }		
  });		
  f.pack();
  f.setVisible(true); 
 }
}	