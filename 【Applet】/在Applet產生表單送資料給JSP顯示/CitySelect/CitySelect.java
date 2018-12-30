/*
�m�����O�\�໡���n 
(1) public String getCity() ���o�ثe����������W��
(2) public String getArea() ���o�ثe������ϰ�W��
*/ 

import java.awt.*;
import java.io.*;
import java.awt.event.*;
public class CitySelect extends Panel
{
 public Choice chCity;
 public Choice chArea;
 BufferedReader br;
 String temp="";
 String [] data;
 
 
 public CitySelect()
 {
 	EventHander eh=new EventHander();
 	chCity=new Choice();
 	chCity.addItemListener(eh);
 	chArea=new Choice();
 	
 	//�թw��l�����Φa�ϸ�ƭ�
 	try
 	{ 
 	 boolean firstData=true;	
 	 br=new BufferedReader(new FileReader("city.txt"));
 	 while((temp=br.readLine())!=null)
 	 {
 	 	data=temp.split(",");
 	  chCity.addItem(data[0]);
 	  
 	  if(firstData)
 	  {
 	   for(int i=1;i<data.length;i++)	
 	    chArea.addItem(data[i]);	
 	   firstData=false;
 	  } 
 	 }	
 	}
 	catch(Exception ioe){} 

 	add(new Label("��a�a�}:"));
 	add(chCity);
 	add(new Label("��"));
 	add(chArea);
 }
 class EventHander implements ItemListener
 {
  public void itemStateChanged(ItemEvent ie)
  {	
   String selectCity=chCity.getSelectedItem();	
   chArea.removeAll();
   try
   {
    br=new BufferedReader(new FileReader("city.txt"));		
    while((temp=br.readLine())!=null)
    {
    	data=temp.split(",");
    	//�P�_�ثe�ҿ�ܪ�������A�����X�ӫ������Ҧ��ϰ�
    	if(selectCity.equals(data[0]))
    	{
    	 for(int i=1;i<data.length;i++)
    	 {
    	 	chArea.addItem(data[i]);
    	 }
    	 break;	
    	}	
    }
   }
   catch(IOException ioe){} 	
  }		
 }	
 
 
 public String getCity()
 {
 	return chCity.getSelectedItem();
 }	
 public String getArea()
 {
 	return chArea.getSelectedItem();
 }	
 
 
 //---------------------------------------------------------------------------
 //���ե�
 public static void main(String argv[])
 {
 	Frame frame=new Frame("�ڬO�@�Ӵ��յ���");
 	frame.addWindowListener(new WindowAdapter()
 	{
 	 public void windowClosing(WindowEvent we)
 	 {
 	 	System.exit(0);
 	 }		
 	});	
 	frame.add(new CitySelect());
 	frame.setSize(400,60);
 	frame.setLocation(300,100);
 	frame.setVisible(true);
 }
 //---------------------------------------------------------------------------		
}	