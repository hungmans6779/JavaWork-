import java.awt.*;
import java.awt.event.*;

public class HunTest2 extends Frame
{
 int count=0;
 
 public static void main(String argv[])
 {
  new HunTest2();
 }
 public HunTest2()
 {
 	addMouseMotionListener(new MouseAdapter()
 	{
 	 public void mouseMoved(MouseEvent me)
 	 {
 	 	setTitle(me.getX()+","+me.getY());
 	 }		
 	});		
 	addWindowListener(new WindowAdapter()
 	{
 	 public void windowClosing(WindowEvent we)
 	 {
 	  System.exit(0);	
 	 }		
 	});	
 	setTitle("河內塔程式---洪嘉宏");
 	setLocation(100,100);
  setSize(new Dimension(1000,700));	
  show();
 }	
 public void hun(int n,String a,String b,String c)
 {
  if(n==1)
  {
   System.out.println("第 "+(++count)+" 次===>"+"from "+a+" to "+c);	
  } 
  else
  {
   hun(n-1,a,c,b);
   System.out.println("第 "+(++count)+" 次===>"+"from "+a+" to "+c);	
   hun(n-1,b,a,c);	
  }	
 }
 public void showP(Graphics g)
 {
 	g.setFont(new Font("dialog",Font.BOLD,24));
  g.setColor(Color.RED);
 	g.fillRect(200,300,10,300);	
 	g.fillRect(110,600,190,10); //畫出底盤
 	g.drawString("A盤",190,650);
 	g.fillRect(500,300,10,300);	
 	g.fillRect(410,600,190,10); //畫出底盤
 	g.drawString("B盤",490,650);
 	g.fillRect(800,300,10,300);	
 	g.fillRect(710,600,190,10); //畫出底盤
 	g.drawString("C盤",790,650);
 }	
 public void paint(Graphics g)
 {
  showP(g);
 }	
 
 	
}