import java.awt.*;
public class DrawArcTest1 extends Canvas
{
 int start,end;	
 public static void main(String argv[])
 {
  int x=Integer.parseInt(argv[0]);
  int y=Integer.parseInt(argv[1]);
  Frame f=new Frame("DrawArcTest1");
  DrawArcTest1 dat=new DrawArcTest1(x,y);	
  f.add(dat,BorderLayout.CENTER);
  f.setResizable(false);
  f.pack();
  f.setVisible(true);
 }
 public DrawArcTest1(int x,int y)
 {
 	start=x;
 	end=y;
 	setSize(100,100);
 }
 public void paint(Graphics g)
 {
 	g.drawArc(20,20,70,70,start,end);
 }	
}