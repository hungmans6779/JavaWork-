import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class cSwingTest15
{	
 JFrame f;	
 JButton b1;
 JButton b2;
 JButton b3;
 public static void main(String argv[])
 {
  new cSwingTest15();
 }
 public cSwingTest15()
 {
 	f=new JFrame("cSwingTest15");
  f.addWindowListener(new MyEventHandler());
  Container contentPane=f.getContentPane();
  contentPane.setLayout(new FlowLayout());
  b1=new JButton("�o�X���n");
  b1.addActionListener(new MyEventHandler());
  b2=new JButton("��ܷs����");
  b2.addActionListener(new MyEventHandler());
  b3=new JButton("�����{��");
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
 	 f.dispose();
 	}	
 	public void actionPerformed(ActionEvent ae)
 	{
 	 if(ae.getSource()==b1)
 	 {
 	 	System.out.println("�o�X���n");
 	 	Toolkit.getDefaultToolkit().beep();
 	 }		
 	 else if(ae.getSource()==b2)
 	 {
 	 	JFrame f=new JFrame("�s����");
 	 	f.setLocation(500,200);
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
