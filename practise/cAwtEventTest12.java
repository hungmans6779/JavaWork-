import java.awt.*;
import java.awt.event.*;
public class cAwtEventTest12 extends WindowAdapter implements FocusListener
{
 Frame f;
 public cAwtEventTest12()
 {
  f=new Frame();
  f.setLocation(200,200);
  f.setLayout(new FlowLayout());
  f.addWindowListener(this);
  f.setSize(300,300);
  Button b1=new Button("Button1");
  Button b2=new Button("Button2");
  b1.setSize(50,50);
  b2.setSize(50,50);
  b1.addFocusListener(this);
  b2.addFocusListener(this);
  b2.requestFocus();
  f.add(b1);
  f.add(b2);
  f.pack();
  f.setVisible(true);	
 }		
 public static void main(String argv[])
 {
  new cAwtEventTest12();
 }
 public void focusGained(FocusEvent fe)
 {
 	Button button=(Button)fe.getSource();
 	System.out.println("==============================================");
  System.out.println(((Button)fe.getSource()).getLabel()+"¾켹딩헕");
 }
 public void focusLost(FocusEvent fe)
 {
   System.out.println(((Button)fe.getSource()).getLabel()+"ⅱ쩲딩헕");	
 }		
 public void windowClosing(WindowEvent we)
 {
 	System.exit(0);
 }
}