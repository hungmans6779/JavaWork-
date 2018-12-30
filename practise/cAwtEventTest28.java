import java.awt.*;
import java.awt.event.*;
public class cAwtEventTest28 extends Frame implements ItemListener
{
 Choice chFontName,chFontStyle,chFontSize;
 Label label;
 String fontName[]={"dialog","dialoginput","serief","sansserief","monospaced"};
 int fontStyle[]={Font.PLAIN,Font.BOLD,Font.ITALIC,Font.BOLD|Font.ITALIC};
 	
 public static void main(String argv[])
 {
  new cAwtEventTest28();
 }		
 public cAwtEventTest28()
 {
  super("cAwtEventTest28");
 	setLocation(300,300);
  addWindowListener(new WindowHandler());	
  chFontName=new Choice();
  chFontStyle=new Choice();
  chFontSize=new Choice();
  for(int i=0;i<fontName.length;i++)
   chFontName.add(fontName[i]);	
  chFontStyle.add("標準");
  chFontStyle.add("粗體");
  chFontStyle.add("斜體");
  chFontStyle.add("粗斜體");
  for(int i=8;i<=72;i+=2)
   chFontSize.add(String.valueOf(i));
  chFontName.addItemListener(this);
  chFontStyle.addItemListener(this);
  chFontSize.addItemListener(this);
  Panel p=new Panel(new GridLayout(1,3));
  label=new Label("Awt Font Style");
  p.add(chFontName);
  p.add(chFontStyle);
  p.add(chFontSize);
  add(p,BorderLayout.NORTH);
  add(label,BorderLayout.SOUTH);
  pack();
  setVisible(true);
   
 }	
 public void itemStateChanged(ItemEvent ie)
 {
 	String name=chFontName.getSelectedItem();
 	int style=fontStyle[chFontStyle.getSelectedIndex()];
 	int size=Integer.parseInt(chFontSize.getSelectedItem());
 	Font font=new Font(name,style,size);
 	label.setFont(font);
 	pack();
 }	
}	

class WindowHandler extends WindowAdapter
{
 public void windowClosing(WindowEvent we)
 {
  System.exit(0);	
 }		
}	