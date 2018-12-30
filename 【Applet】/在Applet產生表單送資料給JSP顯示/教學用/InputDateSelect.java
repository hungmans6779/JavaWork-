import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class InputDateSelect extends Panel
{
 Label lText;	
 TextField tfDate;
 Button bSelect;
 EventHandler eh;
 Choice chYear;
 Choice chMonth;
 Choice chDate;
 Date date;
 Button bOk;
 Button bCancel;
 final Frame dateFrame;
 boolean addCompent=true;
 
 //��ť��
 class EventHandler	implements ActionListener,ItemListener
 {
 	
 	//Button���s���U����檺��k 
 	//--------------------------------------------------
 	public void actionPerformed(ActionEvent e) 
 	{
 	 Button b=(Button)e.getSource();	
 	 if(b.getLabel().equals("��ܤ��"))
 	 {
 	 	bbb1();
 	 }	
 	 else if(b.getLabel().equals("�T�w"))
 	 {
	 	String value=chYear.getSelectedItem()+"/"+chMonth.getSelectedItem()+"/"+chDate.getSelectedItem();
 	 	tfDate.setText(value); 
 	 	addCompent=false;	
 	 	dateFrame.dispose();
 	 }
 	 else
 	 {
 	 	 addCompent=false;	
 	 	 dateFrame.dispose();
 	 }		
 	}
 	//ActionListener ����
 	//-------------------------------------------------------
 	
 	
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
 	
 		 
 	//--------------------------------------------------
 }	
 //��ť������
 //-------------------------------------------------- 
 
 	public void bbb1()
 	{
    if(addCompent)
    {
 	
 	   dateFrame.setLocation(300,300);
 	   dateFrame.setSize(500,100);
 	   dateFrame.addWindowListener(new WindowAdapter()
 	   {
 	 	  public void windowClosing(WindowEvent we)
 	 	  {
 	 	   addCompent=false;	
 	 	   dateFrame.dispose();
 	 	  }	
 	   });	
 	   Panel p1=new Panel(new FlowLayout());
 	   Panel p2=new Panel(new FlowLayout());
 
  	  for(int i=date.getYear()+1900-50;i<=date.getYear()+1900+50;i++)
 	    chYear.addItem(String.valueOf(i));
 	    chYear.select(String.valueOf(date.getYear()+1900));
 	    chYear.addItemListener(eh);
 	 
 	    for(int i=1;i<=12;i++)
 	     chMonth.addItem(String.valueOf(i));
 	    chMonth.select(String.valueOf(date.getMonth()+1));
 	    chMonth.addItemListener(eh);
 	  
 	    for(int i=1;i<=31;i++)
 	     chDate.addItem(String.valueOf(i));
 	    chDate.select(String.valueOf(date.getDate()));
 	
 	    p1.add(new Label("����G"));
 	    p1.add(chYear);
 	
   	  p1.add(new Label("�~ "));
 	    p1.add(chMonth);
 	    p1.add(new Label("�� "));
 	    p1.add(chDate);
 	    p1.add(new Label("�� "));
 	 
   	  p2.add(bOk);
 	    p2.add(bCancel);
 	 
 	    dateFrame.setLayout(new GridLayout(2,1));
 	    dateFrame.add(p1);
 	    dateFrame.add(p2);
 	   }	 
 	    dateFrame.setVisible(true);	
 	    
 	}	
 	
 	
 //�غc�l
 //-------------------------------------------------- 
 public InputDateSelect()
 {
 	dateFrame=new Frame("�����ܾ�");
 	eh=new EventHandler();
 	date=new Date();
 	lText=new Label("���");
 	tfDate=new TextField(10);
 	bSelect=new Button("��ܤ��");
 	bSelect.addActionListener(eh);
 	bSelect.setActionCommand("1");
 	chYear=new Choice();
 	chMonth=new Choice();
 	chDate=new Choice();
 	bOk=new Button("�T�w");
 	bOk.setActionCommand("2");
  bOk.addActionListener(eh);
 
  bCancel=new Button("����");
  bCancel.setActionCommand("3");
  bCancel.addActionListener(eh);


 
 	add(lText);
 	add(tfDate);
 	add(bSelect);
 }
 //-------------------------------------------------- 
 
 public static void main(String argv[])
 {
  final Frame frame=new Frame("�o�O���յ���");
  frame.setLocation(100,100);
  frame.setSize(500,100);
  frame.addWindowListener(new WindowAdapter()
  {
    public void windowClosing(WindowEvent we)
    {
     frame.dispose();
    }	
  });	
  frame.add(new InputDateSelect());
  frame.show();	
 }		

}	