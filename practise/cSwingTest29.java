import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class cSwingTest29
{
 JDesktopPane desktopPane=null;	
 int count=1;
 public static void main(String argv[])
 {
  new cSwingTest29();
 }
 public cSwingTest29()
 {
 	JFrame frame=new JFrame("cSwingTest29");
 	frame.addWindowListener(new WindowAdapter()
 	{
 	 public void windowClosing(WindowEvent we)
 	 {
 	  System.exit(0);	
 	 }		
 	});	
 	Container contentPane=frame.getContentPane();
 	contentPane.setLayout(new BorderLayout());
 	JButton button1=new JButton("create new InternamFrame");
 	button1.addActionListener(new MyEventHandler());
 	contentPane.add(button1,BorderLayout.SOUTH);
 	desktopPane=new JDesktopPane();
 	contentPane.add(desktopPane);
 	frame.setLocation(0,0);
 	frame.setSize(new Dimension(800,800));
 	frame.setVisible(true);
 
 }
 class MyEventHandler implements ActionListener
 {
  public void actionPerformed(ActionEvent ae)
  {	
   JInternalFrame internalFrame=new JInternalFrame("JInternalFrame "+count,true,true,true,true);	
   internalFrame.setLocation(-200+count*200,-200+count*200);
   internalFrame.setSize(200,200);
   internalFrame.show();
   count++;
   Container contentPane1=internalFrame.getContentPane();
   JTextArea ta=new JTextArea();
   JButton button=new JButton("InternalFrame");
   contentPane1.add(ta,BorderLayout.CENTER);
   contentPane1.add(button,BorderLayout.SOUTH);
   desktopPane.add(internalFrame);
   try
   {
   	internalFrame.setSelected(true);
   }	
   catch(java.beans.PropertyVetoException e)
   {
    System.out.println("Exception white ...");	
   }	
  	
  }		
 }		
}