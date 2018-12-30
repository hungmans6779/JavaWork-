import java.awt.*;
import java.awt.event.*;
public class MouseEventTest3 extends MouseAdapter
{
 Frame f;	
 public static void main(String argv[])
 {
 	new MouseEventTest3();
 }
 public MouseEventTest3()
 {
 	f=new Frame();
 	f.addMouseListener(this);
 	f.setSize(300,300);
 	f.setVisible(true);
 }		
 public void mouseClicked(MouseEvent me)
 {
 	String str="";
 	switch(me.getModifiers())
 	{
 	 case InputEvent.BUTTON1_MASK:
 	                   str="Button1";
 	                   break;
 	 case InputEvent.BUTTON3_MASK:
 	                   str="Button3";
 	                   break;	
   case InputEvent.ALT_MASK+InputEvent.BUTTON1_MASK:
                    str="ALT+Button1";
                    break;
   case InputEvent.SHIFT_MASK+InputEvent.BUTTON3_MASK:                    	                  
                    str="SHIRT+BUTOTN3";
                    break;
   case InputEvent.CTRL_MASK+InputEvent.BUTTON1_MASK:
                    str="CTRL+Button1";
                    break;
   default: 
      str="沒有在定義內";
      break;                    
 	}	
 	f.setTitle(str);
 }	
}