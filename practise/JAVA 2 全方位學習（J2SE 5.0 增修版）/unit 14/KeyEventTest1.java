import java.awt.*;
import java.awt.event.*;
public class KeyEventTest1 extends KeyAdapter
{
 Frame f;
 public static void main(String argv[])
 {
  new KeyEventTest1();
 }
 public KeyEventTest1()
 {
  f=new Frame("KeyEventTest1");
  f.addKeyListener(this);
  f.setSize(500,500);
  f.setVisible(true);
 }
 public void keyPressed(KeyEvent e)
 {
 	System.out.println("\n\n=======================");
  System.out.println("Some Key Pressed.....");
  System.out.println("Key Code: "+e.getKeyCode());
  System.out.println("KeyModifiersText: "+KeyEvent.getKeyModifiersText(e.getModifiers()));
  System.out.println("Key Text: "+KeyEvent.getKeyText(e.getKeyCode()));
 }
 public void keyTyped(KeyEvent e)
 {
 	System.out.println("Some Key Typed.....");
 	System.out.println("The KeyChar: "+e.getKeyChar());
 } 
}