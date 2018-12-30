import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.net.*;
import java.io.*;
public class FormApplet extends Applet{
	Button confirm;
	DateSelecter ds;
	{
		int year=new Date().getYear()+1900;
		ds=new DateSelecter(year,year+5);
	}

	
	public void init(){
		setLayout(new BorderLayout());
		Panel p=new Panel(new FlowLayout(FlowLayout.LEFT));
		p.add(new Label("請選擇日期"));
		add(p,"North");
		add(ds,"Center");

		final TextArea ta=new TextArea(20,20);
		add(ta,"West");

		confirm=new Button("確定");
		confirm.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				try{
					/*
					AppletContext ac=getAppletContext();
					URL url=new URL(getCodeBase()+"../JspFile/FormTest.jsp?Date=" + ds.getDateString());
					ac.showDocument(url);
					*/
					
					URL url=new URL(getCodeBase()+"../JspFile/FormTest.jsp?Date=" + ds.getDateString());
					HttpURLConnection huc=(HttpURLConnection)url.openConnection();

					InputStream is=huc.getInputStream();
					StringBuffer sb=new StringBuffer();
					int i=0;
					while((i=is.read())!=-1){
						sb.append((char)i);
					}
					ta.setText(sb.toString());
					
				}catch(Exception me){
					showStatus(me.getMessage());
				}
			}
		});
		p=new Panel();
		p.add(confirm);
		add(p,"South");

	}
}