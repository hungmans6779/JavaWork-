import java.awt.*;
import java.awt.event.*;
public class hCanvasTest3
{
 Frame f;
 public static void main(String argv[])
 {
  new hCanvasTest3();
 }
 public hCanvasTest3()
 {
  f=new Frame("hCanvasTest3");
  f.setSize(500,500);
  f.addWindowListener(new WindowHandler());
  f.add(new MyCanvas(),BorderLayout.CENTER);
  f.setVisible(true);
 }
}

class MyCanvas extends Canvas
{
 public void paint(Graphics g)
 {
  g.drawLine(0,0,300,300);
 }
}

class WindowHandler extends WindowAdapter
{
 public void windowClosing(WindowEvent we)
 {
  System.exit(0);
 }
}