import java.awt.*;
public class FrameTest3
{
 public static void main(String argv[])
 {
  Frame f1=new Frame("�ڪ��Ĥ@��frame");
  Frame f2=new Frame();
  f2.setTitle("�o�O�ĤG��frame");
  System.out.println("f1��Title="+f1.getTitle());
  System.out.println("f2��Title="+f2.getTitle());
  
  f1.setSize(100,100);
  f1.setLocation(100,100);
  f1.setBackground(new Color(255,0,0));
  f1.setVisible(true);
  System.out.println("f1��State="+f1.getState());
  System.out.println("f1��isResizable:"+f1.isResizable());
  f2.setSize(200,200);
  f2.setLocation(300,300);
  f2.setBackground(new Color(0,255,0));
  f2.setVisible(true);
  f2.setResizable(false);
  System.out.println("f2��State="+f2.getState());
  System.out.println("f2��isResizable="+f2.isResizable());
 }
}