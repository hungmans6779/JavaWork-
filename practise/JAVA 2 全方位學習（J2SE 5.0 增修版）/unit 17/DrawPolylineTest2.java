import java.awt.*;
public class DrawPolylineTest2 
{
 public static void main(String argv[])
 {
  Frame f=new Frame("DrawPolylineTest2");
  MyDrawPolyline mydp=new MyDrawPolyline();
  f.add(mydp);
  f.setResizable(false);
  f.pack();
  f.setVisible(true);
 }
}

class MyDrawPolyline extends Canvas
{
 int x[]={50,80,110,110,80,50,20,20};
 int y[]={30,30,60,90,120,120,90,60};
 public MyDrawPolyline()
 {
  setSize(150,150);
 }
 public void paint(Graphics g)
 {
  g.drawPolyline(x,y,8);
 }
}