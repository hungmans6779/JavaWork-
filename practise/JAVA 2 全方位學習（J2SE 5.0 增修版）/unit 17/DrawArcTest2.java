import java.awt.*;
public class DrawArcTest2
{
 static int start,end;
 public static void main(String argv[])
 {
  start=Integer.parseInt(argv[0]);
  end=Integer.parseInt(argv[1]);
  Frame f=new Frame("DrawArcTest2");
  MyDrawArc myda=new MyDrawArc(start,end);
  f.add(myda,BorderLayout.CENTER);
  f.setResizable(false);
  f.pack();
  f.setVisible(true);
 }
}

class MyDrawArc extends Canvas
{
 int start,end;
 public MyDrawArc(int x,int y)
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