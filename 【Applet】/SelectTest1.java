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
 	
  //產生年份的下拉式方塊	
 year=new Choice();
 for(int i=1900;i<=2007;i++)
  year.addItem(String.valueOf(i));
 year.addItemListener(ev);
  
  
 //產生月份的下拉式方塊 
 month=new Choice(); 
 for(int i=1;i<=12;i++)
  month.addItem(String.valueOf(i));
 month.addItemListener(ev);
 
 //產生天數的下拉式方塊
 day=new Choice();
 for(int i=1;i<=31;i++)
  day.addItem(String.valueOf(i));
 day.addItemListener(ev);
   
  
 add(new Label("出生日期：")); 
 add(year);
 add(new Label("年 "));
 add(month);
 add(new Label("月 "));
 add(day);
 add(new Label("日 ")); 
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