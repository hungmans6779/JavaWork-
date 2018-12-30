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


import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
public class DateSelect extends Panel
{
 Choice chYear;
 Choice chMonth;
 Choice chDate;
 Date date;
 DateFormat df;
 
 EventHandler ev;
 public DateSelect()
 {
 	this("����G",4,0,0);	
 }		
 public DateSelect(String label,int style,int start_year,int end_year)
 {
 	ev=new EventHandler();
 	chYear=new Choice();
 	chMonth=new Choice();
 	chDate=new Choice();
 	chYear.addItemListener(ev);
 	chMonth.addItemListener(ev);
 	date=new Date();
 	df=DateFormat.getDateInstance();
 	int nowYear=date.getYear()+1900;
 	
 	
 	//�� style ���ͦ~�����U�Ԧ����
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
   
  //���ͤ�����U�Ԧ����
  for(int i=1;i<=12;i++)
   chMonth.addItem(String.valueOf(i));
  
  //���ͤѼƪ��U�Ԧ����
  for(int i=1;i<=31;i++)
   chDate.addItem(String.valueOf(i));
    
  //��ܥثe�t�Ϊ����  
  chYear.select(String.valueOf(nowYear));
  chMonth.select(String.valueOf(date.getMonth()+1));
  chDate.select(String.valueOf(date.getDate())); 
   
  add(new Label(label));
  add(chYear);
  add(new Label("�~ "));
  add(chMonth);
  add(new Label("�� "));
  add(chDate);
  add(new Label("�� "));
  
  
 }	
 //------------------------------------------------------------------------------
 //�غc�l����
 
 
 //�s�W��ť��
 //------------------------------------------------------------------------------
 class EventHandler implements ItemListener
 { 
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
   	 else
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
 //------------------------------------------------------------------------------
 
 //���o�ثe�U�ԤU��檺���
 public String getValue()
 {
  int year=Integer.parseInt(chYear.getSelectedItem())-1900;
  int month=Integer.parseInt(chMonth.getSelectedItem())-1;	
  int date=Integer.parseInt(chDate.getSelectedItem());
  return df.format(new Date(year,month,date));
 }		
 
 
 
 
 //------------------------------------------------------------------------------
 //�����������յ{����
 public static void main(String argv[])
 {
  Frame frame=new Frame("�o�O�@�Ӵ��եΪ�����");
  frame.addWindowListener(new WindowAdapter()
  {
   public void windowClosing(WindowEvent we)
   {
   	System.exit(0);
   }		
  });	
  frame.add(new DateSelect());
  frame.setLocation(200,200);
  frame.setSize(400,70);
  frame.setVisible(true);
 }	
  //------------------------------------------------------------------------------
 	
}	