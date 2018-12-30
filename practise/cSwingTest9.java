import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class cSwingTest9
{
 public static void main(String argv[])
 {
  new cSwingTest9();
 }
 public cSwingTest9()
 {
  JFrame frame=new JFrame("cSwingTest9");
  frame.addWindowListener(new WindowAdapter()
  {
   public void windowClosing(WindowEvent we)
   {
   	System.exit(0);
   }		
  });	
  Container contentPane=frame.getContentPane();
  Box box=new Box(BoxLayout.X_AXIS);
  //Box box=Box.createHorizontalBox();
  box.add(new JButton("One"));
  
  //box.add(Box.createHorizontalGlue());
  
  //box.add(Box.createHorizontalStrut(50));
  
  //box.add(Box.createRigidArea(new Dimension(50,100)));
  
  box.add(new Box.Filler(new Dimension(50,50),new Dimension(100,50),new Dimension(200,50)));
  
  box.add(new JButton("Two"));
  contentPane.add(box);
  //frame.setSize(200,50);
  frame.pack();
  frame.setVisible(true);
 }
}