import java.awt.*;
import java.awt.event.*;
public class CheckBoxTest1 implements ItemListener
{
 Checkbox cb[];
 Frame f;
 public static void main(String argv[])
 {
  new CheckBoxTest1();
 }
 public CheckBoxTest1()
 {
  f=new Frame("CheckBoxTest1");
  f.setLayout(new GridLayout(3,1));
  cb=new Checkbox[3];
  cb[0]=new Checkbox("Item1");
  cb[1]=new Checkbox("Item2");
  cb[1].setState(true);
  cb[2]=new Checkbox();
  cb[2].setLabel("Item3");
  for(int i=0;i<cb.length;i++)
  {
   cb[i].addItemListener(this);
   f.add(cb[i]);
  }
  f.pack();
  f.setVisible(true);
 }
 public void itemStateChanged(ItemEvent e)
 {
  Checkbox ch=(Checkbox)e.getSource();
  String cbl=ch.getLabel();
  if(e.getStateChange()==ItemEvent.SELECTED)
  {
  // f.setTitle(cbl+" is SELECTED ");
   System.out.println(cbl+" is SELECTED ");
  }
  else
  {
   //f.setTitle(cbl+" is DESELECTED ");
   System.out.println(cbl+" is DESELECTED ");
  }
 }
}