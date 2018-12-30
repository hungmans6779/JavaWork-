//以Swing元件建立JavaNote

package Note.JJavaNotePackage;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import Note.JMyClockPackage.*;

public class JJavaNote extends JFrame implements ActionListener{
	
	JTextArea ta;	//文字方塊
	int textSize=12;	//預設文字大小
	JMenuBar mb=new JMenuBar();	//功能表列
	JPopupMenu pm=new JPopupMenu();	//快顯功能表
	/**記錄目前指標位置,尋找及取代用*/
	int focus;
	/**記錄檔案是否變更*/
	boolean isChange=false;

	/**建立功能表列*/
	private void addJMenuBar(){
		String[] s={"檔案","編輯","檢視","格式","其他"};
		for(int a=0;a<s.length;a++){
			JMenu m=new JMenu(s[a]);
			mb.add(m);
		}
		addFileJMenu();
		addEditJMenu();
		addViewJMenu();
		addFormatJMenu();
		addHelpJMenu();
		addJPopupMenu();
		setJMenuBar(mb);
	}

	/**建立檔案功能表*/
	private void addFileJMenu(){
		JMenu m=mb.getMenu(0);//取得第一個功能表物件
		m.add(new JMenuItem("開新檔案..."));
		//於功能表物件中新增功能表項目,"..."代表會出現對話方塊
		m.add(new JMenuItem("開啟舊檔..."));
		m.add(new JMenuItem("儲存檔案..."));
		m.add(new JMenuItem("另存檔案..."));
		m.add(new JMenuItem("關閉"));

		//逐一取得沒有名字的JMenuItem物件
		for(int a=0;a<m.getItemCount();a++){
			JMenuItem mi=m.getItem(a);
			mi.addActionListener(this);//新增監聽器
			mi.setActionCommand(mi.getLabel());//以功能項目標籤為ActionCommand
		}
		m.insertSeparator(4);//於序號4的位置新增分隔線
	}

	/**建立編輯功能表*/
	private void addEditJMenu(){
		JMenu m=mb.getMenu(1);
		m.add(new JMenuItem("剪下"));
		m.add(new JMenuItem("複製"));
		m.add(new JMenuItem("貼上"));
		for(int a=0;a<m.getItemCount();a++){
			JMenuItem mi=m.getItem(a);
			mi.addActionListener(this);
			mi.setActionCommand(mi.getLabel());
		}
	}

	/**建立檢視功能表*/
	private void addViewJMenu(){
		JMenu m=mb.getMenu(2);
		m.add(new JMenuItem("尋找..."));
		m.add(new JMenuItem("取代..."));
		m.add(new JMenuItem("到..."));
		for(int a=0;a<m.getItemCount();a++){
			JMenuItem mi=m.getItem(a);
			mi.addActionListener(this);
			mi.setActionCommand(mi.getLabel());
		}
	}

	/**建立格式功能表*/
	private void addFormatJMenu(){
		JMenu m=mb.getMenu(3);


		JMenu c=new JMenu("色彩");
		String[] temp={"紅","綠","藍","黑","其他..."};
		for(int a=0;a<temp.length;a++){			
			JMenuItem mi=new JMenuItem(temp[a]);
			mi.addActionListener(this);
			mi.setActionCommand(mi.getLabel());
			c.add(mi);
		}
		m.add(c);

		
		JMenu s=new JMenu("字型大小");
		temp=new String[]{"放大","縮小","自訂..."};
		int [] i={KeyEvent.VK_A,KeyEvent.VK_I};
		for(int a=0;a<temp.length;a++){			
			JMenuItem mi=new JMenuItem(temp[a]);
			mi.addActionListener(this);
			mi.setActionCommand(mi.getLabel());
			s.add(mi);
		}
		m.add(s);
	}

	/**建立其他功能表*/
	private void addHelpJMenu(){
		JMenu m=mb.getMenu(4);
		m.add(new JMenuItem("關於"));
		m.add(new JMenuItem("電子鐘"));
		for(int a=0;a<m.getItemCount();a++){
			JMenuItem mi=m.getItem(a);
			mi.addActionListener(this);
			mi.setActionCommand(mi.getLabel());
		}
	}

	/**建立快顯功能表*/
	private void addJPopupMenu(){
		String[] JLabel={"剪下","複製","貼上"};
		for(int a=0;a<JLabel.length;a++){
			JMenuItem mi=pm.add(JLabel[a]);
			mi.addActionListener(this);
			mi.setActionCommand(mi.getLabel());
		}
	}


	/**撰寫各功能選項的程式碼*/

