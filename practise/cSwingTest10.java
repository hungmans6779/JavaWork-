import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class cSwingTest10
{
 public static void main(String argv[])
 {
  new cSwingTest10();
 }
 public cSwingTest10()
 {
  JFrame frame=new JFrame("cSwingTest10");
  frame.addWindowListener(new WindowAdapter()
  {
   public void windowClosing(WindowEvent we)
   {
    System.exit(0);	
   }	
  });		
  Container contentPane=frame.getContentPane();

  Box baseBox=new Box(BoxLayout.X_AXIS);
  Box hBox=Box.createHorizontalBox();
  Box vBox1=Box.createVerticalBox();
  Box vBox2=Box.createVerticalBox();
  Box vBox3=new Box(BoxLayout.X_AXIS);
  Box vBox4=Box.createVerticalBox();
  
  baseBox.add(vBox1);
  baseBox.add(vBox2);
  vBox1.add(new JButton("first"));
  JButton b3=new JButton("third");
  b3.setMaximumSize(new Dimension(100,150));
  vBox1.add(b3);
  
  vBox3.add(Box.createVerticalStrut(50));
  vBox3.add(new JButton("fouth"));
  vBox3.add(Box.createVerticalStrut(50));
  
  vBox4.add(Box.createVerticalGlue());
  vBox4.add(new JButton("This is the last JButton"));
  hBox.add(vBox3);
  hBox.add(vBox4);
  
  JButton b2=new JButton("second");
  b2.setAlignmentX(Component.CENTER_ALIGNMENT);
  b2.setMaximumSize(new Dimension(300,50));
  vBox2.add(b2);
  vBox2.add(hBox);
  
  
  
  
  contentPane.add(baseBox);  
  //frame.setSize(new Dimension(300,300));
  frame.pack();
  frame.setVisible(true);
 }
 	
}