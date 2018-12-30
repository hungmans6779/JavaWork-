import java.awt.*;
import java.awt.event.*;
public class cAwtEventTest23 extends WindowAdapter implements ItemListener
{
 Frame f;
 Choice ch;
 Label label;	
 public cAwtEventTest23()
 {
 	f=new Frame("cAwtEventTest23");
 	f.setLayout(new BorderLayout());
 	f.setLocation(300,300);
 	f.addWindowListener(this);
 	ch=new Choice();
 	for(int i=1;i<=10;i++)
 	{
 	 ch.add("Item "+i);
 	}	
 	ch.addItemListener(this);
 	label=new Label("No Item Selected");
 	f.add(ch,BorderLayout.NORTH);
 	f.add(label,BorderLayout.SOUTH);
 	f.pack();
 	f.setVisible(true);
 }	
 public static void main(String argv[])
 {
  new cAwtEventTest23();
 }
 public void itemStateChanged(ItemEvent ie)
 {
  Choice ch=(Choice)ie.getSource();
  String item=ch.getSelectedItem()+" SELECTED.";
  label.setText(item);
 }
 public void windowClosing(WindowEvent we)
 {
 	System.exit(0);
 }		
}