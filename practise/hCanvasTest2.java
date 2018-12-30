import java.awt.*;
import java.awt.event.*;
public class hCanvasTest2 extends Canvas
{
 public static void main(String argv[])
 {
  hCanvasTest2 canvas=new hCanvasTest2();
  Frame frame=new Frame("hCanvasTest2");
  frame.addWindowListener(new WindowHandler());
  frame.add(canvas,BorderLayout.CENTER);
  frame.setSize(500,500);
  frame.setVisible(true); 	
 }
 public void paint(Graphics g)
 {
 	g.drawLine(100,100,300,300);
 }	
}
	