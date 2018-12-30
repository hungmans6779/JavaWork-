import java.awt.*;
import java.awt.event.*;
public class Ex2_1 implements TextListener,ActionListener
{
 Frame f;
 TextField tf;
 Label lb;
 Font ff;
 int rstyle,rsize;
 String rfontName;
 String fontName[]={"dialog","dialoginput","serif","sansserif","monospaced"};
 int style[]={Font.PLAIN,Font.BOLD,Font.ITALIC,Font.BOLD|Font.ITALIC};
 int size[]={8,16,24,32};
 public static void main(String argv[])
 {
 	new Ex2_1();
 }		
 public Ex2_1()
 {
 	f=new Frame("Ex2_1 ----- 洪嘉宏於95年06月16日設定的");
 	lb=new Label("請輸入您的資料吧",Label.CENTER);
 	tf=new TextField(" ",10);
 	tf.addTextListener(this);
 	
 	MenuShortcut mf1=new MenuShortcut(KeyEvent.VK_A,false);
 	MenuItem fontName1=new MenuItem("Aria",mf1);
 	fontName1.setActionCommand("1");
 	fontName1.addActionListener(this);
 	MenuShortcut mf2=new MenuShortcut(KeyEvent.VK_B,false);
 	MenuItem fontName2=new MenuItem("Courier New",mf2);
 	fontName2.setActionCommand("2");
 	fontName2.addActionListener(this);
 	MenuShortcut mf3=new MenuShortcut(KeyEvent.VK_C,false);
 	MenuItem fontName3=new MenuItem("Time New Roman",mf3);
 	fontName3.setActionCommand("3");
 	fontName3.addActionListener(this);
 	MenuShortcut mf4=new MenuShortcut(KeyEvent.VK_D,false);
 	MenuItem fontName4=new MenuItem("Arial",mf4);
 	fontName4.setActionCommand("4");
 	fontName4.addActionListener(this);
 	MenuShortcut mf5=new MenuShortcut(KeyEvent.VK_E,false);
 	MenuItem fontName5=new MenuItem("新細明體",mf5);
 	fontName5.setActionCommand("5");
 	fontName5.addActionListener(this);
 	Menu fontName=new Menu("字型名稱",true);
 	fontName.add(fontName1);
 	fontName.add(fontName2);
 	fontName.add(fontName3);
 	fontName.add(fontName4);
 	fontName.add(fontName5);
 	
 
 	
 	MenuShortcut ms1=new MenuShortcut(KeyEvent.VK_F,false);
 	MenuItem style1=new MenuItem("標準",ms1);
 	style1.setActionCommand("6");
 	style1.addActionListener(this);
 	MenuShortcut ms2=new MenuShortcut(KeyEvent.VK_G,false);
 	MenuItem style2=new MenuItem("粗體",ms2);
 	style2.setActionCommand("7");
 	style2.addActionListener(this);
 	MenuShortcut ms3=new MenuShortcut(KeyEvent.VK_H,false);
 	MenuItem style3=new MenuItem("斜體",ms3);
 	style3.setActionCommand("8");
 	style3.addActionListener(this);
 	MenuShortcut ms4=new MenuShortcut(KeyEvent.VK_I,false);
 	MenuItem style4=new MenuItem("粗斜體",ms4);
 	style4.setActionCommand("9");
 	style4.addActionListener(this);
 	Menu style=new Menu("字型樣式",true);
 	style.add(style1);
 	style.add(style2);
 	style.add(style3);
 	style.add(style4);
 	
 	MenuItem size1=new MenuItem("8");
 	size1.setActionCommand("10");
 	size1.addActionListener(this);
 	MenuItem size2=new MenuItem("16");
 	size2.setActionCommand("11");
 	size2.addActionListener(this);
 	MenuItem size3=new MenuItem("24");
 	size3.setActionCommand("12");
 	size3.addActionListener(this);
 	MenuItem size4=new MenuItem("32");
 	size4.setActionCommand("13");
 	size4.addActionListener(this);
 	Menu size=new Menu("字型大小");
 	size.add(size1);
 	size.add(size2);
 	size.add(size3);
 	size.add(size4);
 	
 	
 	
 	 
 	MenuBar mb=new MenuBar();
  mb.add(fontName);
  mb.add(style);
  mb.add(size);
 	f.setMenuBar(mb);
 	f.add(lb,BorderLayout.NORTH);
 	f.add(tf,BorderLayout.SOUTH);
 	f.setSize(500,150);
 	f.setVisible(true);
 
 }	
 public void actionPerformed(ActionEvent e)
 {
 	switch(Integer.parseInt(e.getActionCommand()))
 	{
 	 case 1:
 	   rfontName=fontName[0];
 	   break;
 	 case 2:
 	   rfontName=fontName[1];
 	   break;
 	 case 3:
 	   rfontName=fontName[2];
 	   break;
 	 case 4:
 	   rfontName=fontName[3];
 	   break;
 	 case 5:
 	   rfontName=fontName[4];
 	   break;
 	 case 6:
 	   rstyle=style[0];
 	   break;
 	 case 7:
 	   rstyle=style[1];
 	   break;    
 	 case 8:
 	   rstyle=style[2];
 	   break;
 	 case 9:
 	   rstyle=style[3];
 	   break;  
 	 case 10:
 	   rsize=size[0];
 	   break;  
 	 case 11:
 	   rsize=size[1];
 	   break;  
 	 case 12:
 	   rsize=size[2];
 	   break;  
 	 case 13:
 	   rsize=size[3];
 	   break;    		
 	}	
 	ff=new Font(rfontName,rstyle,rsize);
 	lb.setFont(ff);
 }	
 public void textValueChanged(TextEvent e)
 {
  lb.setText(tf.getText());
 }	
}	