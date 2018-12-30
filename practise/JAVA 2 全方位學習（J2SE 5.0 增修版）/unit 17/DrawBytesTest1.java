import java.awt.*;
public class DrawBytesTest1 extends Canvas
{
 byte b[]={1,2,3,4,5,6};
 char c[]={'a','b','c','d'};
 public static void main(String argv[])
 {
  DrawBytesTest1 ds=new DrawBytesTest1();
  Frame f=new Frame("DrawBytesTest1");
  f.add(ds);
  f.pack();
  f.setVisible(true);
 }
 public DrawBytesTest1()
 {
  setSize(300,300);
 }
 public void paint(Graphics g)
 {
  //g.drawLine(10,30,200,30);
   g.drawBytes(b,1,3,10,30);
   g.drawChars(c,0,4,30,130);
 }


}