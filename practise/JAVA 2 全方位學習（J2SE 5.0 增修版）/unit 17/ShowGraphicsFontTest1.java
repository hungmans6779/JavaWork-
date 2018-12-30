import java.awt.*;
import java.awt.event.*;
public class ShowGraphicsFontTest1 implements ItemListener
{
 Frame f;
 MyShowFont msf;
 Choice ch;
 String fontName[];	
 public static void main(String argv[])
 {
 	new ShowGraphicsFontTest1();
 }	
 public ShowGraphicsFontTest1()
 {
 	f=new Frame("ShowGraphicsFontTest1");
 	fontName=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
 	msf=new MyShowFont(fontName[0]);
 	ch=new Choice();
 	for(int i=0;i<fontName.length;i++)
 	{
 	 ch.add(fontName[i]);	
 	}	
 	ch.addItemListener(this);
 	f.add(ch,BorderLayout.NORTH);
 	f.add(msf,BorderLayout.CENTER);
 	f.pack();
 	f.setVisible(true);
 }	
 public void itemStateChanged(ItemEvent e)
 {
 	msf.setFontName(ch.getSelectedItem());
 	msf.repaint();
 }	
}

class MyShowFont extends Canvas
{
 String fontName;	
 public MyShowFont(String str)
 {
 	fontName=str;
 	setSize(100,30);
 }		
 public void setFontName(String str)
 {
  fontName=str;	
 }
 public void paint(Graphics g)
 {
 	g.setFont(new Font(fontName,Font.PLAIN,24));
 	g.drawString("I am abc",20,20);
 }	
}	