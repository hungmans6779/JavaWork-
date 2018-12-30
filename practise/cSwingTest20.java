import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class cSwingTest20 extends JFrame implements MouseListener,MouseMotionListener
{
 int startX=0,startY=0;
 int endX=0,endY=0;
 int x=0,y=0;
 int flag=1; //1ªí¥Ü²¾°Ê·Æ¹«¡A2ªí¥Ü©ì²Ö·Æ¹«
 public static void main(String argv[])
 {
 	new cSwingTest20();
 }		
  
 public cSwingTest20()
 {
 	Container contentPane=getContentPane();
 	contentPane.addMouseListener(this);
  contentPane.addMouseMotionListener(this);	
 	addWindowListener(new WindowAdapter()
 	{
 	 public void windowClosing(WindowEvent we)
 	 {
 	  System.exit(0);	
 	 }		
 	});	
 	
  setLocation(500,200);
  setSize(500,500);
  show();
 }	
  public void mouseClicked(MouseEvent me){}
  public void mouseEntered(MouseEvent me){}
  public void mouseExited(MouseEvent me){}

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
   repaint();	
  }
  public void mouseDragged(MouseEvent me)
  {
   flag=2;	
   x=me.getX();
   y=me.getY();
   repaint();
  }		
 
 public void update(Graphics g)
 {
 	//g.setColor(this.getBackground());
 	g.setColor(new Color(255,255,255));
 	g.fillRect(0,0,getWidth(),getHeight());
 	paint(g);
 }	

 public void paint(Graphics g)
 {
 	g.setColor(new Color(255,255,255));
 	//g.setColor(Color.black);
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