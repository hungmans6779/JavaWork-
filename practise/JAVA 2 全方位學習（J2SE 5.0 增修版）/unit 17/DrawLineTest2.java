import java.awt.*;
public class DrawLineTest2 extends Canvas
{
 public static void main(String argv[])
 {
 	DrawLineTest2 d=new DrawLineTest2();
  Frame f=new Frame("DrawLineTest2");
  f.add(d);
  f.pack();
  f.setVisible(true);
 }
 public DrawLineTest2()
 {
  setSize(50,50);	
 }
 public void paint(Graphics g)
 {
 	g.drawLine(10,15,30,40);
 }	

}