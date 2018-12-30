import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class cSwingTest35
{
 JScrollPane jsb;	
 public static void main(String argv[])
 {
 	new cSwingTest35();
 }		
 public cSwingTest35()
 {
 	JFrame frame=new JFrame("cSwingTest35");
 	frame.addWindowListener(new WindowAdapter()
 	{
 	 public void windowClosing(WindowEvent we)
 	 {
 	 	System.exit(0);
 	 }	
 	});	
 	Container contentPane=frame.getContentPane();
 	contentPane.setLayout(new BorderLayout());
 	JLabel l=new JLabel(new ImageIcon("02.jpg"));
 	JPanel p1=new JPanel();
 	p1.setLayout(new BorderLayout());
 	p1.add(l);
 	jsb=new JScrollPane(p1);
 	
 	JPanel p2=new JPanel();
 	p2.setLayout(new GridLayout(3,1));
 	JButton b1=new JButton("總是顯示水平捲軸");
 	b1.addActionListener(new MyEventHandler());
 	JButton b2=new JButton("不顯示水平捲軸");
 	b2.addActionListener(new MyEventHandler());
 	JButton b3=new JButton("依照實際狀況顯示");
 	b3.addActionListener(new MyEventHandler());
 	p2.add(b1);
 	p2.add(b2);
 	p2.add(b3);
 	
 	contentPane.add(p2,BorderLayout.WEST);
 	contentPane.add(jsb,BorderLayout.CENTER);
 	frame.setLocation(300,200);
 	//frame.setSize(new Dimension(350,220));
 	frame.pack();
 	frame.show();
 }	
 
 class MyEventHandler implements ActionListener
 {
 	public void actionPerformed(ActionEvent ae)
 	{	
 	 if(ae.getActionCommand().equals("總是顯示水平捲軸"))
 	 	jsb.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
 	 else if(ae.getActionCommand().equals("不顯示水平捲軸"))
    jsb.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER); 	 		
 	 else
 	 	jsb.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
 
 	// jsb.revalidate();
 	}	
 }	
}