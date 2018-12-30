import java.awt.*;
import java.awt.event.*;
public class cAwtEventTest19 extends WindowAdapter implements ItemListener
{
 Frame f;	
 public static void main(String arv[])
 {
 	new cAwtEventTest19();
 }	
 public cAwtEventTest19()
 {
 	f=new Frame();
 	f.setLocation(300,300);
 	f.addWindowListener(this);
 	f.setLayout(new BorderLayout());
 	String data[]={"Item1","Item2","Item3","Item4","Item5","Item6"};
 	Choice ch=new Choice();
 	for(int i=0;i<data.length;i++)
   ch.add(data[i]);
  ch.addItemListener(this);
  System.out.println("Item Count:"+ch.getItemCount());
  f.add(ch,BorderLayout.NORTH);
  f.pack();
  f.setVisible(true);	
 }	
 public void itemStateChanged(ItemEvent ie)
 {
 	System.out.println("================");
 	Choice ch=(Choice)ie.getSource();
 	int index=ch.getSelectedIndex();
 	String item=ch.getItem(index);
 	System.out.println("Item index:"+index);
 	System.out.println("Item:"+item);
 }
 public void windowClosing(WindowEvent we)
 {
 	System.exit(0);
 }		
}