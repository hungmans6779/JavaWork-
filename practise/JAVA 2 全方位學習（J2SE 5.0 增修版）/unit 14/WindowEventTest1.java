import java.awt.*;
import java.awt.event.*;
public class WindowEventTest1
{
 public static void main(String argv[])
 {
  Frame f=new Frame("WindwosEventTest1");
  f.addWindowListener(new WindowEventHandler1());
  f.setSize(200,200);
  f.setVisible(true);
 }
}
 class WindowEventHandler1 implements WindowListener
{
 public void windowClosing(WindowEvent e)
 {
  System.out.println("Windows Event Closing.....");
  System.exit(0);
 }
 public void windowIconified(WindowEvent e) 
 {
  System.out.println("Windows Event is Iconified.....");
 }
 public void windowActivated(WindowEvent e)
 {
 	 System.out.println("Windows Event is Activated.....");
 }
 public void windowDeactivated(WindowEvent e) 
 {
   System.out.println("Windows Event is Deactivated....."); 
 }
 public void windowOpened(WindowEvent e)
 {
 	 System.out.println("Windows Event is Opened....");
 } 
 public void windowClosed(WindowEvent e) 
 {
   System.out.println("Windows Event is Closed.....");
 } 
 public void windowDeiconified(WindowEvent e) 
 {
   System.out.println("Windows Event is Deiconified.....");
 }
}