import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class hAwtTest2 extends Frame
{
 int startX=0,startY=0,endX=0,endY=0,x=0,y=0;
 public static void main(String argv[])
 {
 	new hAwtTest2();
 }		
 public hAwtTest2()
 {
 	setTitle("hAwtTest2");
 	addWindowListener(new WindowAdapter()
 	{
 	 public void windowClosing(WindowEvent we)
 	 {
 	 	System.exit(0);
 	 }		
 	});	
 	addMouseListener(new MyListenerHandler());
 	addMouseMotionListener(new MyListenerHandler());
 	setBackground(new Color(255,255,255));
 	setLocation(500,200);
 	setSize(500,500);
 	show();
 }	
 public void paint(Graphics g)
 {
 	g.drawLine(startX,startY,endX,endY);
 }	
 class MyListenerHandler extends MouseAdapter implements MouseMotionListener
 {
  public void mouseMoved(MouseEvent me){}
  public void mouseDragged(MouseEvent me)
  {
   endX=me.getX();
 	 endY=me.getY();
 	 repaint();
  }			
  public void mousePressed(MouseEvent me)
  {	
   startX=me.getX();
   startY=me.getY();	
  }
  public void mouseReleased(MouseEvent me)
  {
   endX=me.getX();
   endY=me.getY();	
   repaint();
  }		
 }	
}	

