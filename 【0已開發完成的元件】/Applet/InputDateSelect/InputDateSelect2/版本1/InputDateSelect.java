/*
《此類別功能說明》
(1) getValue() 取得目前使用者的所設定的時間
*/


import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.text.*;
public class InputDateSelect extends Panel
{
 TextField tf;
 Button bSelect;
 Date date;
 EventHandler ev;
 DateFormat df;
 final Frame dateFrame; //設定日期的視窗
 boolean firstShowFrame=true; //判斷建立視窗的次數，建立設定時間視窗元件一次後即不再重新建立
 Label lMonth;
 Button dayButton[];
 String value[]=new String[42];
 Calendar cal;
 int addYear=0;
 int addMonth=0;
  
 //建構子
 public InputDateSelect()
 {  

 	cal=Calendar.getInstance();
  for(int i=0;i<value.length;i++)
   value[i]="";
 	date=new Date();
 	addYear=date.getYear();
  addMonth=date.getMonth();
 	dayButton=new Button[42];
 	df=DateFormat.getDateInstance();
 	dateFrame=new Frame("日期設定器");  
 	ev=new EventHandler();
 	
 	tf=new TextField();
 	tf.setColumns(10);
 	bSelect=new Button("選擇日期");
 	bSelect.setActionCommand("選擇日期");
 	bSelect.addActionListener(ev);
 	
  add(new Label("日期： "));
  add(tf);
  add(bSelect);
 }
  //--------------------------------------------------------------
 //建構子結束

 	
 	
 		
 //監聽器
 class EventHandler implements ActionListener
 {
 	//處理選擇日期按鈕按下後，顯示日期設定的視窗
 	/*********************************************************************************************/
  public void actionPerformed(ActionEvent ae)
  {
   Button button=(Button)ae.getSource();
   //當選擇日期的按鈕按下時....
   if(button.getActionCommand().equals("選擇日期"))
   {	
   	//初始目前的介面擺放位置
   	/************************************************/
    if(firstShowFrame)
    {
     /*	
     addYear=date.getYear();
     addMonth=date.getMonth();
    	*/
     dateFrame.setLocation(500,200);
     dateFrame.setSize(300,220);
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
     Panel p1=new Panel(new GridLayout(3,1));
     Panel p11=new Panel(new FlowLayout()); //擺放標題
     Panel p12=new Panel(new FlowLayout()); //擺放上下個目的控制鈕
     Panel p13=new Panel(new GridLayout(1,7));
     Panel p2=new Panel(new GridLayout(6,7)); //擺放動態產生的Button按鈕
     p11.add(new Label("日期選擇器"));
     
     
     Button bLast=new Button("上個月");
     bLast.setActionCommand("上個月");
     bLast.addActionListener(ev);
     String thisMonth=String.valueOf(date.getYear()+1900)+"/"+String.valueOf(date.getMonth()+1);
     lMonth=new Label(thisMonth);
     Button bNext=new Button("下個月");
     bNext.setActionCommand("下個月");
     bNext.addActionListener(ev);
     p12.add(bLast);
     p12.add(lMonth);
     p12.add(bNext);
     p13.add(new Label("日",Label.CENTER));
     p13.add(new Label("一",Label.CENTER));
     p13.add(new Label("二",Label.CENTER));
     p13.add(new Label("三",Label.CENTER));
     p13.add(new Label("四",Label.CENTER));
     p13.add(new Label("五",Label.CENTER));
     p13.add(new Label("六",Label.CENTER));
     p1.add(p11);
     p1.add(p12);
     p1.add(p13);
       
     changeValue(addYear,addMonth);
     
     //設定動態產生的Button元件.....
     for(int i=0;i<42;i++)
     {
     	dayButton[i]=new Button(value[i]);
     	dayButton[i].setActionCommand(value[i]);
     	dayButton[i].addActionListener(ev);
     	p2.add(dayButton[i]);
     }     
     dateFrame.add(p1);
     dateFrame.add(p2);   
     }
    /************************************************/
    dateFrame.show();	
   }
   else if(button.getActionCommand().equals("上個月"))
   {
   	if(addMonth<=0)
   	{
   	 addYear--;
   	 addMonth=12;	
   	}	
   	addMonth--;
    changeButtonValue();
   }
   else if(button.getActionCommand().equals("下個月"))
   {
    if(addMonth>=11)
    {
     addYear++;
     addMonth=-1;	
    }	
   	addMonth++;
   	changeButtonValue();
   }
   //當使用者按下天數的按鍵時，即將該值回值到tf的元件
   else
   {
   	if(!button.getActionCommand().equals(""))
   	{
   	 String str=df.format(new Date(addYear,addMonth,Integer.parseInt(button.getActionCommand())));
   	 tf.setText(str);
   	 firstShowFrame=false;
   	 dateFrame.dispose();
   	} 
   }		
  }
 }	
 /*********************************************************************************************/ 		
 //監聽器結束

 
 //改變目前顯示的天數元件值
 //------------------------------------------------------------------------------
 public void changeButtonValue()
 {
 	changeValue(addYear,addMonth); 	
 	
  for(int i=0;i<dayButton.length;i++)
  {
   dayButton[i].setLabel("");
   dayButton[i].setLabel(value[i]);	
   dayButton[i].setActionCommand(value[i]);
  }	
 }	
 //------------------------------------------------------------------------------
 
 public void changeValue(int addYear,int addMonth)
 {
 	lMonth.setText((addYear+1900)+"/"+(addMonth+1));
 	cal.setTime(new Date(addYear,addMonth,1));
  int firstDay=cal.get(Calendar.DAY_OF_WEEK);
  int endDay=getDays(addYear+1900,addMonth+1);
  int dd=1;
  for(int i=0;i<value.length;i++)
   value[i]="";
  for(int i=firstDay-1;i<endDay+firstDay-1;i++)
  {
   value[i]=String.valueOf(dd);
   dd++;
  }	
 }	
 
 
 //取得每個月的天數
 public int getDays(int year,int month)
 {
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
  return date;
 }

 // getValue() 取得目前使用者的所設定的時間
 public String getValue()
 {
  return tf.getText();	
 }	



 //測試用
 //-----------------------------------------------------------------
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
 //-----------------------------------------------------------------
}	