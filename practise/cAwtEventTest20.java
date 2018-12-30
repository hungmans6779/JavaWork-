import java.awt.*;
import java.awt.event.*;
public class cAwtEventTest20 extends WindowAdapter implements ItemListener
{
 Frame f;	
 public static void main(String arv[])
 {
 	new cAwtEventTest20();
 }	
 public cAwtEventTest20()
 {
 	f=new Frame();
 	f.setLocation(300,300);
 	f.addWindowListener(this);
 	f.setLayout(new BorderLayout());
 	String data[]={"Item1","Item2","Item3","Item4","Item5","Item6"};
 	Choice ch=new Choice();
 	for(int i=0;i<data.length;i++)
   ch.add(data[i]);
  ch.insert("Item7",ch.getItemCount());
  
  for(int i=(ch.getItemCount()+1);i<999;i++)
   ch.insert("Item"+String.valueOf(i),ch.getItemCount());
  ch.addItemListener(this);
  System.out.println("Item Count:"+ch.getItemCount());
  int count=ch.getItemCount();
  for(int i=50;i<=count;i++)
  {
   String s="Item"+i;	
   ch.remove(s);
  }	
  f.add(ch,BorderLayout.NORTH);
  f.pack();
  f.setVisible(true);	
 }	
 public void itemStateChanged(ItemEvent ie)
 {
 	Choice ch=(Choice)ie.getSource();
  if(ie.getStateChange()==ItemEvent.SELECTED)
   System.out.println(ch.getSelectedItem()+" SELECTED");
  else
   System.out.println("DESELECTED");
 }
 public void windowClosing(WindowEvent we)
 {
 	System.exit(0);
 }		
}