import java.awt.*;
import java.awt.event.*;
public class cAwtEventTest28 extends Frame implements ItemListener
{
 Choice chFontName,chFontStyle,chFontSize;
 String fontName[]={"dialog","dialoginput","serief","sansserief","monospaced"};
 String fontStyle[]={"Font.PLAIN","Font.BOLD","Font.ITALIC","Font.BOLD|Font.ITALIC"};
 	
 public static void main(String argv[])
 {
  new cAwtEventTest28();
 }		
 public cAwtEventTest28()
 {
  addWindowListener(new WindowHandler());	
 }	
 public void itemStateChanged(ItemEvent ie)
 {
 	
 }	
}	

class WindowHandler extends WindowAdapter
{
 public void windowClosing(WindowEvent we)
 {
  System.exit(0);	
 }		
}	