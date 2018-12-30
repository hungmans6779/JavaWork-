import java.awt.*;
import java.awt.event.*;
public class cAwtEventTest29 extends WindowAdapter implements ItemListener
{
 Choice chFontName,chFontStyle,chFontSize;
 Label label;
 Frame f;
 String fontName[]={"dialog","dialoginput","serief","sansserief","monospaced"};
 int fontStyle[]={Font.PLAIN,Font.BOLD,Font.ITALIC,Font.BOLD|Font.ITALIC};
 	
 public static void main(String argv[])
 {
  new cAwtEventTest29();
 }
 public cAwtEventTest29()
 {
  f=new Frame("cAwtEventTest29");
  f.addWindowListener(this);
  f.setLocation(300,300);
  chFontName=new Choice();
  chFontStyle=new Choice();
  chFontSize=new Choice();
  chFontName.addItemListener(this);
  chFontStyle.addItemListener(this);
  chFontSize.addItemListener(this);
  Panel p=new Panel(new GridLayout(1,3));
  label=new Label("Awt Font Style");
  for(int i=0;i<fontName.length;i++)
   chFontName.add(fontName[i]);
  chFontStyle.add("標準");
  chFontStyle.add("粗體");
  chFontStyle.add("斜體");
  chFontStyle.add("粗斜體"); 
  for(int i=8;i<=72;i+=2)
   chFontSize.add(String.valueOf(i));
  p.add(chFontName);
  p.add(chFontStyle);
  p.add(chFontSize);
  f.add(p,BorderLayout.NORTH);
  f.add(label,BorderLayout.SOUTH);
  f.pack();
  f.setVisible(true);
 }
 public void windowClosing(WindowEvent we)
 {
  System.exit(0);
 }
 public void itemStateChanged(ItemEvent ie)
 {
  String name=chFontName.getSelectedItem();
  int style=fontStyle[chFontStyle.getSelectedIndex()];
  int size=Integer.parseInt(chFontSize.getSelectedItem());
  Font font=new Font(name,style,size);
  label.setFont(font);
  System.out.println("============================================");
  System.out.println("取得邏輯名稱getName()="+font.getName());
  System.out.println("取得樣式名稱getFontName()="+font.getFontName());
  System.out.println("取得種類名稱getFamily()="+font.getFamily());
  System.out.println("取得字型的樣式getStyle()="+font.getStyle());
  System.out.println("取得字型的大小getSize()="+font.getSize());
  f.pack();
 }
}