import java.applet.*;
import java.awt.*;
public class AwtAppletTest002 extends Applet
{
 public void init()
 {	
  setLayout(new FlowLayout(FlowLayout.CENTER));
  add(new Button("One"));
  add(new Button("Two"));
  add(new Button("Three"));
 } 
}