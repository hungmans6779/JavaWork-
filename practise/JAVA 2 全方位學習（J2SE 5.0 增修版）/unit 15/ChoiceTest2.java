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
  
  Button b1=new Button("�W�[Item��");
  b1.setActionCommand("b1");
  b1.addActionListener(this);
  Button b2=new Button("���Item��");
  b2.setActionCommand("b2");
  b2.addActionListener(this);
  Button b3=new Button("��ܩT�w��Item 3");
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
   System.out.println("�W�[ Item "+count);
   System.out.println("�w�g�T�w�z�ҼW�[���O "+ch.getItem(count-1));
   System.out.println("====================================");
   count++;
  } 
  else
  {
   if(e.getActionCommand()=="b2")
    {
     ch.remove(ch.getItemCount()-1);
 	   System.out.println("\n\n====================================");
     System.out.println("��� Item "+(count-1));
     System.out.println("�w�g�T�w�z�Ҵ�֪��O Item "+(count-1));
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