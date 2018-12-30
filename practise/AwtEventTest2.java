import java.awt.*;
import java.awt.event.*;
public class AwtEventTest2
{
 public static void main(String argv[])
 {
  Frame f=new Frame("AwtEventTest2");
  f.addWindowListener(new WindowEventHandle());
  f.setSize(100,100);
  f.setVisible(true);
 }
}

class WindowEventHandle implements WindowListener
{
 public void windowActivated(WindowEvent we)
 {
 	System.out.println("Activated ...");
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
 public void windowDeactivated(WindowEvent we){}
 public void windowDeiconified(WindowEvent we){}
 public void windowOpened(WindowEvent we){}
 public void windowClosed(WindowEvent we){}
}	