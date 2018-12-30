import java.awt.*;
import java.awt.event.*;
public class WindowEventTest2 extends WindowAdapter
{
 public static void main(String argv[])
 {
  new WindowEventTest2();
 }
 public WindowEventTest2()
 {
  Frame f=new Frame("WindowEventTest2");
  f.addWindowListener(this);
  f.setSize(100,100);
  f.setVisible(true);
 }
 public void windowActivated(WindowEvent e)
 {
  System.out.println("Windows Event is Activated.....");
 }
 public void windowClosing(WindowEvent e)
 {
  System.out.println("Windows Event is Closing.....");
  System.exit(0);
 }
}
