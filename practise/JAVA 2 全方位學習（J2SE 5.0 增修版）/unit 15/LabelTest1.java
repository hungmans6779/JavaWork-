import java.awt.*;
import java.awt.event.*;
public class LabelTest1 implements ItemListener
{
 Frame f;
 Label result;
 Choice ch;
 public static void main(String argv[])
 {
 	new LabelTest1();
 }		
 public LabelTest1()
 {
 	f=new Frame("LabelTest1");
 	f.setLayout(new BorderLayout());
 	ch=new Choice();
  ch.add("Item 1");
 	ch.add("Item 2");
	ch.add("Item 3");
	ch.addItemListener(this);
  result=new Label();
  result.setAlignment(Label.CENTER);
 	result.setText("No Item is Selected");
 	f.add(ch,BorderLayout.NORTH);
 	f.add(result,BorderLayout.SOUTH);
 	f.pack();
 	f.setVisible(true);
 }	
 
 public void itemStateChanged(ItemEvent e)
 {
 	Choice cch=(Choice)e.getSource();
 	String str=cch.getSelectedItem();
 	result.setText(str+" is Selected");
 }	
}	