	boolean newFile=true;//記錄是否為新檔案
	File oldFile=null;//記錄舊檔的資料
	boolean close=true;//是否真的關閉檔案(或取消)
	//以上旗標不可宣告於actionPerformed中,否則每次觸發均會還原為初值


	public void actionPerformed(ActionEvent e){
		String command=e.getActionCommand();
		if(command.equals("開新檔案...")){
			if(isChange){
				//顯示確認對話方塊,並取得其傳回值
				int option=JOptionPane.showConfirmDialog(
					JJavaNote.this,"內容已變更,是否儲存檔案?",
					"確認",JOptionPane.YES_NO_CANCEL_OPTION);
			
				//依對話方塊的值回值,執行相對程式
				if(option==JOptionPane.YES_OPTION){
					ActionEvent ae=new ActionEvent(new Object(),10,"儲存檔案...");
					JJavaNote.this.actionPerformed(ae);
				}
				else if(option==JOptionPane.CANCEL_OPTION){
					close=false;//表示不關閉目前檔案
				}
			}

			//取消開新檔案
			if(!close){
				close=true;
				return;
			}
			ta.setText(getDefaultText());

			//所有旗標設回預設值
			setTitle("JJavaNote");
			newFile=true;//記錄是否為新檔案
			oldFile=null;//記錄舊檔的資料
			close=true;//是否真的關閉檔案(或取消)
			isChange=false;
		}
		else if(command.equals("開啟舊檔...")){
			if(isChange){
				int option=JOptionPane.showConfirmDialog(
					JJavaNote.this,"內容已變更,是否儲存檔案?",
					"確認",JOptionPane.YES_NO_CANCEL_OPTION);
				if(option==JOptionPane.YES_OPTION){
					ActionEvent ae=new ActionEvent(new Object(),10,"儲存檔案...");
					JJavaNote.this.actionPerformed(ae);
				}
				else if(option==JOptionPane.CANCEL_OPTION){
					close=false;
				}
			}

			if(!close){
				close=true;
				return;
			}
			try{
				JFileChooser chooser = new JFileChooser();

				/*副檔名過濾器ExampleFileFilter.java為JDK之範例
				位於 安裝資料夾/Demo/jfc/FileChooserDemo/src */
    				ExampleFileFilter filter = new ExampleFileFilter();
				filter.addExtension("txt");
				filter.addExtension("java");
				filter.addExtension("jsp");
				filter.addExtension("html");
				filter.setDescription("TXT & JAVA & JSP & HTML Files");
				chooser.setFileFilter(filter);

				int returnVal = chooser.showOpenDialog(JJavaNote.this);
				if(returnVal == JFileChooser.APPROVE_OPTION) {		
					oldFile=chooser.getSelectedFile();
					//記錄要開啟的檔案名稱
				}

				//開啟檔案
				BufferedReader br=new BufferedReader(
					new FileReader(oldFile));
				String temp="";
				String context="";
				int a=0;//計數器,記錄是否為第一行
				while((temp=br.readLine())!=null){
					if(a++!=0)
						temp="\n" + temp;//若不是第一行則於前方換行
					context+=temp;
				}
				ta.setText(context);
				setTitle(oldFile.getName());
				br.close();

				//設定旗標值
				newFile=false;
				isChange=false;
				close=true;
			}
			catch(NullPointerException ie){}//若開檔對話方塊按取消時new File產生之Exception
			catch(FileNotFoundException ie){
				System.out.println("找不到指定的檔案");
			}
			catch(IOException ie){
				System.out.println("存取發生錯誤");
			}
		}
		else if(command.equals("儲存檔案...")){
			
			File file=null;//用來開啟資料流的路徑及檔名
			if(newFile){
				JFileChooser chooser = new JFileChooser();
    				ExampleFileFilter filter = new ExampleFileFilter();
				int returnVal = chooser.showSaveDialog(JJavaNote.this);
				if(returnVal == JFileChooser.APPROVE_OPTION) {		
					oldFile=file=chooser.getSelectedFile();
					//取得新檔案的資料,做為直接存檔的依據,
				}
			}
			else{
				file=oldFile;		
			}
			try{
				//以開啟舊檔對話方塊執行時記錄之檔案資料為參數來開啟輸出資料流
				BufferedWriter bw=new BufferedWriter(new FileWriter(file));
				bw.write(ta.getText());
				setTitle(file.getName());
				bw.close();
				newFile=false;//不再是新檔案
			}
			catch(NullPointerException ie){}//若開檔對話方塊按取消時new File產生之Exception
			catch(FileNotFoundException ie){
				System.out.println("找不到指定的檔案");
			}
			catch(IOException ie){
				System.out.println("存取發生錯誤");
			}			
		}
		else if(command.equals("另存檔案...")){
			File file=null;//用來做為開啟資料流的檔案資料

			//取得新檔案的資料,做為現在存檔的依據,
			try{
				JFileChooser chooser = new JFileChooser();
    				ExampleFileFilter filter = new ExampleFileFilter();
				int returnVal = chooser.showSaveDialog(JJavaNote.this);
				if(returnVal == JFileChooser.APPROVE_OPTION) {		
					oldFile=file=chooser.getSelectedFile();
				}
				//取得開檔對話方塊的檔案資料做為參數,並做為按儲存檔案時的檔案資料
				BufferedWriter bw=new BufferedWriter(
					new FileWriter(file));
				bw.write(ta.getText());
				setTitle(file.getName());//設定視窗標頭
				bw.close();
				newFile=false;//不再是新檔案
			}
			catch(NullPointerException ie){}//若開檔對話方塊按取消時new File產生之Exception
			catch(FileNotFoundException ie){
				System.out.println("找不到指定的檔案");
			}
			catch(IOException ie){
				System.out.println("存取發生錯誤");
			}
		}
		else if(command.equals("關閉")){
			if(isChange){
				int option=JOptionPane.showConfirmDialog(
					JJavaNote.this,"內容已變更,是否儲存檔案?",
					"確認",JOptionPane.YES_NO_CANCEL_OPTION);
				if(option==JOptionPane.YES_OPTION){
					ActionEvent ae=new ActionEvent(new Object(),10,"儲存檔案...");
					JJavaNote.this.actionPerformed(ae);
					System.exit(0);
				}
				else if(option==JOptionPane.NO_OPTION){
					System.exit(0);
				}
				else if(option==JOptionPane.CANCEL_OPTION){
				}
			}
			else
				System.exit(0);
		}
		else if(command.equals("剪下")){
			ta.cut();
			isChange=true;
		}
		else if(command.equals("複製")){
			ta.copy();
			isChange=true;
		}
		else if(command.equals("貼上")){
			ta.paste();
			isChange=true;
		}
		else if(command.equals("尋找...")){

			new FindJDialog(1);
		
		}
		else if(command.equals("取代...")){
			new FindJDialog(2);
		}
		else if(command.equals("到...")){
			class GoJDialog extends JDialog{
				GoJDialog(){
					super(JJavaNote.this,"到",true);
					setBounds(200,200,250,70);
					setResizable(false);
					
					JLabel goJLabel=new JLabel("行數");
					final JTextField lineText=new JTextField(10);
					//因為要讓MouseAdapter內部類別存取,所以須設為final
					JButton go=new JButton("到");
					go.addMouseListener(new MouseAdapter(){
						public void mouseClicked(MouseEvent e){
							int line=0;
							try{
								line=Integer.parseInt(lineText.getText());
							}
							catch(NumberFormatException ne){
								lineText.setText("請輸入行數");
								lineText.setSelectionStart(0);
								lineText.setSelectionEnd(lineText.getText().length()-1);
								return;
							}
							
							int setFocus=0;//記錄字數
							String content=ta.getText();
							int flow=0;//記錄經過的行數
							for(int a=0;a<content.length();a++){
								if(content.charAt(a)=='\n')
									if(++flow==line-1)
										break;
								setFocus++;
							}
							ta.setSelectionStart(setFocus+1);
							dispose();
						}
					});
					Panel p=new Panel();
					p.add(goJLabel);
					p.add(lineText);
					p.add(go);
					
					add(p);
					addWindowListener(new WindowAdapter(){
						public void windowClosing(WindowEvent e){
							dispose();
						}

					});
					show();
				}
			}
			new GoJDialog();
		}
		else if(command.equals("紅")){
			ta.setForeground(Color.red);
		}
		else if(command.equals("綠")){
			ta.setForeground(Color.green);
		}
		else if(command.equals("藍")){
			ta.setForeground(Color.blue);
		}
		else if(command.equals("黑")){
			ta.setForeground(Color.black);
		}
		else if(command.equals("其他...")){
			//顯示顏色選擇方塊,並接收其傳回值
			Color c=JColorChooser.showDialog(JJavaNote.this,"顏色選擇方塊",new Color(128,128,128));
			ta.setForeground(c);
		}
		else if(command.equals("放大")){
			textSize+=2;
			ta.setFont(new Font(null,0,textSize));
		}
		else if(command.equals("縮小")){
			textSize-=2;
			ta.setFont(new Font(null,0,textSize));
		}
		else if(command.equals("自訂...")){
			try{
				//顯示輸入對話方塊,接收其值後轉回整數
				textSize=Integer.parseInt(JOptionPane.showInputDialog(JJavaNote.this,"請輸入字型大小"));
			}
			catch(NumberFormatException nfe){
				JOptionPane.showMessageDialog(JJavaNote.this,
					"請輸入正確的數字","錯誤",JOptionPane.INFORMATION_MESSAGE);
				return;
			}
			if(textSize<1 || textSize>1638){
				//顯示訊息方塊
				JOptionPane.showMessageDialog(JJavaNote.this,
					"請輸入介於1~1638間的數字","錯誤",JOptionPane.INFORMATION_MESSAGE);				
				return;
			}
			ta.setFont(new Font(null,0,textSize));
		}			
		else if(command.equals("關於")){
			class AboutJDialog extends JDialog{


				AboutJDialog(){
					super(JJavaNote.this,"About",true);
					setBounds(200,200,220,120);
					setResizable(false);

					JLabel information;
					Panel panel;
					information=new JLabel("公用軟體,歡迎使用");
					panel=new Panel(new FlowLayout(FlowLayout.LEFT));
					panel.add(information);
					add(panel,BorderLayout.NORTH);
	
					information=new JLabel("作者:許大笨");
					panel=new Panel(new FlowLayout(FlowLayout.LEFT));
					panel.add(information);
					add(panel,BorderLayout.CENTER);
	
					information=new JLabel("E-mail:yung1001@pchome.com.tw");
					panel=new Panel(new FlowLayout(FlowLayout.LEFT));
					panel.add(information);
					add(panel,BorderLayout.SOUTH);


					addWindowListener(new WindowAdapter(){
						public void windowClosing(WindowEvent e){
							dispose();
						}
					});
				}
			}
			new AboutJDialog().show();
		}
		else if(command.equals("電子鐘")){
			new JMyClock().show();			
		}
	}


