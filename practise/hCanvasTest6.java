import java.awt.*;
import java.awt.event.*;
public class hCanvasTest6
{
 Frame f;
 public static void main(String argv[])
 {
 	new hCanvasTest6();
 }	
 public hCanvasTest6()
 {
 	f=new Frame("hCanvasTest6");
 	f.setLocation(100,100);
 	f.setSize(600,600);
 	f.addWindowListener(new WindowHandler());
 	MyCanvas myCanvas=new MyCanvas();
 	f.add(myCanvas,BorderLayout.CENTER);
 	f.setVisible(true);
 }		
}

class MyCanvas extends Canvas
{
 public void paint(Graphics g)
 {
 	int x[]={40,70,100,100,70,40,10,10};
 	int y[]={10,10,40,70,100,100,70,40};
 	g.fillPolygon(x,y,8);
 }
}

class WindowHandler extends WindowAdapter
{
 public void windowClosing(WindowEvent we)
 {
  System.exit(0);
 }
}