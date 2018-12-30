import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class cSwingTest16
{	
 JFrame f;	
 JButton b1;
 JButton b2;
 JButton b3;
 public static void main(String argv[])
 {
  new cSwingTest16();
 }
 public cSwingTest16()
 {
 	f=new JFrame("cSwingTest16");
  f.addWindowListener(new MyEventHandler());
  Container contentPane=f.getContentPane();
  contentPane.setLayout(new FlowLayout());
  b1=new JButton("發出嗶聲");
  b1.addActionListener(new MyEventHandler());
  b2=new JButton("顯示新視窗");
  b2.addActionListener(new MyEventHandler());
  b3=new JButton("結束程式");
  b3.addActionListener(new MyEventHandler());
  contentPane.add(b1);
  contentPane.add(b2);
  contentPane.add(b3);
  f.setLocation(500,200);
  f.pack();
  f.show();
 }	
  class MyEventHandler extends WindowAdapter implements ActionListener
 {
 	public void windowClosing(WindowEvent we)
 	{
 	 System.exit(0);
 	}	
 	public void actionPerformed(ActionEvent ae)
 	{
 	 if(ae.getActionCommand().equals("發出嗶聲"))
 	 {
 	 	System.out.println("發出嗶聲");
 	 	Toolkit.getDefaultToolkit().beep();
 	 }		
 	 else if(ae.getActionCommand().equals("顯示新視窗"))
 	 {
 	 	JFrame f=new JFrame("新視窗");
 	 	f.setLocation(500,300);
 	 	Container contentPane=f.getContentPane();
 	 	contentPane.setLayout(new FlowLayout());
 	 	contentPane.add(new JButton("b1"));
 	 	contentPane.add(new JButton("b2"));
 	 	f.pack();
 	 	f.show();
 	 }	
 	 else
 	 {
 	 	System.exit(0);
 	 }	
 	}	
 }	
}
