import java.awt.*;
import java.awt.event.*;
public class MouseEventMaskTest1 extends MouseAdapter
{
 Frame f;
 public static void main(String argv[])
 {
  new MouseEventMaskTest1();
 }
 public MouseEventMaskTest1()
 {
  f=new Frame("MouseEventMaskTest1");
  f.addMouseListener(this);
  f.setSize(500,500);
  f.setVisible(true);
 }
 public void mouseClicked(MouseEvent e)
 {
  switch(e.getModifiers())
  {
   case InputEvent.BUTTON1_MASK:
    f.setTitle("Mouse Button1 Click");
    break;
   case InputEvent.BUTTON3_MASK:
    f.setTitle("Mouse Button3 Click"); 
    break;
   case InputEvent.BUTTON1_MASK+InputEvent.ALT_MASK:
    f.setTitle("Mouse Button1 + ALT Clicked....");
    break; 
   case InputEvent.BUTTON1_MASK+InputEvent.SHIFT_MASK:
    f.setTitle("Mouse Button1 + SHIFT Clicked....");
    break; 
   case InputEvent.BUTTON1_MASK+InputEvent.CTRL_MASK:
    f.setTitle("Mouse Button1 + CTRL Clicked....");
    break;  
   case InputEvent.BUTTON3_MASK+InputEvent.ALT_MASK:
    f.setTitle("Mouse Button3 + ALT Clicked....");
    break; 
   case InputEvent.BUTTON3_MASK+InputEvent.SHIFT_MASK:
    f.setTitle("Mouse Button3 + SHIFT Clicked....");
    break; 
    case InputEvent.BUTTON3_MASK+InputEvent.CTRL_MASK:
    f.setTitle("Mouse Button3 + CTRL Clicked....");
    break;  
  } 
 }
}
