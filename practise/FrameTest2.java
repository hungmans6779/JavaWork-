import java.awt.*;
public class FrameTest2
{
 public static void main(String argv[])
 {
  Frame f1=new Frame("我的第一個Frame1");
  f1.setSize(500,500);
  f1.setLocation(200,200);
  f1.setBackground(new Color(0,0,255));
  f1.setVisible(true);
  f1.setResizable(false);
  System.out.println("isShowing:"+f1.isShowing());	
  System.out.println("Frame Title="+f1.getTitle());
  System.out.println("Frame State="+f1.getState());
  System.out.println("Frame isResizable="+f1.isResizable());
 }
}