//GridLayout�d��
/**
*��ܤ�����ϥΪ̿�ܤ��
*/
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class DateSelector extends Frame{
	//�~,�����
	Label yearLabel,monthLabel;
	Button forward,back;

	//�g,�����
	GridLayout gl=new GridLayout(7,7);//�Ĥ@�C���g,��L�C����
	Panel p=new Panel(gl);

	//�O���n��ܪ��~�M��
	int showYear,showMonth;


	DateSelector(){
		setBounds(200,200,300,250);
		setResizable(false);
		setTitle("�����ܪ��");


		//�[�J�~Label(�]���᭱�n���,�ҥH�ݭn�Ѧ��ܼ�)
		showYear=new Date().getYear()+1900;
		yearLabel=new Label("�褸" + String.valueOf(showYear) + " �~",Label.CENTER);
		add(yearLabel,BorderLayout.NORTH);

		//�[�J��Label(�]���᭱�n���,�ҥH�ݭn�Ѧ��ܼ�),�ΤW,�U�Ӥ뤧Button
		showMonth=new Date().getMonth()+1;
		monthLabel=new Label(String.valueOf(showMonth) + "���",Label.CENTER);
		forward=new Button("�W�Ӥ�");
		back=new Button("�U�Ӥ�");
		MonthChangeAdapter mca=new MonthChangeAdapter();
		forward.addMouseListener(mca);
		back.addMouseListener(mca);
		Panel l=new Panel();
		l.add(forward);
		l.add(monthLabel);
		l.add(back);
		add(l,BorderLayout.CENTER);

		
		//�[�J�gLabel
		String[] weekLabel={"�P����","�P���@","�P���G","�P���T","�P���|","�P����","�P����"};
		for(int a=0;a<weekLabel.length;a++){
			Label temp=new Label(weekLabel[a]);
			p.add(temp);
		}


		//�[�J��Button
		for(int a=0;a<42;a++){
			Button temp=new Button();
			p.add(temp);
		}
		dateShow(new Date(showYear+ "/" + showMonth + "/" + "1"));
		add(p,BorderLayout.SOUTH);


		//�s�W������ť��
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}

		
	//�s���ƹ���ť�౵���O
	class MonthChangeAdapter extends MouseAdapter{
		public void mouseClicked(MouseEvent e){
			Button b=(Button)e.getSource();
			if(b.equals(forward)){
			//�����1
				showMonth--;
				if(showMonth==0){
					showMonth=12;
					showYear--;
				}
			}
			else if(b.equals(back)){
			//����[1
				showMonth++;
				if(showMonth==13){
					showMonth=1;
					showYear++;
				}
			}
			//���ܦ~,��Label������
			yearLabel.setText("�褸" + showYear + "�~");
			monthLabel.setText(showMonth + " ���");

			//���ܤ�Button������
			dateShow(new Date(showYear+ "/" + showMonth + "/" + "1"));
		}
	}

	//�]�w��Button�W��Label
	private void dateShow(Date date){
		Component[] c=p.getComponents();
		int dayOfWeek=date.getDay();
		int dayMax=dayOfMonth(showYear,showMonth);
		int index=0;
		for(int a=7;a<c.length;a++){
		//�Ĥ@�C���gLabel����,�ҥH�qindex 7�}�l
			((Button)c[a]).setLabel("");//���]���Ŧr��,����ŦX�A�]Label
			if(index++>=dayOfWeek && a<(dayMax+7+dayOfWeek)){
				((Button)c[a]).setLabel(String.valueOf(a-6-dayOfWeek));
			}
		}

	}

	//�Ǧ^�Y�~�Y�몺�Ѽ�
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