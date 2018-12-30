import java.awt.*;
import java.awt.event.*;
public class AwtEventTest6
{
 public static void main(String argv[])
 {
  Frame f=new Frame("AwtEventTest6");
  f.addWindowListener(new WindowEventHandler1());
  f.addWidnowListener(new WindowEventHandler2());
  f.setSize(100,100);
  f.setVisible(true);	
 }	
}

class WindowEventHandler1 extends WindowAdapter
{
 public void windowClosing(WindowEvent we)
 {
 	System.out.println("Handler 1");
 }		
}	

class WindowEventHandler2 extends WindowAdapter
{
 public void windowClosing(WindowEvent we)
 {	
  System.out.println("Handler 2");
  System.exit(0);	
 } 
}	