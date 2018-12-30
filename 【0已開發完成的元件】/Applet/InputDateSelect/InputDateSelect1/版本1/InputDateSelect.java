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
 final Frame dateFrame; //設定日期的視窗
 boolean firstShowFrame=true; //判斷建立視窗的次數，建立設定時間視窗元件一次後即不再重新建立
 
 //建構子
 public InputDateSelect()
 {
  this("日期：",4,0,0);	
 }	
 
 //建構子
 public InputDateSelect(String label,int style,int start_year,int end_year)
 {  
 	this.label=label;
 	date=new Date();
 	df=DateFormat.getDateInstance();
 	dateFrame=new Frame("請輸入"+label);
 	  
 	ev=new EventHandler();
 	tf=new TextField();
 	tf.setColumns(10);
 	bSelect=new Button("選擇日期");
 	bSelect.setActionCommand("inputDate");
 	bSelect.addActionListener(ev);
 	
 	
 	//初始年份的下拉式選單
 	//--------------------------------------------------------------
  chYear=new Choice();
  chYear.addItemListener(ev);
  int nowYear=date.getYear()+1900;
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
  //--------------------------------------------------------------
  
  
  //初始月份的下拉式選單
  //--------------------------------------------------------------
  chMonth=new Choice();
  chMonth.addItemListener(ev);
  for(int i=1;i<=12;i++)
   chMonth.addItem(String.valueOf(i));
  //--------------------------------------------------------------
  
  //初始天數的下拉式選單
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
 //建構子結束

 	
 	
 		
 //監聽器
 class EventHandler implements ActionListener,ItemListener
 {
 	//處理選擇日期按鈕按下後，顯示日期設定的視窗
 	/*********************************************************************************************/
  public void actionPerformed(ActionEvent ae)
  {
   Button button=(Button)ae.getSource();
   //當選擇日期的按鈕按下時....
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
     //新增日期選擇視窗的功能選單
  
     dateFrame.setLayout(new GridLayout(2,1));
   
     Panel p1=new Panel(new FlowLayout());
     p1.add(new Label("日期："));
     p1.add(chYear);
     p1.add(new Label("年" ));
     p1.add(chMonth);
     p1.add(new Label("月 "));
     p1.add(chDate);
     p1.add(new Label("日 "));
     Panel p2=new Panel(new FlowLayout());
     bOk=new Button("確定");
     bOk.setActionCommand("selectOk");
     bOk.addActionListener(ev);
     bCancel=new Button("取消");
     bCancel.setActionCommand("selectCancel");
     bCancel.addActionListener(ev);
   
     p2.add(bOk);
     p2.add(bCancel);
   
     dateFrame.add(p1);
     dateFrame.add(p2);
    }
    
    dateFrame.show();	
   }
   //當設定日期視窗的確定按鈕按下時.... 
   else if(button.getActionCommand().equals("selectOk"))
   {
   	int year=Integer.parseInt(chYear.getSelectedItem());
    int month=Integer.parseInt(chMonth.getSelectedItem());
   	int date=Integer.parseInt(chDate.getSelectedItem());
   	tf.setText(df.format(new Date(year-1900,month-1,date)));
   	firstShowFrame=false;
   	dateFrame.dispose();
   }	 
   //當設定日期視窗的取消按鈕按下時.... 
   else 
   {
   	firstShowFrame=false;
   	dateFrame.dispose();
   }	
  }
  /*********************************************************************************************/ 
 

  //處理年分份及月份的下拉式選單改變選項後即變更天數的資料值
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
 //監聽器結束
 
 public String getValue()
 {
 	int year=Integer.parseInt(chYear.getSelectedItem())-1900;
 	int month=Integer.parseInt(chMonth.getSelectedItem())-1;
 	int date=Integer.parseInt(chDate.getSelectedItem());
 	return df.format(new Date(year,month,date));
 }	


 //測試用
 /*********************************************************************************************/ 	 
 public static void main(String argv[])
 {
  Frame f=new Frame("這是一個測試視窗");
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