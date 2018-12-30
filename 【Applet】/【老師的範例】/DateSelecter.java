import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.text.*;

public class DateSelecter extends Panel{
	private Date date=new Date();
	private DateFormat df=DateFormat.getDateInstance();

	private Choice cYear=new Choice();
	private Choice cMonth=new Choice();
	
	{
		for(int a=1;a<=12;a++){
			cMonth.add(Integer.toString(a));
		}
	}

	private Choice cDate=new Choice();
	
	{
		int day=getCDateDate(date.getYear()+1900,date.getMonth()+1);

		for(int a=1;a<=day;a++){
			cDate.add(Integer.toString(a));
		}
	}

	private int getCDateDate(int year,int month){
		int date=31;
		switch(month){
			case 4:
			case 6:
			case 9:
			case 11:
				date=30;
				break;
			case 2:
				if(year%4==0 && year%100!=0 ||year%400==0)
					date=29;
				else
					date=28;
		}
		return date;		
	}

	//新增元件監聽器
	{
		class MyItemListener implements ItemListener{
			public  void itemStateChanged(ItemEvent e) {
				int year=Integer.parseInt(cYear.getSelectedItem());
				int month=Integer.parseInt(cMonth.getSelectedItem());
				int date=getCDateDate(year,month);
				
				cDate.removeAll();
				for(int a=1;a<=date;a++){
					cDate.add(Integer.toString(a));
				}
			}
		}
		MyItemListener mil=new MyItemListener();
		cYear.addItemListener(mil);
		cMonth.addItemListener(mil);
	}



	/**年份為執行時之前後五十年*/
	public DateSelecter(){
		this(new Date().getYear()+1900-50,new Date().getYear()+1900+50);
	}

	/**建構者指定起始年與結束年*/
	public DateSelecter(int startYear,int endYear){

		for(int a=startYear;a<=endYear;a++){
			cYear.add(Integer.toString(a));
		}

		setSize(250,50);
		Label lYear=new Label("年");
		Label lMonth=new Label("月");
		Label lDate=new Label("日");
		add(cYear);
		add(lYear);
		add(cMonth);
		add(lMonth);
		add(cDate);
		add(lDate);

		cYear.select(Integer.toString(date.getYear()+1900));
		cMonth.select(Integer.toString(date.getMonth()+1));
		cDate.select(Integer.toString(date.getDate()));
	}

	public static void main(String[] args){
		final Frame f=new Frame();
		f.setBounds(300,300,260,60);
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				f.dispose();
			}
		});


		f.add(new DateSelecter());
		f.setVisible(true);
	}	
}