//本身為視窗程式可獨立執行
//內部類別綜合應用
//內部類別物件會將日期字串傳給外部類別物件中之元件
//TextField,Button,Choice,Frame
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class DateChoicerFrame extends Frame{
	Panel p=new Panel();
	Label dateLabel;;
	TextField birthday=new TextField(10);
	Button browser=new Button("日期選擇視窗");
	DateChoicerFrame(String title)	{
		setBounds(200,200,300,80);
		setResizable(false);
		setTitle(title);
		dateLabel=new Label(title);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		p.add(dateLabel);
		p.add(birthday);
		p.add(browser);
		add(p);

		browser.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				//讓新視窗蓋住原視窗(以外部類別物件的座標為座標)
				new DateInputer(DateChoicerFrame.this.getX(),DateChoicerFrame.this.getY());
			}
		});
	}
	public static void main(String[] args){
		new DateChoicerFrame("出發日期").show();
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
					birthday.setText(yearChoice.getSelectedItem() + "/" + monthChoice.getSelectedItem() + "/" +
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
	
			setBounds(x,y,300,100);
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