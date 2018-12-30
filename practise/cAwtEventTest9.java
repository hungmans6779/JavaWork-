import java.awt.*;
import java.awt.event.*;
public class cAwtEventTest9 extends KeyAdapter
{
 Frame f;
 public cAwtEventTest9()
 {
 	f=new Frame();
 	f.addKeyListener(this);
 	f.setLocation(500,500);
 	f.setSize(300,300);
 	f.setVisible(true);
 }	
 public static void main(String argv[])
 {
  new cAwtEventTest9(); 	
 }	
 public void keyPressed(KeyEvent ke)
 {
 	System.out.println("====================================");
  System.out.println("Some Key pressed...");
  System.out.println("The KeyCode="+ke.getKeyCode());
  System.out.println("keyChar="+ke.getKeyChar());
  System.out.println("ModifieText="+KeyEvent.getKeyModifiersText(ke.getModifiers()));
  System.out.println("KeyText="+KeyEvent.getKeyText(ke.getKeyCode()));
 }	
 public void keyTyped(KeyEvent ke)
 {

 }
}