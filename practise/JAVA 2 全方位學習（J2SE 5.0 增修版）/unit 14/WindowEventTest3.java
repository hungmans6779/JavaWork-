import java.awt.*;
import java.awt.event.*;
public class WindowEventTest3
{
 public static void main(String argv[])
 {
  Frame f=new Frame("WindowEventTest3");
  f.addWindowListener(new WindowEventHandler31());
  f.addWindowListener(new WindowEventHandler32());
  f.setSize(200,200);
  f.setVisible(true);
 } 
}
class WindowEventHandler31 extends WindowAdapter
{
 public void windowClosing(WindowEvent e)
 {
  System.out.println("WindowEventHandler31.....");
 }
}
class WindowEventHandler32 extends WindowAdapter
{
 public void windowClosing(WindowEvent e)
 {
  System.out.println("WindowEventHandler32.....");
  System.exit(0);
 }
}