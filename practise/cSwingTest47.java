import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class cSwingTest47
{
 public static void main(String argv[])
 {
 	new cSwingTest47();
 }	
 public cSwingTest47()
 {
 	JFrame frame=new JFrame("cSwingTest47");
 	frame.addWindowListener(new WindowAdapter()
 	{
 	 public void windowClosing(WindowEvent we)
 	 {
 	 	System.exit(0);
 	 }		
 	});
 	Container contentPane=frame.getContentPane();
 	
 	final JButton button=new JButton();
  button.setDisabledIcon(new ImageIcon("04.jpg"));
  
  button.setIcon(new ImageIcon("05.jpg"));
  button.setRolloverIcon(new ImageIcon("06.jpg"));
  button.setPressedIcon(new ImageIcon("07.jpg"));
 	JPanel p=new JPanel();
 	JButton b1=new JButton("­P¯à");
 	b1.addActionListener(new ActionListener()
 	{
 	 public void actionPerformed(ActionEvent ae)
 	 {
 	  button.setEnabled(true);	
 	 }		
 	});	
 	JButton b2=new JButton("°£¯à");
 	b2.addActionListener(new ActionListener()
 	{
 	 public void actionPerformed(ActionEvent ae)
 	 {
 	  button.setEnabled(false);	
 	 }		
 	});	
 	p.add(b1);
 	p.add(b2);
 	contentPane.add(button,BorderLayout.CENTER);
 	contentPane.add(p,BorderLayout.SOUTH);
 	
 	frame.setLocation(500,200);
 	//frame.setSize(new Dimension(300,300));
 	frame.pack();
 	frame.show();
 		
 }	
}