import java.awt.*;
import java.awt.event.*;
public class CheckBoxTest2 implements ItemListener,ActionListener
{
 Frame f;
 Checkbox cb[];
 Button b;
 public static void main(String argv[])
 {
  new CheckBoxTest2();
 }
 public CheckBoxTest2()
 {
  f=new Frame("CheckBoxTest2");
  Panel p1=new Panel();
  b=new Button("顯示所有被選擇的..");
  b.addActionListener(this);
  p1.add(b);
  Panel p2=new Panel();
  p2.setLayout(new GridLayout(3,1));
  cb=new Checkbox[3];
  for(int i=0;i<cb.length;i++)
  {
   cb[i]=new Checkbox();
   cb[i].setLabel("Item "+(i+1));
   cb[i].addItemListener(this);
   p2.add(cb[i]);
  }
  f.add(p1,BorderLayout.EAST);
  f.add(p2,BorderLayout.WEST);
  f.pack();
  f.setVisible(true);
 }
 public void itemStateChanged(ItemEvent e)
 {
  Checkbox ch=(Checkbox)e.getSource();
  if(e.getStateChange()==ItemEvent.SELECTED)
  {
   System.out.println(ch.getLabel()+" is SELECTED");
  }
  else
  {
   System.out.println(ch.getLabel()+" is DESELECTED");
  }
 }
 public void actionPerformed(ActionEvent e)
 {
   showResult1();
 }
 
 public void showResult1()
 {
 	System.out.println("\n\n==================");
  for(int j=0;j<cb.length;j++)
  {
   String str=String.valueOf(cb[j].getState());
   if(str=="true")
   {
   	System.out.println(cb[j].getLabel()+" is SELECTED");
   }		
   else
   {
   	System.out.println(cb[j].getLabel()+" is DESELECTED");
   }	 	
  }	
  System.out.println("==================");
 }	
 

}