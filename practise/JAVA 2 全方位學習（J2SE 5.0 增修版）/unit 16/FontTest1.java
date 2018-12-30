import java.awt.*;
import java.awt.event.*;
public class FontTest1 implements ItemListener
{
 Frame f;
 Choice chFontName,chStyle,chSize;
 Label lb;
 String fontName[]={"dialog","dialopinput","serif","sansserif","monospaced"};	
 int style[]={Font.PLAIN,Font.BOLD,Font.ITALIC,Font.BOLD|Font.ITALIC};
 public static void main(String argv[])
 {
 	new FontTest1();
 }		
 public FontTest1()
 {
 	f=new Frame("FontTest1");
 	chFontName=new Choice();
 	chFontName.addItemListener(this);
 	for(int i=0;i<fontName.length;i++)
 	{
 	 chFontName.add(fontName[i]);
 	}
 	 
 	chStyle=new Choice();
 	chStyle.addItemListener(this);
 	chStyle.add("標準");
 	chStyle.add("粗體");
 	chStyle.add("斜體");
 	chStyle.add("粗斜體");
 	
 	chSize=new Choice();
 	chSize.addItemListener(this);
 	for(int i=8;i<=48;i+=8)
 	{
 	 chSize.add(Integer.toString(i));	
 	}	
 	Panel p=new Panel(new GridLayout(1,3));
 	p.add(chFontName);
 	p.add(chStyle);
 	p.add(chSize);
 	
 	lb=new Label("AWT Font Test",Label.CENTER);
 	f.add(p,BorderLayout.NORTH);
 	f.add(lb,BorderLayout.SOUTH);
 	f.pack();
 	f.setVisible(true);
 	
 }	
 public void itemStateChanged(ItemEvent e)
 {
 	//System.out.println("test");
 	String str=chFontName.getSelectedItem();
 	int sstyle=style[chStyle.getSelectedIndex()];
 	int size=Integer.parseInt(chSize.getSelectedItem());
 	Font fo=new Font(str,sstyle,size);
 	lb.setFont(fo);
 	f.pack();
 }		
	
}	