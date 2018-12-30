import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
public class cSwingTest36
{
 JScrollPane jsp;
 public static void main(String argv[])
 {
  new cSwingTest36();
 }
 public cSwingTest36()
 {
 	JFrame frame=new JFrame("cSwingTest36");
 	jsp=new JScrollPane();
 	frame.addWindowListener(new WindowAdapter()
 	{
 	 public void windowClosing(WindowEvent we)
 	 {
 	 	System.exit(0);
 	 }		
 	});	
 	Container contentPane=frame.getContentPane();
 	contentPane.setLayout(new BorderLayout());
 	JPanel p1=new JPanel();
 	p1.add(new JLabel(new ImageIcon("01.jpg")));
 	jsp.setViewportView(p1);
 	jsp.setColumnHeaderView(new JLabel("水平表頭"));
 	jsp.setRowHeaderView(new JLabel("垂直表頭"));
 	jsp.setViewportBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
 	jsp.setCorner(JScrollPane.UPPER_LEFT_CORNER,new JLabel(new ImageIcon("01.jpg")));
 	jsp.setCorner(JScrollPane.UPPER_RIGHT_CORNER,new JLabel(new ImageIcon("01.jpg")));
 	
 	JButton b1=new JButton("總是顯是水平捲軸");
 	b1.addActionListener(new MyEventHandler());
 	JButton b2=new JButton("從不顯示水平捲軸");
 	b2.addActionListener(new MyEventHandler());
 	JButton b3=new JButton("依實際需要顯示水平顯軸");
 	b3.addActionListener(new MyEventHandler());
 	JPanel p2=new JPanel();
 	p2.setLayout(new GridLayout(3,1));
 	p2.add(b1);
 	p2.add(b2);
 	p2.add(b3);
 	
 	contentPane.add(p2,BorderLayout.WEST);
 	contentPane.add(jsp,BorderLayout.CENTER);
 	frame.setLocation(300,200); 	
 	frame.setSize(new Dimension(600,500));
 	frame.show();
 }
 
 class MyEventHandler implements ActionListener
 {
  public void actionPerformed(ActionEvent ae)
  {
   if(ae.getActionCommand().equals("總是顯是水平捲軸"))
    jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
   else if(ae.getActionCommand().equals("從不顯示水平捲軸"))
    jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
   else
    jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);	
  }		
 }		
 
}