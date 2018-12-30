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
		setTitle("大笨鬧鈴");
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
		c.setBackground(Color.BLACK);//JLabel新增底圖功能,所以無法設定底色
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
						if(labTime.getText().equals(strSetTime))//若設定時間已到顯示JDialog
						{
							class TimeOutJDialog extends JDialog //Local Inner Class
							{
								JLabel labMessage;
								TimeOutJDialog()
								{
									super(JMyClock.this,"鬧鈴通知",true);//以外部類別為參數
									setBounds(300,300,100,80);
									setResizable(false);
									labMessage=new JLabel("設定時間已到");
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
							tod.setAlwaysOnTop(true);//J2SE 5.0 才新增之方法(Widndow)
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
	/**取得系統時間*/
	private String getTime()
	{
		
		//以Calender取得系統時間後自行設計格式
		Calendar ca=Calendar.getInstance();
		String strTime=ca.get(Calendar.AM_PM)==0?"上午 ":"下午 ";

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
		//取得系統的時間格式
		return df.format(Calendar.getInstance().getTime());
		//以format(Date)取得時間字串
		*/
	}

	/**設定時間*/
	private void setTime(String strTime)
	{
		labTime.setText(strTime);	
	}
	/**建立功能表列*/
	private void creatJMenu()
	{
		JMenuBar mb=new JMenuBar();
		setJMenuBar(mb);
		//設定功能表列

		JMenu muFile=new JMenu("檔案");
		JMenu muEdit=new JMenu("編輯");
		mb.add(muFile);
		mb.add(muEdit);
		//新增功能表標籤


		final JMenuItem miFileAbout=new JMenuItem("作者");
		final JMenuItem miFileClosed=new JMenuItem("結束");
		muFile.add(miFileAbout);
		muFile.add(miFileClosed);
		//設計檔案功能表

		final JMenu muEditBackground=new JMenu("底色");
		final JMenu muEditForeground=new JMenu("時間顏色");
		final JMenuItem miEditSetTime=new JMenuItem("鬧鈴設定");
		final JMenuItem miEditCancelTime=new JMenuItem("鬧鈴取消");
		muEdit.add(muEditBackground);
		muEdit.add(muEditForeground);
		muEdit.addSeparator();//分隔線
		muEdit.add(miEditSetTime);
		muEdit.add(miEditCancelTime);
		//設計編輯功能表

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
		//設計底色子功能表

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
		//設計底色子功能表

		class JMenuMouseListener implements ActionListener//Local Inner Class
		{
			public void actionPerformed(ActionEvent e)//設定各功能表項目之功能
			{
				if(e.getSource().equals(miFileAbout))
				{
					class Author extends JDialog
					{
						Author()
						{
							super(JMyClock.this,"作者簡介",true);
							JLabel labAuthor,labCom,labUtil;
							setBounds(300,300,100,140);
							setResizable(false);
							labAuthor=new JLabel("作者:許裕永");
							labCom=new JLabel("任教:巨匠電腦");
							labUtil=new JLabel("單位:高雄認證");
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
					std.show();//顯示鬧鈴設定之對話方塊
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

	/*Member Inner Class 建立鬧鈴設定之JDialog*/
	private class SetTimeJDialog extends JDialog
	{
		JLabel labTitle,labHour,labMinute;
		JComboBox chAM_PM,chHour,chMinute;
		JButton butYes,butCancel;
		SetTimeJDialog()
		{
			super(JMyClock.this,"鬧鈴設定",true);//以外部類別為參數
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
		
			labTitle=new JLabel("請選擇鬧鈴時間");
			add(labTitle,BorderLayout.NORTH);

			JPanel panCenter,panSouth;
			panCenter=new JPanel(new FlowLayout(FlowLayout.LEFT));
			labHour=new JLabel("時");
			labMinute=new JLabel("分");

			chAM_PM=new JComboBox();
			chAM_PM.addItem("上午");
			chAM_PM.addItem("下午");

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
			butYes=new JButton("確定");
			butYes.addMouseListener(new MouseAdapter()
				{
					public void mouseClicked(MouseEvent e)
					{
						strSetTime=getSetTime();
						dispose();
					}
				}
			);
			butCancel=new JButton("取消");
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