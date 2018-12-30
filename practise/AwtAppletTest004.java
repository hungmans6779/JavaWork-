import java.applet.*;
import java.awt.*;
public class AwtAppletTest004 extends Applet
{
 public void init()
 {
  setLayout(new CardLayout());
  add(new Button("one"));
  add(new Button("two"));
  add(new Button("three"));
 }	
}