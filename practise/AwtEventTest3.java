import java.awt.*;
import java.awt.event.*;
public class AwtEventTest3 implements WindowListener
{
 public static void main(String argv[])
 {
 	Frame f=new Frame("AwtEventTest3");
 	f.addWindowListener(new AwtEventTest3());
 	f.setSize(100,100);
 	f.setVisible(true);
 }	 
 public void windowActivated(WindowEvent we)
 {
  System.out.println("Activated");	
 }	
 public void windowDeiconified(WindowEvent we)
 {
 	System.out.println("Deiconified...");
 }	
 public void windowClosing(WindowEvent we)
 {
 	System.out.println("Closing...");
 	System.exit(0);
 }	
 public void windowDeactivated(WindowEvent we){}
 public void windowIconified(WindowEvent we){}
 public void windowOpened(WindowEvent we){}
 public void windowClosed(WindowEvent we){}
}