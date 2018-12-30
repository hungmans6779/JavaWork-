import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class cGridLayoutTest1
{
 public static void main(String argv[])
 {
  JFrame frame=new JFrame("cGridLayoutTest1");
  frame.addWindowListener(new WindowAdapter()
  {
   public void windowClosing(WindowEvent we)
   {
   	System.exit(0);
   }	
  });	
  Container contentPane=frame.getContentPane();
  contentPane.setLayout(new GridLayout(5,2));
  contentPane.add(new JButton("one"));
  contentPane.add(new JButton("two"));
  contentPane.add(new JButton("three"));
  contentPane.add(new JButton("four"));
  contentPane.add(new JButton("five"));
  contentPane.add(new JButton("This is a last JButton"));
  frame.pack();
  //frame.setSize(new Dimension(200,200));
  frame.setVisible(true);
 }
}