//GridLayout範例
/**
*顯示月曆讓使用者選擇日期
*/
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class DateSelector extends Frame{
	//年,月顯示
	Label yearLabel,monthLabel;
	Button forward,back;

	//週,日顯示
	GridLayout gl=new GridLayout(7,7);//第一列為週,其他列為日
	Panel p=new Panel(gl);

	//記錄要顯示的年和月
	int showYear,showMonth;


	DateSelector(){
		setBounds(200,200,300,250);
		setResizable(false);
		setTitle("日期選擇表單");


		//加入年Label(因為後面要改值,所以需要參考變數)
		showYear=new Date().getYear()+1900;
		yearLabel=new Label("西元" + String.valueOf(showYear) + " 年",Label.CENTER);
		add(yearLabel,BorderLayout.NORTH);

		//加入月Label(因為後面要改值,所以需要參考變數),及上,下個月之Button
		showMonth=new Date().getMonth()+1;
		monthLabel=new Label(String.valueOf(showMonth) + "月份",Label.CENTER);
		forward=new Button("上個月");
		back=new Button("下個月");
		MonthChangeAdapter mca=new MonthChangeAdapter();
		forward.addMouseListener(mca);
		back.addMouseListener(mca);
		Panel l=new Panel();
		l.add(forward);
		l.add(monthLabel);
		l.add(back);
		add(l,BorderLayout.CENTER);

		
		//加入週Label
		String[] weekLabel={"星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
		for(int a=0;a<weekLabel.length;a++){
			Label temp=new Label(weekLabel[a]);
			p.add(temp);
		}


		//加入日Button
		for(int a=0;a<42;a++){
			Button temp=new Button();
			p.add(temp);
		}
		dateShow(new Date(showYear+ "/" + showMonth + "/" + "1"));
		add(p,BorderLayout.SOUTH);


		//新增視窗監聽器
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}

		
	//製做滑鼠監聽轉接類別
	class MonthChangeAdapter extends MouseAdapter{
		public void mouseClicked(MouseEvent e){
			Button b=(Button)e.getSource();
			if(b.equals(forward)){
			//月份減1
				showMonth--;
				if(showMonth==0){
					showMonth=12;
					showYear--;
				}
			}
			else if(b.equals(back)){
			//月份加1
				showMonth++;
				if(showMonth==13){
					showMonth=1;
					showYear++;
				}
			}
			//改變年,月Label之標籤
			yearLabel.setText("西元" + showYear + "年");
			monthLabel.setText(showMonth + " 月份");

			//改變日Button之標籤
			dateShow(new Date(showYear+ "/" + showMonth + "/" + "1"));
		}
	}

	//設定日Button上之Label
	private void dateShow(Date date){
		Component[] c=p.getComponents();
		int dayOfWeek=date.getDay();
		int dayMax=dayOfMonth(showYear,showMonth);
		int index=0;
		for(int a=7;a<c.length;a++){
		//第一列的週Label不動,所以從index 7開始
			((Button)c[a]).setLabel("");//先設為空字串,條件符合再設Label
			if(index++>=dayOfWeek && a<(dayMax+7+dayOfWeek)){
				((Button)c[a]).setLabel(String.valueOf(a-6-dayOfWeek));
			}
		}

	}

	//傳回某年某月的天數
	private int dayOfMonth(int year,int month){
		int day=31;
		switch(month){
			case 4:
			case 6:
			case 9:
			case 11:
				day=30;
				break;
			case 2:
				if(year%4==0 && year%100!=0 || year%400==0){
					day=29;
				}
				else{
					day=28;
				}
		}
		return day;
	}


	public static void main(String[] args){
		new DateSelector().show();
	}		
}