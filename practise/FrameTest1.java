import java.awt.Frame;
public class FrameTest1
{
 public static void main(String argv[])
 {
  Frame f1=new Frame();
  Frame f2=new Frame("這是我第一個AWT的Frame f2");
  f1.setTitle("這是我第一個AWT的Frame f1");
  f1.setSize(600,500);
  f2.setSize(300,1000);
  f1.setVisible(true);
  f2.setVisible(true);
 }
}