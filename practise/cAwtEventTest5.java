import java.awt.*;
import java.awt.event.*;
public class cAwtEventTest5
{
 public static void main(String arg[])
 {
  Frame f1=new Frame("Frame1");
  Frame f2=new Frame("Frame2");
  f1.setLocation(100,100);
  f1.addWindowListener(new WindowEventHandler());
  f2.setLocation(300,300);
  f2.addWindowListener(new WindowEventHandler());
  f1.setSize(100,100);
  f2.setSize(300,300);
  f1.setVisible(true);
  f2.setVisible(true);
 }
}

class WindowEventHandler extends WindowAdapter
{	
 public void windowActivated(WindowEvent we)
 {
  Frame f=(Frame)we.getSource();
  System.out.println(f.getTitle()+" is Activated...");
 }	
 public void windowClosing(WindowEvent we1)
 {
 	Frame f=(Frame)we1.getSource();
 	System.out.println(f.getTitle()+" is Closing...");
 	System.exit(0);
 }	
}