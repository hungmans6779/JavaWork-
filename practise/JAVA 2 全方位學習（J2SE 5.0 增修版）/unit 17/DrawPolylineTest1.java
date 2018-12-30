import java.awt.*;
public class DrawPolylineTest1 extends Canvas
{
 int x[]={50,80,110,110,80,50,20,20};
 int y[]={30,30,60,90,120,120,90,60};
 public static void main(String argv[])
 {
  Frame f=new Frame("DrawPolylineTest1");
  DrawPolylineTest1 dpl=new DrawPolylineTest1();
  f.add(dpl,BorderLayout.CENTER);
  f.setResizable(false);
  f.pack();
  f.setVisible(true);
 }
 public DrawPolylineTest1()
 {
  setSize(150,150);
 }
 public void paint(Graphics g)
 {
  g.drawPolyline(x,y,8);
 }
}