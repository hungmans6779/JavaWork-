import java.awt.*;
import java.awt.event.*;
public class hCanvasTest7 extends WindowAdapter implements ItemListener
{
 Frame frame;
 MyCanvas mc;
 Choice chFont;	
 String fontName[];
 public static void main(String argv[])
 {
  new hCanvasTest7();	
 }
 public hCanvasTest7()
 {
 	frame=new Frame("hCanvasTest7");
 	frame.addWindowListener(this);
 	fontName=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
 	chFont=new Choice();
 	chFont.addItemListener(this);
 	for(int i=0;i<fontName.length;i++)
 	 chFont.add(fontName[i]);
 	mc=new MyCanvas(fontName[0]);
 	frame.add(chFont,BorderLayout.NORTH);
 	frame.add(mc,BorderLayout.CENTER);
 	frame.pack();
 	frame.setVisible(true);
 }
 public void itemStateChanged(ItemEvent ie)
 {
 	Choice ch=(Choice)ie.getSource();
 	mc.setFontName(ch.getSelectedItem());
 	mc.repaint();
 }	
 public void windowClosing(WindowEvent we)
 {
 	System.exit(0);
 }		
}

class MyCanvas extends Canvas
{
 String fontName=null;	
 public MyCanvas(String name)
 {
 	fontName=name;
 	setSize(200,50);
 }		
 public void setFontName(String name)
 {
 	fontName=name;
 }	
 public void paint(Graphics g)
 {
 	g.setFont(new Font(fontName,Font.BOLD,36));
 	g.drawString("¤¤¤åABC",30,35);
 }		
}	