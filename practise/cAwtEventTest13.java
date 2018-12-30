import java.awt.*;
import java.awt.event.*;
public class cAwtEventTest13 extends ComponentAdapter implements ActionListener
{
 Frame f;
 public cAwtEventTest13()
 {
  f=new Frame();
  f.setLocation(200,200);
  f.setLayout(new FlowLayout());
  f.setSize(300,300);
  f.addComponentListener(this);
  Button b1=new Button("Button1");
  Button b2=new Button("Button2");
  
  b1.setSize(50,50);
  b2.setSize(50,50);
  b1.addActionListener(this);
  b2.addActionListener(this);
   
  f.add(b1);
  f.add(b2);
  f.pack();
  f.setVisible(true);	
 }		
 public static void main(String argv[])
 {
  new cAwtEventTest13();
 }

 public void actionPerformed(ActionEvent ae)
 {
 	Button b=(Button)ae.getSource();
  f.setTitle(b.getLabel());	
 }	
}