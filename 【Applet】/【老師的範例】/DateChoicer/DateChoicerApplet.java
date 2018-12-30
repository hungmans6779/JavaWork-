//使用自訂元件
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class DateChoicerApplet extends Applet{
	DateChoicer dc;
	public void init(){
		dc=new DateChoicer("請假日期");
		add(dc);
		dc=new DateChoicer("收假日期");
		add(dc);
		dc=new DateChoicer("出發日期");
		add(dc);
		dc=new DateChoicer("回程日期");
		add(dc);
		dc=new DateChoicer("出國日期");
		add(dc);
		dc=new DateChoicer("回國日期");
		add(dc);
		dc=new DateChoicer("搭車日期");
		add(dc);
		dc=new DateChoicer("搭機日期");
		add(dc);
		dc=new DateChoicer("開訓日期");
		add(dc);
		dc=new DateChoicer("結訓日期");
		add(dc);
		dc=new DateChoicer("生日");
		add(dc);
	}
}