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
  chFontStyle.add("�з�");
  chFontStyle.add("����");
  chFontStyle.add("����");
  chFontStyle.add("�ʱ���"); 
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
  System.out.println("���o�޿�W��getName()="+font.getName());
  System.out.println("���o�˦��W��getFontName()="+font.getFontName());
  System.out.println("���o�����W��getFamily()="+font.getFamily());
  System.out.println("���o�r�����˦�getStyle()="+font.getStyle());
  System.out.println("���o�r�����j�pgetSize()="+font.getSize());
  f.pack();
 }
}