import java.awt.*;
import java.awt.event.*;
public class cAwtEventTest18 extends WindowAdapter implements ItemListener
{
 Frame f;
 public static void main(String argv[])
 {
  new cAwtEventTest18();
 }
 public cAwtEventTest18()
 {
 	f=new Frame("cAwtEventTest18");
 	f.setLayout(new GridLayout(4,1));
 	f.addWindowListener(this);
 	f.setLocation(300,300);
 	Checkbox cb[]=new Checkbox[4];
 	CheckboxGroup cbg1=new CheckboxGroup();
 	CheckboxGroup cbg2=new CheckboxGroup();
 	cb[0]=new Checkbox("Item1");
 	cb[1]=new Checkbox("Item2",true);
 	cb[0].setCheckboxGroup(cbg1);
 	cb[1].setCheckboxGroup(cbg1);
 	cb[2]=new Checkbox("Item3",true,cbg2);
 	cb[3]=new Checkbox("Item4",cbg2,false);
 	for(int i=0;i<cb.length;i++)
 	{
 	 cb[i].addItemListener(this);	
 	 f.add(cb[i]);
 	} 
 	f.pack();
 	f.setVisible(true);
 }	
 public void itemStateChanged(ItemEvent ie)
 {
 	Checkbox cb=(Checkbox)ie.getSource();
 	String label=cb.getLabel();
 	if(ie.getStateChange()==ItemEvent.SELECTED)
 	 System.out.println(label+"¡@SELECTED");
 	else
 	 System.out.println(label+" DESELECTED");
 }	
 public void windowClosing(WindowEvent we)
 {
 	System.exit(0);
 }	
}