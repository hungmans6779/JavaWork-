import java.awt.*;
public class DrawOvalTest1 extends Canvas
{
 public static void main(String argv[])
 {
 	DrawOvalTest1 dot=new DrawOvalTest1();
 	Frame f=new Frame("DrawOvalTest1");
 	f.add(dot,BorderLayout.CENTER);
  f.pack();
  f.setVisible(true);
 }
 public DrawOvalTest1()
 {
 	setSize(350,200);
 }		
 public void paint(Graphics g)
 {
 	g.drawString("Circle",30,20);
 	g.drawOval(20,30,50,50);
 	g.fillOval(20,100,50,50);
 	
 	g.drawString("Oval-Shaped",100,20);
 	g.drawOval(90,30,100,50);
 	g.fillOval(90,100,100,50);
 	
 	g.drawString("drawArc",230,20);
 	g.drawArc(200,30,100,50,0,90);
 	g.fillArc(200,100,100,50,0,90);
 	
 }	
	
	
}	