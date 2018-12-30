import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class cBorderLayoutTest1
{
 JFrame frame;
 Container contentPane;	
 public static void main(String argv[])
 {
 	new cBorderLayoutTest1();
 }	
 public cBorderLayoutTest1()
 {
  frame=new JFrame("cBorderLayoutTest1");
  frame.addWindowListener(new WindowAdapter()
  {
   public void windowClosing()
   {
   	System.exit(0);
   }		
  });	
  contentPane=frame.getContentPane();
  contentPane.setLayout(new BorderLayout(500,10));
  contentPane.add(new JButton("NORTH"),BorderLayout.NORTH);
  contentPane.add(new JButton("EAST"),BorderLayout.EAST);
  contentPane.add(new JButton("SOUTH"),BorderLayout.SOUTH);
  contentPane.add(new JButton("WEST"),BorderLayout.WEST);
  contentPane.add(new JLabel("CENTER",JLabel.CENTER),BorderLayout.CENTER);
  frame.pack();
  frame.setVisible(true);	
 }
}
