import java.awt.*;
import java.applet.Applet;
public class AppletPanelTest extends Applet
{
 public void init()
 {
  Panel p=new Panel();
  p.setBackground(Color.red);
  p.setSize(100,100);
 
  setBackground(Color.green); 
  setSize(200,200);
  add(p);
 }
}