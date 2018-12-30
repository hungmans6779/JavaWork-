import java.awt.*;
import java.awt.event.*;
public class hCanvasTest1 extends Frame
{
 public static void main(String argv[])
 {
  new hCanvasTest1();
 }
 public hCanvasTest1()
 {
 	super("hCanvasTest1");
 	addWindowListener(new WindowHandler());
 	setLocation(100,100);
 	setSize(300,300);
 	setVisible(true);
 }	
 public void paint(Graphics g)
 {
 	g.drawLine(5,30,100,100);
 }	
}

class WindowHandler extends WindowAdapter
{
 public void windowClosing(WindowEvent we)
 {
 	System.exit(0);
 }		 
}	