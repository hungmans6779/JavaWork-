import java.awt.*;
import java.awt.event.*;
public class ListTest2 implements ItemListener,ActionListener
{ 
 static int count=0,index=0;
 List ls;
 Button b1,b2,b3,bb;
 public static void main(String argv[])
 {
  new ListTest2(argv); 
 }
 public ListTest2(String argv[])
 {
  Frame f=new Frame("ListTest1");
  f.setLayout(new BorderLayout());
  ls=new List(Integer.parseInt(argv[0]),Boolean.valueOf(argv[1]).booleanValue());
  ls.addItemListener(this);
  for(int i=2;i<argv.length;i++)
  {
   ls.add(argv[i]);
  }
  Panel p=new Panel(new GridLayout(3,1));
  b1=new Button("�W�[Item");
  b1.setActionCommand("b1");
  b1.addActionListener(this);
  b2=new Button("���Item");
  b2.setActionCommand("b2");
  b2.addActionListener(this);
  b3=new Button("��ܩT�w��Item3");
  b3.setActionCommand("b3");
  b3.addActionListener(this);
  p.add(b1);
  p.add(b2);
  p.add(b3);
  
  f.add(ls,BorderLayout.NORTH);
  f.add(p,BorderLayout.SOUTH);

  f.pack();
  f.setVisible(true);
  System.out.println("Total Items Count : "+ls.getItemCount()+" Items.....");
 } 
 public void itemStateChanged(ItemEvent e)
 {
  System.out.println("\n\n==================");
  List l=(List)e.getSource();
  int index[]=l.getSelectedIndexes();
  String str[]=l.getSelectedItems();
  for(int j=0;j<index.length;j++)
  {
   System.out.println(index[j]+"  "+str[j]);	
  }	
 }
 public void actionPerformed(ActionEvent e)
 {

  bb=(Button)e.getSource();
  selectB1B2();
 }	
 
 
 //�P�_�O�W�[�άO���Item�����s�Q����.......
 //============================================
 public void selectB1B2()
 {
 	if(bb.getActionCommand()=="b1")
  {
   count=ls.getItemCount();
   index=count-1;
   ls.add("Item"+(count+1));
   count++;
   index++;
   System.out.println("�w�g�T�w�N�z�� "+ls.getItem(index)+"�[�JList����F...");	
   b3isEnabled();
  }
  else
  {
   if(bb.getActionCommand()=="b2")
   {
   	ls.remove(index);
   	System.out.println("�w�g�T�w�N�z�� Item"+count+"�����F......");
   	index--;
   	count--;   	
    b3isEnabled();
   }
   else
   {
   	ls.select(2); 	
   }			
  }		 	
 }	
 //============================================ 
 
  
 //�T�{Button b3������O�_�i�H�ϥ�
 //========================================
 public void b3isEnabled()
 {
 	if(count<3)
  {
   b3.setEnabled(false);	
  }	
  else
  {
   b3.setEnabled(true);
  }	
 }	
  //========================================

}