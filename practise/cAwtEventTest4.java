import java.awt.*;
import java.awt.event.*;
public class cAwtEventTest4
{
 public static void main(String argv[])
 {
  Frame f=new Frame("Frame1");
  f.addWindowListener(new WindowEventHandler1());
  f.addWindowListener(new WindowEventHandler2());
  f.setLocation(200,200);
  f.setSize(300,300);
  f.setVisible(true);	
 }	
}

class WindowEventHandler1 extends WindowAdapter
{
 public void windowClosing(WindowEvent we)
 {
  System.out.println("WindowEventHandler1.....");	
 }		
}	

class WindowEventHandler2 extends WindowAdapter
{
 public void windowClosing(WindowEvent we)
 {
 	System.out.println("WindowEventHandler2.....");
 	System.exit(0);
 }		
}	