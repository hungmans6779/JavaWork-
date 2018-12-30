import java.awt.*;
import javax.swing.*;
public class cSwingTest1 extends JApplet
{

 public void init()
 {
 	JButton button1=new JButton("Hello Swing applet");
 	button1.setBackground(Color.green);
 	getContentPane().add(button1,BorderLayout.CENTER);
 }	
}