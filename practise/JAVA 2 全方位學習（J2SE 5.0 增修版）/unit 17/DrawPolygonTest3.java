import java.awt.*;
public class DrawPolygonTest3
{
 static int x[]={50,80,110,110,80,50,20,20};
 static int y[]={30,30,60,90,120,120,90,60};	
 public static void main(String argv[])
 {
  Frame f=new Frame("DrawPolygonTest3");
  MyDrawPolygon3 mydp=new MyDrawPolygon3(x,y);
  f.add(mydp,BorderLayout.CENTER);
  f.setResizable(false);
  f.pack();
  f.setVisible(true);
 }
}

class MyDrawPolygon3 extends Canvas
{
 int x[],y[];
 public MyDrawPolygon3(int xx[],int yy[])
 {
 	x=xx;
 	y=yy;
  setSize(150,150);
 }
 public void paint(Graphics g)
 {
 	g.drawPolygon(x,y,8);
 }	
}