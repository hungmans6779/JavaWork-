import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class cSwingTest4 
{
 public static void main(String argv[])
 {
  JFrame frame=new JFrame("cSwingTest4");
  final JLabel label=new JLabel("Test JButton");
  label.setFont(new Font("dialog",Font.BOLD,30));
  frame.addWindowListener(new WindowAdapter()
  {
   public void windowClosing(WindowEvent we)
   {
    System.exit(0);	
   }		
  });	
  Container contain=frame.getContentPane();
  contain.setLayout(new GridLayout(2,1));
  JButton button=new JButton("Swing Button");
  button.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent ae)
   {
    label.setText("我被按到了");	
   }		
  });	
  contain.add(button);
  contain.add(label);
  frame.pack();
  frame.setVisible(true);
 }
}
