/*
�m�����O�\�໡���n
(1)�غc�l�ѼƳ]�w
public DateSelect(String label,int style,int start_year,int end_year)
�ilabel�j�G�]�w�ثe�n��ܪ����D
�istyle�j�G
         1. ��ܥX�~������~���U�Ԧ����	
         2. ��ܥH��ƾ䬰�D���~���U�Ԧ����
         3 .��ܥi�H���ϥΪ̪����]�w�_�l�~���M�פ�~�����~���U�Ԧ����
         4. ��ܫe��U50�~���U�Ԧ����
�istart_year�j�G�]�w�_�l���~��(�u��style=3�ɤ~���]�w�A��l�ҳ]��0�Y�i)
�iend_year�j�G�]�w�פ�~��  (�u��style=3�ɤ~���]�w�A��l�ҳ]��0�Y�i)
(2) public String getValue()  ���o�ثe�U�Ԧ���檺���

*/

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.text.*;
public class InputDateSelect extends Panel
{
 String label;
 Choice chYear;
 Choice chMonth;
 Choice chDate;	
 TextField tf;
 Button bSelect;
 Button bOk;
 Button bCancel;
 Date date;
 EventHandler ev;
 DateFormat df;
 final Frame dateFrame; //�]�w���������
 boolean firstShowFrame=true; //�P�_�إߵ��������ơA�إ߳]�w�ɶ���������@����Y���A���s�إ�
 
 //�غc�l
 public InputDateSelect()
 {
  this("����G",4,0,0);	
 }	
 
 //�غc�l
 public InputDateSelect(String label,int style,int start_year,int end_year)
 {  
 	this.label=label;
 	date=new Date();
 	df=DateFormat.getDateInstance();
 	dateFrame=new Frame("�п�J"+label);
 	  
 	ev=new EventHandler();
 	tf=new TextField();
 	tf.setColumns(10);
 	bSelect=new Button("��ܤ��");
 	bSelect.setActionCommand("inputDate");
 	bSelect.addActionListener(ev);
 	
 	
 	//��l�~�����U�Ԧ����
 	//--------------------------------------------------------------
  chYear=new Choice();
  chYear.addItemListener(ev);
  int nowYear=date.getYear()+1900;
  switch(style)
  {
  //��ܥX�~������~���U�Ԧ����	
   case 1:	
    for(int i=nowYear-110;i<=nowYear;i++)
     chYear.addItem(String.valueOf(i));
   break;
   //��ܥH��ƾ䬰�D���~���U�Ԧ����
   case 2:
    for(int i=nowYear;i<=nowYear+20;i++)
     chYear.addItem(String.valueOf(i));
   break;
   //��ܥi�H���ϥΪ̪����]�w�_�l�~���M�פ�~�����~���U�Ԧ����
   case 3:
    for(int i=start_year;i<=end_year;i++)
     chYear.addItem(String.valueOf(i));
   break;  
   //��ܫe��U50�~���U�Ԧ����
   case 4:
   default:
    for(int i=nowYear-50;i<=nowYear+50;i++)
     chYear.addItem(String.valueOf(i));
   break;
  	
  }
  //--------------------------------------------------------------
  
  
  //��l������U�Ԧ����
  //--------------------------------------------------------------
  chMonth=new Choice();
  chMonth.addItemListener(ev);
  for(int i=1;i<=12;i++)
   chMonth.addItem(String.valueOf(i));
  //--------------------------------------------------------------
  
  //��l�Ѽƪ��U�Ԧ����
  //--------------------------------------------------------------
  chDate=new Choice();	
  for(int i=1;i<=31;i++)
   chDate.addItem(String.valueOf(i));
  //--------------------------------------------------------------
  
  chYear.select(String.valueOf(nowYear));
  chMonth.select(String.valueOf(date.getMonth()+1));
  chDate.select(String.valueOf(date.getDate()));
  
    
  add(new Label(label));
  add(tf);
  add(bSelect);
 }
 //�غc�l����

 	
 	
 		
 //��ť��
 class EventHandler implements ActionListener,ItemListener
 {
 	//�B�z��ܤ�����s���U��A��ܤ���]�w������
 	/*********************************************************************************************/
  public void actionPerformed(ActionEvent ae)
  {
   Button button=(Button)ae.getSource();
   //���ܤ�������s���U��....
   if(button.getActionCommand().equals("inputDate"))
   {	
    if(firstShowFrame)
    {
     dateFrame.setLocation(500,200);
     dateFrame.setSize(300,100);
     dateFrame.setResizable(false);
     dateFrame.setBackground(SystemColor.control);
     dateFrame.addWindowListener(new WindowAdapter()
     {
      public void windowClosing(WindowEvent we)
      {
       firstShowFrame=false;
       dateFrame.dispose(); 	
      }		
     });	
     //�s�W�����ܵ������\����
  
     dateFrame.setLayout(new GridLayout(2,1));
   
     Panel p1=new Panel(new FlowLayout());
     p1.add(new Label("����G"));
     p1.add(chYear);
     p1.add(new Label("�~" ));
     p1.add(chMonth);
     p1.add(new Label("�� "));
     p1.add(chDate);
     p1.add(new Label("�� "));
     Panel p2=new Panel(new FlowLayout());
     bOk=new Button("�T�w");
     bOk.setActionCommand("selectOk");
     bOk.addActionListener(ev);
     bCancel=new Button("����");
     bCancel.setActionCommand("selectCancel");
     bCancel.addActionListener(ev);
   
     p2.add(bOk);
     p2.add(bCancel);
   
     dateFrame.add(p1);
     dateFrame.add(p2);
    }
    
    dateFrame.show();	
   }
   //��]�w����������T�w���s���U��.... 
   else if(button.getActionCommand().equals("selectOk"))
   {
   	int year=Integer.parseInt(chYear.getSelectedItem());
    int month=Integer.parseInt(chMonth.getSelectedItem());
   	int date=Integer.parseInt(chDate.getSelectedItem());
   	tf.setText(df.format(new Date(year-1900,month-1,date)));
   	firstShowFrame=false;
   	dateFrame.dispose();
   }	 
   //��]�w����������������s���U��.... 
   else 
   {
   	firstShowFrame=false;
   	dateFrame.dispose();
   }	
  }
  /*********************************************************************************************/ 
 

