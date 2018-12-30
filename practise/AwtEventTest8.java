import java.awt.*;
import java.awt.event.*;
public class AwtEventTest8 implements ActionListener
{
 Frame f;
 Button b1;
 Button b2;		
 public static void main(String argv[])
 {
 	new AwtEventTest8();
 }		
 public AwtEventTest8()
 {
  f=new Frame("AwtEventTest8");
  f.setLayout(new GridLayout(1,2));
  b1=new Button("Left");
  b1.setActionCommand("b1");
  b1.addActionListener(this);
  
  b2=new Button("Right");
  b2.setActionCommand("b2");
  b2.addListener(this);
  
  f.add(b1);
  f.add(b2);
  f.pack();
  f.setVisible(true);	
 }	
 public void actionPerformed(ActionEvent e)
 {
  String cmd=e.getActionCommand();
  	
 }	
}	