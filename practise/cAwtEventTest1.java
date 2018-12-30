import java.awt.*;
import java.awt.event.*;
public class cAwtEventTest1 extends WindowAdapter
{
 Frame f1;	
 public cAwtEventTest1()
 {
  f1=new Frame("Frame1");
  f1.addWindowListener(this);
  f1.setSize(300,300);
  f1.setLocation(100,100);
  f1.setVisible(true); 
 }		
 public static void main(String argv[])
 {
  new cAwtEventTest1();
 }
 public void windowClosing(WindowEvent we)
 {
 	System.exit(0);
 }	
}