import java.awt.*;
public class DrawPolygonTest2
{
 public static void main(String argv[])
 {
  Frame f=new Frame("DrawPolygonTest2");
  MyDrawPolygon mydp=new MyDrawPolygon();
  f.add(mydp,BorderLayout.CENTER);
  f.setResizable(false);
  f.pack();
  f.setVisible(true);
 }
}

class MyDrawPolygon extends Canvas
{
 int x[]={50,80,110,110,80,50,20,20};
 int y[]={30,30,60,90,120,120,90,60};
 public MyDrawPolygon()
 {
  setSize(150,150);
 }
 public void paint(Graphics g)
 {
 	g.drawPolygon(x,y,8);
 }	

}