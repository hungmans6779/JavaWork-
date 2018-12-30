import java.awt.*;
import java.applet.*;
import java.net.*;
public class PlayMusic extends Applet{
	AudioClip ac;
	public void init(){
		ac=getAudioClip(getCodeBase(),"../music/CTN_Doraemon.mid");
	}
	public void start(){
		ac.play();
	}
	public void stop(){
		ac.stop();
	}
}