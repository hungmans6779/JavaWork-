import java.applet.*;
import java.awt.*;
public class AppletTest1 extends Applet
{
 public static void main(String argv[])
 {
  new AppletTest1().init();
 }
 public void init()
 {
 
 }
 public void paint(Graphics g)
 {
  g.drawString("生我之前誰是我",500,200);
 }
}
