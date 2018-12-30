/*
�m�����O�\�໡���n
(1) getValue() ���o�ثe�ϥΪ̪��ҳ]�w���ɶ�
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
 final Frame dateFrame; //�]�w���������
 boolean firstShowFrame=true; //�P�_�إߵ��������ơA�إ߳]�w�ɶ���������@����Y���A���s�إ�
 Label lMonth;
 Button dayButton[];
 String value[]=new String[42];
 Calendar cal;
 int addYear=0;
 int addMonth=0;
  
 //�غc�l
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
 	dateFrame=new Frame("����]�w��");  
 	ev=new EventHandler();
 	
 	tf=new TextField();
 	tf.setColumns(10);
 	bSelect=new Button("��ܤ��");
 	bSelect.setActionCommand("��ܤ��");
 	bSelect.addActionListener(ev);
 	
  add(new Label("����G "));
  add(tf);
  add(bSelect);
 }
  //--------------------------------------------------------------
 //�غc�l����

 	
 	
 		
 //��ť��
 class EventHandler implements ActionListener
 {
 	//�B�z��ܤ�����s���U��A��ܤ���]�w������
 	/*********************************************************************************************/
  public void actionPerformed(ActionEvent ae)
  {
   Button button=(Button)ae.getSource();
   //���ܤ�������s���U��....
   if(button.getActionCommand().equals("��ܤ��"))
   {	
   	//��l�ثe�������\���m
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
     //�s�W�����ܵ������\����
     dateFrame.setLayout(new GridLayout(2,1));
     Panel p1=new Panel(new GridLayout(3,1));
     Panel p11=new Panel(new FlowLayout()); //�\����D
     Panel p12=new Panel(new FlowLayout()); //�\��W�U�ӥت�����s
     Panel p13=new Panel(new GridLayout(1,7));
     Panel p2=new Panel(new GridLayout(6,7)); //�\��ʺA���ͪ�Button���s
     p11.add(new Label("�����ܾ�"));
     
     
     Button bLast=new Button("�W�Ӥ�");
     bLast.setActionCommand("�W�Ӥ�");
     bLast.addActionListener(ev);
     String thisMonth=String.valueOf(date.getYear()+1900)+"/"+String.valueOf(date.getMonth()+1);
     lMonth=new Label(thisMonth);
     Button bNext=new Button("�U�Ӥ�");
     bNext.setActionCommand("�U�Ӥ�");
     bNext.addActionListener(ev);
     p12.add(bLast);
     p12.add(lMonth);
     p12.add(bNext);
     p13.add(new Label("��",Label.CENTER));
     p13.add(new Label("�@",Label.CENTER));
     p13.add(new Label("�G",Label.CENTER));
     p13.add(new Label("�T",Label.CENTER));
     p13.add(new Label("�|",Label.CENTER));
     p13.add(new Label("��",Label.CENTER));
     p13.add(new Label("��",Label.CENTER));
     p1.add(p11);
     p1.add(p12);
     p1.add(p13);
       
     changeValue(addYear,addMonth);
     
     //�]�w�ʺA���ͪ�Button����.....
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
   else if(button.getActionCommand().equals("�W�Ӥ�"))
   {
   	if(addMonth<=0)
   	{
   	 addYear--;
   	 addMonth=12;	
   	}	
   	addMonth--;
    changeButtonValue();
   }
   else if(button.getActionCommand().equals("�U�Ӥ�"))
   {
    if(addMonth>=11)
    {
     addYear++;
     addMonth=-1;	
    }	
   	addMonth++;
   	changeButtonValue();
   }
   //��ϥΪ̫��U�Ѽƪ�����ɡA�Y�N�ӭȦ^�Ȩ�tf������
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
 //��ť������

 
 //���ܥثe��ܪ��ѼƤ����
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
 
 
 //���o�C�Ӥ몺�Ѽ�
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

 // getValue() ���o�ثe�ϥΪ̪��ҳ]�w���ɶ�
 public String getValue()
 {
  return tf.getText();	
 }	



 //���ե�
 //-----------------------------------------------------------------
 public static void main(String argv[])
 {
  Frame f=new Frame("�o�O�@�Ӵ��յ���");
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