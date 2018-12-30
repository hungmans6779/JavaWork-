import java.awt.*;
import java.applet.*;
import java.net.*;
public class ShowDoc extends Applet{
	AppletContext ac;
	public void init(){
		ac=getAppletContext();
	}
	public void start(){
		try{
			ac.showDocument(new URL(getCodeBase(),"../picture/Wang.jpg"),"_blank");
		}catch(MalformedURLException e){}
	}
}