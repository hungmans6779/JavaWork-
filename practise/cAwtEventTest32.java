import java.awt.*;
import java.awt.event.*;
public class cAwtEventTest32 extends WindowAdapter implements ActionListener
{
 Frame frame;
 Checkbox cb;
 Button button;	
 Dialog dialog;
 public static void main(String argv[])
 {
  new cAwtEventTest32();
 }
 public cAwtEventTest32()
 {
  frame=new Frame("cAwtEventTest32");
  frame.addWindowListener(this);
  cb=new Checkbox("Modal");
  button=new Button("Show Dialog");
  button.addActionListener(this);
  frame.add(cb,BorderLayout.NORTH);
  frame.add(button,BorderLayout.CENTER);
  frame.pack();
  frame.setVisible(true);
 }
 public void actionPerformed(ActionEvent ae)
 {
 	dialog=new Dialog(frame,"I am a Dialog",cb.getState());
 	dialog.addWindowListener(this);
 	dialog.setLocation(100,100);
 	dialog.setSize(200,200);
 	button.setEnabled(false);
 	dialog.show();
 }
 public void windowClosing(WindowEvent we)
 {
 	try
 	{
 	Frame frame=(Frame)we.getSource();
 	System.exit(0);
  } 
  catch(Exception e)
  {	
   Dialog dd=(Dialog)we.getSource();
 	 //dialog.dispose();
 	 System.out.println(dd.getTitle());
 	 dd.dispose();
 	 button.setEnabled(true);
 	} 
 }		
}