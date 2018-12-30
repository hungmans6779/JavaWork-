import java.awt.*;
import java.awt.event.*;
public class cAwtEventTest15 extends WindowAdapter implements ActionListener
{
 Frame f;
 Button b1,b2;
 public cAwtEventTest15()
 {
 	 f=new Frame("cAwtEventTest1");
 	 f.setLayout(new FlowLayout());
 	 f.addWindowListener(this);
 	 b1=new Button("Left");
 	 b1.addActionListener(this);
 	 b1.setActionCommand("1");
 	 f.add(b1);
 	 b2=new Button("Right");
 	 b2.addActionListener(this);
 	 b2.setActionCommand("2");
 	 b2.setEnabled(false);
 	 f.add(b2);
 	 f.setLocation(300,300);
 	 f.setSize(300,300);
 	 f.pack();
 	 f.setVisible(true);
 }		
 public static void main(String argv[])
 {
  new  cAwtEventTest15();
 }		
 public void windowClosing(WindowEvent we)
 {
 	System.exit(0);
 }	
 public void actionPerformed(ActionEvent ae)
 {
 	String s=ae.getActionCommand();
 	/*
 	if(s.equals("1"))
 	 b2.setEnabled(!b2.isEnabled());
 	else
 	 b1.setEnabled(!b1.isEnabled());
 	*/ 

 	if(s.equals("1"))
 	{
 	 b1.setEnabled(false);
 	 b2.setEnabled(true);
 	} 
 	else
 	{
 	 b2.setEnabled(false);
 	 b1.setEnabled(true);
  } 

 }	
}