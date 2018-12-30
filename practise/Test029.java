import java.awt.*;
import java.applet.*;
public class Test029 extends Applet
{
 public void init()
 {
  Panel p=new Panel();
  p.setBackground(Color.red);
  p.setSize(200,200);
  setBackground(Color.green);
  setSize(200,200);
  add(p);
 }
}