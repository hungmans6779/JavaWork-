import java.awt.*;
import java.awt.event.*;
public class hCanvasTest5
{
 Frame f;
 public static void main(String argv[])
 {
  new hCanvasTest5();
 }
 public hCanvasTest5()
 {
  f=new Frame("hCanvasTest5");
  f.setSize(500,500);
  f.addWindowListener(new WindowHandler());
  MyCanvas myCanvas=new MyCanvas();
  f.add(myCanvas,BorderLayout.CENTER);
  f.setBackground(new Color(0,255,0));
  f.setVisible(true);
 }
}

class MyCanvas extends Canvas
{
 public void paint(Graphics g)
 {
 	g.setColor(new Color(233,32,133));
  g.drawArc(200,200,100,100,0,100);
  g.fillArc(300,300,100,100,0,100);
  
 }
}

class WindowHandler extends WindowAdapter
{
 public void windowClosing(WindowEvent we)
 {
  System.exit(0);
 }
}