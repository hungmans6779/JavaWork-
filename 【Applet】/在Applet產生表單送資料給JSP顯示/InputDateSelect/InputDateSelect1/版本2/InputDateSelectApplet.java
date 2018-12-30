import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.net.*;
public class InputDateSelectApplet extends Applet
{
 InputDateSelect ids1;	
 InputDateSelect ids2;
 Button sendButton;
 EventHandler eh;
 AppletContext ac;
 public void init()
 {
 	/*
 	 建構子===>InputDateSelect(String label,int style,int start_year,int end_year)
 	 style的設定方式
    1.顯示出年日期的年份下拉式選單	
    2.顯示以行事曆為主的年份下拉式選單
    3.顯示可以讓使用者直接設定起始年份和終止年份的年份下拉式選單
    4.顯示前後各50年的下拉式選單
  */  
  eh=new EventHandler();
 	ids1=new InputDateSelect("請假日期",2,0,0);
 	ids2=new InputDateSelect("收假日期",2,0,0);
 	
 	setLayout(new GridLayout(2,1));
 	Panel p1=new Panel(new FlowLayout());
 	p1.add(ids1);
 	p1.add(ids2);
 	Panel p2=new Panel(new FlowLayout());
 	sendButton=new Button("送出資料");
 	sendButton.addActionListener(eh);
 	p2.add(sendButton);
 	add(p1);
 	add(p2);
 	ac=getAppletContext();
 }	
 
 class EventHandler implements ActionListener
 {
  public void actionPerformed(ActionEvent ae)
  {
  	String 請假日期=ids1.getValue();
  	String 收假日期=ids2.getValue();
  	try
  	{
  	 ac.showDocument(new URL("http://localhost/jsp/InputDateSelectApplet.jsp?"+"請假日期="+請假日期+"&收假日期="+收假日期));
  	}
  	catch(MalformedURLException me){} 
  }		
 }	
}