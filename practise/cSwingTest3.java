import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class cSwingTest3
{
 public static void main(String argv[])
 {
  JFrame f=new JFrame("cSwingTest3");
  JButton button=new JButton("Swing Test3");
  button.setBackground(Color.GREEN);
  f.setSize(300,300);
  f.addWindowListener(new WindowAdapter()
  {
   public void windowClosing(WindowEvent we)
   {
   	System.exit(0);
   }		
  });	
  f.getContentPane().add(button,BorderLayout.CENTER);
  f.setVisible(true);
 }
}
