import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class cSwingTest19
{
 JFrame f;	
 int startX=0,startY=0;
 int endX=0,endY=0;
 int x=0,y=0;
 int flag=1; //1ªí¥Ü²¾°Ê·Æ¹«¡A2ªí¥Ü©ì²Ö·Æ¹«
 public static void main(String argv[])
 {
 	new cSwingTest19();
 }		
  
 public cSwingTest19()
 {
 	f=new JFrame("cSwingTest19");
 	Container contentPane=f.getContentPane();
 	f.addWindowListener(new WindowAdapter()
 	{
 	 public void windowClosing(WindowEvent we)
 	 {
 	  System.exit(0);	
 	 }		
 	});	
 	contentPane.addMouseListener(new MyEventHandler());
  contentPane.addMouseMotionListener(new MyEventHandler());	
  f.setLocation(500,200);
  f.setSize(500,500);
  f.setVisible(true);
 }	

 class MyEventHandler extends MouseAdapter implements MouseMotionListener
 {
 	public void mousePressed(MouseEvent me)
 	{
 	 startX=me.getX();
 	 startY=me.getY();	
 	}
 	public void mouseReleased(MouseEvent me)
 	{
 	 endX=me.getX();
 	 endY=me.getY();	 	
 	}
 		
  public void mouseMoved(MouseEvent me)
  {
   flag=1;
   x=me.getX();
   y=me.getY();
   f.repaint();	
  }
  public void mouseDragged(MouseEvent me)
  {
   flag=2;	
   x=me.getX();
   y=me.getY();
   f.repaint();
  }		
 }
 
 public void paint(Graphics g)
 {
  if(flag==1)
  {
   g.drawString("·Æ¹«®y¼Ð( "+x+" , "+y+" )",10,50);
   g.drawLine(startX,startY,endX,endY);
  }
  else
  {
   g.drawString("·Æ¹«®y¼Ð( "+x+" , "+y+" )",10,50);
   g.drawLine(startX,startY,x,y);	
  }		
 }	
 
 
}	