import java.awt.*;
import java.awt.event.*;
public class AwtEventTest5 extends WindowAdapter
{
 Frame f;	
 public AwtEventTest5()
 {
  f=new Frame("AwtEventTest5");
  f.addWindowListener(this);
  f.setSize(100,100);
  f.setVisible(true);	
 }	
 public static void main(String argv[])
 {
 	new AwtEventTest5();
 }
 public void windowClosing(WindowEvent we)
 {
  System.out.println("Closing....");
  System.exit(0);	
 }		
 public void windowActivated(WindowEvent we)
 {
  System.out.println("Activated...");	
 }	
 public void windowIconified(WindowEvent we)
 {
  System.out.println("Iconified");	
 }	
}