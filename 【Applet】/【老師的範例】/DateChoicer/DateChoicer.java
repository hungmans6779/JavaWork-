//將文字方塊、按鈕及選擇視窗整合為一個元件
//此程式為單純元件,須讓其他容器置入後使用
//內部類別綜合應用
//內部類別物件會將日期字串傳給外部類別物件中之元件
//TextField,Button,Choice,Frame
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class DateChoicer extends Panel{
	TextField date=new TextField(10);
	Button browser=new Button("日期選擇視窗");
	
	//讓容器取得本物件之值
	public String getDate(){
		return date.getText();
	}

	DateChoicer(String title){
		Label dateLabel=new Label(title);
		add(dateLabel);
		add(date);
		add(browser);
		browser.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				//讓新視窗蓋住原視窗(以外部類別物件的座標為座標)
				new DateInputer(browser.getX()+browser.getParent().getX(),browser.getParent().getY()+browser.getParent().getY());
				//以按鈕在Panel的X+Panel在AppletX為X座標
				//按鈕在Panel的Y+Panel在AppletY為Y座標
			}
		});
	}
	//建立內部類別
	class DateInputer extends Frame implements ItemListener{
		private Label yearLabel,monthLabel,dayLabel;
		private Choice yearChoice,monthChoice,dayChoice;
		private Button confirm,cancel;
		private void addComponent(){
			yearLabel=new Label("年");
			monthLabel=new Label("月");
			dayLabel=new Label("日");
	
			//在年選單中置入以今年為基準的前後各100年的選項
			yearChoice=new Choice();
			int year=Calendar.getInstance().get(Calendar.YEAR);
			for(int a=-100;a<100;a++){
				yearChoice.addItem(String.valueOf(year + a));
			}
			yearChoice.select(100);//選擇今年
			yearChoice.addItemListener(this);
	
			//月份選單
			monthChoice=new Choice();
			for(int a=1;a<=12;a++){
				monthChoice.addItem(String.valueOf(a));
			}
			monthChoice.select(String.valueOf(Calendar.getInstance().get(Calendar.MONTH)+1));
			//選擇本月
			monthChoice.addItemListener(this);
	
			//日期選單
			dayChoice=new Choice();
			addDayChoiceItem(yearChoice.getSelectedItem(),monthChoice.getSelectedItem());
			dayChoice.select(String.valueOf(Calendar.getInstance().get(Calendar.DATE)));
			//選擇今天

			Panel p=new Panel();
			p.add(yearLabel);
			p.add(yearChoice);
			p.add(monthLabel);
			p.add(monthChoice);
			p.add(dayLabel);
			p.add(dayChoice);
			add(p);
	
			confirm=new Button("確定");
			confirm.addMouseListener(new MouseAdapter(){
				public void mouseClicked(MouseEvent e){
					date.setText(yearChoice.getSelectedItem() + "/" + monthChoice.getSelectedItem() + "/" +
						dayChoice.getSelectedItem());
					dispose();
				}
			});
			cancel=new Button("取消");
			cancel.addMouseListener(new MouseAdapter(){
				public void mouseClicked(MouseEvent e){
					dispose();
				}
			});
			p=new Panel();
			p.add(confirm);
			p.add(cancel);
			add(p,BorderLayout.SOUTH);
			
		}

		//新增日期選單
		public void addDayChoiceItem(String year,String month){
			dayChoice.removeAll();
			int intYear=Integer.parseInt(year);
			int intMonth=Integer.parseInt(month);
			int day=31;
			switch(intMonth){
				case 4:
				case 6:
				case 9:
				case 11:
					day=30;
					break;
				case 2:
					if(intYear%4==0 && intYear%100!=0 || intYear%400==0)
						day=29;
					else
						day=28;
			}
			for(int a=1;a<=day;a++){
				dayChoice.addItem(String.valueOf(a));
			}
		}
		DateInputer(int x,int y){
			addComponent();
	
			setBounds(x,y,300,130);
			setResizable(false);
			setTitle("日期選擇器");
			
			addWindowListener(new WindowAdapter(){
				public void windowClosing(WindowEvent e){
					dispose();
				}
			});
			
			show();
			
		}

		public void itemStateChanged(ItemEvent e){
			addDayChoiceItem(yearChoice.getSelectedItem(),monthChoice.getSelectedItem());		
		}
	}
}