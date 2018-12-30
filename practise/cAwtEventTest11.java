import java.awt.event.*;
import java.awt.*;
public class cAwtEventTest11 extends KeyAdapter
{
 Frame f;
 public cAwtEventTest11()
 {
 	f=new Frame();
 	f.addKeyListener(this);
 	f.setLocation(300,300);
 	f.setSize(300,300);
 	f.setVisible(true);
 }		
 public static void main(String argv[])
 {
  new cAwtEventTest11();
 }
 public void keyPressed(KeyEvent ke)
 {
  switch(ke.getModifiers())
  {
   case KeyEvent.VK_A:
    break;
  }	
 }	
}