import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class cSwingTest11
{
 public static void main(String argv[])
 {
  JFrame frame=new JFrame("cSwingTest11");
  frame.addWindowListener(new WindowAdapter()
  {
   public void windowClosing(WindowEvent we)
   {
    System.exit(0);	
   }		
  });	
  Container contentPane=frame.getContentPane();
  contentPane.setLayout(new FlowLayout());
  JButton button=new JButton("按我有聲音喔");
  button.addActionListener(new ActionHandlerTest11());
  contentPane.add(button);
  frame.setLocation(500,200);
  frame.pack();
  frame.show();
 }
}

class ActionHandlerTest11 implements ActionListener
{
 public void actionPerformed(ActionEvent ae)
 {
 	System.out.println("test");
  Toolkit.getDefaultToolkit().beep();
 }
}