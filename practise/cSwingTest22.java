import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class cSwingTest22
{	
 public static void main(String argv[])
 {
 	new cSwingTest22();
 }	
 public cSwingTest22()
 {
  JFrame frame=new JFrame("cSwingTest22");
  frame.addWindowListener(new WindowAdapter()
  {
   public void windowClosing(WindowEvent we)
   {
    System.exit(0);	
   }		
  });	
  Container contentPane=frame.getContentPane();
  JButton button=new JButton("JButton");
  button.addActionListener(new MyEventHandler());
  contentPane.add(button);
  frame.setLocation(500,300);
  frame.pack();
  frame.show();
 }	
 class MyEventHandler implements ActionListener
 {
  public void actionPerformed(ActionEvent ae)
  {
   JFrame f=new JFrame("·sµøµ¡");
   f.setLocation(200,200);
   f.setSize(100,100);
   f.show();	
  }		
 }	
}