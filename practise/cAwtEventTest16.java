import java.awt.*;
import java.awt.event.*;
public class cAwtEventTest16 extends WindowAdapter implements ItemListener
{
 Frame f;	
 public static void main(String argv[])
 {
  new cAwtEventTest16();
 }
 public cAwtEventTest16()
 {
  f=new Frame("Checkbox 元件的運用");
  f.setLayout(new GridLayout(3,1));
  f.setLocation(300,300);
  f.addWindowListener(this);
  Checkbox cb[]=new Checkbox[3];
  cb[0]=new Checkbox("one");
  cb[1]=new Checkbox();
  cb[1].setLabel("two");
  cb[2]=new Checkbox("three",true);
  for(int i=0;i<cb.length;i++)
  {
   cb[i].addItemListener(this);
   f.add(cb[i]);	
  }	
  f.pack();
  f.setVisible(true);
 }
 public void windowClosing(WindowEvent we)
 {
  System.exit(0);
 }
 public void itemStateChanged(ItemEvent ie)
 {
 	Checkbox cb=(Checkbox)ie.getSource();
  String label=cb.getLabel();
  if(ie.getStateChange()==ItemEvent.SELECTED)
   System.out.println(label+" SELECTED.");	
  else
   System.out.println(label+" DESELECTED.");
 }
}