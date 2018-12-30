import java.awt.*;
import java.awt.event.*;
public class cAwtEventTest3
{
 public static void main(String argv[])
 {
  Frame f1=new Frame("Frame1");
  f1.addWindowListener(new WindowEventHandler());
  f1.setLocation(200,200);
  f1.setSize(300,300);
  f1.setVisible(true);
 }
}

class WindowEventHandler implements WindowListener
{
 public void windowClosing(WindowEvent we)
 {
  System.out.println("WindowClosing...");
  System.exit(0);	
 }	
 public void windowActivated(WindowEvent we)
 {
  System.out.println("WindowActivated...");	
 }
 public void windowDeactivated(WindowEvent we)
 {
  System.out.println("WindowDeactivated...");	
 }	
 public void windowDeiconified(WindowEvent we)
 {
  System.out.println("WindowDeiconified...");	
 }	
 public void windowIconified(WindowEvent we)
 {
  System.out.println("WindowIconified...");	
 }	
 public void windowOpened(WindowEvent we){}
 public void windowClosed(WindowEvent we){}
}