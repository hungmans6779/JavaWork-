import java.awt.*;
import java.awt.event.*;
public class FontTest2 extends Frame implements ItemListener
{
 Choice chFontName,chStyle,chSize;
 Label lb;
 String fontName[]={"dialog","dialopinput","serif","sansserif","monospaced"};	
 int style[]={Font.PLAIN,Font.BOLD,Font.ITALIC,Font.BOLD|Font.ITALIC};
 public static void main(String argv[])
 {
 	new FontTest2();
 }		
 public FontTest2()
 {
 	super("FontTest2");
 	chFontName=new Choice();
 	chFontName.addItemListener(this);
 	chFontName.add("Aria");
 	chFontName.add("Courier New");
 	chFontName.add("Time New Roman");
 	chFontName.add("Arial");
 	chFontName.add("新細明體");
 	 
 	chStyle=new Choice();
 	chStyle.addItemListener(this);
 	chStyle.add("標準");
 	chStyle.add("粗體");
 	chStyle.add("斜體");
 	chStyle.add("粗斜體");
 	
 	chSize=new Choice();
 	chSize.addItemListener(this);
 	for(int i=8;i<=168;i+=8)
 	{
 	 chSize.add(Integer.toString(i));	
 	}	
 	Panel p=new Panel(new GridLayout(1,3));
 	p.add(chFontName);
 	p.add(chStyle);
 	p.add(chSize);
 	
 	lb=new Label("AWT Font Test",Label.CENTER);
 	add(p,BorderLayout.NORTH);
 	add(lb,BorderLayout.SOUTH);
 	pack();
 	setVisible(true);
 	
 }	
 public void itemStateChanged(ItemEvent e)
 {
 	String str=fontName[chFontName.getSelectedIndex()];
 	int sstyle=style[chStyle.getSelectedIndex()];
 	int size=Integer.parseInt(chSize.getSelectedItem());
 	Font fo=new Font(str,sstyle,size);
 	lb.setFont(fo);
 	pack();
 }		
	
}	