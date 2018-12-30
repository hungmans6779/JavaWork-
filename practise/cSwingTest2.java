/*
 <applet code="cSwingTest2.class" width=200 height=100>
 </applet>
*/
import java.awt.*;
import javax.swing.*;
public class cSwingTest2 extends JApplet
{
 public void init()
 {
  JButton button1=new JButton("Swing Test2");
  button1.setBackground(Color.YELLOW);
  getContentPane().add(button1,BorderLayout.CENTER);
 }
}