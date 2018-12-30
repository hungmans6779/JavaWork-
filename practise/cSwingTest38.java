import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
public class cSwingTest38
{
 public static void main(String argv[])
 {
 	new cSwingTest38();
 }		
 public cSwingTest38()
 {
 	JFrame frame=new JFrame("cSwingTest38");
 	frame.addWindowListener(new WindowAdapter()
 	{
 	 public void windowClosing(WindowEvent we)
 	 {
 	 	System.exit(0);
 	 }		
 	});	
 	Container contentPane=frame.getContentPane();
 	JButton b=new JButton("b1");
 	//b.setBorder(BorderFactory.createLineBorder(Color.blue,50));
 	b.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED,Color.cyan,Color.red));
 	contentPane.add(b);
 	frame.setLocation(500,200);
 	frame.setSize(new Dimension(200,200));
 	frame.show();
 }	
	
}	