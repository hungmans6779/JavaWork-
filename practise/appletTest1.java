import java.applet.Applet;
import java.awt.*;

public class appletTest1 extends Applet
{
 public void init()
 {
 	setBackground(Color.GREEN);
 	setForeground(Color.BLACK);
 }
 public void start()
 {
 	
 }
		
 public void paint(Graphics g)
 {
   g.drawLine(40,20,300,20); 
   g.setFont(new Font("Serief",Font.BOLD,32));
   g.drawString("Hello,Java World",50,50);
   g.setColor(Color.YELLOW);
   g.drawString("自由人的證照",50,100);
   g.setColor(Color.RED);
   g.drawString("SCJP",50,150);
   g.drawString("SCWCD",50,200);
   g.setColor(Color.BLACK);	
   g.drawLine(40,220,300,220);
 }
}