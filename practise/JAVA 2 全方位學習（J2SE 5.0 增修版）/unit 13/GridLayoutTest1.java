import java.awt.*;
import java.awt.event.*;
public class GridLayoutTest1 implements ActionListener
{
 Frame f;
 Button b[]=new Button[100];
 public static void main(String argv[])
 {
  new GridLayoutTest1();
 }
 public GridLayoutTest1()
 {
  f=new Frame("GridLayoutTest1");
  f.setLayout(new GridLayout(10,10,5,5));
  for(int i=0;i<100;i++)
  {
   b[i]=new Button(String.valueOf(i));
   b[i].addActionListener(this);
   f.add(b[i]);	
  }	
  f.pack();
  f.setVisible(true);
 }	
 public void actionPerformed(ActionEvent e)
 {
 	Button bb=(Button)e.getSource();
 	f.setTitle(bb.getLabel());
 }	
}
