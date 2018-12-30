//�n�J���
//����椣�@����
//�����i�ѨϥΪ̨M�w�O�_�[�K

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.net.*;
import java.io.*;
public class LoginForm extends Frame{
	Button ok,cancel,reset;
	TextField name,password;
	Label statusLabel;
	String checkURL,showURL;
	AppletContext ac;

	private void addComponent(){
		Label nameLabel,passwordLabel;
		Panel panel=new Panel(new FlowLayout(FlowLayout.LEFT));
		Panel panel2=new Panel(new BorderLayout());

		nameLabel=new Label("�b��");
		passwordLabel=new Label("�K�X");
		statusLabel=new Label("�п�J�b���αK�X");
		name=new TextField(15);
		password=new TextField(15);
		ok=new Button("�T�w");
		cancel=new Button("����");
		reset=new Button("���g");
	

		panel.add(nameLabel);//�N����m�Jpanel
		panel.add(name);
		panel2.add(panel,BorderLayout.NORTH);//�Npanel�m�Jpanel2
		
		panel=new Panel(new FlowLayout(FlowLayout.LEFT));//�إ߷s��Panel����
		panel.add(passwordLabel);
		panel.add(password);
		panel2.add(panel,BorderLayout.CENTER);

		add(panel2,BorderLayout.NORTH);//�Npanel2�m�JLoginForm

		panel=new Panel(new FlowLayout(FlowLayout.CENTER));//�إ߷s��Panel����
		panel.add(ok);
		panel.add(cancel);
		panel.add(reset);
		add(panel,BorderLayout.CENTER);

		panel=new Panel(new FlowLayout(FlowLayout.LEFT));//�إ߷s��Panel����
		panel.add(statusLabel);
		add(panel,BorderLayout.SOUTH);


		MyMouseAdapter ma=new MyMouseAdapter();
		ok.addMouseListener(ma);
		cancel.addMouseListener(ma);
		reset.addMouseListener(ma);
	}
	private void nameError(){
		name.requestFocus();
		name.selectAll();
		statusLabel.setText("�b�����~,�Э��s��J");
	}
	private void passwordError(){
		password.requestFocus();
		password.selectAll();
		statusLabel.setText("�K�X���~,�Э��s��J");
	}
	private void anyError(){
		name.requestFocus();
		name.selectAll();
		statusLabel.setText("�b���αK�X���~,�Э��s��J");
	}
	private class MyMouseAdapter extends MouseAdapter{
		public void mouseClicked(MouseEvent e){
			Button b=(Button)e.getSource();
			if(b==ok){
				if(ac!=null){
					try{
						URL url=new URL(checkURL +"?name="+name.getText()+"&password="+
							password.getText());

						InputStream is=url.openStream();						int i=0;
						StringBuffer sb=new StringBuffer();
						while((i=is.read())!=-1){
							sb.append((char)i);
						}
						String check=sb.toString();
						statusLabel.setText(check.toString());
						if(check.contains("OK")){
							ac.showDocument(new URL(showURL+"?name="+name.getText()+"&password="+
							password.getText()));
							dispose();
						}else if(check.contains("NameError")){
							nameError();
						}else if(check.contains("PasswordError")){
							passwordError();
						}else{
							anyError();
						}
					}catch(Exception me){
						statusLabel.setText(me.toString());
					}
				}
			}
			else if(b==cancel){
				dispose();
			}
			else{
				name.setText("");
				password.setText("");
				statusLabel.setText("�п�J�b���K�X");
			}
		}
	}
	public String getName(){
		return name.getText();
	}
	public String getPassword(){
		return password.getText();
	}

	/**Applet�M�Τ��غc��k*/
	public LoginForm(String checkURL,String showURL,AppletContext ac){
		this.checkURL=checkURL;
		this.showURL=showURL;
		this.ac=ac;
		
		setTitle("�n�J");
		setBounds(200,200,200,170);
		setResizable(false);
		addComponent();
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				dispose();
			}
		});
		show();
	}
	/**�@��{���ϥΤ��غc��k*/
	public LoginForm(){
		this(null,null,null);
	}
	public static void main(String[] args){
		new LoginForm(null,null,null);
	}
}