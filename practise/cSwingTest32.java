import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class cSwingTest32
{
 int count=1;
 JPanel p4;
 public static void main(String argv[])
 {
 	new cSwingTest32();
 }	
 public cSwingTest32()
 {
  JFrame frame=new JFrame("cSwingTest32");
  frame.addWindowListener(new WindowAdapter()
  {
   public void windowClosing(WindowEvent we)
   {
    System.exit(0);	
   }		
  });		
  Container contentPane=frame.getContentPane();
  JButton button=new JButton("¤Á´«");
  button.addActionListener(new MyEventHandler());
  contentPane.setLayout(new BorderLayout());
  JPanel p1=new JPanel();
  p1.add(button);
  contentPane.add(p1,BorderLayout.NORTH);
  
  JPanel p2=new JPanel(new GridLayout(1,3));
  p2.add(new JButton("One"));
  p2.add(new JButton("Two"));
  p2.add(new JButton("Three"));
  
  JPanel p3=new JPanel(new GridLayout(3,1));
  p3.add(new JButton("four"));
  p3.add(new JButton("five"));
  p3.add(new JButton("This is a last JButton"));
  
  p4=new JPanel(new CardLayout());
  p4.add("one",p2);
  p4.add("two",p3);
  ((CardLayout)p4.getLayout()).show(p4,"one");
  
  contentPane.add(p4,BorderLayout.CENTER);
  frame.setLocation(300,200);
  frame.setSize(new Dimension(500,500));
  frame.show();
  
 }	
 
 class MyEventHandler implements ActionListener
 {
  public void actionPerformed(ActionEvent ae)
  {
   count++;
   switch(count)
   {
   	case 1: ((CardLayout)p4.getLayout()).show(p4,"one"); break;
   	case 2: ((CardLayout)p4.getLayout()).show(p4,"two"); break;
   	default: assert false;
   }
   if(count==2)
    count=0;
  }		
 }	
}