	/**開新檔案後的預設文字*/
	String defaultFile="";//記錄要讀入的檔案名稱
	private String getDefaultText(){
		String defaultText="";//要回值給ta物件的字串
		class NewFileDialog extends JDialog implements ActionListener{
			String[] JButtonJLabel={"Empty","Application","Applet","Frame","JSP","Servlet","HTML"};
			boolean oldFile=false;
			Panel p=new Panel();
			NewFileDialog(){
				super(JJavaNote.this,"檔案樣式選擇",true);
				setBounds(100,100,640,100);
				setResizable(false);
				addWindowListener(new WindowAdapter(){
					public void windowClosing(WindowEvent e){
						defaultFile="example/empty.txt";
					}
				});
				for(int a=0;a<JButtonJLabel.length;a++){
					JButton b=new JButton(JButtonJLabel[a]);
					b.addActionListener(this);
					b.setActionCommand(JButtonJLabel[a]);
					p.add(b);
				}
				add(new JLabel("請選擇要開啟的新檔案樣式"),BorderLayout.NORTH);
				add(p);
			}

			public void actionPerformed(ActionEvent e){
				String command=e.getActionCommand();
				if(command.equals("Empty")){
					defaultFile="example/empty.txt";
					dispose();
				}
				else if(command.equals("Application")){
					defaultFile="example/application.txt";
					dispose();
				}
				else if(command.equals("Applet")){
					defaultFile="example/applet.txt";
					dispose();
				}
				else if(command.equals("Frame")){
					defaultFile="example/Frame.txt";
					dispose();
				}
				else if(command.equals("JSP")){
					defaultFile="example/jsp.txt";
					dispose();
				}
				else if(command.equals("Servlet")){
					defaultFile="example/servlet.txt";
					dispose();
				}
				else if(command.equals("HTML")){
					defaultFile="example/html.txt";
					dispose();
				}
			}	
		}
		new NewFileDialog().show();
		//用defaultFile之值讀取檔案
		try{
			if(defaultFile.equals("oldFile")){
				return "oldFile";
			}
			BufferedReader br=new BufferedReader(new FileReader(defaultFile));
			String temp;
			while((temp=br.readLine())!=null){
				defaultText+=temp + "\n";
			}
		}
		catch(FileNotFoundException e){
			defaultText="//未找到預設檔案";
		}
		catch(IOException e){
			defaultText="//存取預設檔案發生錯誤";
		}
		catch(Exception e){
			defaultText="//發生不明錯誤";
		}
		return defaultText;
	}

