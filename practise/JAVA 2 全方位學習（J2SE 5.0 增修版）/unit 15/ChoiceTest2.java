import java.awt.*;
import java.awt.event.*;
public class ChoiceTest2 implements ItemListener,ActionListener
{
 Frame f;
 Choice ch;
 static int count=5;
 public static void main(String argv[])
 {
  new ChoiceTest2(argv);
 }
 public ChoiceTest2(String argv[])
 {
  f=new Frame("ChoiceTest2");
  f.setLayout(new GridLayout(4,1));
  ch=new Choice();
  ch.addItemListener(this);
  for(int i=0;i<argv.length;i++)
  {
   ch.add(argv[i]);
  }
  
  Button b1=new Button("增加Item值");
  b1.setActionCommand("b1");
  b1.addActionListener(this);
  Button b2=new Button("減少Item值");
  b2.setActionCommand("b2");
  b2.addActionListener(this);
  Button b3=new Button("選擇固定的Item 3");
  b3.setActionCommand("b3");
  b3.addActionListener(this);
  
  f.add(ch);
  f.add(b1);
  f.add(b2);
  f.add(b3);
  f.pack();
  f.setVisible(true);
  System.out.println("Total "+ch.getItemCount()+" Items");
 }
 public void itemStateChanged(ItemEvent e)
 {
 	System.out.println("\n\n====================================");
  System.out.println("Selected Item Index : "+ch.getSelectedIndex());
  System.out.println("Selected Item : "+ch.getSelectedItem());
 }
 public void actionPerformed(ActionEvent e)
 {
 	Button bb=(Button)e.getSource();
 	if(bb.getActionCommand()=="b1")
 	{
 	 ch.insert("Item "+count,ch.getItemCount());
 	 System.out.println("\n\n====================================");
   System.out.println("增加 Item "+count);
   System.out.println("已經確定您所增加的是 "+ch.getItem(count-1));
   System.out.println("====================================");
   count++;
  } 
  else
  {
   if(e.getActionCommand()=="b2")
    {
     ch.remove(ch.getItemCount()-1);
 	   System.out.println("\n\n====================================");
     System.out.println("減少 Item "+(count-1));
     System.out.println("已經確定您所減少的是 Item "+(count-1));
     System.out.println("====================================");
     count--;
    }
    else
    {
   	 ch.select(2);
   	 System.out.println(ch.getItem(2)+" is SELECTED.....");
    }
  } 	
 }	
 
}