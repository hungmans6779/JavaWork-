import java.awt.*;
import java.awt.event.*;
public class GridLayoutTest2 
{
 static Frame f;
 static Button b[]=new Button[100];
 public static void main(String argv[])
 {
 	String str="GridLayoutTest1";
  f=new Frame(str);
  GridLayout gl=new GridLayout(10,10,5,5);
  f.setLayout(gl);
  for(int i=0;i<100;i++)
  {
   b[i]=new Button(String.valueOf(i));
   b[i].addActionListener(new ButtonHandler());
   f.add(b[i]);	
  }	
  f.pack();
  str+="目前的列("+String.valueOf(gl.getRows())+"),行是("+String.valueOf(gl.getColumns()+")");
  f.setTitle(str);
  f.setVisible(true);
 }
}
class ButtonHandler extends GridLayoutTest2 implements ActionListener
{
 public void actionPerformed(ActionEvent e)
 {
 	Button bb=(Button)e.getSource();
 	f.setTitle(bb.getLabel());
 }	
}
