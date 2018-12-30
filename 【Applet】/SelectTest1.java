import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class SelectTest1 extends Applet
{
 Choice year;
 Choice month;
 Choice day;	
 EventHandler ev;
 public void init()
 {
  ev=new EventHandler();	
 	
  //���ͦ~�����U�Ԧ����	
 year=new Choice();
 for(int i=1900;i<=2007;i++)
  year.addItem(String.valueOf(i));
 year.addItemListener(ev);
  
  
 //���ͤ�����U�Ԧ���� 
 month=new Choice(); 
 for(int i=1;i<=12;i++)
  month.addItem(String.valueOf(i));
 month.addItemListener(ev);
 
 //���ͤѼƪ��U�Ԧ����
 day=new Choice();
 for(int i=1;i<=31;i++)
  day.addItem(String.valueOf(i));
 day.addItemListener(ev);
   
  
 add(new Label("�X�ͤ���G")); 
 add(year);
 add(new Label("�~ "));
 add(month);
 add(new Label("�� "));
 add(day);
 add(new Label("�� ")); 
 }
 
 public class EventHandler implements ItemListener
 {
 	public void itemStateChanged(ItemEvent ie)
 	{
 
   int _year=Integer.parseInt(year.getItem(year.getSelectedIndex()));
   int _month=Integer.parseInt(month.getItem(month.getSelectedIndex()));
   
   int _day=31;
   switch(_month)
   {
    case 4:
    case 6:
    case 9:
    case 11:
     _day=30; break;	
    case 2:
     if(_year%4==0 && _year%100!=0 || _year%400==0)
      _day=29;	
     else
      _day=28;
   }	
   
   for(int i=1;i<=_day;i++)
   {
    day.addItem(String.valueOf(i));	
   }
 	}	
 }	
}	