package Note.JMyClockPackage;
import java.awt.*;
import java.awt.event.*;
import java.util.*;//Calendar,Date
import java.text.*;//DateFormat
import javax.swing.*;

public class JMyClock extends JFrame
{
	private JLabel labTime;
	private String strSetTime;
	private Container c;
	public JMyClock()
	{
		c=getContentPane();
		setBounds(200,200,180,110);
		setTitle("�j�¾x�a");
		setResizable(false);
		creatJMenu();
		addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent e)
				{
					dispose();
				}
			});//Anonymous Inner Class
		
		labTime=new JLabel(getTime(),JLabel.CENTER);
		labTime.setForeground(Color.green);
		labTime.setFont(new Font(null,Font.BOLD,20));
		c.setBackground(Color.BLACK);//JLabel�s�W���ϥ\��,�ҥH�L�k�]�w����
		c.add(labTime);
		Thread t=new Thread()
		{
			public void run()
			{
				while(true)
				{
					try
					{
						setTime(getTime());
						if(labTime.getText().equals(strSetTime))//�Y�]�w�ɶ��w�����JDialog
						{
							class TimeOutJDialog extends JDialog //Local Inner Class
							{
								JLabel labMessage;
								TimeOutJDialog()
								{
									super(JMyClock.this,"�x�a�q��",true);//�H�~�����O���Ѽ�
									setBounds(300,300,100,80);
									setResizable(false);
									labMessage=new JLabel("�]�w�ɶ��w��");
									add(labMessage);
									addWindowListener(new WindowAdapter()
										{
											public void windowClosing(WindowEvent e)
											{
												dispose();
											}
										}
									);//Anonymous Inner Class
								}
							}
							TimeOutJDialog tod=new TimeOutJDialog();
							tod.setAlwaysOnTop(true);//J2SE 5.0 �~�s�W����k(Widndow)
							tod.show();
						}
						sleep(1000);
					}
					catch(InterruptedException e){}
				}
			}

		};
		t.start();
	}
	/**���o�t�ήɶ�*/
	private String getTime()
	{
		
		//�HCalender���o�t�ήɶ���ۦ�]�p�榡
		Calendar ca=Calendar.getInstance();
		String strTime=ca.get(Calendar.AM_PM)==0?"�W�� ":"�U�� ";

		int intHour=ca.get(Calendar.HOUR);
		if(intHour<10)
			strTime=strTime + "0" + String.valueOf(intHour)+ ":";
		else
			strTime=strTime + String.valueOf(intHour)+ ":";

		int intMinute=ca.get(Calendar.MINUTE);
		if(intMinute<10)
			strTime=strTime + "0" + String.valueOf(intMinute)+ ":";
		else
			strTime=strTime + String.valueOf(intMinute)+ ":";

		int intSecond=ca.get(Calendar.SECOND);
		if(intSecond<10)
			strTime=strTime + "0" + String.valueOf(intSecond);
		else
			strTime=strTime + String.valueOf(intSecond);
		return strTime;
		

		/*
		DateFormat df=DateFormat.getTimeInstance();
		//���o�t�Ϊ��ɶ��榡
		return df.format(Calendar.getInstance().getTime());
		//�Hformat(Date)���o�ɶ��r��
		*/
	}

	/**�]�w�ɶ�*/
	private void setTime(String strTime)
	{
		labTime.setText(strTime);	
	}
	/**�إߥ\���C*/
	private void creatJMenu()
	{
		JMenuBar mb=new JMenuBar();
		setJMenuBar(mb);
		//�]�w�\���C

		JMenu muFile=new JMenu("�ɮ�");
		JMenu muEdit=new JMenu("�s��");
		mb.add(muFile);
		mb.add(muEdit);
		//�s�W�\������


		final JMenuItem miFileAbout=new JMenuItem("�@��");
		final JMenuItem miFileClosed=new JMenuItem("����");
		muFile.add(miFileAbout);
		muFile.add(miFileClosed);
		//�]�p�ɮץ\���

		final JMenu muEditBackground=new JMenu("����");
		final JMenu muEditForeground=new JMenu("�ɶ��C��");
		final JMenuItem miEditSetTime=new JMenuItem("�x�a�]�w");
		final JMenuItem miEditCancelTime=new JMenuItem("�x�a����");
		muEdit.add(muEditBackground);
		muEdit.add(muEditForeground);
		muEdit.addSeparator();//���j�u
		muEdit.add(miEditSetTime);
		muEdit.add(miEditCancelTime);
		//�]�p�s��\���

		final JMenuItem miBackColorRED=new JMenuItem("RED");
		final JMenuItem miBackColorBLUE=new JMenuItem("BLUE");
		final JMenuItem miBackColorBLACK=new JMenuItem("BLACK");
		final JMenuItem miBackColorGREEN=new JMenuItem("GREEN");
		final JMenuItem miBackColorYELLOW=new JMenuItem("YELLOW");
		muEditBackground.add(miBackColorRED);
		muEditBackground.add(miBackColorBLUE);
		muEditBackground.add(miBackColorBLACK);
		muEditBackground.add(miBackColorGREEN);
		muEditBackground.add(miBackColorYELLOW);
		//�]�p����l�\���

		final JMenuItem miForeColorRED=new JMenuItem("RED");
		final JMenuItem miForeColorBLUE=new JMenuItem("BLUE");
		final JMenuItem miForeColorBLACK=new JMenuItem("BLACK");
		final JMenuItem miForeColorGREEN=new JMenuItem("GREEN");
		final JMenuItem miForeColorYELLOW=new JMenuItem("YELLOW");
		muEditForeground.add(miForeColorRED);
		muEditForeground.add(miForeColorBLUE);
		muEditForeground.add(miForeColorBLACK);
		muEditForeground.add(miForeColorGREEN);
		muEditForeground.add(miForeColorYELLOW);
		//�]�p����l�\���

		class JMenuMouseListener implements ActionListener//Local Inner Class
		{
			public void actionPerformed(ActionEvent e)//�]�w�U�\����ؤ��\��
			{
				if(e.getSource().equals(miFileAbout))
				{
					class Author extends JDialog
					{
						Author()
						{
							super(JMyClock.this,"�@��²��",true);
							JLabel labAuthor,labCom,labUtil;
							setBounds(300,300,100,140);
							setResizable(false);
							labAuthor=new JLabel("�@��:�\�Υ�");
							labCom=new JLabel("����:���K�q��");
							labUtil=new JLabel("���:�����{��");
							add(labAuthor,"North");
							add(labCom,"Center");
							add(labUtil,"South");
							addWindowListener(new WindowAdapter()
							{
								public void windowClosing(WindowEvent e)
								{
									dispose();
								}
							});
						}
					}
					new Author().show();
				}
				else if(e.getSource().equals(miFileClosed))
				{
					dispose();
				}
				else if(e.getSource().equals(miForeColorRED))
				{
					labTime.setForeground(Color.RED);
				}
				else if(e.getSource().equals(miForeColorBLUE))
				{
					labTime.setForeground(Color.BLUE);
				}
				else if(e.getSource().equals(miForeColorGREEN))
				{
					labTime.setForeground(Color.GREEN);
				}
				else if(e.getSource().equals(miForeColorBLACK))
				{
					labTime.setForeground(Color.BLACK);
				}
				else if(e.getSource().equals(miForeColorYELLOW))
				{
					labTime.setForeground(Color.YELLOW);
				}
				else if(e.getSource().equals(miBackColorBLUE))
				{
					c.setBackground(Color.BLUE);
				}
				else if(e.getSource().equals(miBackColorRED))
				{
					c.setBackground(Color.RED);
				}
				else if(e.getSource().equals(miBackColorBLACK))
				{
					c.setBackground(Color.BLACK);
				}
				else if(e.getSource().equals(miBackColorGREEN))
				{
					c.setBackground(Color.GREEN);
				}
				else if(e.getSource().equals(miBackColorYELLOW))
				{
					c.setBackground(Color.YELLOW);
				}
				else if(e.getSource().equals(miEditSetTime))
				{
					SetTimeJDialog std=new SetTimeJDialog();
					std.show();//��ܾx�a�]�w����ܤ��
				}
				else if(e.getSource().equals(miEditCancelTime))
				{
					strSetTime=null;
				}
			}	

		}

		JMenuMouseListener mml=new JMenuMouseListener();
		miFileAbout.addActionListener(mml);
		miFileClosed.addActionListener(mml);
		miForeColorRED.addActionListener(mml);
		miForeColorBLUE.addActionListener(mml);
		miForeColorBLACK.addActionListener(mml);
		miForeColorGREEN.addActionListener(mml);
		miForeColorYELLOW.addActionListener(mml);
		miBackColorRED.addActionListener(mml);
		miBackColorBLUE.addActionListener(mml);
		miBackColorGREEN.addActionListener(mml);
		miBackColorBLACK.addActionListener(mml);
		miBackColorYELLOW.addActionListener(mml);
		miEditSetTime.addActionListener(mml);
		miEditCancelTime.addActionListener(mml);
	}

	/*Member Inner Class �إ߾x�a�]�w��JDialog*/
	private class SetTimeJDialog extends JDialog
	{
		JLabel labTitle,labHour,labMinute;
		JComboBox chAM_PM,chHour,chMinute;
		JButton butYes,butCancel;
		SetTimeJDialog()
		{
			super(JMyClock.this,"�x�a�]�w",true);//�H�~�����O���Ѽ�
			setBounds(300,300,220,150);
			setResizable(false);
			addWindowListener(new WindowAdapter()
				{
					public void windowClosing(WindowEvent e)
					{
						dispose();
					}
				}
			);//Anonymous Inner Class
		
			labTitle=new JLabel("�п�ܾx�a�ɶ�");
			add(labTitle,BorderLayout.NORTH);

			JPanel panCenter,panSouth;
			panCenter=new JPanel(new FlowLayout(FlowLayout.LEFT));
			labHour=new JLabel("��");
			labMinute=new JLabel("��");

			chAM_PM=new JComboBox();
			chAM_PM.addItem("�W��");
			chAM_PM.addItem("�U��");

			chHour=new JComboBox();
			for(int a=0;a<=9;a++)
				chHour.addItem("0" + String.valueOf(a));
			for(int a=10;a<=11;a++)
				chHour.addItem(String.valueOf(a));

			chMinute=new JComboBox();
			for(int a=0;a<=9;a++)
				chMinute.addItem("0" + String.valueOf(a));
			for(int a=10;a<=59;a++)
				chMinute.addItem(String.valueOf(a));

			panCenter.add(chAM_PM);
			panCenter.add(chHour);
			panCenter.add(labHour);
			panCenter.add(chMinute);
			panCenter.add(labMinute);
			add(panCenter,BorderLayout.CENTER);
			
			panSouth=new JPanel();
			butYes=new JButton("�T�w");
			butYes.addMouseListener(new MouseAdapter()
				{
					public void mouseClicked(MouseEvent e)
					{
						strSetTime=getSetTime();
						dispose();
					}
				}
			);
			butCancel=new JButton("����");
			butCancel.addMouseListener(new MouseAdapter()
				{
					public void mouseClicked(MouseEvent e)
					{
						dispose();
					}
				}
			);
			panSouth.add(butYes);
			panSouth.add(butCancel);
			add(panSouth,BorderLayout.SOUTH);	
		}
		private String getSetTime()
		{
			return chAM_PM.getSelectedItem() + " " + chHour.getSelectedItem() 
				+ ":" + chMinute.getSelectedItem() +":00";
		}
	}
	public static void main(String[] args)
	{
		JMyClock clock=new JMyClock();
		clock.show();
	}
}