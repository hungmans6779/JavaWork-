import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class cSwingTest40
{
 public static void main(String argv[])
 {
 	JFrame frame=new JFrame("cSwingTest40");
 	frame.addWindowListener(new WindowAdapter()
 	{
 	 public void windowClosing(WindowEvent we)
 	 {
 	 	System.exit(0);
 	 }		
 	});	
 	Container contentPane=frame.getContentPane();
 	Icon icon=new ImageIcon("02.jpg");
 	JLabel label=new JLabel(icon,JLabel.CENTER);
 	contentPane.add(label);
 	frame.setLocation(500,200);
 	frame.setSize(new Dimension(500,500));
 	frame.setVisible(true);
 }		
}	