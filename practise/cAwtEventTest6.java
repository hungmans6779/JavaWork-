import java.awt.*;
import java.awt.event.*;
public class cAwtEventTest6 extends MouseAdapter implements MouseMotionListener
{
 Frame f;	
 public static void main(String argv[])
 {
 	new cAwtEventTest6();
 }
 public cAwtEventTest6()
 {
  f=new Frame();
  f.addMouseListener(this);
  f.addMouseMotionListener(this);
  f.addWindowListener(new WindowHandler());	
  f.setLocation(200,200);
  f.setSize(300,300);
  f.setVisible(true);
 }	
 public void mouseClicked(MouseEvent me)
 {
  f.setTitle("Mouse Clicked...");	
 }
 public void mouseExited(MouseEvent me)
 {
  f.setTitle("Mouse Exited...");	
 }		
 public void mouseDragged(MouseEvent me)
 {
 
 }
 public void mouseMoved(MouseEvent me)
 { 
  f.setTitle("( "+me.getX()+" , "+me.getY()+" )");	
 }			
}

class WindowHandler extends WindowAdapter
{
 public void windowClosing(WindowEvent we)
 {
  System.exit(0);	
 }		
}	