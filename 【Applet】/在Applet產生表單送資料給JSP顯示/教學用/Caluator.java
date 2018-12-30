/*
《此類別功能說明》
(1) public String getValue()  取得目前按鈕的日期
*/

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.text.*;
public class Caluator extends Frame
{
 private Date date;
 private DateFormat df;	
 private Choice chYear;
 private Choice chMonth;
 Button [] daysButton;
 private int thisYear=0;
 private int thisMonth=0;
 private int addYear=0;
 private int addMonth=0;
 private EventHandler eh;
 private Button bLast; //設定上個月份的按鈕
 private Button bNext; //設定下個月份的按鈕
 private Label showMonth;
 private String [] map;
 private Calendar cal;
 private int selectDay=0; //設定使用使用者所選擇的天數
 
 
 //初始化視窗
 //-------------------------------------------------------------------------------------		
 {
 	setTitle("時間選擇器");
  setLocation(500,300);
 	setSize(300,300);
 	addWindowListener(new WindowAdapter()
 	{
 	 public void windowClosing(WindowEvent we)
 	 {
 	  dispose();
 	 }		
 	});		
 	setBackground(SystemColor.control);
 	setLayout(new GridLayout(2,1));
 }		
 //初始化視窗結束
 //-------------------------------------------------------------------------------------	
	
	
 //建構子
 //-------------------------------------------------------------------------------------			
 public Caluator()
 {
 	date=new Date();
  df=DateFormat.getDateInstance();
  thisYear=date.getYear()+1900; //設定目前的年份
  thisMonth=date.getMonth()+1;  //設定目前的月份
  addYear=date.getYear();       //取得原始的年份值
  addMonth=date.getMonth();     //取得原始的年份值
 	eh=new EventHandler();
 	cal=Calendar.getInstance();
 		
 	Panel p1=new Panel(new GridLayout(3,1));
 	Panel p11=new Panel(new FlowLayout());
 	Panel p12=new Panel(new FlowLayout());
 	Panel p13=new Panel(new FlowLayout());
 	Panel p2=new Panel(new GridLayout(6,7));
 	
 	
 	//*****************************************************************
 	chYear=new Choice();
 	chYear.addItemListener(eh);
 	for(int i=1900;i<=thisYear+50;i++)
 	 chYear.addItem(String.valueOf(i));
 	chYear.select(String.valueOf(thisYear));
 	 
 	chMonth=new Choice();
 	chMonth.addItemListener(eh);
 	for(int i=1;i<=12;i++)
 	 chMonth.addItem(String.valueOf(i));
 	chMonth.select(String.valueOf(thisMonth));
   
  p11.add(new Label("日期："));
 	p11.add(chYear);
 	p11.add(new Label("年 "));
 	p11.add(chMonth);
 	p11.add(new Label("月 "));
 	//*****************************************************************
 	bLast=new Button("上個月");
 	bLast.addActionListener(eh);
 	bLast.setActionCommand("上個月");
  showMonth=new Label("西元："+String.valueOf(thisYear)+" 年 "+String.valueOf(thisMonth)+" 月");
  bNext=new Button("下個月");
 	bNext.addActionListener(eh);
 	bNext.setActionCommand("下個月");	
 	p12.add(bLast);
 	p12.add(showMonth);
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
 
 	//*****************************************************************
 	map=new String[42];
 	for(int i=0;i<map.length;i++)
 	 map[i]="";
 	
 
  daysButton=new Button[42];
  changeMap(); //變更Map值
 	for(int i=0;i<42;i++)
 	{
 	 daysButton[i]=new Button(map[i]);	
 	 daysButton[i].addActionListener(eh);
 	 p2.add(daysButton[i]);
 	}  	
 	add(p1);
 	add(p2);
 }	
 //建構子結束
 //-------------------------------------------------------------------------------------	
 
 //變更Map陣列值
 //-------------------------------------------------------------------------------------
 public void changeMap()
 {
 	for(int i=0;i<map.length;i++)
 	 map[i]="";
  cal.setTime(new Date(addYear,addMonth,1));	
  int startWeek=cal.get(Calendar.DAY_OF_WEEK);
  int endWeek=startWeek+getDays(addYear+1900,addMonth+1);
  int dd=1;
  for(int i=startWeek-1;i<=endWeek-2;i++)
  {
   map[i]=String.valueOf(dd);	
   dd++;
  }	
 }	
 //變更Map陣列值結尾
 //-------------------------------------------------------------------------------------
 
 
 
 //取得本月份的天數
 //------------------------------------------------------------------------------------- 
 public int getDays(int year,int month)
 {
  int days=31;
  switch(month)
  {
   case 2:
    if(year%4==0 && year%100!=0 || year%400==0)
     days=29;
    else
     days=28;
   break;
   case 4:
   case 6:
   case 9:
   case 11:
    days=30;
    break;	
  }		
  return days;
 }	
 //取得本月份的天數結尾
 //------------------------------------------------------------------------------------- 
 
 

 
 //事件監聽器
 //-------------------------------------------------------------------------------------	
 class EventHandler implements ItemListener,ActionListener
 {
 	//按下Button按鈕時的動作
 	//-------------------------------------------------------------------------------------	
 	public void actionPerformed(ActionEvent ae)
  {
   Button button=(Button)ae.getSource();
   if(button.getActionCommand().equals("上個月"))
   {
   	if(addMonth==0)
   	{
   	 addMonth=12;	
   	 addYear--;
   	}
    addMonth--;
    changeMap();
    for(int i=0;i<map.length;i++)
     daysButton[i].setLabel(map[i]);
    showMonth.setText("西元："+String.valueOf(addYear+1900)+" 年 "+String.valueOf(addMonth+1)+" 月");  	 
    chYear.select(String.valueOf(addYear+1900));
    chMonth.select(String.valueOf(addMonth+1));
   }
   else if(button.getActionCommand().equals("下個月"))		
   {
    if(addMonth==11)
    {
     addMonth=-1;
     addYear++;
    } 
    addMonth++;
    changeMap(); 
    for(int i=0;i<map.length;i++)
     daysButton[i].setLabel(map[i]);
    showMonth.setText("西元："+String.valueOf(addYear+1900)+" 年 "+String.valueOf(addMonth+1)+" 月");  
    chYear.select(String.valueOf(addYear+1900));
    chMonth.select(String.valueOf(addMonth+1));	
   }
   else
   {
   	if(!button.getActionCommand().equals(""))
   	{
   	 selectDay=Integer.parseInt(button.getActionCommand());	
   	 System.out.println(getValue());
   	}	
   }		
  }	
  //按下Button按鈕時的動作結尾
 	//-------------------------------------------------------------------------------------	
 	
 	//下拉式選單的事件
 	//------------------------------------------------------------
	public void itemStateChanged(ItemEvent ie)
  {
   addYear=Integer.parseInt(chYear.getSelectedItem())-1900;    	
   addMonth=Integer.parseInt(chMonth.getSelectedItem())-1;
   changeMap();
   for(int i=0;i<map.length;i++)
     daysButton[i].setLabel(map[i]);
   showMonth.setText("西元："+String.valueOf(addYear+1900)+" 年 "+String.valueOf(addMonth+1)+" 月");  	 
  }	
  //下拉式選單的事件結尾
 	//------------------------------------------------------------	
 }	
 //事件監聽器結束
 //-------------------------------------------------------------------------------------	
 
 //取得目前按鈕的日期
 public String getValue()
 {
  return df.format(new Date(addYear,addMonth,selectDay));	
 }	
 
 //測試用....
 public static void main(String argv[])
 {
  new Caluator().show();	
 }		
}	