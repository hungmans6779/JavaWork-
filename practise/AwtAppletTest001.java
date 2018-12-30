import java.applet.Applet;
import java.awt.*;
public class AwtAppletTest001 extends Applet
{
 public void init()
 {
 	 setLayout(new BorderLayout(20,20));
 	 add(new Button("One"),BorderLayout.EAST);
 	 add(new Button("Two"),BorderLayout.WEST);
 	 add(new Button("Three"),BorderLayout.CENTER);
 	 add(new Button("Four"),BorderLayout.NORTH);
 	 add(new Button("Five"),BorderLayout.SOUTH);
 }	
}