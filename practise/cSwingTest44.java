import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class cSwingTest44
{
 public static void main(String argv[])
 {
  new cSwingTest44();
 }
 public cSwingTest44()
 {
  JFrame frame=new JFrame("cSwingTest44");
  frame.addWindowListener(new WindowAdapter()
  {
   public void windowClosing(WindowEvent we)
   {
   	System.exit(0);
   }		
  });		
  Container contentPane=frame.getContentPane();
  JLabel label=new JLabel();
  label.setText("¹q¸£Àb«È");
  label.setHorizontalAlignment(JLabel.RIGHT);
  label.setVerticalAlignment(JLabel.TOP);
  contentPane.add(label);
  frame.setLocation(100,100);
  frame.setSize(new Dimension(200,200));
  frame.show();
 }	
}