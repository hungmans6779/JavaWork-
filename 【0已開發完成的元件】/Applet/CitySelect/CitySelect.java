/*
《此類別功能說明》 
(1) public String getCity() 取得目前選取的城市名稱
(2) public String getArea() 取得目前選取的區域名稱
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
 	
 	//組定初始城市及地區資料值
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

 	add(new Label("住家地址:"));
 	add(chCity);
 	add(new Label("市"));
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
    	//判斷目前所選擇的城市後，對應出該城市的所有區域
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
 //測試用
 public static void main(String argv[])
 {
 	Frame frame=new Frame("我是一個測試視窗");
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