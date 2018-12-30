import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class cSwingTest6 implements ActionListener
{
 JFrame frame;	
 JPanel p1,p2,p3,p4;
 int count=1;
 JButton button1;
 JButton button2;
 JButton button3;
 JButton button4;
 public static void main(String argv[])
 {
 	new cSwingTest6();
 }
 public cSwingTest6()
 {
 	frame=new JFrame("cSwingTest6");
 	frame.addWindowListener(new WindowAdapter()
 	{
 	 public void windowClosing(WindowEvent we)
 	 {
 	 	System.exit(0);
 	 }		
 	});	
 	Container contentPane=frame.getContentPane();
 	contentPane.setLayout(new GridLayout(2,1));
 	p1=new JPanel(new FlowLayout());
 	button1=new JButton("第一頁");
 	button1.setActionCommand("1");
 	button1.addActionListener(this);
  button2=new JButton("上一頁");
 	button2.setActionCommand("2");
 	button2.addActionListener(this); 	
  button3=new JButton("下一頁");
 	button3.setActionCommand("3");
 	button3.addActionListener(this);  	
 	button4=new JButton("最後頁");
 	button4.setActionCommand("4");
 	button4.addActionListener(this); 
 	p1.add(button1);
 	p1.add(button2);
 	p1.add(button3);
 	p1.add(button4);
 	contentPane.add(p1);
 	
 	p2=new JPanel(new FlowLayout());
 	p2.add(new JButton("one"));
 	p2.add(new JButton("two"));
 	p2.add(new JButton("three"));
 	
 	p3=new JPanel(new GridLayout(3,1));
 	p3.add(new JButton("four"));
 	p3.add(new JButton("five"));
 	p3.add(new JButton("This ia a last JButton"));
 	
 	JPanel p5=new JPanel(new GridLayout(2,3));
 	p5.add(new JButton("1"));
 	p5.add(new JButton("2"));
 	p5.add(new JButton("3"));
 	p5.add(new JButton("4"));
 	p5.add(new JButton("5"));
 	p5.add(new JButton("6"));
 	
 	p4=new JPanel(new CardLayout());
 	p4.add("one",p2);
 	p4.add("two",p3);
 	p4.add("three",p5);
 	((CardLayout)p4.getLayout()).show(p4,"one");
 	contentPane.add(p4);
 	frame.pack();
 	frame.setVisible(true);
 }	
 public void actionPerformed(ActionEvent ae)
 {
  JButton button=(JButton)ae.getSource();
  button.setEnabled(true);
  int s=Integer.parseInt(button.getActionCommand());
  switch(s)
  {
   case 1: ((CardLayout)p4.getLayout()).first(p4); count=1; break;
   case 2: ((CardLayout)p4.getLayout()).previous(p4); count--; break;
   case 3: ((CardLayout)p4.getLayout()).next(p4);  count++; break;
   case 4: ((CardLayout)p4.getLayout()).last(p4); count=3; break;
  }	
  boolean b1=(count==1)?false:true;
  boolean b4=(count==3)?false:true;
  button1.setEnabled(b1);
  button2.setEnabled(b1);
  button3.setEnabled(b4);
  button4.setEnabled(b4);
 }			
}	