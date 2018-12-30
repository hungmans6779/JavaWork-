import java.awt.*;
import java.awt.event.*;
public class ButtonTest1 implements ActionListener
{
 Button b1,b2;
 public static void main(String argv[])
 {
  new ButtonTest1();
 }
 public ButtonTest1()
 {
  Frame f=new Frame("ButtonTest1");
  f.setLayout(new GridLayout(1,2));
  b1=new Button("LEFT");
  b1.setActionCommand("b1");
  b1.addActionListener(this);
  b2=new Button("Right");
  b2.setActionCommand("b2");
  b2.setEnabled(false);
  b2.addActionListener(this);
  f.add(b1);
  f.add(b2);
  f.pack();
  f.setVisible(true);
 }
 public void actionPerformed(ActionEvent e)
 {
  String str=e.getActionCommand();
  //if(str=="b1")
  if(str.equals("b1"))
  {
   b1.setEnabled(false);	
   b2.setEnabled(!b2.isEnabled());
  }
  else
  {
   b2.setEnabled(false);
   b1.setEnabled(!b1.isEnabled());
  }
 }
}
