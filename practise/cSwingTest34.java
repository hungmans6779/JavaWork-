import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class cSwingTest34
{
 JTabbedPane tabbedPane;	
 int index=0;
 int number=1;
 public static void main(String argv[])
 {
  new cSwingTest34();
 }
 public cSwingTest34()
 {
  JFrame frame=new JFrame("cSwingTest34");
  frame.addWindowListener(new WindowAdapter()
  {
   public void windowClosing(WindowEvent we)
   {
    System.exit(0);	
   }		
  });	
  Container contentPane=frame.getContentPane();
  JLabel label11=new JLabel(new ImageIcon("01.jpg"));
  JLabel label12=new JLabel("�ݧڭ̪�t�S��..�F�`�a�I",JLabel.CENTER);
  label12.setVerticalAlignment(JLabel.TOP);
  label12.setBackground(Color.pink);
  label12.setOpaque(true);
  JPanel p1=new JPanel(new BorderLayout());
  p1.add(label11,BorderLayout.CENTER);
  p1.add(label12,BorderLayout.NORTH);
  
  JLabel label21=new JLabel(new ImageIcon("02.jpg"));
  JLabel label22=new JLabel("�ڭ̬O�i�R���p�߫}",JLabel.CENTER);
  label22.setVerticalAlignment(JLabel.TOP);
  label22.setBackground(Color.green);
  label22.setOpaque(true);
  JPanel p2=new JPanel(new BorderLayout());
  p2.add(label21,BorderLayout.CENTER);
  p2.add(label22,BorderLayout.NORTH);
  
  JLabel label31=new JLabel(new ImageIcon("03.jpg"));
  JLabel label32=new JLabel("�ڭ̬O����|���",JLabel.CENTER);
  label32.setVerticalAlignment(JLabel.TOP);
  label32.setBackground(Color.yellow);
  label32.setOpaque(true);
  JPanel p3=new JPanel(new BorderLayout());
  p3.add(label31,BorderLayout.CENTER);
  p3.add(label32,BorderLayout.NORTH);
  
  tabbedPane=new JTabbedPane();
  tabbedPane.setTabPlacement(JTabbedPane.LEFT);
  tabbedPane.addChangeListener(new MyEventHandler());
  tabbedPane.addTab("��t�S�ު���",p1);
  tabbedPane.addTab("�i�R���߫}",p2);
  tabbedPane.addTab("����|���",p3);
  tabbedPane.setEnabledAt(2,false);
  contentPane.setLayout(new BorderLayout());
  JButton button=new JButton("�s�W�@�Ӽ���");
  button.setBackground(Color.cyan);
  button.addActionListener(new MyEventHandler());
  contentPane.add(button,BorderLayout.NORTH);
  contentPane.add(tabbedPane,BorderLayout.CENTER);
  frame.setLocation(500,200);
  frame.pack();
  frame.show();
 }
 class MyEventHandler implements ActionListener,ChangeListener
 {
 	public void stateChanged(ChangeEvent ce)
 	{
 	 if(index!=tabbedPane.getSelectedIndex())
 	 {
 	 	if(index<tabbedPane.getTabCount()-1)
 	 	{
 	 	 tabbedPane.setEnabledAt(index+1,true);	
 	 	}	
 	 }		
 	 index=tabbedPane.getSelectedIndex();	
 	}	
  public void actionPerformed(ActionEvent ae)
  {
   String str="�s������ "+number;
   JLabel label=new JLabel(str,JLabel.CENTER);
   label.setVerticalAlignment(JLabel.TOP);
   label.setBackground(Color.green);
   label.setOpaque(true);
   JPanel p=new JPanel();
   p.add(label);
   tabbedPane.addTab(str,p);
   tabbedPane.setEnabledAt(number+2,false);
   number++;
   tabbedPane.validate();
  }		
 }
}