import java.awt.*;
public class DrawPolygonTest1 extends Canvas
{
 int x[]={50,80,110,110,80,50,20,20};
 int y[]={30,30,60,90,120,120,90,60};
 public static void main(String argv[])
 {
 	Frame f=new Frame("DrawPolygonTest1");
 	DrawPolygonTest1 dpg=new DrawPolygonTest1();
 	f.add(dpg,BorderLayout.CENTER);
 	f.setResizable(false);
 	f.pack();
 	f.setVisible(true);
 }	
 public DrawPolygonTest1()
 {
 	setSize(150,150);
 }	
 public void paint(Graphics g)
 {
 	g.drawPolygon(x,y,8);
 }	
}