import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import java.text.*;

public class DateSelect extends Panel
{
	private Date date;
	private DateFormat df;
	public Choice chYear;
	public Choice chMonth;
	public Choice chDate;
	Eventhandler eh;
	
	public DateSelect()
	{
		date=new Date();
		df=DateFormat.getDateInstance();
		eh=new Eventhandler();
		chYear=new Choice();
		for(int i=date.getYear()-100+1900;i<=date.getYear()+1900;i++)
		{
				chYear.addItem(String.valueOf(i));
		}
		chYear.select(String.valueOf(date.getYear()+1900));
		chYear.addItemListener(eh);
		
		chMonth=new Choice();
		for(int i=1;i<=12;i++)
		{
				chMonth.addItem(String.valueOf(i));
		}
		chMonth.select(String.valueOf(date.getMonth()+1));
		chMonth.addItemListener(eh);
		
		chDate=new Choice();
		for(int i=1;i<=31;i++)
		{
				chDate.addItem(String.valueOf(i));
		}
		chDate.select(String.valueOf(date.getDate()));
		
		add(new Label("生日"));
		add(chYear);	
		add(new Label("年"));
		add(chMonth);
		add(new Label("月"));
		add(chDate);
		add(new Label("日"));
	}
	public static void main(String[] args)
	{
			Frame f=new Frame("AWT");
			f.addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent e)
				{
					System.exit(0);	
				}
			}
			);
			f.add(new DateSelect());
			f.setLocation(200,200);
			f.setSize(300,300);
			f.setVisible(true);
			
	}

	
	class Eventhandler implements ItemListener
	{
		public void itemStateChanged(ItemEvent e)	
		{
			int year=Integer.parseInt(chYear.getSelectedItem());	
			int month=Integer.parseInt(chMonth.getSelectedItem());	
			int day=31;
			switch(month)
			{
				case 2:
					if(year%4==0 && year%100!=0 || year%400==0)
						day=29;
					else	
						day=28;	
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					day=30;
					break;
			}
			chDate.removeAll();
			for(int i=1;i<=day;i++)
			{
					chDate.addItem(String.valueOf(i));
			}
		}
	}
	
	
	public int getYear()
	{
			return Integer.parseInt(chYear.getSelectedItem());
	}
	public int getMonth()
	{
			return Integer.parseInt(chMonth.getSelectedItem());
	}
	public int getDate()
	{
			return Integer.parseInt(chDate.getSelectedItem());
	}	
	public String getDateFormat()
	{
		return df.format(new Date(getYear()-1900,getMonth()-1,getDate()));	
	}
	
}