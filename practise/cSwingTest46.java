import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class cSwingTest46
{
 public static void main(String argv[])
 {
  new cSwingTest46();
 }
 public cSwingTest46()
 {
 	JFrame frame=new JFrame("cSwingTest46");
 	frame.addWindowListener(new WindowAdapter()
 	{
 	 public void windowClosing()
 	 {
 	  System.exit(0);	
 	 }		
 	});	
 	Container contentPane=frame.getContentPane();
  JButton button=new JButton("Àb«È",new ImageIcon("04.jpg"));
  button.setHorizontalTextPosition(JButton.CENTER);
  button.setVerticalTextPosition(JButton.BOTTOM);
  contentPane.add(button);
  frame.setLocation(500,200);
  frame.pack();
  frame.show();
 
 }	
}