	/**此類別供尋找及取代共用,顯示時以建構方法的參數決定顯示視窗之大小*/
	private class FindJDialog extends JDialog implements ActionListener{
		JLabel findJLabel,replaceJLabel;
		JTextField findText,replaceText;
		JButton next,replace,replaceAll;
		boolean hasFind=false;//記錄是否找到字串,供判斷取代是否執行

		//同一個視窗,用建構方法的參數來決定顯示範圍
		FindJDialog(int style){
			super(JJavaNote.this,"尋找/取代",false);
			findJLabel=new JLabel("尋找");
			replaceJLabel=new JLabel("取代");
			findText=new JTextField(20);
			replaceText=new JTextField(20);
			next=new JButton("尋找下一個");
			next.addActionListener(this);
			replace=new JButton("取代");
			replace.addActionListener(this);
			replaceAll=new JButton("全部取代");
			replaceAll.addActionListener(this);
			Panel p=new Panel(new FlowLayout(FlowLayout.LEFT));
			p.add(findJLabel);
			p.add(findText);
			p.add(next);
			add(p,BorderLayout.NORTH);

			p=new Panel(new FlowLayout(FlowLayout.LEFT));
			p.add(replaceJLabel);
			p.add(replaceText);
			p.add(replace);
			p.add(replaceAll);
			add(p,BorderLayout.CENTER);

			if(style==1)
				setBounds(200,200,400,70);
			else
				setBounds(200,200,450,110);
			setResizable(false);

			addWindowListener(new WindowAdapter(){
				public void windowClosing(WindowEvent e){
					dispose();
				}
			});
			show();
		}
		public void actionPerformed(ActionEvent e){

			String findString=findText.getText();
			String replaceString=replaceText.getText();	
			JButton b=(JButton)e.getSource();
			if(b==next){				
				ta.requestFocus();
				int ch=focus;//取得目前的起始位置			
				String content=ta.getText().substring(ch);//取得起始位罝後之所有文字
				int selectStart=content.indexOf(findString);//傳回值-1表示未找到
				if(selectStart!=-1){
					setTitle("找到要尋找的字串");
					ta.setSelectionStart(selectStart+focus);
					ta.setSelectionEnd(selectStart+findString.length()+focus);
					focus=ta.getSelectionEnd();//設定下一次的起始位置
					hasFind=true;
				}
				else{
					setTitle("已找不到要尋找的字串");
					hasFind=false;//不能執行取代
				}
			}
			else if(b==replace){
				if(!hasFind)return;//未找到要搜尋的字串
				String content=ta.getText().substring(0,focus);

				//因為replaceText有計算換行符號,但indexOf方法沒有,所以行數要自己算
				int line=0;
				/*for(int a=0;a<content.length();a++){
					if(content.charAt(a)=='\n')
						line++;
				}*/

				ta.replaceRange(replaceString,ta.getSelectionStart()-line,ta.getSelectionEnd()-line);
				actionPerformed(new ActionEvent(next,0,null));//再次執行尋找
			}
			else {
				if(!hasFind)return;
				String content=ta.getText();
				//用字串物件來全部置換
				content=content.replaceAll(findString,replaceString);
				ta.setText(content);
				hasFind=false;//不接受再取代

			}
		}
	}
	JJavaNote(){
		setTitle("JJavaNote");
		setBounds(100,100,640,480);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				if(isChange){
					int option=JOptionPane.showConfirmDialog(
						JJavaNote.this,"內容已變更,是否儲存檔案?",
						"確認",JOptionPane.YES_NO_OPTION);
					if(option==JOptionPane.YES_OPTION){
						ActionEvent ae=new ActionEvent(new Object(),10,"儲存檔案...");
						JJavaNote.this.actionPerformed(ae);
					}
				}
				System.exit(0);
			}
		});

		ta=new JTextArea(getDefaultText());
		
		ta.setFont(new Font(null,0,textSize));
		ta.add(pm);//將快顯功能表加入此元件
		ta.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				focus=ta.getSelectionEnd();
				if(e.getButton()==MouseEvent.BUTTON3){
					pm.show(ta,e.getX(),e.getY());
				}
			}
		});//接收使用者動作來顯示快顯功能表
		ta.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e){
				isChange=true;
			}
		});
		addJMenuBar();//新增功能表

		//將文字編輯物件先置於捲軸容器中再置入視窗容器
		getContentPane().add(new JScrollPane(ta));
		show();
	}
	public static void main(String[] args){
		new JJavaNote();
	}
}