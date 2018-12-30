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
 	f=new Frame("MouseEventTest1");
 	f.addMouseListener(this);
 	f.addMouseMotionListener(this);
 	f.setSize(500,500);
 	f.setVisible(true);
 }		
 public void mouseClicked(MouseEvent e)
 {
 	f.setTitle("Mouse Clicked.....");
 }	
 public void mousePressed(MouseEvent e)
 {
  System.out.println("MousePressed.....");	
 }
 public void mouseReleased(MouseEvent e)
 {
 	System.out.println("MouseReleased.....");
 }	
 public void mouseEntered(MouseEvent e)
 {
 	f.setTitle("Mouse Entered.....");
 }	
 public void mouseExited(MouseEvent e)
 {
 	f.setTitle("Mouse Exited.....");
 }	
 public void mouseDragged(MouseEvent e)
 {
  int x=e.getX();
  int y=e.getY();
  f.setTitle("Mouse Dragged move (x,y)===>("+x+","+y+")");
 }
 public void mouseMoved(MouseEvent e)
 {
 }	
}	