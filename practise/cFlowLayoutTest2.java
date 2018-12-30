import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class cFlowLayoutTest2 implements ActionListener
{
 JFrame frame;	
 public static void main(String argv[])
 {
  new cFlowLayoutTest2();
 }
 public cFlowLayoutTest2()
 {
 	frame=new JFrame("cFlowLayoutTest2");
 	frame.addWindowListener(new WindowAdapter()
 	{
 	 public void windowClosing(WindowEvent we)
 	 {
 	 	System.exit(0);
 	 }		
 	});	
 	Container contentPane=frame.getContentPane();
 	//contentPane.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
 	//contentPane.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
 	//contentPane.setLayout(new FlowLayout(FlowLayout.RIGHT,10,10));
 	//contentPane.setLayout(new FlowLayout(FlowLayout.LEADING,10,10));
 	contentPane.setLayout(new FlowLayout(FlowLayout.TRAILING,10,10));
  JButton button[]=new JButton[5];
  for(int i=0;i<button.length;i++)
  {
   button[i]=new JButton();
   if(i!=4)
   button[i].setLabel("Button "+(i+1));
   else
   button[i].setLabel("This ia a last JButton");
   button[i].addActionListener(this);
   contentPane.add(button[i]);
   	
  }	
  
 	frame.setSize(new Dimension(200,200));
 	frame.setVisible(true);
 }	
 public void actionPerformed(ActionEvent ae)
 {
 	JButton button=(JButton)ae.getSource();
 	frame.setTitle(button.getLabel());
 }	
}

