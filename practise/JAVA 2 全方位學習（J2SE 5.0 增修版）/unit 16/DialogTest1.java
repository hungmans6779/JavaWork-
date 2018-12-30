import java.awt.*;
import java.awt.event.*;
public class DialogTest1 extends WindowAdapter implements ActionListener
{
 Frame f;
 Checkbox cb;
 Button b;
 Dialog d;
 public static void main(String argv[])
 {
 	new DialogTest1();
 }		
 public DialogTest1()
 {
 	f=new Frame("DialogTest1");
 	f.setLayout(new BorderLayout());
 	cb=new Checkbox("Modal",true);
 	b=new Button("���Dialog");
 	b.addActionListener(this);
 	f.add(cb,BorderLayout.NORTH);
 	f.add(b,BorderLayout.CENTER);
 	f.pack();
 	f.setVisible(true);	
 }
 public void actionPerformed(ActionEvent e)
 {
 	d=new Dialog(f,"I am Dialog ......",cb.getState());
 	d.addWindowListener(this);
 	d.setSize(500,300);
 	d.setLocation(100,200);
 	b.setEnabled(false);
 	d.setVisible(true);
 	
 }	
 public void windowClosing(WindowEvent e)
 {
  d.dispose();
 	//d.setVisible(false);
 	b.setEnabled(true);
 }		
}	