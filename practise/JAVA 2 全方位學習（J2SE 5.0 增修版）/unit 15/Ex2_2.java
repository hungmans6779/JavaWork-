import java.awt.*;
import java.awt.event.*;
public class Ex2_2 implements ItemListener,ActionListener,TextListener
{ 
 static int count=0,index=0;
 List ls,resultSelectLs;
 Button b1,b2,b3,bb;
 Button tfb1,tfb2;
 Label l2,talb;
 TextField tf;
 //TextArea ta;
 Checkbox cb1,cb2;
 public static void main(String argv[])
 {
  new Ex2_2( ); 
 }
 public Ex2_2()
 {
  Frame f=new Frame("Ex2_2 ----- 洪嘉宏於95年06月15日設計的");
  f.setLayout(new BorderLayout(20,20));
  ls=new List(7,false);
  ls.addItemListener(this);
  for(int i=1;i<5;i++)
  {
   ls.add("Item "+i);
  }
  
  //---------------------------------------------------
  //設定List為單選或多選的CheckboxGroup之Checkbox元件
  Panel p1=new Panel(new GridLayout(3,1));
  Label l1=new Label("設定List的元件選項");
  CheckboxGroup cbg1=new CheckboxGroup();
  cb1=new Checkbox("單選模式",cbg1,true);
  cb2=new Checkbox("多選模式",cbg1,false);
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
  b1.setActionCommand("1");
  b1.addActionListener(this);
  b2=new Button("減少Item");
  b2.setActionCommand("2");
  b2.addActionListener(this);
  b3=new Button("選擇固定的Item3");
  b3.setActionCommand("3");
  b3.addActionListener(this);
  p2.add(b1);
  p2.add(b2);
  p2.add(b3);
  //---------------------------------------------------
   
  
  Panel p3=new Panel(new GridLayout(3,1));
  l2=new Label("此為顯示Item元件被選取的狀態");
  Button b4=new Button("清除選取的狀態");
  b4.setActionCommand("4");
  b4.addActionListener(this);
  resultSelectLs=new List(5,false);
  //ta=new TextArea(" ",2,2,TextArea.SCROLLBARS_VERTICAL_ONLY);
  p3.add(l2);
  p3.add(resultSelectLs);
  p3.add(b4);
  
  
  Panel p4=new Panel(new GridLayout(5,1));
  Label tflb=new Label("此為處理從TextField輸入的選項");
  talb=new Label();
  tf=new TextField("0",10);
  tf.addTextListener(this);
  tfb1=new Button("增加TextField的資料");
  tfb1.setActionCommand("5");
  tfb1.addActionListener(this);
  tfb1.setEnabled(false);
  tfb2=new Button("去除TextField的資料");
  tfb2.setActionCommand("6");
  tfb2.addActionListener(this);
  tfb2.setEnabled(false);
  p4.add(talb);
  p4.add(tflb);
  p4.add(tf);
  p4.add(tfb1);
  p4.add(tfb2);
  
  
  
  
  
  
  f.add(ls,BorderLayout.NORTH);
  f.add(p1,BorderLayout.WEST);
  f.add(p2,BorderLayout.SOUTH);
  f.add(p3,BorderLayout.EAST);
  f.add(p4,BorderLayout.CENTER);
  f.pack();
  f.setVisible(true);
  System.out.println("Total Items Count : "+ls.getItemCount()+" Items.....");
 } 
  
 //===========================================
 //觸發TextListener的Event..................
 //==========================================
 public void textValueChanged(TextEvent e)
 {
  try
  {
   if(Integer.parseInt(tf.getText())!=0)
   {
  	tfb1.setEnabled(true);
    tfb2.setEnabled(true);
 	 } 
   else
   {
 	  tfb1.setEnabled(false);
    tfb2.setEnabled(false);	 		
   }
  }	
 	catch(NumberFormatException nfe)
 	{
 		
 	}			
 }	
 //=========================================== 
 
