import java.awt.*;
import java.awt.event.*;
public class MouseEventTest4
{
 public static void main(String argv[])
 {
  Frame f=new Frame();
  f.addMouseListener(new MouseEventHandler());
  f.setSize(200,200);
  f.setVisible(true);
 }
}

class MouseEventHandler extends MouseAdapter
{
 public void mouseClicked(MouseEvent me)
 {
 	Frame f=(Frame)me.getSource();
 	String str="";
 	switch(me.getModifiers())
 	{
 	 case InputEvent.BUTTON1_MASK:
 	        str="BUTTON1";
 	        break;	
 	 case InputEvent.BUTTON3_MASK:
 	        str="BUTTON3";
 	        break;
 	 case InputEvent.ALT_MASK+InputEvent.BUTTON1_MASK:
 	        str="ALT+BUTTON1";
 	        break;
   case InputEvent.CTRL_MASK+InputEvent.BUTTON3_MASK:
          str="CTRL+BUTTON3";
          break; 	   
   case InputEvent.SHIFT_MASK+InputEvent.BUTTON1_MASK:
          str="SHIFT+BUTTON1";
          break;
   default: 
          str="沒有定義";
          break;                       
 	}	
  f.setTitle(str);
 }		
}	