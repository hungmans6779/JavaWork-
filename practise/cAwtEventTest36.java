import java.awt.*;
import java.awt.event.*;
public class cAwtEventTest36 implements TextListener
{	
 Frame f;
 public static void main(String argv[])
 {
  new cAwtEventTest36();
 }
 public cAwtEventTest36()
 {
  f=new Frame("cAwtEventTest36");
  f.addWindowListener(new WindowAdapter()
  {
   public void windowClosing(WindowEvent we)
   {
    System.exit(0);	
   }		
  });	
  TextField tfPassword=new TextField(10);
  tfPassword.setEchoChar('*');
  tfPassword.addTextListener(this);
  f.add(tfPassword);
  //f.setSize(new Dimension(200,200));
  f.pack();
  f.setVisible(true); 	
 }	
 public void textValueChanged(TextEvent te)
 {
 	TextField tf=(TextField)te.getSource();
 	String str=tf.getText();
 	f.setTitle(str);
 }	
}