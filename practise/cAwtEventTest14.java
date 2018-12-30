import java.awt.*;
import java.awt.event.*;
public class cAwtEventTest14 extends WindowAdapter implements ActionListener
{
 Frame f;
 public cAwtEventTest14()
 {
 	 f=new Frame("cAwtEventTest1");
 	 f.setLayout(new FlowLayout());
 	 f.addWindowListener(this);
 	 Button b1=new Button("B1");
 	 b1.addActionListener(this);
 	 b1.setActionCommand("1");
 	 f.add(b1);
 	 Button b2=new Button("B2");
 	 b2.addActionListener(this);
 	 b2.setActionCommand("2");
 	 f.add(b2);
 	 f.setLocation(300,300);
 	 f.setSize(300,300);
 	 f.pack();
 	 f.setVisible(true);
 }		
 public static void main(String argv[])
 {
  new  cAwtEventTest14();
 }		
 public void windowClosing(WindowEvent we)
 {
 	System.exit(0);
 }	
 public void actionPerformed(ActionEvent ae)
 {
  Button button=(Button)ae.getSource();
  switch(Integer.parseInt(button.getActionCommand()))
  {
   case 1: System.out.println("button1被按下了"); break;
   case 2: System.out.println("button2被按下了"); break;
   default: break;	
  }	
 }	
}