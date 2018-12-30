import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.*;

public class Ex1 implements Runnable
{
 Frame f;
 Label l,lshow;
 TextField tfHour,tfMinute,tfSecond;
 Button btnSetTime;
 GregorianCalendar gc;
 boolean timeOk=false;
 public static void main(String argv[])
 {
 	new Ex1();
 	
 }	
 public Ex1()
 {
  
 	f=new Frame("Ex1 ----- 洪嘉宏於95年06月26日設計的程式");
 	f.setFont(new Font("Arial",Font.PLAIN,50));
 	f.addWindowListener(new WindowAdapter()
 	{
 	 public void windowClosing(WindowEvent e)
 	 {
 	  System.exit(0);	
 	 }		
 	});
 	l=new Label(getTime(),Label.CENTER);
 	l.setFont(new Font("Arial",Font.PLAIN,200));
  Thread t1=new Thread(this);		
  t1.start();
  
  Panel p1=new Panel(new GridLayout(1,6));
  tfHour=new TextField("0");
  tfMinute=new TextField("0");
  tfSecond=new TextField("0");
  p1.add(tfHour);
  p1.add(new Label(" 時 "));
  p1.add(tfMinute);
  p1.add(new Label(" 分 "));
  p1.add(tfSecond);
  p1.add(new Label(" 秒 "));
  
  btnSetTime=new Button("設定鬧鐘的時間");
  btnSetTime.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent e)
   {
   	if(timeOk)
   	{   
   	 lshow.setText("鬧鐘的顯示訊息");		
   	 lshow.setBackground(new Color(255,255,255));
   	 btnSetTime.setLabel("設定鬧鐘的時間");
   	 timeOk=false;
   	}
   	else
   	{
   	 btnSetTime.setLabel("取消鬧鐘的時間");	
   	 timeOk=true;
   	}	   
   }	
  });	
  Panel p2=new Panel(new GridLayout(1,2));
  lshow=new Label("鬧鐘的顯示訊息");
  lshow.setFont(new Font("Arial",Font.PLAIN,40));
  lshow.setForeground(new Color(230,35,00));
  p2.add(btnSetTime);
  p2.add(lshow);
  f.add(l,BorderLayout.NORTH);
  f.add(p1,BorderLayout.CENTER);
  f.add(p2,BorderLayout.SOUTH);
  f.pack();
  f.setResizable(false);
  f.setVisible(true);
 }	
 public String getTime()
 {
 	gc=new GregorianCalendar();
 	return gc.get(GregorianCalendar.HOUR)+":"+
 	       gc.get(GregorianCalendar.MINUTE)+":"+
 	       gc.get(GregorianCalendar.SECOND);
 }	
 public void run()
 {
 	int tHour=0,tMinute=0,tSecond=0;
 	int gHour=0,gMinute=0,gSecond=0;
  while(true)
  {
   try
   {
   	//sleep(500);
   	TimeUnit.MILLISECONDS.sleep(200);
   	l.setText(getTime());
   	
   	if(timeOk)
   	{
   	 tHour=Integer.parseInt(tfHour.getText());
 	   gHour=gc.get(GregorianCalendar.HOUR);
     tMinute=Integer.parseInt(tfMinute.getText());
  	 gMinute=gc.get(GregorianCalendar.MINUTE);
 	   tSecond=Integer.parseInt(tfSecond.getText());
     gSecond=gc.get(GregorianCalendar.SECOND);
     if((tHour==gHour)&&(tMinute==gMinute)&&(tSecond==gSecond))
     {
      lshow.setText("您設定的時間到了");
      try
      {
      
       for(int i=0;i<255;i+=10)
       {
       	Thread.sleep(100);
       	if(i==254)
        { i=0; }
        for(int j=0;j<255;j+=20)
        {
         lshow.setBackground(new Color(i,j,(int)(Math.random()*100)));
        } 
       }
      }
      catch(InterruptedException ie)
      {
       ie.printStackTrace();	
      }	  
     }	
   	} 	
   }		
   catch(InterruptedException ie)
   {
   	ie.printStackTrace();
   }	
  }			
 }
}