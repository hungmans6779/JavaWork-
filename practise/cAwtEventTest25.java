import java.awt.*;
import java.awt.event.*;
public class cAwtEventTest25 extends WindowAdapter
{
 Frame f;	
 public static void main(String argv[])
 {
  new cAwtEventTest25();
 }
 public cAwtEventTest25()
 {
 	f=new Frame("cAwtEventTest25");
 	f.setLayout(new BorderLayout());
 	f.addWindowListener(this);
 	f.setLocation(300,300);
 	f.setSize(300,300);
 	Panel p=new Panel(new FlowLayout());
 	Button []btn=new 	Button[10];
 	for(int i=0;i<2;i++)
 	{
 	 btn[i]=new Button("Button"+(i+1));
 	 p.add(btn[i]);
 	}	
 	ScrollPane sp=new ScrollPane(ScrollPane.SCROLLBARS_AS_NEEDED);
 	sp.add(p);
 	f.add(sp);
 	f.setVisible(true);
 }	
 public void windowClosing(WindowEvent we)
 {
 	System.exit(0);
 }	
}