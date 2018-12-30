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
  //設定List為單選或多選的CheckboxGroup之Checkbox元件
  Panel p1=new Panel(new GridLayout(3,1));
  Label l1=new Label("設定List的元件選項");
  CheckboxGroup cbg1=new CheckboxGroup();
  Checkbox cb1=new Checkbox("單選模式",cbg1,true);
  Checkbox cb2=new Checkbox("多選模式",cbg1,false);
  cb1.addItemListener(this);
  cb2.addItemListener(this);
  p1.add(l1);
  p1.add(cb1);
  p1.add(cb2);
  //---------------------------------------------------
  
  //---------------------------------------------------
  //設定增加或減少Item的Button元件
  Panel p2=new Panel(new GridLayout(3,1));
  b1=new Button("增加Item");
  b1.setActionCommand("b1");
  b1.addActionListener(this);
  b2=new Button("減少Item");
  b2.setActionCommand("b2");
  b2.addActionListener(this);
  b3=new Button("選擇固定的Item3");
  b3.setActionCommand("b3");
  b3.addActionListener(this);
  p2.add(b1);
  p2.add(b2);
  p2.add(b3);
  //---------------------------------------------------
   
  
  Panel p3=new Panel(new GridLayout(2,1));
  l2=new Label("此為顯示Item元件被選取的狀態");
  Button b4=new Button("清除選取的狀態");
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
   if(cbb.getLabel()=="單選模式")	
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
   	 l2.setText("您所選取的是 "+llls.getSelectedItem());
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
 
 //判斷是增加或是減少Item的按鈕被按取.......
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
   System.out.println("已經確定將您的 "+ls.getItem(index)+"加入List元件了...");	
   b3isEnabled();
  }
  else
  {
   if(bb.getActionCommand()=="b2")
   {
   	count=ls.getItemCount();
   	index=count-1;
   	ls.remove(index);
   	System.out.println("已經確定將您的 Item"+count+"移除了......");
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
 
  
 //確認Button b3的元件是否可以使用
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