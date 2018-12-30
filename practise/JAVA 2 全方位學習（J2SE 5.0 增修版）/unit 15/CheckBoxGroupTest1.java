import java.awt.*;
public class CheckBoxGroupTest1
{
 public static void main(String argv[])
 {
  Frame f=new Frame("CheckBoxGroupTest1");
  f.setLayout(new GridLayout(4,1));
  CheckboxGroup cbg1=new CheckboxGroup();
  CheckboxGroup cbg2=new CheckboxGroup();
  Checkbox cb[]=new Checkbox[4];
  cb[0]=new Checkbox("Item1");
  cb[0].setState(true);
  cb[1]=new Checkbox("Item2");
  cb[0].setCheckboxGroup(cbg1);
  cb[1].setCheckboxGroup(cbg1);
  
  cb[2]=new Checkbox("Item3",true,cbg2);
  cb[3]=new Checkbox("Item4",cbg2,false);
  for (int i=0;i<4;i++)
  {
   f.add(cb[i]);
  }
  f.pack();
  f.setVisible(true);
 }

}