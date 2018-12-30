import java.awt.*;
import java.awt.event.*;
public class cAwtEventTest26 extends WindowAdapter implements ActionListener,TextListener
{
 Frame f;	
 Label label;
 TextField tf;
 public static void main(String argv[])
 { 
  new cAwtEventTest26();
 }
 public cAwtEventTest26()
 {
 	f=new Frame("cAwtEventTest26");
 	f.setLocation(300,300);
 	f.setLayout(new GridLayout(2,1));
 	f.addWindowListener(this);
 	label=new Label("");
 	tf=new TextField("",10);
 	tf.addTextListener(this);
 	tf.addActionListener(this);
 	f.add(tf);
 	f.add(label);
 	f.pack();
 	f.setVisible(true);
 }	
 
 public void windowClosing(WindowEvent we)
 {
  System.exit(0);	
 }	
 public void actionPerformed(ActionEvent ae)
 {
 	label.setText("");
 }
 public void textValueChanged(TextEvent te)
 {
 	TextField tf=(TextField)te.getSource();
 	label.setText(tf.getText());
 }		
}