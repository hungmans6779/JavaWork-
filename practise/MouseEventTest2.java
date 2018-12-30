import java.awt.*;
import java.awt.event.*;
public class MouseEventTest2 
{
 public static void main(String argv[])
 {
 	Frame f=new Frame("Frame");
 	f.addMouseListener(new MouseEventHandler());
 	f.addMouseMotionListener(new MouseMotionEventHandler());
 	f.setSize(100,100);
 	f.setVisible(true);
 }		
}	

class MouseEventHandler extends MouseAdapter
{
 public void mouseClicked(MouseEvent me)
 {
  Frame f=(Frame)me.getSource(); 	
  f.setTitle("mouseClicked");
 }		
 public void mouseExited(MouseEvent me)
 {
 	Frame f=(Frame)me.getSource();
 	f.setTitle("mouseExited");
 }	
}

class MouseMotionEventHandler extends MouseMotionAdapter
{
 public void mouseMoved(MouseEvent me)
 {
  Frame f=(Frame)me.getSource();	
  f.setTitle("("+f.getX()+","+f.getY()+")");
 }		
}	