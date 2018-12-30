import java.awt.*;
public class DrawPolylineTest3 
{
 static int x[]={50,80,110,110,80,50,20,20};
 static int y[]={30,30,60,90,120,120,90,60};
 public static void main(String argv[])
 {
  Frame f=new Frame("DrawPolylineTest3");
  MyDrawPolyline3 mydp=new MyDrawPolyline3(x,y);
  f.add(mydp);
  f.setResizable(false);
  f.pack();
  f.setVisible(true);
 }
}

class MyDrawPolyline3 extends Canvas
{
 int xx[],yy[];
 public MyDrawPolyline3(int x[],int y[])
 {
 	xx=x;
 	yy=y;
  setSize(150,150);
 }
 public void paint(Graphics g)
 {
  g.drawPolyline(xx,yy,8);
 }
}