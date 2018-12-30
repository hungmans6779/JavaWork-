import java.awt.*;
import java.awt.event.*;
public class WindowEventTest4
{
 public static void main(String argv[])
 {
  Frame f1=new Frame("Host");
  f1.addWindowListener(new WindowEventHandler4());
  f1.setSize(100,100);
  f1.setLocation(100,100);
  f1.setVisible(true);
  Frame f2=new Frame("Servant");
  f2.addWindowListener(new WindowEventHandler4());
  f2.setSize(200,200);
  f2.setLocation(300,100);
  f2.setVisible(true);
 }
}
class WindowEventHandler4 extends WindowAdapter
{
 public void windowActivated(WindowEvent e)
 {
  Frame af=(Frame)e.getSource();
  System.out.println(af.getTitle()+" Activated....");
 }
 public void windowClosing(WindowEvent e)
 {
  System.out.println("window is Closing .....");
  System.exit(0);
 }
 public void windowDeiconified(WindowEvent e)
 {
  Frame afd=(Frame)e.getSource();
  System.out.println(afd.getTitle()+" Deiconified");	
 }
}