import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.net.*;
import java.io.*;
public class FormApplet2 extends Applet{
	Button confirm;
	String dateString=null;

	private class DateSelecterFrame extends Frame{
		DateSelecterFrame(int startYear,int endYear){
			final Dialog d=new Dialog(this,true);
			d.setTitle("日期選擇");
			d.addWindowListener(new WindowAdapter(){
				public void windowClosing(WindowEvent e){
					dateString="";
					d.dispose();
				}
			});
			final DateSelecter ds=new DateSelecter(startYear,endYear);
			d.add(ds,"Center");
	
			Panel p=new Panel();
			Button confirm=new Button("確定");
			Button cancel=new Button("取消");
			confirm.addMouseListener(new MouseAdapter(){
				public void mouseClicked(MouseEvent e){
					dateString=ds.getDateString();
					d.dispose();
				}
			});
			cancel.addMouseListener(new MouseAdapter(){
				public void mouseClicked(MouseEvent e){
					dateString="";
					d.dispose();
				}
			});
			p.add(confirm);
			p.add(cancel);
			d.add(p,"South");

			d.setBounds(300,300,300,150);
			d.setResizable(false);
			d.setVisible(true);
		}
	}

	
	public void init(){
		Label lA=new Label("生日");
		add(lA);
		final TextField birthday=new TextField(20);
		add(birthday);
		Button showWindowA=new Button("日期選擇視窗");
		showWindowA.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				new DateSelecterFrame(new Date().getYear()+1900-100,new Date().getYear()+1900);
				birthday.setText(dateString);
			}
		});
		add(showWindowA);

		Label lB=new Label("受訓日期");
		add(lB);
		final TextField startDay=new TextField(20);
		add(startDay);
		Button showWindowB=new Button("日期選擇視窗");
		showWindowB.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				new DateSelecterFrame(new Date().getYear()+1900-5,new Date().getYear()+1900);
				startDay.setText(dateString);
			}
		});
		add(showWindowB);

		Label lC=new Label("結訓日期");
		add(lC);
		final TextField endDay=new TextField(20);
		add(endDay);
		Button showWindowC=new Button("日期選擇視窗");
		showWindowC.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				new DateSelecterFrame(new Date().getYear()+1900,new Date().getYear()+1900+5);
				endDay.setText(dateString);
			}
		});
		add(showWindowC);

		confirm=new Button("確定");
		confirm.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				try{
					
					AppletContext ac=getAppletContext();
					URL url=new URL(getCodeBase()+"../JspFile/FormTest.jsp?birthday=" + birthday.getText()
						+"&srartDay=" + startDay.getText() + "&endDay=" + endDay.getText());
					ac.showDocument(url);				
				}catch(Exception me){}
			}
		});
		add(confirm);

	}
}