 //===========================================
 //觸發ItemListener的Event..................
 //===========================================    
 public void itemStateChanged(ItemEvent e)
 { 	
 	try
 	{
   Checkbox cbb=(Checkbox)e.getSource();
   if(cbb.getLabel()=="單選模式")	
   {
   	ls.setMultipleMode(false);
    ls.deselect(ls.getSelectedIndex());	
 	  resultSelectLs.removeAll();
   }
   else
   {
    ls.setMultipleMode(true);
    ls.deselect(ls.getSelectedIndex());	
 	  resultSelectLs.removeAll();
   }
  }
  
  catch(ClassCastException cce)
  {
   List llls=(List)e.getSource();
   if(e.getStateChange()==ItemEvent.SELECTED)
   {	
   	if(cb1.getState())
   	{  
   	 String strta1;		 
     strta1="您所選取的是 "+llls.getSelectedItem();
     resultSelectLs.removeAll();
   	 resultSelectLs.add(strta1);
   	}
    else
    {
     sureRemoveToList();
    }	  	 
   }	
   else
   {
   	sureRemoveToList();
   }	
  }
  finally
  {
  	
  }		 	
 }	
 //===========================================    
 
 
 
 //===========================================
 //觸發ActionListener的Event..................
 //===========================================   
 public void actionPerformed(ActionEvent e)
 {
   bb=(Button)e.getSource();
   buttonHandle();
 }	
 //===========================================    
 
 //判斷是增加或是減少Item的按鈕被按取.......
 //============================================
 public void buttonHandle()
 {
 	int selectButton=Integer.parseInt(bb.getActionCommand());
 	talb.setText("");
 	switch(selectButton)
 	{
 		
 		 //增加List的Item的內容
 	 case	1:
 	     count=ls.getItemCount();
 	     index=count;
       ls.add("Item "+(count+1));
       System.out.println("已經確定將您的 "+ls.getItem(index)+"加入List元件了...");
       talb.setText(ls.getItem(index)+" 加入List元件了...");	
       b3isEnabled();
       b2.setEnabled(true);		
      break; 
     
     
     //減少List的Item的內容
 	 case 2:
 	    count=ls.getItemCount();
   	  index=count-1;
   	  System.out.println("已經確定將你的 "+ls.getItem(index)+"移除了......");
   	  talb.setText(ls.getItem(index)+" 從List元件中移除了......");
     	ls.remove(index);
      b3isEnabled();
      if(index==0)
      {  b2.setEnabled(false);	}	
      sureRemoveToList();
      if(count<=3)
      { b3.setEnabled(false); }	
     break;
    
     
     
     //設定List元件去選取Item3的內容
   case 3:  
 		  ls.select(2); 	
 		 break;
 		 
 		 
 		 //清除List元件的選取 
 	 case 4:
 	    ls.deselect(ls.getSelectedIndex());	
 	    resultSelectLs.removeAll();
 	   break;
 	   
 	   
 	   //輸入TextField的資料，然後增加到List元件
 	 case 5:
 	    ls.add(tf.getText());
 	    count=ls.getItemCount();
   	  index=count-1;
 	    talb.setText(ls.getItem(index)+" 加入List元件了...");	
 	    tf.setText("0");
 	  break; 	 
 	   
 	   
 	  //依照TextField的資料，然後將List元件的相關資料移除 
 	 case 6:
 	   try
 	   {
 	    ls.remove(tf.getText());
 	   }
 	   catch(IllegalArgumentException e) 
 	   {
  	  talb.setText("您所輸入的值 "+tf.getText()+" 不在List元件中.....");
  	  System.out.println("您所輸入的值 "+tf.getText()+" 不在List元件中.....");
 	   }	
 	  tf.setText("0");
 	  break; 
 	} 
 }	
 //============================================ 
 
  
 //確認Button b3的元件是否可以使用
 //========================================
 public void b3isEnabled()
 {
 	if(count<2)
  {
   b3.setEnabled(false);	
  }	
  else
  {
   b3.setEnabled(true);
  }	
 }	
  //========================================
  
 //確認取消選取或移除List的ls元件之Item時，List的resultSelectLs元件內的選取值能一併更新
 //======================================== 
 public void sureRemoveToList()
 {
  String strls[]=ls.getSelectedItems();
  resultSelectLs.removeAll();
  for(int i=0;i<strls.length;i++)
  {
   resultSelectLs.add("您所選取的是 "+strls[i],i);
  }	 
 }
 //========================================
}