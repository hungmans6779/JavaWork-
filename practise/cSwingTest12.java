import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class cSwingTest12
{
 JFrame f;	
 public static void main(String argv[])
 {
 	new cSwingTest12();
 }	
 public cSwingTest12()
 {
 	f=new JFrame("cSwingTest12");
 	f.addWindowListener(new WindowAdapter()
 	{
 	 public void windowClosing(WindowEvent we)
 	 {	
 	  System.exit(0);	
 	 } 
 	});	
 	Container contentPane=f.getContentPane();
 	JButton b1=new JButton("發出嗶聲");
 	b1.addActionListener(new MyListener());
 	contentPane.add(b1);
 	f.setLocation(500,200);
 	f.pack();
 	f.setVisible(true);
 }
 class MyListener implements ActionListener
 {
 	public void actionPerformed(ActionEvent ae)
 	{
 	 System.out.println("嗶一聲了");
 	 Toolkit.getDefaultToolkit().beep();	
 	}	
 }		
}