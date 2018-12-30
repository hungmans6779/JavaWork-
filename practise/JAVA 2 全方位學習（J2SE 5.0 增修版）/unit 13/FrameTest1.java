import java.awt.*;
public class FrameTest1
{
 public static void main(String argv[])
 {
  Frame f1=new Frame("test f1");
  Frame f2=new Frame("test f2");
  f1.setSize(100,200);
  f2.setSize(200,400);
  f2.setLocation(200,400);
  f1.setVisible(true);
  f2.setVisible(true);
  f1.setResizable(false);
  f2.setResizable(f1.isShowing());
  f2.toFront();
 }
}