import java.awt.*;
import java.awt.event.*;
public class cAwtEventTest7 extends MouseAdapter
{
 Frame f;
 public cAwtEventTest7()
 {
 	f=new Frame();
 	f.addMouseListener(this);
 	f.setLocation(200,200);
 	f.setSize(300,300);
 	f.setVisible(true);
 }		
 public static void main(String argv[])
 {
 	new cAwtEventTest7();
 }	
 public void mouseClicked(MouseEvent me)
 {
 	String str="";
 	switch(me.getModifiers())
 	{
 	 case InputEvent.BUTTON1_MASK:
 	  str="Button1";
 	  break;
 	 case InputEvent.BUTTON2_MASK:
 	  str="Button2";
 	  break;
 	 case InputEvent.BUTTON3_MASK:
 	  str="Button3";
 	  break;
 	 case InputEvent.CTRL_MASK+InputEvent.BUTTON1_MASK:
 	  str="ctrl+button1";
 	  break;
 	 case InputEvent.SHIFT_MASK+InputEvent.BUTTON3_MASK:
 	  str="shift+button3";
 	  break;
 	 default:
 	  str="沒有定義按鍵功能";
 	  break;
 	}	
 	f.setTitle(str);
 }	
}