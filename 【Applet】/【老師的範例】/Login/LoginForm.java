//登入表單
//本表單不作驗證
//本表單可由使用者決定是否加密

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

		nameLabel=new Label("帳號");
		passwordLabel=new Label("密碼");
		statusLabel=new Label("請輸入帳號及密碼");
		name=new TextField(15);
		password=new TextField(15);
		ok=new Button("確定");
		cancel=new Button("取消");
		reset=new Button("重寫");
	

		panel.add(nameLabel);//將元件置入panel
		panel.add(name);
		panel2.add(panel,BorderLayout.NORTH);//將panel置入panel2
		
		panel=new Panel(new FlowLayout(FlowLayout.LEFT));//建立新的Panel物件
		panel.add(passwordLabel);
		panel.add(password);
		panel2.add(panel,BorderLayout.CENTER);

		add(panel2,BorderLayout.NORTH);//將panel2置入LoginForm

		panel=new Panel(new FlowLayout(FlowLayout.CENTER));//建立新的Panel物件
		panel.add(ok);
		panel.add(cancel);
		panel.add(reset);
		add(panel,BorderLayout.CENTER);

		panel=new Panel(new FlowLayout(FlowLayout.LEFT));//建立新的Panel物件
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
		statusLabel.setText("帳號錯誤,請重新輸入");
	}
	private void passwordError(){
		password.requestFocus();
		password.selectAll();
		statusLabel.setText("密碼錯誤,請重新輸入");
	}
	private void anyError(){
		name.requestFocus();
		name.selectAll();
		statusLabel.setText("帳號或密碼錯誤,請重新輸入");
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
				statusLabel.setText("請輸入帳號密碼");
			}
		}
	}
	public String getName(){
		return name.getText();
	}
	public String getPassword(){
		return password.getText();
	}

	/**Applet專用之建構方法*/
	public LoginForm(String checkURL,String showURL,AppletContext ac){
		this.checkURL=checkURL;
		this.showURL=showURL;
		this.ac=ac;
		
		setTitle("登入");
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
	/**一般程式使用之建構方法*/
	public LoginForm(){
		this(null,null,null);
	}
	public static void main(String[] args){
		new LoginForm(null,null,null);
	}
}