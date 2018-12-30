import java.awt.*;
import java.awt.event.*;
public class WindowEventTest11
{
 public static void main(String argv[])
 {
  Frame f=new Frame("WindwosEventTest1");
  f.addWindowListener(new WindowEventHandler11());
  f.setSize(200,200);
  f.setVisible(true);
 }
}
 class WindowEventHandler11 extends WindowAdapter
{
 public void windowClosing(WindowEvent e)
 {
  System.out.println("Windows Event Closing.....");
  System.exit(0);
 }
 
}