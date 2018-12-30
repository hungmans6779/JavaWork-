//�HSwing����إ�JavaNote

package Note.JJavaNotePackage;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import Note.JMyClockPackage.*;

public class JJavaNote extends JFrame implements ActionListener{
	
	JTextArea ta;	//��r���
	int textSize=12;	//�w�]��r�j�p
	JMenuBar mb=new JMenuBar();	//�\���C
	JPopupMenu pm=new JPopupMenu();	//����\���
	/**�O���ثe���Ц�m,�M��Ψ��N��*/
	int focus;
	/**�O���ɮ׬O�_�ܧ�*/
	boolean isChange=false;

	/**�إߥ\���C*/
	private void addJMenuBar(){
		String[] s={"�ɮ�","�s��","�˵�","�榡","��L"};
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

	/**�إ��ɮץ\���*/
	private void addFileJMenu(){
		JMenu m=mb.getMenu(0);//���o�Ĥ@�ӥ\�����
		m.add(new JMenuItem("�}�s�ɮ�..."));
		//��\����󤤷s�W�\�����,"..."�N��|�X�{��ܤ��
		m.add(new JMenuItem("�}������..."));
		m.add(new JMenuItem("�x�s�ɮ�..."));
		m.add(new JMenuItem("�t�s�ɮ�..."));
		m.add(new JMenuItem("����"));

		//�v�@���o�S���W�r��JMenuItem����
		for(int a=0;a<m.getItemCount();a++){
			JMenuItem mi=m.getItem(a);
			mi.addActionListener(this);//�s�W��ť��
			mi.setActionCommand(mi.getLabel());//�H�\�ඵ�ؼ��Ҭ�ActionCommand
		}
		m.insertSeparator(4);//��Ǹ�4����m�s�W���j�u
	}

	/**�إ߽s��\���*/
	private void addEditJMenu(){
		JMenu m=mb.getMenu(1);
		m.add(new JMenuItem("�ŤU"));
		m.add(new JMenuItem("�ƻs"));
		m.add(new JMenuItem("�K�W"));
		for(int a=0;a<m.getItemCount();a++){
			JMenuItem mi=m.getItem(a);
			mi.addActionListener(this);
			mi.setActionCommand(mi.getLabel());
		}
	}

	/**�إ��˵��\���*/
	private void addViewJMenu(){
		JMenu m=mb.getMenu(2);
		m.add(new JMenuItem("�M��..."));
		m.add(new JMenuItem("���N..."));
		m.add(new JMenuItem("��..."));
		for(int a=0;a<m.getItemCount();a++){
			JMenuItem mi=m.getItem(a);
			mi.addActionListener(this);
			mi.setActionCommand(mi.getLabel());
		}
	}

	/**�إ߮榡�\���*/
	private void addFormatJMenu(){
		JMenu m=mb.getMenu(3);


		JMenu c=new JMenu("��m");
		String[] temp={"��","��","��","��","��L..."};
		for(int a=0;a<temp.length;a++){			
			JMenuItem mi=new JMenuItem(temp[a]);
			mi.addActionListener(this);
			mi.setActionCommand(mi.getLabel());
			c.add(mi);
		}
		m.add(c);

		
		JMenu s=new JMenu("�r���j�p");
		temp=new String[]{"��j","�Y�p","�ۭq..."};
		int [] i={KeyEvent.VK_A,KeyEvent.VK_I};
		for(int a=0;a<temp.length;a++){			
			JMenuItem mi=new JMenuItem(temp[a]);
			mi.addActionListener(this);
			mi.setActionCommand(mi.getLabel());
			s.add(mi);
		}
		m.add(s);
	}

	/**�إߨ�L�\���*/
	private void addHelpJMenu(){
		JMenu m=mb.getMenu(4);
		m.add(new JMenuItem("����"));
		m.add(new JMenuItem("�q�l��"));
		for(int a=0;a<m.getItemCount();a++){
			JMenuItem mi=m.getItem(a);
			mi.addActionListener(this);
			mi.setActionCommand(mi.getLabel());
		}
	}

	/**�إߧ���\���*/
	private void addJPopupMenu(){
		String[] JLabel={"�ŤU","�ƻs","�K�W"};
		for(int a=0;a<JLabel.length;a++){
			JMenuItem mi=pm.add(JLabel[a]);
			mi.addActionListener(this);
			mi.setActionCommand(mi.getLabel());
		}
	}


	/**���g�U�\��ﶵ���{���X*/

	boolean newFile=true;//�O���O�_���s�ɮ�
	File oldFile=null;//�O�����ɪ����
	boolean close=true;//�O�_�u�������ɮ�(�Ψ���)
	//�H�W�X�Ф��i�ŧi��actionPerformed��,�_�h�C��Ĳ�o���|�٭쬰���


	public void actionPerformed(ActionEvent e){
		String command=e.getActionCommand();
		if(command.equals("�}�s�ɮ�...")){
			if(isChange){
				//��ܽT�{��ܤ��,�è��o��Ǧ^��
				int option=JOptionPane.showConfirmDialog(
					JJavaNote.this,"���e�w�ܧ�,�O�_�x�s�ɮ�?",
					"�T�{",JOptionPane.YES_NO_CANCEL_OPTION);
			
				//�̹�ܤ�����Ȧ^��,����۹�{��
				if(option==JOptionPane.YES_OPTION){
					ActionEvent ae=new ActionEvent(new Object(),10,"�x�s�ɮ�...");
					JJavaNote.this.actionPerformed(ae);
				}
				else if(option==JOptionPane.CANCEL_OPTION){
					close=false;//��ܤ������ثe�ɮ�
				}
			}

			//�����}�s�ɮ�
			if(!close){
				close=true;
				return;
			}
			ta.setText(getDefaultText());

			//�Ҧ��X�г]�^�w�]��
			setTitle("JJavaNote");
			newFile=true;//�O���O�_���s�ɮ�
			oldFile=null;//�O�����ɪ����
			close=true;//�O�_�u�������ɮ�(�Ψ���)
			isChange=false;
		}
		else if(command.equals("�}������...")){
			if(isChange){
				int option=JOptionPane.showConfirmDialog(
					JJavaNote.this,"���e�w�ܧ�,�O�_�x�s�ɮ�?",
					"�T�{",JOptionPane.YES_NO_CANCEL_OPTION);
				if(option==JOptionPane.YES_OPTION){
					ActionEvent ae=new ActionEvent(new Object(),10,"�x�s�ɮ�...");
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

				/*���ɦW�L�o��ExampleFileFilter.java��JDK���d��
				��� �w�˸�Ƨ�/Demo/jfc/FileChooserDemo/src */
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
					//�O���n�}�Ҫ��ɮצW��
				}

				//�}���ɮ�
				BufferedReader br=new BufferedReader(
					new FileReader(oldFile));
				String temp="";
				String context="";
				int a=0;//�p�ƾ�,�O���O�_���Ĥ@��
				while((temp=br.readLine())!=null){
					if(a++!=0)
						temp="\n" + temp;//�Y���O�Ĥ@��h��e�贫��
					context+=temp;
				}
				ta.setText(context);
				setTitle(oldFile.getName());
				br.close();

				//�]�w�X�Э�
				newFile=false;
				isChange=false;
				close=true;
			}
			catch(NullPointerException ie){}//�Y�}�ɹ�ܤ����������new File���ͤ�Exception
			catch(FileNotFoundException ie){
				System.out.println("�䤣����w���ɮ�");
			}
			catch(IOException ie){
				System.out.println("�s���o�Ϳ��~");
			}
		}
		else if(command.equals("�x�s�ɮ�...")){
			
			File file=null;//�ΨӶ}�Ҹ�Ƭy�����|���ɦW
			if(newFile){
				JFileChooser chooser = new JFileChooser();
    				ExampleFileFilter filter = new ExampleFileFilter();
				int returnVal = chooser.showSaveDialog(JJavaNote.this);
				if(returnVal == JFileChooser.APPROVE_OPTION) {		
					oldFile=file=chooser.getSelectedFile();
					//���o�s�ɮת����,���������s�ɪ��̾�,
				}
			}
			else{
				file=oldFile;		
			}
			try{
				//�H�}�����ɹ�ܤ������ɰO�����ɮ׸�Ƭ��ѼƨӶ}�ҿ�X��Ƭy
				BufferedWriter bw=new BufferedWriter(new FileWriter(file));
				bw.write(ta.getText());
				setTitle(file.getName());
				bw.close();
				newFile=false;//���A�O�s�ɮ�
			}
			catch(NullPointerException ie){}//�Y�}�ɹ�ܤ����������new File���ͤ�Exception
			catch(FileNotFoundException ie){
				System.out.println("�䤣����w���ɮ�");
			}
			catch(IOException ie){
				System.out.println("�s���o�Ϳ��~");
			}			
		}
		else if(command.equals("�t�s�ɮ�...")){
			File file=null;//�ΨӰ����}�Ҹ�Ƭy���ɮ׸��

			//���o�s�ɮת����,�����{�b�s�ɪ��̾�,
			try{
				JFileChooser chooser = new JFileChooser();
    				ExampleFileFilter filter = new ExampleFileFilter();
				int returnVal = chooser.showSaveDialog(JJavaNote.this);
				if(returnVal == JFileChooser.APPROVE_OPTION) {		
					oldFile=file=chooser.getSelectedFile();
				}
				//���o�}�ɹ�ܤ�����ɮ׸�ư����Ѽ�,�ð������x�s�ɮ׮ɪ��ɮ׸��
				BufferedWriter bw=new BufferedWriter(
					new FileWriter(file));
				bw.write(ta.getText());
				setTitle(file.getName());//�]�w�������Y
				bw.close();
				newFile=false;//���A�O�s�ɮ�
			}
			catch(NullPointerException ie){}//�Y�}�ɹ�ܤ����������new File���ͤ�Exception
			catch(FileNotFoundException ie){
				System.out.println("�䤣����w���ɮ�");
			}
			catch(IOException ie){
				System.out.println("�s���o�Ϳ��~");
			}
		}
		else if(command.equals("����")){
			if(isChange){
				int option=JOptionPane.showConfirmDialog(
					JJavaNote.this,"���e�w�ܧ�,�O�_�x�s�ɮ�?",
					"�T�{",JOptionPane.YES_NO_CANCEL_OPTION);
				if(option==JOptionPane.YES_OPTION){
					ActionEvent ae=new ActionEvent(new Object(),10,"�x�s�ɮ�...");
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
		else if(command.equals("�ŤU")){
			ta.cut();
			isChange=true;
		}
		else if(command.equals("�ƻs")){
			ta.copy();
			isChange=true;
		}
		else if(command.equals("�K�W")){
			ta.paste();
			isChange=true;
		}
		else if(command.equals("�M��...")){

			new FindJDialog(1);
		
		}
		else if(command.equals("���N...")){
			new FindJDialog(2);
		}
		else if(command.equals("��...")){
			class GoJDialog extends JDialog{
				GoJDialog(){
					super(JJavaNote.this,"��",true);
					setBounds(200,200,250,70);
					setResizable(false);
					
					JLabel goJLabel=new JLabel("���");
					final JTextField lineText=new JTextField(10);
					//�]���n��MouseAdapter�������O�s��,�ҥH���]��final
					JButton go=new JButton("��");
					go.addMouseListener(new MouseAdapter(){
						public void mouseClicked(MouseEvent e){
							int line=0;
							try{
								line=Integer.parseInt(lineText.getText());
							}
							catch(NumberFormatException ne){
								lineText.setText("�п�J���");
								lineText.setSelectionStart(0);
								lineText.setSelectionEnd(lineText.getText().length()-1);
								return;
							}
							
							int setFocus=0;//�O���r��
							String content=ta.getText();
							int flow=0;//�O���g�L�����
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
		else if(command.equals("��")){
			ta.setForeground(Color.red);
		}
		else if(command.equals("��")){
			ta.setForeground(Color.green);
		}
		else if(command.equals("��")){
			ta.setForeground(Color.blue);
		}
		else if(command.equals("��")){
			ta.setForeground(Color.black);
		}
		else if(command.equals("��L...")){
			//����C���ܤ��,�ñ�����Ǧ^��
			Color c=JColorChooser.showDialog(JJavaNote.this,"�C���ܤ��",new Color(128,128,128));
			ta.setForeground(c);
		}
		else if(command.equals("��j")){
			textSize+=2;
			ta.setFont(new Font(null,0,textSize));
		}
		else if(command.equals("�Y�p")){
			textSize-=2;
			ta.setFont(new Font(null,0,textSize));
		}
		else if(command.equals("�ۭq...")){
			try{
				//��ܿ�J��ܤ��,������ȫ���^���
				textSize=Integer.parseInt(JOptionPane.showInputDialog(JJavaNote.this,"�п�J�r���j�p"));
			}
			catch(NumberFormatException nfe){
				JOptionPane.showMessageDialog(JJavaNote.this,
					"�п�J���T���Ʀr","���~",JOptionPane.INFORMATION_MESSAGE);
				return;
			}
			if(textSize<1 || textSize>1638){
				//��ܰT�����
				JOptionPane.showMessageDialog(JJavaNote.this,
					"�п�J����1~1638�����Ʀr","���~",JOptionPane.INFORMATION_MESSAGE);				
				return;
			}
			ta.setFont(new Font(null,0,textSize));
		}			
		else if(command.equals("����")){
			class AboutJDialog extends JDialog{


				AboutJDialog(){
					super(JJavaNote.this,"About",true);
					setBounds(200,200,220,120);
					setResizable(false);

					JLabel information;
					Panel panel;
					information=new JLabel("���γn��,�w��ϥ�");
					panel=new Panel(new FlowLayout(FlowLayout.LEFT));
					panel.add(information);
					add(panel,BorderLayout.NORTH);
	
					information=new JLabel("�@��:�\�j��");
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
		else if(command.equals("�q�l��")){
			new JMyClock().show();			
		}
	}


	/**�}�s�ɮ׫᪺�w�]��r*/
	String defaultFile="";//�O���nŪ�J���ɮצW��
	private String getDefaultText(){
		String defaultText="";//�n�^�ȵ�ta���󪺦r��
		class NewFileDialog extends JDialog implements ActionListener{
			String[] JButtonJLabel={"Empty","Application","Applet","Frame","JSP","Servlet","HTML"};
			boolean oldFile=false;
			Panel p=new Panel();
			NewFileDialog(){
				super(JJavaNote.this,"�ɮ׼˦����",true);
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
				add(new JLabel("�п�ܭn�}�Ҫ��s�ɮ׼˦�"),BorderLayout.NORTH);
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
		//��defaultFile����Ū���ɮ�
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
			defaultText="//�����w�]�ɮ�";
		}
		catch(IOException e){
			defaultText="//�s���w�]�ɮ׵o�Ϳ��~";
		}
		catch(Exception e){
			defaultText="//�o�ͤ������~";
		}
		return defaultText;
	}

	/**�����O�ѴM��Ψ��N�@��,��ܮɥH�غc��k���ѼƨM�w��ܵ������j�p*/
	private class FindJDialog extends JDialog implements ActionListener{
		JLabel findJLabel,replaceJLabel;
		JTextField findText,replaceText;
		JButton next,replace,replaceAll;
		boolean hasFind=false;//�O���O�_���r��,�ѧP�_���N�O�_����

		//�P�@�ӵ���,�Ϋغc��k���ѼƨӨM�w��ܽd��
		FindJDialog(int style){
			super(JJavaNote.this,"�M��/���N",false);
			findJLabel=new JLabel("�M��");
			replaceJLabel=new JLabel("���N");
			findText=new JTextField(20);
			replaceText=new JTextField(20);
			next=new JButton("�M��U�@��");
			next.addActionListener(this);
			replace=new JButton("���N");
			replace.addActionListener(this);
			replaceAll=new JButton("�������N");
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
				int ch=focus;//���o�ثe���_�l��m			
				String content=ta.getText().substring(ch);//���o�_�l���_�ᤧ�Ҧ���r
				int selectStart=content.indexOf(findString);//�Ǧ^��-1��ܥ����
				if(selectStart!=-1){
					setTitle("���n�M�䪺�r��");
					ta.setSelectionStart(selectStart+focus);
					ta.setSelectionEnd(selectStart+findString.length()+focus);
					focus=ta.getSelectionEnd();//�]�w�U�@�����_�l��m
					hasFind=true;
				}
				else{
					setTitle("�w�䤣��n�M�䪺�r��");
					hasFind=false;//���������N
				}
			}
			else if(b==replace){
				if(!hasFind)return;//�����n�j�M���r��
				String content=ta.getText().substring(0,focus);

				//�]��replaceText���p�⴫��Ÿ�,��indexOf��k�S��,�ҥH��ƭn�ۤv��
				int line=0;
				/*for(int a=0;a<content.length();a++){
					if(content.charAt(a)=='\n')
						line++;
				}*/

				ta.replaceRange(replaceString,ta.getSelectionStart()-line,ta.getSelectionEnd()-line);
				actionPerformed(new ActionEvent(next,0,null));//�A������M��
			}
			else {
				if(!hasFind)return;
				String content=ta.getText();
				//�Φr�ꪫ��ӥ����m��
				content=content.replaceAll(findString,replaceString);
				ta.setText(content);
				hasFind=false;//�������A���N

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
						JJavaNote.this,"���e�w�ܧ�,�O�_�x�s�ɮ�?",
						"�T�{",JOptionPane.YES_NO_OPTION);
					if(option==JOptionPane.YES_OPTION){
						ActionEvent ae=new ActionEvent(new Object(),10,"�x�s�ɮ�...");
						JJavaNote.this.actionPerformed(ae);
					}
				}
				System.exit(0);
			}
		});

		ta=new JTextArea(getDefaultText());
		
		ta.setFont(new Font(null,0,textSize));
		ta.add(pm);//�N����\���[�J������
		ta.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				focus=ta.getSelectionEnd();
				if(e.getButton()==MouseEvent.BUTTON3){
					pm.show(ta,e.getX(),e.getY());
				}
			}
		});//�����ϥΪ̰ʧ@����ܧ���\���
		ta.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e){
				isChange=true;
			}
		});
		addJMenuBar();//�s�W�\���

		//�N��r�s�誫����m�󱲶b�e�����A�m�J�����e��
		getContentPane().add(new JScrollPane(ta));
		show();
	}
	public static void main(String[] args){
		new JJavaNote();
	}
}