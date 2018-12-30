/*
《此類別功能說明》
(1)建構子參數設定
public DateSelect(String label,int style,int start_year,int end_year)
【label】：設定目前要顯示的標題
【style】：
         1. 顯示出年日期的年份下拉式選單	
         2. 顯示以行事曆為主的年份下拉式選單
         3 .顯示可以讓使用者直接設定起始年份和終止年份的年份下拉式選單
         4. 顯示前後各50年的下拉式選單
【start_year】：設定起始的年份(只有style=3時才須設定，其餘皆設為0即可)
【end_year】：設定終止的年份  (只有style=3時才須設定，其餘皆設為0即可)
(2) public String getValue()  取得目前下拉式選單的日期

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
 	this("日期：",4,0,0);	
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
 	
 	
 	//依 style 產生年份的下拉式選單
 	switch(style)
  {
  //顯示出年日期的年份下拉式選單	
   case 1:	
    for(int i=nowYear-110;i<=nowYear;i++)
     chYear.addItem(String.valueOf(i));
   break;
   //顯示以行事曆為主的年份下拉式選單
   case 2:
    for(int i=nowYear;i<=nowYear+20;i++)
     chYear.addItem(String.valueOf(i));
   break;
   //顯示可以讓使用者直接設定起始年份和終止年份的年份下拉式選單
   case 3:
    for(int i=start_year;i<=end_year;i++)
     chYear.addItem(String.valueOf(i));
   break;  
   //顯示前後各50年的下拉式選單
   case 4:
   default:
    for(int i=nowYear-50;i<=nowYear+50;i++)
     chYear.addItem(String.valueOf(i));
   break;
  }
   
  //產生月份的下拉式選單
  for(int i=1;i<=12;i++)
   chMonth.addItem(String.valueOf(i));
  
  //產生天數的下拉式選單
  for(int i=1;i<=31;i++)
   chDate.addItem(String.valueOf(i));
    
  //顯示目前系統的日期  
  chYear.select(String.valueOf(nowYear));
  chMonth.select(String.valueOf(date.getMonth()+1));
  chDate.select(String.valueOf(date.getDate())); 
   
  add(new Label(label));
  add(chYear);
  add(new Label("年 "));
  add(chMonth);
  add(new Label("月 "));
  add(chDate);
  add(new Label("日 "));
  
  
 }	
 //------------------------------------------------------------------------------
 //建構子結尾
 
 
 //新增監聽器
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
 
 //取得目前下拉下選單的日期
 public String getValue()
 {
  int year=Integer.parseInt(chYear.getSelectedItem())-1900;
  int month=Integer.parseInt(chMonth.getSelectedItem())-1;	
  int date=Integer.parseInt(chDate.getSelectedItem());
  return df.format(new Date(year,month,date));
 }		
 
 
 
 
 //------------------------------------------------------------------------------
 //此部份為測試程式用
 public static void main(String argv[])
 {
  Frame frame=new Frame("這是一個測試用的視窗");
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