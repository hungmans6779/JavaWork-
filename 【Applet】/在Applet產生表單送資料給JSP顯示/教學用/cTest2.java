import java.awt.*;
import java.awt.event.*;
public class cTest2
{
 static Button b1=new Button("����");
 static Button b2=new Button("�k��");		
 public static void main(String argv[])
 {
 	Frame frame=new Frame("���ոյ�");
 	frame.setLayout(new FlowLayout());
 	frame.setSize(200,100);
 	frame.setLocation(200,200);
  EventHandler eh=new EventHandler(); 	


  b2.setEnabled(false);
  b1.addActionListener(eh);
  b2.addActionListener(eh);	
  frame.add(b1);
  frame.add(b2); 	
 	frame.setVisible(true);
 }
 
 public static  class EventHandler implements ActionListener
 {
  public void actionPerformed(ActionEvent ae)
  {
   Button b=(Button)ae.getSource();
   if(b.getLabel().equals("����"))
   {
    b1.setEnabled(!b1.isEnabled());
    b2.setEnabled(!b2.isEnabled());	
   }	
   else
   {
     b1.setEnabled(!b1.isEnabled());
     b2.setEnabled(!b2.isEnabled());	
   }		
  }		
 }	
 		
}	