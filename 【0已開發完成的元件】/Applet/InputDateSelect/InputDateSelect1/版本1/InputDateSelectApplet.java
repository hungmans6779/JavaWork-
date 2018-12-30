import java.awt.*;
import java.applet.*;
public class InputDateSelectApplet extends Applet
{
 InputDateSelect ids1;	
 Button sendButton;
 public void init()
 {
 	String label=getParameter("label");
 	int style=Integer.parseInt(getParameter("style"));
 	int start_year=Integer.parseInt(getParameter("start_year"));
 	int end_year=Integer.parseInt(getParameter("end_year"));
 	ids1=new InputDateSelect(label,style,start_year,end_year);
 	/*
 	Panel p1=new Panel(new FlowLayout());
 	p1.add(ids1);
 	add(p1);
 	*/
 	add(ids1);
 }	
}