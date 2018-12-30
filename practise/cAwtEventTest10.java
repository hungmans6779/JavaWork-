import java.awt.*;
import java.awt.event.*;
public class cAwtEventTest10 extends MouseAdapter
{
 Frame f;
 public cAwtEventTest10()
 {
 	f=new Frame();
 	f.setLocation(300,300);
 	f.setSize(300,300);
 	f.addMouseListener(this);
 	f.setVisible(true);
 }		
 public static void main(String argv[])
 {
  new cAwtEventTest10();
 }
 public void mouseClicked(MouseEvent me)
 {
 	switch(me.getModifiers())
 	{
 	 case MouseEvent.BUTTON1_MASK:
 	  System.out.println("BUTTON1");
 	  break;
 	 case MouseEvent.BUTTON2_MASK:
 	  System.out.println("BUTTON2");
 	  break;
 	 case MouseEvent.BUTTON3_MASK:
 	  System.out.println("BUTTON3");
 	  break;
 	 case InputEvent.ALT_MASK+MouseEvent.BUTTON1_MASK:
 	  System.out.println("ALT+BUTTON1");
 	 break;
 	 default:
 	  System.out.println("沒有定義此按鍵");
 	  break;
 	}	 
 }	
}