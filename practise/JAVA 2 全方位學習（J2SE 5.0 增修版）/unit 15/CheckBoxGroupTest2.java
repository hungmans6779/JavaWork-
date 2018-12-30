import java.awt.*;
import java.awt.event.*;
public class CheckBoxGroupTest2 implements ActionListener
{
 Frame f;
 Checkbox cb[];
 CheckboxGroup cbg1,cbg2;
 public static void main(String argv[])
 {
  new CheckBoxGroupTest2();  	
 }
 public CheckBoxGroupTest2()
 {
  f=new Frame("CheckBoxGroupTest2");
  
  Panel p1=new Panel();
  p1.setLayout(new GridLayout(4,1));
  cbg1=new CheckboxGroup();
  cbg2=new CheckboxGroup();
  cb=new Checkbox[4];
  cb[0]=new Checkbox("Item1");
  cb[0].setState(true);
  cb[1]=new Checkbox("Item2");
  cb[0].setCheckboxGroup(cbg1);
  cb[1].setCheckboxGroup(cbg1);
  
  cb[2]=new Checkbox("Item3",true,cbg2);
  cb[3]=new Checkbox("Item4",cbg2,false);
  for (int i=0;i<4;i++)
  {
   p1.add(cb[i]);
  }
  
  Panel p2=new Panel();
  Button b=new Button("«ö¤U");
  b.addActionListener(this);
  p2.add(b);
  f.setLayout(new GridLayout(1,2));
  f.add(p1);
  f.add(p2);
  f.pack();
  f.setVisible(true);
 }
 public void actionPerformed(ActionEvent e)
 {
  System.out.println("==========================");
  System.out.println(cbg1.getSelectedCheckbox());
	System.out.println(cbg2.getSelectedCheckbox());
 }	
 
}