import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class cSwingTest28
{ 
 public static void main(String argv[])
 {
 	new cSwingTest28();
 }		
 public cSwingTest28()
 {
 	JFrame frame=new JFrame("cSwingTest28");
 	frame.addWindowListener(new WindowAdapter()
 	{
 	 public void windowClosing(WindowEvent we)
 	 {
 	 	System.exit(0);;
 	 }		
 	});	
 	JLayeredPane layeredPane=frame.getLayeredPane();
 	JButton b1=new JButton("Left Button");
 	b1.setVerticalAlignment(JButton.TOP);
 	b1.setForeground(Color.BLACK);
 	b1.setBackground(Color.red);
 	b1.setOpaque(true);
 	b1.setBounds(50,50,100,100);
 	layeredPane.add(b1,new Integer(100),1);
 	
 	JButton b2=new JButton("Right Button");
 	b2.setVerticalAlignment(JButton.TOP);
 	b2.setForeground(Color.BLACK);
 	b2.setBackground(Color.green);
 	b2.setOpaque(true);
 	b2.setBounds(100,100,100,100);
 	layeredPane.add(b2,new Integer(100),0);
 	
 	frame.setSize(new Dimension(280,280));
 	frame.setVisible(true);
 }
	
}	