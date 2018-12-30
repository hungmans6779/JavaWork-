import java.awt.*;

public class DrawLineTest11 extends Frame
{
 public static void main(String argv[])
 {
  DrawLineTest11 n1=new DrawLineTest11();	
  n1.setTitle("DrawLineTest1");
  n1.setSize(100,100);
  n1.setVisible(true);
 }
 public void paint(Graphics g)
 {
  g.drawLine(10,15,30,40);	
 }
}
