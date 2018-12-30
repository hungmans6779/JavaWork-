import java.awt.*;
import java.awt.event.*;
public class Ex2_1 extends KeyAdapter
{
 Frame f;
 public static void main(String argv[])
 {
  new Ex2_1();
 }
 public Ex2_1()
 {
  f=new Frame("Ex2_1 ----- 洪嘉宏於95年06月14日設計");
  f.addKeyListener(this);
  f.setSize(300,300);
  f.setVisible(true);
 }
 public void keyPressed(KeyEvent e)
 {
  System.out.println("===============");
  int inputValue=e.getKeyCode();
  if(inputValue<KeyEvent.VK_0 || inputValue>KeyEvent.VK_9)
  {
   System.out.println("您輸入的值有誤...........");
  }
  else
  {
   System.out.println("您輸入的數字為: "+e.getKeyChar());
  }
 }

}