import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class cSwingTest30
{
 public static void main(String argv[])
 {
  new cSwingTest30();
 }
 public cSwingTest30()
 {
  JFrame frame=new JFrame("cSwingTest30");
  frame.addWindowListener(new WindowAdapter()
  {
   public void windowClosing(WindowEvent we)
   {
   	System.exit(0);
   }		
  });	
  Container contentPane=frame.getContentPane();
  contentPane.setLayout(new GridLayout(2,1));
  JLabel label[]=new JLabel[5];
  for(int i=0;i<label.length;i++)
  {
   label[i]=new JLabel("Label "+(i+1),JLabel.CENTER);
   label[i].setBackground(Color.cyan);
   label[i].setBorder(BorderFactory.createEtchedBorder());
   label[i].setOpaque(true);	
  }	
  
  JPanel p1=new JPanel(new BorderLayout());
  p1.add(label[0]);
  
  JPanel p2=new JPanel(new GridLayout(1,2));
  p2.add(label[1]);
  p2.add(label[2]);
  
  JPanel p3=new JPanel(new GridLayout(2,1));
  p3.add(label[3]);
  p3.add(label[4]);
  
  JPanel p4=new JPanel(new GridLayout(1,2));
  p4.add(p2);
  p4.add(p3);
  
  contentPane.add(p1);
  contentPane.add(p4);
  
  frame.setLocation(100,100);
  frame.setSize(new Dimension(300,300));
  frame.setVisible(true);
 }
}