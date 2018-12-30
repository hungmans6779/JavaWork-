//�����������{���i�W�߰���
//�������O��X����
//�������O����|�N����r��ǵ��~�����O���󤤤�����
//TextField,Button,Choice,Frame
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class DateChoicerFrame extends Frame{
	Panel p=new Panel();
	Label dateLabel;;
	TextField birthday=new TextField(10);
	Button browser=new Button("�����ܵ���");
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
				//���s�����\������(�H�~�����O���󪺮y�Ь��y��)
				new DateInputer(DateChoicerFrame.this.getX(),DateChoicerFrame.this.getY());
			}
		});
	}
	public static void main(String[] args){
		new DateChoicerFrame("�X�o���").show();
	}

	//�إߤ������O
	class DateInputer extends Frame implements ItemListener{
		private Label yearLabel,monthLabel,dayLabel;
		private Choice yearChoice,monthChoice,dayChoice;
		private Button confirm,cancel;
		private void addComponent(){
			yearLabel=new Label("�~");
			monthLabel=new Label("��");
			dayLabel=new Label("��");
	
			//�b�~��椤�m�J�H���~����Ǫ��e��U100�~���ﶵ
			yearChoice=new Choice();
			int year=Calendar.getInstance().get(Calendar.YEAR);
			for(int a=-100;a<100;a++){
				yearChoice.addItem(String.valueOf(year + a));
			}
			yearChoice.select(100);//��ܤ��~
			yearChoice.addItemListener(this);
	
			//������
			monthChoice=new Choice();
			for(int a=1;a<=12;a++){
				monthChoice.addItem(String.valueOf(a));
			}
			monthChoice.select(String.valueOf(Calendar.getInstance().get(Calendar.MONTH)+1));
			//��ܥ���
			monthChoice.addItemListener(this);
	
			//������
			dayChoice=new Choice();
			addDayChoiceItem(yearChoice.getSelectedItem(),monthChoice.getSelectedItem());
			dayChoice.select(String.valueOf(Calendar.getInstance().get(Calendar.DATE)));
			//��ܤ���

			Panel p=new Panel();
			p.add(yearLabel);
			p.add(yearChoice);
			p.add(monthLabel);
			p.add(monthChoice);
			p.add(dayLabel);
			p.add(dayChoice);
			add(p);
	
			confirm=new Button("�T�w");
			confirm.addMouseListener(new MouseAdapter(){
				public void mouseClicked(MouseEvent e){
					birthday.setText(yearChoice.getSelectedItem() + "/" + monthChoice.getSelectedItem() + "/" +
						dayChoice.getSelectedItem());
					dispose();
				}
			});
			cancel=new Button("����");
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

		//�s�W������
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
			setTitle("�����ܾ�");
			
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