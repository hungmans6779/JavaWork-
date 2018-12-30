import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class LoginFormApplet extends Applet{
	Button login;
	public void init(){
		login=new Button("µn¤J");
		login.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				new LoginForm(getCodeBase().toString() + "check.jsp",
					getCodeBase().toString() + "FormTest.jsp",
					getAppletContext()).show();
			}
		});
		add(login);
	}
}