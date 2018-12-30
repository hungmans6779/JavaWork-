import java.awt.*;
import java.awt.event.*;
public class hAwtTest1
{
 Frame frame;
 TextField tfPassword;
 Label labOutData;
 public static void main(String argv[])
 {
  new hAwtTest1();
 }
 public hAwtTest1()
 {
  frame=new Frame("cAwtTest1");
  frame.addWindowListener(new WindowAdapter()
  {
   public void windowClosing(WindowEvent we)
   {
   	System.exit(0);
   }		
  });	
  frame.setLayout(new GridLayout(2,1));
  frame.setLocation(500,200);
  
  tfPassword=new TextField(10);
  tfPassword.setEchoChar('*');
  tfPassword.addTextListener(new MyEventHandler());
  labOutData =new Label();
  frame.add(tfPassword);
  frame.add(labOutData);
  frame.setSize(200,80);
  frame.show();
 }
 class MyEventHandler implements TextListener
 {
  public void textValueChanged(TextEvent te)
  {
   String data=((TextField)te.getSource()).getText();
   labOutData.setText((data.length()>10)?data.substring(0,10):data);
   if(data.length()>10)
   {
     tfPassword.setText(data.substring(0,10));
     tfPassword.setCaretPosition(10);
   }	
   
  }	
 }	
}


	