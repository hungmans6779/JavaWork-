import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class cSwingTest8
{
 public static void main(String argv[])
 {
  new cSwingTest8();
 }
 public cSwingTest8()
 {
  JFrame frame=new JFrame("cSwingTest8");
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
  box.add(Box.createHorizontalStrut(50));
  box.add(new JButton("Two"));
  contentPane.add(box);
  //frame.setSize(200,50);
  frame.setSize(new Dimension(200,50));
  frame.setVisible(true);
 }
}