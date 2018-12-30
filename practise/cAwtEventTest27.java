import java.awt.*;
import java.awt.event.*;
public class cAwtEventTest27 extends WindowAdapter
{
 Frame f;
 public static void main(String argv[])
 {
  new cAwtEventTest27(); 	
 }	
 public cAwtEventTest27()
 {
 	f=new Frame("cAwtEventTest27");
 	f.setLayout(new GridLayout(4,1));
 	f.addWindowListener(this);
 	String str="1234567890  234567890  34567890  4567890  567890";
 	TextArea ta1=new TextArea(str,3,10,TextArea.SCROLLBARS_NONE);
 	TextArea ta2=new TextArea(str,3,10,TextArea.SCROLLBARS_BOTH);
 	TextArea ta3=new TextArea(str,3,10,TextArea.SCROLLBARS_HORIZONTAL_ONLY);
 	TextArea ta4=new TextArea(str,3,10,TextArea.SCROLLBARS_VERTICAL_ONLY);
 	f.add(ta1);
 	f.add(ta2);
 	f.add(ta3);
 	f.add(ta4);
 	f.pack();
 	f.setVisible(true);
 }	
 public void windowClosing(WindowEvent we)
 {
  System.exit(0);	
 }	
}