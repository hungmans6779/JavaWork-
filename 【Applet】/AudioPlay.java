import java.awt.*;
import java.applet.*;
import java.net.*;
public class AudioPlay extends Applet
{
 AudioClip ac;	
 public void init()
 {
 	ac=getAudioClip(getCodeBase(),"Media/01.mid");
 }
 public void start()
 {
 	ac.play();
 }			
}	