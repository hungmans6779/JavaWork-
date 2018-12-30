import java.awt.*;

public class DrawLineTest1 extends Frame
{
 public static void main(String argv[])
 {
  new DrawLineTest1();	
 }
 public DrawLineTest1()
 {
  setTitle("DrawLineTest1");
  setSize(50,50);
  setVisible(true);
 }
 public void paint(Graphics g)
 {
  g.drawLine(10,15,30,40);	
 }
}
