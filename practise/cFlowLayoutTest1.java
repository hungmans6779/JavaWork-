import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class cFlowLayoutTest1 implements ActionListener
{
 JFrame frame;	
 public static void main(String argv[])
 {
  new cFlowLayoutTest1();
 }
 public cFlowLayoutTest1()
 {
 	frame=new JFrame("cFlowLayoutTest1");
 	frame.addWindowListener(new WindowAdapter()
 	{
 	 public void windowClosing(WindowEvent we)
 	 {
 	 	System.exit(0);
 	 }		
 	});	
 	Container contentPane=frame.getContentPane();
 	contentPane.setLayout(new FlowLayout());
  JButton b1=new JButton("one");
  b1.addActionListener(this);
  contentPane.add(b1);
 	//contentPane.add(new JButton("One"));
 	contentPane.add(new JButton("Two"));
 	contentPane.add(new JButton("Three"));
 	contentPane.add(new JButton("Four"));
 	contentPane.add(new JButton("Five"));
 	contentPane.add(new JButton("This ia a last Button"));
 	frame.setSize(new Dimension(200,200));
 	frame.setVisible(true);
 }	
 public void actionPerformed(ActionEvent ae)
 {
 	JButton button=(JButton)ae.getSource();
 	frame.setTitle(button.getLabel());
 }	
}

