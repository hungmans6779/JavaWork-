import java.awt.*;
import java.applet.*;
import java.net.*;
public class DrawImage extends Applet{
	Image img;
	public void init(){
		img=getImage(getCodeBase(),"picture/Wang.jpg");
	}
	public void paint(Graphics g){
		g.drawImage(img,0,0,this);
	}
}