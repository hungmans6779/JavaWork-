import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class hSwingTest1
{
 public static void main(String argv[])
 {
  JFrame f=new JFrame("hSwingTest1");
  f.setLayout(new FlowLayout());
  f.addWindowListener(new WindowAdapter()
  {
   public void windowClosing(WindowEvent we)
   {
   	System.exit(0);
   }		
  });	
  JButton button=new JButton("Swing JButton");
  button.setBackground(Color.GREEN);
  f.setSize(300,300);
  f.getContentPane().add(button);
  f.setVisible(true);
 }
}