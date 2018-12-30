import java.awt.*;
import java.awt.event.*;
public class AwtEventTest4 extends WindowAdapter
{
 public static void main(String argv[])
 {
  Frame f=new Frame("AwtEventTest4");
  f.addWindowListener(new AwtEventTest4()); 	
  f.setSize(100,100);
  f.setVisible(true);
 }
 public void windowActivated(WindowEvent we)
 {
 	System.out.println("Activated...");
 }		
 public void windowIconified(WindowEvent we)
 {
  System.out.println("Iconified...");	
 }	
 public void windowClosing(WindowEvent we)
 {
  System.out.println("Closing...");
  System.exit(0);	
 }	

}