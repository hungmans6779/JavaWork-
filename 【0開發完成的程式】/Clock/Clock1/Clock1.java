import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class Clock1
{
 Frame frame;	
 Label label;
 Label labelShowMessage;
 Label labelFore,labelBack;
 Scrollbar sbFR,sbFG,sbFB,sbBR,sbBG,sbBB;
 int tempfrColor=0,tempfgColor=0,tempfbColor=0,tempbrColor=0,tempbgColor=0,tempbbColor=0;
 String isAm="AM"; 
 int setHour=0;
 int setMinute=0;
 int foreR=0,foreG=0,foreB=0,backR=0,backG=0,backB=0;
 boolean setOk=true;
 public static void main(String argv[])
 {
 	new Clock1();
 }		
 public Clock1()
 {
  frame=new Frame("自由人的小鬧鐘程式");
  frame.addWindowListener(new WindowAdapter()
  {
   public void windowClosing(WindowEvent we)
   {
   	System.exit(0);
   }		
  });
  frame.setResizable(false);
  frame.setLocation(500,200);
  frame.setSize(new Dimension(500,150));
  
  label=new Label(showTime());
  label.setForeground(Color.green);
  label.setBackground(Color.black);
  label.setFont(new Font("dialog",Font.BOLD,50));
  label.setAlignment(Label.CENTER);
  frame.add(label,BorderLayout.CENTER);
  labelShowMessage=new Label();
  labelShowMessage.setBackground(Color.cyan);
  labelShowMessage.setForeground(Color.red);
  labelShowMessage.setAlignment(Label.CENTER);
  labelShowMessage.setFont(new Font("dialog",Font.BOLD,18));
  frame.add(labelShowMessage,BorderLayout.SOUTH);
  
  Menu item1=new Menu("編輯");
  MenuItem item1_1=new MenuItem("設定鬧鐘時間");
  
  
  
  //顯示時間設定視窗
  item1_1.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent ae)
   {
   	final Frame newFrame1=new Frame("顯示時間設定視窗");
   	newFrame1.addWindowListener(new WindowAdapter()
   	{
   	 public void windowClosing(WindowEvent we)
   	 {
   	 	newFrame1.dispose();
   	 }		
   	});	
   	newFrame1.setLayout(new GridLayout(2,1));
   	Panel p1=new Panel(new FlowLayout());
   	Panel p2=new Panel(new FlowLayout());
   	
   	final Choice choiceAMPM=new Choice();
   	choiceAMPM.add("AM");
   	choiceAMPM.add("PM");
   	final Choice choiceHour=new Choice();
   	for(int i=1;i<=12;i++)
   	 choiceHour.add(String.valueOf(i));
    final Choice choiceMinute=new Choice();
    for(int i=1;i<=60;i++)
     choiceMinute.add(String.valueOf(i));
   	p1.add(new Label("時間設定： "));
   	p1.add(choiceAMPM);
   	p1.add(choiceHour);
   	p1.add(new Label("時"));
   	p1.add(choiceMinute);
   	p1.add(new Label("分"));
   	
   	Button selectOk=new Button("確定");
   	selectOk.addActionListener(new ActionListener()
   	{
   	 public void actionPerformed(ActionEvent ae)
   	 {
   	 	setHour=0;
   	 	setOk=true;
   	 	isAm=choiceAMPM.getSelectedItem();
   	 	setHour=Integer.parseInt(choiceHour.getSelectedItem());
   	 	setMinute=Integer.parseInt(choiceMinute.getSelectedItem());
   	 	frame.setTitle("自由人的小鬧鐘程式---您所設定的時間是: "+isAm+setHour+" 時 "+setMinute+" 分");
   	 	newFrame1.dispose();
   	 }	
   	});	
   	Button selectCancel=new Button("取消");
   	selectCancel.addActionListener(new ActionListener()
   	{
   	 public void actionPerformed(ActionEvent ae)
   	 {
   	 	newFrame1.dispose();
   	 }		
   	});	
   	p2.add(selectOk);
   	p2.add(selectCancel);
   	newFrame1.add(p1);
   	newFrame1.add(p2);
   	newFrame1.setResizable(false);
   	newFrame1.setSize(new Dimension(300,100));
   	newFrame1.setLocation(500,400);
   	newFrame1.setBackground(Color.green);
   	newFrame1.show();
   }		
  });	
  
  
  
  
  MenuItem item1_2=new MenuItem("設定文字與背景顏色");
  //顯示前景與背景顏色功能設定視窗
  item1_2.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent ae)
   {
   	final Frame newFrame2=new Frame("設定文字與背景顏色");
   	newFrame2.addWindowListener(new WindowAdapter()
   	{
   	 public void windowClosing(WindowEvent we)
   	 {
   	 	newFrame2.dispose();
   	 }		
   	});	
   	newFrame2.setResizable(false);
   	newFrame2.setSize(new Dimension(500,300));
   	newFrame2.setLocation(500,400);
   	newFrame2.setBackground(Color.white);
   	newFrame2.setLayout(new GridLayout(3,1));
   	
   	Panel pa1=new Panel(new GridLayout(1,2));
   	Panel pa2=new Panel(new GridLayout(1,2));
   	labelFore=new Label();
   	labelFore.setSize(new Dimension(200,200));
   	labelFore.setBackground(new Color(label.getForeground().getRed(),label.getForeground().getGreen(),label.getForeground().getBlue()));
   	pa2.add(new Label("設定文字顏色"));
   	pa2.add(labelFore);
   	
   	Panel pa3=new Panel(new GridLayout(3,2));
   	sbFR=new Scrollbar(Scrollbar.HORIZONTAL,label.getForeground().getRed(),10,0,255);
    sbFG=new Scrollbar(Scrollbar.HORIZONTAL,label.getForeground().getGreen(),10,0,255);
   	sbFB=new Scrollbar(Scrollbar.HORIZONTAL,label.getForeground().getBlue(),10,0,255);
   	sbFR.addAdjustmentListener(new MyEventHandler());
    sbFG.addAdjustmentListener(new MyEventHandler());   	
    sbFB.addAdjustmentListener(new MyEventHandler());
   	pa3.add(new Label("紅色值"));
   	pa3.add(sbFR);
   	pa3.add(new Label("綠色值"));
   	pa3.add(sbFG);
   	pa3.add(new Label("藍色值"));
   	pa3.add(sbFB);
   	pa1.add(pa2);
   	pa1.add(pa3);
   	

   	Panel pb1=new Panel(new GridLayout(1,2));
   	Panel pb2=new Panel(new GridLayout(1,2));
   	labelBack=new Label();
   	labelBack.setSize(new Dimension(200,200));
   	labelBack.setBackground(new Color(label.getBackground().getRed(),label.getBackground().getGreen(),label.getBackground().getBlue()));
   	pb2.add(new Label("設定背景顏色"));
   	pb2.add(labelBack);
   	
   	Panel pb3=new Panel(new GridLayout(3,2));
   	sbBR=new Scrollbar(Scrollbar.HORIZONTAL,label.getBackground().getRed(),10,0,255);
    sbBG=new Scrollbar(Scrollbar.HORIZONTAL,label.getBackground().getGreen(),10,0,255);
   	sbBB=new Scrollbar(Scrollbar.HORIZONTAL,label.getBackground().getBlue(),10,0,255);
   	sbBR.addAdjustmentListener(new MyEventHandler());
    sbBG.addAdjustmentListener(new MyEventHandler());   	
    sbBB.addAdjustmentListener(new MyEventHandler());
   	pb3.add(new Label("紅色值"));
   	pb3.add(sbBR);
   	pb3.add(new Label("綠色值"));
   	pb3.add(sbBG);
   	pb3.add(new Label("藍色值"));
   	pb3.add(sbBB);
   	pb1.add(pb2);
   	pb1.add(pb3);
   	
   	
   	Panel pc3=new Panel(new FlowLayout());
   	Button b1=new Button("確定");
   	b1.addActionListener(new ActionListener()
   	{
   	 public void actionPerformed(ActionEvent ae)
   	 {
   	  label.setForeground(new Color(tempfrColor,tempfgColor,tempfbColor));
   	  label.setBackground(new Color(tempbrColor,tempbgColor,tempbbColor));
   	  newFrame2.dispose();
   	 }	
   	});
   	Button b2=new Button("取消");
   	b2.addActionListener(new ActionListener()
   	{
   	 public void actionPerformed(ActionEvent ae)
   	 {
   	 	newFrame2.dispose();
   	 }		
   	});	
   	pc3.add(b1);
   	pc3.add(b2);
   	newFrame2.add(pa1);
   	newFrame2.add(pb1);
   	newFrame2.add(pc3);   	
   	newFrame2.show();
   }		
  });	
  item1.add(item1_1);
  item1.add(item1_2);
  
  
  Menu item2=new Menu("檔案");
  MenuItem item2_1=new MenuItem("作者");
  //顯示作者的個人簡介
  item2_1.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent ae)
   {
   	final Frame newFrame3=new Frame("作者的個人簡介");
   	newFrame3.addWindowListener(new WindowAdapter()
   	{
   	 public void windowClosing(WindowEvent we)
   	 {
   	 	newFrame3.dispose();
   	 }	
   	});	
   	newFrame3.setLayout(new GridLayout(3,1));
   	newFrame3.setResizable(false);
   	newFrame3.add(new Label("作者：洪嘉宏",Label.CENTER));
   	newFrame3.add(new Label("指導老師：許大笨",Label.CENTER));
    newFrame3.add(new Label("程式名稱：小鬧鐘",Label.CENTER));
   	newFrame3.setSize(new Dimension(300,300));
   	newFrame3.setBackground(Color.pink);
   	newFrame3.setForeground(Color.blue);
   	newFrame3.setFont(new Font("sanserif",Font.BOLD,30));
   	newFrame3.setLocation(500,400);
   	newFrame3.show();
   }		
  });	
  MenuItem item2_2=new MenuItem("離開");
  item2_2.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent ae)
   {
   	System.exit(0);
   }	
  });	
  item2.add(item2_1);
  item2.add(item2_2);
  
  MenuBar mb=new MenuBar();
  mb.add(item1);
  mb.add(item2);
  frame.setMenuBar(mb);
  new RunTime().start();
  frame.show(); 
 }
 
 //處理捲軸捲移動事件
 class MyEventHandler implements AdjustmentListener
 {
 	public void adjustmentValueChanged(AdjustmentEvent ae)
 	{
 	 tempfrColor=labelFore.getBackground().getRed();	
 	 tempfgColor=labelFore.getBackground().getGreen();
 	 tempfbColor=labelFore.getBackground().getBlue();
 	 tempbrColor=labelBack.getBackground().getRed();
 	 tempbgColor=labelBack.getBackground().getGreen();
 	 tempbbColor=labelBack.getBackground().getBlue();
 	 Scrollbar sb=(Scrollbar)ae.getSource();	
 	 if(sb==sbFR)
 	 	tempfrColor=sb.getValue();
 	 else if(sb==sbFG)
 	  tempfgColor=sb.getValue();
 	 else if(sb==sbFB)
 	  tempfbColor=sb.getValue();
 	 else if(sb==sbBR)
 	  tempbrColor=sb.getValue();
 	 else if(sb==sbBG)
 	  tempbgColor=sb.getValue();
 	 else
 	  tempbbColor=sb.getValue(); 	  
 	 labelFore.setBackground(new Color(tempfrColor,tempfgColor,tempfbColor)); 
 	 labelBack.setBackground(new Color(tempbrColor,tempbgColor,tempbbColor));
 	}	
 }	
 
 
 public String showTime()
 {
 	Date now=new Date();
 	String nowTime=now.getHours()<12?"AM ":"PM ";
 	nowTime+=(now.getHours()<10 || now.getHours()>12)?"0":"";
 	nowTime+=(now.getHours()>12?now.getHours()-12:now.getHours())+"："+now.getMinutes()+"："+now.getSeconds();
 	return nowTime;
 }	
 
 
 
 class RunTime extends Thread
 {
  public void run()
  {
   while(true)
   {	
   	try
   	{
   	 Date now=new Date();
   	 int hour=now.getHours();
   	 int minute=now.getMinutes();	
   	 if(isAm.equals("PM")&&(setHour!=12))
   	 {
   	 	if(setOk)
   	 	{
   	 	 setHour+=12;
   	 	 setOk=false;
   	 	} 
   	 }	
   	 //判斷設定時間
   	 if((setHour==hour) &&( setMinute==minute))
   	 {
   	 	for(int i=0;i<=255;i+=20)
   	 	{
   	 	 for(int j=1;j<=9999;j++)
   	 	 {
   	 	  labelShowMessage.setBackground(new Color(255,i,i));	
   	 	 }
   	 	}  
   	 	labelShowMessage.setText("您設定的時間到了");
   	 	Toolkit.getDefaultToolkit().beep();
   	 }	
   	 label.setText(showTime());	
     sleep(1000);
    }
    catch(InterruptedException ie)
    {
     ie.printStackTrace();	
    }	 
   } 
  }		
 }	
 
}

