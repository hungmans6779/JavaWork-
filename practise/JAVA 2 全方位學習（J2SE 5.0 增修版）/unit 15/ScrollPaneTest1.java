import java.awt.*;
import java.awt.event.*;
public class ScrollPaneTest1
{
 public static void main(String argv[])
 {
  Frame f=new Frame();
  Panel p=new Panel(new FlowLayout());
  Button b[]=new Button[1];
  for(int i=0;i<b.length;i++)
  {
   b[i]=new Button("Button "+i);
   p.add(b[i]);	
  }	
 // ScrollPane sp=new ScrollPane(ScrollPane.SCROLLBARS_AS_NEEDED);
  //ScrollPane sp=new ScrollPane(ScrollPane.SCROLLBARS_NEVER);
  ScrollPane sp=new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
  sp.add(p);
  f.add(sp);
  f.pack();
  f.setVisible(true);
  System.gc();
 }
}