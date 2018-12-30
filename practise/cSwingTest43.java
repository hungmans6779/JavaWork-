import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class cSwingTest43
{
 public static void main(String argv[])
 {
  new cSwingTest43();	
 }
 public cSwingTest43()
 {
 	JFrame frame=new JFrame("cSwingTest43");
 	frame.addWindowListener(new WindowAdapter()
 	{
 	 public  void windowClosing(WindowEvent we)
 	 {
 	 	System.exit(0);
 	 }		
 	});	
 	Container contentPane=frame.getContentPane();
 	MyIcon icon=new MyIcon();
 	JLabel label=new JLabel(icon,JLabel.CENTER);
 	frame.add(label);
 	frame.pack();
 	frame.setSize(new Dimension(200,200));
 	frame.setVisible(true);
 		
 }		
 
 
 class MyIcon	implements Icon
 {
 	private int height=50;
 	private int width=70;
  public int getIconHeight()
  {
   return height;
  }		
  public int getIconWidth()
  {
   return width;	
  }	
  public void paintIcon(Component c,Graphics g,int x,int y)
  {
   g.setColor(Color.red); 	  	
   g.drawRect(x,y,width,height);
   g.fillRect(x,y,width,height);
  }	
 }	
 
 
}	