  //�B�z�~�����Τ�����U�Ԧ������ܿﶵ��Y�ܧ�Ѽƪ���ƭ�
  /*********************************************************************************************/ 
  public void itemStateChanged(ItemEvent ie)
  {
   int year=Integer.parseInt(chYear.getSelectedItem());
   int month=Integer.parseInt(chMonth.getSelectedItem());
   int date=31;
   switch(month)
   {
   	case 2:
   	 if(year%4==0 && year%100!=0 || year%400==0)
   	  date=29;
   	 else;
   	  date=28;
   	break;
   	case 4:
   	case 6:
   	case 9:
   	case 11:
   	 date=30;
   	break;
   }	
   chDate.removeAll();
   for(int i=1;i<=date;i++)
    chDate.addItem(String.valueOf(i));
  }	 	
 }	
 /*********************************************************************************************/ 	 
 //��ť������
 
 public String getValue()
 {
 	int year=Integer.parseInt(chYear.getSelectedItem())-1900;
 	int month=Integer.parseInt(chMonth.getSelectedItem())-1;
 	int date=Integer.parseInt(chDate.getSelectedItem());
 	return df.format(new Date(year,month,date));
 }	


 //���ե�
 /*********************************************************************************************/ 	 
 public static void main(String argv[])
 {
  Frame f=new Frame("�o�O�@�Ӵ��յ���");
  f.add(new InputDateSelect());
  f.addWindowListener(new WindowAdapter()
  {
   public void windowClosing(WindowEvent we)
   {
   	System.exit(0);
   }		
  });		
  f.setLocation(200,200);
  f.setSize(250,70);
  f.setVisible(true); 
 }	
 /*********************************************************************************************/ 	 
}	