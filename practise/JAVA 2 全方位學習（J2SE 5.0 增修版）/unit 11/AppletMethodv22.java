import java.awt.Graphics;
import java.applet.Applet;
public class AppletMethodv22 extends Applet
{
 int x,y=0;
 static String s1="";
 public void init()
 {
  x=Integer.parseInt(getParameter("X"));
  y=Integer.parseInt(getParameter("Y"));
  s1="init()==>";
  repaint();
 }
 public void start()
 {
  s1+="start()==>";
  repaint();
 }
 public void stop()
 {
  s1+="stop()==>";
  repaint();
 }
 public void destroy()
 {
  s1+="destroy()==>";
  repaint();
 }
 public void paint(Graphics g)
 {
  s1+="paint()==>";
  g.drawString("Hello Java!!!",0,10);
  g.drawString(s1,x,y);
 } 

}