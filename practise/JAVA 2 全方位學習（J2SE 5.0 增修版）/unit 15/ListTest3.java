import java.awt.*;
import java.awt.event.*;
public class ListTest3 implements ItemListener,ActionListener
{ 
 static int count=0,index=0;
 List ls;
 Button b1,b2,b3,bb;
 Label l2;
 public static void main(String argv[])
 {
  new ListTest3(argv); 
 }
 public ListTest3(String argv[])
 {
  Frame f=new Frame("ListTest1");
  f.setLayout(new BorderLayout());
  ls=new List(Integer.parseInt(argv[0]),Boolean.valueOf(argv[1]).booleanValue());
  //ls.addActionListener(this);
  ls.addItemListener(this);
  for(int i=2;i<argv.length;i++)
  {
   ls.add(argv[i]);
  }
  
  //---------------------------------------------------
  //�]�wList�����Φh�諸CheckboxGroup��Checkbox����
  Panel p1=new Panel(new GridLayout(3,1));
  Label l1=new Label("�]�wList������ﶵ");
  CheckboxGroup cbg1=new CheckboxGroup();
  Checkbox cb1=new Checkbox("���Ҧ�",cbg1,true);
  Checkbox cb2=new Checkbox("�h��Ҧ�",cbg1,false);
  cb1.addItemListener(this);
  cb2.addItemListener(this);
  p1.add(l1);
  p1.add(cb1);
  p1.add(cb2);
  //---------------------------------------------------
  
  //---------------------------------------------------
  //�]�w�W�[�δ��Item��Button����
  Panel p2=new Panel(new GridLayout(3,1));
  b1=new Button("�W�[Item");
  b1.setActionCommand("b1");
  b1.addActionListener(this);
  b2=new Button("���Item");
  b2.setActionCommand("b2");
  b2.addActionListener(this);
  b3=new Button("��ܩT�w��Item3");
  b3.setActionCommand("b3");
  b3.addActionListener(this);
  p2.add(b1);
  p2.add(b2);
  p2.add(b3);
  //---------------------------------------------------
   
  
  Panel p3=new Panel(new GridLayout(2,1));
  l2=new Label("�������Item����Q��������A");
  Button b4=new Button("�M����������A");
  b4.setActionCommand("b4");
  b4.addActionListener(this);
  p3.add(l2);
  p3.add(b4);
  
  
  
  f.add(ls,BorderLayout.NORTH);
  f.add(p1,BorderLayout.WEST);
  f.add(p2,BorderLayout.SOUTH);
  f.add(p3,BorderLayout.EAST);
  f.pack();
  f.setVisible(true);
  System.out.println("Total Items Count : "+ls.getItemCount()+" Items.....");
 } 
 //===========================================    
 public void itemStateChanged(ItemEvent e)
 { 	
 	try
 	{
   Checkbox cbb=(Checkbox)e.getSource();
   if(cbb.getLabel()=="���Ҧ�")	
   {
   	ls.setMultipleMode(false);
   }
   else
   {
    ls.setMultipleMode(true);
   }
  }
  catch(ClassCastException cce)
  {
   List llls=(List)e.getSource();
   if(e.getStateChange()==ItemEvent.SELECTED)
   {
   	 l2.setText("�z�ҿ�����O "+llls.getSelectedItem());
   }	
  }
  finally
  {
  	
  }		 	
 }	
 //===========================================    
 
 
 //===========================================   
 public void actionPerformed(ActionEvent e)
 {
   bb=(Button)e.getSource();
   selectB1B2();
 }	
 //===========================================    
 
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
   	count=ls.getItemCount();
   	index=count-1;
   	ls.remove(index);
   	System.out.println("�w�g�T�w�N�z�� Item"+count+"�����F......");
   	index--;
   	count--;   	
    b3isEnabled();
   }
   else
   {
   	if(bb.getActionCommand()=="b4")
   	{
   	 ls.deselect(ls.getSelectedIndex());	
   	}	
   	else
   	{
   	 ls.select(2); 	
   	} 
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