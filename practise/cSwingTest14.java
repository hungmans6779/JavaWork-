import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class cSwingTest14
{
 public static void main(String argv[])
 {
  JFrame f=new JFrame("cSwingTest14");
  f.addWindowListener(new MyEventHandler());
  Container contentPane=f.getContentPane();
  JButton b1=new JButton("�o�X�ͤ@�n");
  b1.addActionListener(new MyEventHandler());
  contentPane.add(b1);
  f.pack();
  f.setLocation(500,200);
  f.show();
 }
}

class MyEventHandler extends WindowAdapter implements ActionListener
{
 public void actionPerformed(ActionEvent ae)
 {
  System.out.println("�ͤ@�n�F...");
  Toolkit.getDefaultToolkit().beep();	
 }	
 public void windowClosing(WindowEvent we)
 {
 	System.exit(0);
 }	
}