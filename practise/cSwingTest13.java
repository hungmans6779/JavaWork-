import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class cSwingTest13
{
 public static void main(String argv[])
 {
 	JFrame f=new JFrame("cSwingTest13");
 	f.addWindowListener(new WindowAdapter()
 	{
 	 public void windowClosing(WindowEvent we)
 	 {
 	 	System.exit(0);
 	 }		
 	});	
 	Container contentPane=f.getContentPane();
 	JButton b1=new JButton("µo•XπÕ¡n");
 	b1.addActionListener(new ActionListener()
 	{
 	 public void actionPerformed(ActionEvent ae)
 	 {
 	  Toolkit.getDefaultToolkit().beep();	
 	 }		
 	});	
  contentPane.add(b1);
  f.setLocation(500,200);
  f.pack();
  f.setVisible(true);
 }	
}