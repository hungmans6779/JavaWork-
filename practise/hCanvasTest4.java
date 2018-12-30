import java.awt.*;
import java.awt.event.*;
public class hCanvasTest4
{
 Frame f;
 public static void main(String argv[])
 {
  new hCanvasTest4();
 }
 public hCanvasTest4()
 {
  f=new Frame("hCanvasTest4");
  f.setSize(500,500);
  f.addWindowListener(new WindowHandler());
  f.add(new MyCanvas(),BorderLayout.CENTER);
  f.setVisible(true);
 }
}

class MyCanvas extends Canvas
{
 byte []b=new byte[]{21,32,33,23};
 char []ch={'d','2','a'};
 public void paint(Graphics g)
 {
  g.drawString("I am a Java Programmer",30,50);
  g.drawLine(20,50,200,50);
  g.drawBytes(b,0,3,30,120);
  g.drawChars(ch,0,3,30,150);
 }
}

class WindowHandler extends WindowAdapter
{
 public void windowClosing(WindowEvent we)
 {
  System.exit(0);
 }
}