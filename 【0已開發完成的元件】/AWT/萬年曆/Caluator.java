/*
�m�����O�\�໡���n
(1) public String getValue()  ���o�ثe���s�����
*/

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.text.*;
import java.io.*;
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
 private Button bLast; //�]�w�W�Ӥ�������s
 private Button bNext; //�]�w�U�Ӥ�������s
 private Label showMonth;
 private String [] map;
 private Calendar cal;
 private int selectDay=0; //�]�w�ϥΨϥΪ̩ҿ�ܪ��Ѽ�
 private int startWeek=0; 
 BufferedReader br;
 int [][]specialDay;
 
 
 //��l�Ƶ���
 //-------------------------------------------------------------------------------------		
 {
 	setTitle("�U�~��");
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
 	setLayout(new GridLayout(3,1));
 }		
 //��l�Ƶ�������
 //-------------------------------------------------------------------------------------	
 
 //��l��Ū�����ɮר�specialDay�}�C
 //-------------------------------------------------------------------------------------	
 {
 	int totalDay=0;
  int count=0; 
 	String temp="";
 	String []tempDay;
 	try
 	{
 	 br=new BufferedReader(new FileReader("SpecialDay.txt"));	
 	 while(br.readLine()!=null)
 	  totalDay++;
 	}
 	catch(Exception ioe){}  
  specialDay=new int[totalDay][2]; 
 	try
 	{
 	 br=new BufferedReader(new FileReader("SpecialDay.txt"));		
 	 while((temp=br.readLine())!=null)
 	 {
 	  tempDay=temp.split(",");
 	  specialDay[count][0]=Integer.parseInt(tempDay[1]);
 	  specialDay[count][1]=Integer.parseInt(tempDay[2]);
 	  count++;	
 	 }
 	}
 	catch(IOException ioe) {}
 }	
 //��l��Ū�����ɮר�specialDay�}�C
 //-------------------------------------------------------------------------------------
	
	
 //�غc�l
 //-------------------------------------------------------------------------------------			
 public Caluator()
 {
 	date=new Date();
  df=DateFormat.getDateInstance();
  thisYear=date.getYear()+1900; //�]�w�ثe���~��
  thisMonth=date.getMonth()+1;  //�]�w�ثe�����
  addYear=date.getYear();       //���o��l���~����
  addMonth=date.getMonth();     //���o��l���~����
 	eh=new EventHandler();
 	cal=Calendar.getInstance();
 		
 	Panel p1=new Panel(new GridLayout(3,1));
 	Panel p11=new Panel(new FlowLayout());
 	Panel p12=new Panel(new FlowLayout());	
 	Panel p13=new Panel(new GridLayout(1,7));
 	Panel p2=new Panel(new GridLayout(3,7));
 	Panel p3=new Panel(new GridLayout(3,7));
 	
 	//*****************************************************************
 	chYear=new Choice();
 	chYear.addItemListener(eh);
 	for(int i=1;i<=9999;i++)
 	 chYear.addItem(String.valueOf(i));
 	chYear.select(String.valueOf(thisYear));
 	 
 	chMonth=new Choice();
 	chMonth.addItemListener(eh);
 	for(int i=1;i<=12;i++)
 	 chMonth.addItem(String.valueOf(i));
 	chMonth.select(String.valueOf(thisMonth));
   
  p11.add(new Label("����G"));
 	p11.add(chYear);
 	p11.add(new Label("�~ "));
 	p11.add(chMonth);
 	p11.add(new Label("�� "));
 	//*****************************************************************
 	bLast=new Button("�W�Ӥ�");
 	bLast.addActionListener(eh);
 	bLast.setActionCommand("�W�Ӥ�");
  showMonth=new Label("�褸�G"+String.valueOf(thisYear)+" �~ "+String.valueOf(thisMonth)+" ��");
  showMonth.setForeground(Color.BLUE);
  bNext=new Button("�U�Ӥ�");
 	bNext.addActionListener(eh);
 	bNext.setActionCommand("�U�Ӥ�");	
 	p12.add(bLast);
 	p12.add(showMonth);
 	p12.add(bNext);
 	
 	Label lSun=new Label("��",Label.CENTER);
 	lSun.setForeground(Color.BLUE);
 	p13.add(lSun);
  p13.add(new Label("�@",Label.CENTER));
  p13.add(new Label("�G",Label.CENTER));
  p13.add(new Label("�T",Label.CENTER));
  p13.add(new Label("�|",Label.CENTER));
  p13.add(new Label("��",Label.CENTER));
 	Label lSat=new Label("��",Label.CENTER);
 	lSat.setForeground(Color.BLUE);
 	p13.add(lSat);  
  
 	p1.add(p11);
 	p1.add(p12);
 	p1.add(p13);
 	//*****************************************************************
 	map=new String[42];
 	for(int i=0;i<map.length;i++)
 	 map[i]="";
 	
  daysButton=new Button[42];
  changeMap(); //�ܧ�Map��
 	
 	for(int i=0;i<=20;i++)
 	{	
 	 daysButton[i]=new Button(map[i]);	
 	 daysButton[i].addActionListener(eh);
 	 p2.add(daysButton[i]);
 	} 
 	for(int i=21;i<=41;i++)
 	{
 	 daysButton[i]=new Button(map[i]);	
 	 daysButton[i].addActionListener(eh);
 	 p3.add(daysButton[i]);
 	}
 	//��ܯS�O������p�G�O�Ұ���ΰ�w����ɡA�h��ܤ@�ǮĪG
 	showSpecialDays(); 
 	add(p1);
 	add(p2);
 	add(p3);
 }	
 //�غc�l����
 //-------------------------------------------------------------------------------------	
  
 
 
 //�ƥ��ť��
 //-------------------------------------------------------------------------------------	
 class EventHandler implements ItemListener,ActionListener
 {
 	//���UButton���s�ɪ��ʧ@
 	//-------------------------------------------------------------------------------------	
 	public void actionPerformed(ActionEvent ae)
  {
   Button button=(Button)ae.getSource();
   if(button.getActionCommand().equals("�W�Ӥ�"))
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
    showMonth.setText("�褸�G"+String.valueOf(addYear+1900)+" �~ "+String.valueOf(addMonth+1)+" ��");  	 
    chYear.select(String.valueOf(addYear+1900));
    chMonth.select(String.valueOf(addMonth+1));
    showSpecialDays();
   }
   else if(button.getActionCommand().equals("�U�Ӥ�"))		
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
     
    showMonth.setText("�褸�G"+String.valueOf(addYear+1900)+" �~ "+String.valueOf(addMonth+1)+" ��");  
    chYear.select(String.valueOf(addYear+1900));
    chMonth.select(String.valueOf(addMonth+1));	
    showSpecialDays();
   }
   else
   {
   	if(!button.getActionCommand().equals(""))
   	{
   	 selectDay=Integer.parseInt(button.getLabel());	
   	 System.out.println(getValue());
   	}	
   }		
  }	
  //���UButton���s�ɪ��ʧ@����
 	//-------------------------------------------------------------------------------------	
 	
 	//�U�Ԧ���檺�ƥ�
 	//------------------------------------------------------------
	public void itemStateChanged(ItemEvent ie)
  {
   addYear=Integer.parseInt(chYear.getSelectedItem())-1900;    	
   addMonth=Integer.parseInt(chMonth.getSelectedItem())-1;
   changeMap();
   for(int i=0;i<map.length;i++)
     daysButton[i].setLabel(map[i]);
   showMonth.setText("�褸�G"+String.valueOf(addYear+1900)+" �~ "+String.valueOf(addMonth+1)+" ��");  	 
  }	
  //�U�Ԧ���檺�ƥ󵲧�
 	//------------------------------------------------------------	
 }	
 //�ƥ��ť������
 //-------------------------------------------------------------------------------------	

 //�ܧ�Map�}�C��
 //-------------------------------------------------------------------------------------
 public void changeMap()
 {
 	for(int i=0;i<map.length;i++)
 	 map[i]="";
  cal.setTime(new Date(addYear,addMonth,1));	
  startWeek=cal.get(Calendar.DAY_OF_WEEK);
  int endWeek=startWeek+getDays(addYear+1900,addMonth+1);
  int dd=1;
  for(int i=startWeek-1;i<=endWeek-2;i++)
  {
   map[i]=String.valueOf(dd);	
   dd++;
  }	
 }	
 //�ܧ�Map�}�C�ȵ���
 //-------------------------------------------------------------------------------------
  
 //���o��������Ѽ�
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
 //���o��������ѼƵ���
 //------------------------------------------------------------------------------------- 
 
 //��ܯS�O������p�G�O�Ұ���ΰ�w����ɡA�h��ܤ@�ǮĪG
 //-------------------------------------------------------------------------------------	
 public void showSpecialDays()
 {
  for(int i=0;i<42;i++) 
 	{
 	 //���s�N���s��l�榡	
 	 daysButton[i].setBackground(SystemColor.control);	
 	 daysButton[i].setForeground(Color.BLACK);	
 	 //�w��g���B�鰵��ܨ䵲�G
 	 if((i%7==0 || i%7==6 ) &&(!daysButton[i].getLabel().equals("")))
 	 {
 	  daysButton[i].setForeground(Color.WHITE);	
 	  daysButton[i].setBackground(Color.RED); 
 	 }
 	 //�P�_�S�w��w���骺�����ܨ䵲�G 
   for(int j=0;j<specialDay.length;j++)
   {
   	if(addMonth+1==specialDay[j][0])
   	{
   	 if(i-startWeek+2==specialDay[j][1])
   	 {
   	 	daysButton[i].setForeground(Color.WHITE);	
 	    daysButton[i].setBackground(Color.BLUE); 
   	 }		
   	}	
   }	 
 	}	
 }	
 //��ܯS�O������p�G�O�Ұ���ΰ�w����ɡA�h��ܤ@�ǮĪG����
 //-------------------------------------------------------------------------------------	
 
 //���o�ثe���s�����
 public String getValue()
 {
  return df.format(new Date(addYear,addMonth,selectDay));	
 }	
 
 //���ե�....
 public static void main(String argv[])
 {
  new Caluator().show();	
 }		
}	