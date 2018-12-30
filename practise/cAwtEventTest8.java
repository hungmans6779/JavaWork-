import java.awt.*;
import java.awt.event.*;
public class cAwtEventTest8 extends KeyAdapter
{
 Frame f;
 public cAwtEventTest8()
 {
 	f=new Frame();
 	f.addKeyListener(this);
 	f.setLocation(100,100);
 	f.setSize(300,300);
 	f.setVisible(true);
 }		
 public static void main(String argv[])
 {
  new cAwtEventTest8();
 }
 public void keyPressed(KeyEvent e) 
 {
 	String str="";
 	switch(e.getModifiers())
 	{
 	 case KeyEvent.VK_F9:
 	  str="F9";
 	  break;	
 	 default:
 	  str="沒有定義此按鍵";
 	  break;
 	}	
 	f.setTitle(str);
 } 	
}