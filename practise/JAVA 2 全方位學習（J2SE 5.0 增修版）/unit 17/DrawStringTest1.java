import java.awt.*;
public class DrawStringTest1 extends Canvas
{
 public static void main(String argv[])
 {
  DrawStringTest1 ds=new DrawStringTest1();
  Frame f=new Frame("DrawStringTest1");
  f.add(ds);
  f.pack();
  f.setVisible(true);
 }
 public DrawStringTest1()
 {
  setSize(300,300);
 }
 public void paint(Graphics g)
 {
  g.drawLine(10,30,200,30);
  g.drawString("I am a good program...",30,30);
 }


}