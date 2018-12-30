import java.awt.*;
import java.awt.event.*;
public class Test35
{
 public static void main(String argv[])
 {
 	Frame f=new Frame("Test35");
 	f.addWindowListener(new WindowEventHandler1());
 	f.addWindowListener(new WindowEventHandler2());
 	f.setSize(100,100);
 	f.setVisible(true);
 }	
}

class WindowEventHandler1 extends WindowAdapter
{
 public void windowClosing(WindowEvent e)
 {
 	System.out.println("WindowHandler1");
 }		
}	


class WindowEventHandler2 extends WindowAdapter
{
 public void windowClosing(WindowEvent we)
 {
  System.out.println("WindowHandler2");
  System.exit(0);	
 }		
}	