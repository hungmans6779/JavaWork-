import java.awt.*;
import java.awt.event.*;
class FrameTest1 extends Frame
{	
 public FrameTest1()
 {
  Frame f1=new Frame();
  f1.setSize(100,100);
  f1.setVisible(true);	
  f1.addWindowListener(new WindowAdapter()
  {
   public void windowClosing(WindowEvent e)
   {
   	System.exit(0);
   }	
  }	  
  );
 }	
 public static void main(String argv[])
 {
 	new FrameTest1();
 }	
}
