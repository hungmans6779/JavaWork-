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
  Frame f=new Frame("Ex2_2 ----- �x�ŧ���95�~06��15��]�p��");
  f.setLayout(new BorderLayout(20,20));
  ls=new List(7,false);
  ls.addItemListener(this);
  for(int i=1;i<5;i++)
  {
   ls.add("Item "+i);
  }
  
  //---------------------------------------------------
  //�]�wList�����Φh�諸CheckboxGroup��Checkbox����
  Panel p1=new Panel(new GridLayout(3,1));
  Label l1=new Label("�]�wList������ﶵ");
  CheckboxGroup cbg1=new CheckboxGroup();
  cb1=new Checkbox("���Ҧ�",cbg1,true);
  cb2=new Checkbox("�h��Ҧ�",cbg1,false);
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
  b1.setActionCommand("1");
  b1.addActionListener(this);
  b2=new Button("���Item");
  b2.setActionCommand("2");
  b2.addActionListener(this);
  b3=new Button("��ܩT�w��Item3");
  b3.setActionCommand("3");
  b3.addActionListener(this);
  p2.add(b1);
  p2.add(b2);
  p2.add(b3);
  //---------------------------------------------------
   
  
  Panel p3=new Panel(new GridLayout(3,1));
  l2=new Label("�������Item����Q��������A");
  Button b4=new Button("�M����������A");
  b4.setActionCommand("4");
  b4.addActionListener(this);
  resultSelectLs=new List(5,false);
  //ta=new TextArea(" ",2,2,TextArea.SCROLLBARS_VERTICAL_ONLY);
  p3.add(l2);
  p3.add(resultSelectLs);
  p3.add(b4);
  
  
  Panel p4=new Panel(new GridLayout(5,1));
  Label tflb=new Label("�����B�z�qTextField��J���ﶵ");
  talb=new Label();
  tf=new TextField("0",10);
  tf.addTextListener(this);
  tfb1=new Button("�W�[TextField�����");
  tfb1.setActionCommand("5");
  tfb1.addActionListener(this);
  tfb1.setEnabled(false);
  tfb2=new Button("�h��TextField�����");
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
 //Ĳ�oTextListener��Event..................
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
 //Ĳ�oItemListener��Event..................
 //===========================================    
 public void itemStateChanged(ItemEvent e)
 { 	
 	try
 	{
   Checkbox cbb=(Checkbox)e.getSource();
   if(cbb.getLabel()=="���Ҧ�")	
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
     strta1="�z�ҿ�����O "+llls.getSelectedItem();
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
 //Ĳ�oActionListener��Event..................
 //===========================================   
 public void actionPerformed(ActionEvent e)
 {
   bb=(Button)e.getSource();
   buttonHandle();
 }	
 //===========================================    
 
 //�P�_�O�W�[�άO���Item�����s�Q����.......
 //============================================
 public void buttonHandle()
 {
 	int selectButton=Integer.parseInt(bb.getActionCommand());
 	talb.setText("");
 	switch(selectButton)
 	{
 		
 		 //�W�[List��Item�����e
 	 case	1:
 	     count=ls.getItemCount();
 	     index=count;
       ls.add("Item "+(count+1));
       System.out.println("�w�g�T�w�N�z�� "+ls.getItem(index)+"�[�JList����F...");
       talb.setText(ls.getItem(index)+" �[�JList����F...");	
       b3isEnabled();
       b2.setEnabled(true);		
      break; 
     
     
     //���List��Item�����e
 	 case 2:
 	    count=ls.getItemCount();
   	  index=count-1;
   	  System.out.println("�w�g�T�w�N�A�� "+ls.getItem(index)+"�����F......");
   	  talb.setText(ls.getItem(index)+" �qList���󤤲����F......");
     	ls.remove(index);
      b3isEnabled();
      if(index==0)
      {  b2.setEnabled(false);	}	
      sureRemoveToList();
      if(count<=3)
      { b3.setEnabled(false); }	
     break;
    
     
     
     //�]�wList����h���Item3�����e
   case 3:  
 		  ls.select(2); 	
 		 break;
 		 
 		 
 		 //�M��List���󪺿�� 
 	 case 4:
 	    ls.deselect(ls.getSelectedIndex());	
 	    resultSelectLs.removeAll();
 	   break;
 	   
 	   
 	   //��JTextField����ơA�M��W�[��List����
 	 case 5:
 	    ls.add(tf.getText());
 	    count=ls.getItemCount();
   	  index=count-1;
 	    talb.setText(ls.getItem(index)+" �[�JList����F...");	
 	    tf.setText("0");
 	  break; 	 
 	   
 	   
 	  //�̷�TextField����ơA�M��NList���󪺬�����Ʋ��� 
 	 case 6:
 	   try
 	   {
 	    ls.remove(tf.getText());
 	   }
 	   catch(IllegalArgumentException e) 
 	   {
  	  talb.setText("�z�ҿ�J���� "+tf.getText()+" ���bList����.....");
  	  System.out.println("�z�ҿ�J���� "+tf.getText()+" ���bList����.....");
 	   }	
 	  tf.setText("0");
 	  break; 
 	} 
 }	
 //============================================ 
 
  
 //�T�{Button b3������O�_�i�H�ϥ�
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
  
 //�T�{��������β���List��ls����Item�ɡAList��resultSelectLs���󤺪�����ȯ�@�֧�s
 //======================================== 
 public void sureRemoveToList()
 {
  String strls[]=ls.getSelectedItems();
  resultSelectLs.removeAll();
  for(int i=0;i<strls.length;i++)
  {
   resultSelectLs.add("�z�ҿ�����O "+strls[i],i);
  }	 
 }
 //========================================
}