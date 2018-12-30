import java.lang.*;
import java.applet.*;
import java.awt.*;
public class AppletMethodvv extends Applet
{
 int strX,strY;
 String s1=null;
 public void init()
 {
  strX=Integer.parseInt(getParameter("X"));
  strY=Integer.parseInt(getParameter("Y"));
  s1="init()==>";
  repaint();
 }
 public void start()
 {
  s1=s1+"start()==>";
  repaint();
 }
 public void stop()
 {
  s1=s1+"stop()==>";
  repaint();
 }
 public void destroy()
 {
  s1=s1+"destroy()==>";
  repaint();
 }
 public void paint(Graphics g)
 { 
  g.drawString("Hello!",strX,strY);
  s1=s1+"paint()==>";
  g.drawString(s1,strX,strY+20);
 }
}

