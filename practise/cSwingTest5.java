import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class cSwingTest5 implements ActionListener
{
 JFrame frame;	
 JPanel p1,p2,p3,p4;
 JButton button;
 int i=1;
 public static void main(String argv[])
 {
 	new cSwingTest5();
 }
 public cSwingTest5()
 {
 	frame=new JFrame("cSwingTest5");
 	frame.addWindowListener(new WindowAdapter()
 	{
 	 public void windowClosing(WindowEvent we)
 	 {
 	 	System.exit(0);
 	 }		
 	});	
 	Container contentPane=frame.getContentPane();
 	contentPane.setLayout(new GridLayout(2,1));
 	p1=new JPanel();
 	button=new JButton("Changed");
 	button.addActionListener(this);
 	p1.add(button);
 	contentPane.add(p1);
 	
 	p2=new JPanel(new FlowLayout());
 	p2.add(new JButton("one"));
 	p2.add(new JButton("two"));
 	p2.add(new JButton("three"));
 	
 	p3=new JPanel(new GridLayout(3,1));
 	p3.add(new JButton("four"));
 	p3.add(new JButton("five"));
 	p3.add(new JButton("This ia a last JButton"));
 	
 	p4=new JPanel(new CardLayout());
 	p4.add("one",p2);
 	p4.add("two",p3);
 	((CardLayout)p4.getLayout()).show(p4,"one");
 	contentPane.add(p4);
 	frame.pack();
 	frame.setVisible(true);
 }	
 public void actionPerformed(ActionEvent ae)
 {
 	i++;
  switch(i)
  {
   case 1: ((CardLayout)p4.getLayout()).show(p4,"one"); break;
   case 2: ((CardLayout)p4.getLayout()).show(p4,"two"); break;
  }	
  if(i==2)
   i=0;
  frame.validate();
 }			
}	