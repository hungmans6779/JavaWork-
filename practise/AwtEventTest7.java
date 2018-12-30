import java.awt.*;
import java.awt.event.*;
public class AwtEventTest7 extends KeyAdapter
{
 Frame f;
 public AwtEventTest7()
 {
  f=new Frame("AwtEventTest7");
  f.addKeyListener(this);
  f.setSize(200,200);
  f.setVisible(true);	
 }		
 public static void main(String argv[])
 {
  new AwtEventTest7(); 
 }
 public void keyPressed(KeyEvent ke)
 {
 	System.out.println("========================");
 	System.out.println("Some key pressed...");
 	System.out.println("The KeyCode is:"+ke.getKeyCode());
 	String str="";
 	str=KeyEvent.getKeyModifiersText(ke.getModifiers());
 	System.out.println("Modifier text:"+str);
 	str=KeyEvent.getKeyText(ke.getKeyCode());
 	System.out.println("Key Text:"+str);
 }
 public void keyTyped(KeyEvent ke)
 {
 	System.out.println("Some type pressed...");
 	System.out.println("The KeyChar is¡G"+ke.getKeyChar());
 }		
}