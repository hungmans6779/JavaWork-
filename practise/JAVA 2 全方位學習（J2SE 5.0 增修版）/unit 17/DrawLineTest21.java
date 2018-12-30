import java.awt.*;
public class DrawLineTest21
{
 public static void main(String argv[])
 {
  Frame f=new Frame("DrawLineTest21");
  MyCanvas ca=new MyCanvas();
 
  f.add(ca);
  f.setSize(100,100);
  //f.pack();
  f.setVisible(true);
 }
}
class MyCanvas extends Canvas
{
 public void paint(Graphics g)
 {
 	g.drawLine(10,20,40,40);
 }		
	
}	