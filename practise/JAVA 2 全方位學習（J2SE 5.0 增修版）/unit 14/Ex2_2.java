import java.awt.*;
import java.awt.event.*;
public class Ex2_2 extends MouseAdapter implements MouseMotionListener
{
 Frame f;
 Button b;
 static int x=0,y=0;
 static int xo=0,yo=0;
 public static void main(String argv[])
 {
  new Ex2_2();
 }
 public Ex2_2()
 {
  f=new Frame("Ex2_2 ----- 洪嘉宏於95年06月14日設計");
  f.setLayout(null);
  f.addMouseMotionListener(this);
  
  b=new Button("按住後請拖曳我....");
  b.addMouseListener(this);
  b.setSize(100,100);
  b.setLocation(30,30);
  
  f.add(b);
  f.setSize(300,300);
  f.setVisible(true);
 }


 public void mousePressed(MouseEvent e)
 {
  f.remove(b);
  xo=e.getX();
  yo=e.getY();
 }	
 public void mouseDragged(MouseEvent e)
 {
  x=e.getX()-xo;
  y=e.getY()-yo;
  b.setLocation(x,y);
  f.add(b);
 }	
 public void mouseMoved(MouseEvent e)
 {
 	x=e.getX();
  y=e.getY();
  f.setTitle("(x,y)===> ( "+x+","+y+" )");
 }	
}