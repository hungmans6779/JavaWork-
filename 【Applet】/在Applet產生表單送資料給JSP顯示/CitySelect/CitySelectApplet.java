import java.applet.*;
import java.awt.*;
import java.io.*;
public class CitySelectApplet extends Applet
{
 CitySelect cs;	
 public void init()
 {
 	cs=new CitySelect();
 	add(cs);
 }	
}