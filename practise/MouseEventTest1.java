import java.awt.*;
import java.awt.event.*;
public class MouseEventTest1 extends MouseAdapter implements MouseMotionListener
{
 Frame f;	
 public static void main(String argv[])
 {
 	new MouseEventTest1();
 }	
 public MouseEventTest1()
 {
 	f=new Frame();
 	f.addMouseListener(this);
 	f.addMouseMotionListener(this);
 	f.setSize(200,200);
 	f.setVisible(true);
 }		
 public void mouseMoved(MouseEvent me)
 {
  int x=me.getX();
  int y=me.getY();
  f.setTitle("("+x+","+y+")");	
 }	
 public void mouseDragged(MouseEvent me){}	
 public void mouseClicked(MouseEvent me)
 {
  f.setTitle("Mouse Clicked");	
 }
 public void mouseExited(MouseEvent me)
 {
  f.setTitle("Mouse Exited");	
 }	
}	