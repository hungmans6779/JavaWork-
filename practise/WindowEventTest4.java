import java.awt.*;
import java.awt.event.*;
public class WindowEventTest4
{
 public static void main(String argv[])
 {
  Frame f1=new Frame("F1");
  f1.addWindowListener(new WindowEventHandler());
  f1.setSize(100,100);
  f1.setVisible(true);
  Frame f2=new Frame("F2");
  f2.addWindowListener(new WindowEventHandler());
  f2.setSize(200,200);
  f2.setVisible(true);	
 }	
}

class WindowEventHandler extends WindowAdapter
{
 public void windowClosing(WindowEvent we)
 {
  System.out.println("windowClosing");	
 }	
 public void windowActivated(WindowEvent we)
 {
  Frame f=(Frame)we.getSource();
  System.out.println(f.getTitle()+" is Activated");	
 }
}