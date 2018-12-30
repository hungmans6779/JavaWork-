import java.awt.*;
import java.awt.event.*;
public class ShowGraphicsFontTest2 extends Canvas implements ItemListener
{
 static String fontName[];
 String strFontName;
 public static void main(String argv[])
 {
  ShowGraphicsFontTest2 sgpf =new ShowGraphicsFontTest2();
  Frame f=new Frame("ShowGraphicsFontTest2");
  Choice ch=new Choice();
  fontName=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
  for(int i=0;i<fontName.length;i++)
  {
   ch.add(fontName[i]);	
  }	
  ch.addItemListener(sgpf);
  f.add(ch,BorderLayout.NORTH);
  f.add(sgpf,BorderLayout.SOUTH);
  f.pack();
  f.setVisible(true);
 }  
 public ShowGraphicsFontTest2()
 {
 	setSize(100,50);
 }	
 public void itemStateChanged(ItemEvent e)
 {
 	Choice ch=(Choice)e.getSource();
  strFontName=ch.getSelectedItem();
  repaint();
 }	
 public void paint(Graphics g)
 {
 	g.setFont(new Font(strFontName,Font.PLAIN,36));
 	g.drawString("I am abc",10,30);
 }	
}