import java.awt.*;
import java.awt.event.*;
public class MenuTest1 extends MouseAdapter implements ActionListener,ItemListener
{
 Frame f;
 Label lb;
 PopupMenu pm;
 public static void main(String argv[])
 {
 	new MenuTest1();
 }		
 public MenuTest1()
 {
 	f=new Frame("MouseTest1");
 	f.setLayout(new BorderLayout());
 	MenuItem item1_1=new MenuItem("Item1_1");
 	MenuItem item1_2=new MenuItem("Item1_2");
 	MenuItem item1_3=new MenuItem("Item1_3");
 	item1_1.addActionListener(this);
 	item1_2.addActionListener(this);
 	item1_3.addActionListener(this);
 	Menu item1=new Menu("Item1",false);
 	item1.add(item1_1);
 	item1.add(item1_2);
 	item1.add(item1_3);
 	
 	
 	MenuShortcut ms=new MenuShortcut(KeyEvent.VK_A,false);
 	MenuItem item2=new MenuItem("Item2",ms);
 	item2.addActionListener(this);
 	
 	Menu item3=new Menu("Item3",true);
 	CheckboxMenuItem item3_1=new CheckboxMenuItem("Item3_1",false);
 	MenuShortcut ms1=new MenuShortcut(KeyEvent.VK_B,true);
  MenuItem item3_2=new MenuItem("Item3_2",ms1);
 	CheckboxMenuItem item3_3=new CheckboxMenuItem("Item3_3",true);
 	item3_1.addItemListener(this);
 	item3_2.addActionListener(this);
 	item3_3.addItemListener(this);
 	item3.add(item3_1);
 	item3.add(item3_2);
 	item3.add(item3_3);
 	
 	Menu menu1=new Menu("Menu1");
 	menu1.add(item1);
 	menu1.add(item2);
 	menu1.addSeparator();
 	menu1.add(item3);
 	
 	pm=new PopupMenu();
 	MenuItem popup1=new MenuItem("Popup1");
 	MenuItem popup2=new MenuItem("Popup2");
 	popup1.addActionListener(this);
 	popup2.addActionListener(this);
 	pm.add(popup1);
 	pm.add(popup2);
 	
 	MenuBar mb=new MenuBar();
 	mb.add(menu1);
 	f.setMenuBar(mb);
 	lb=new Label("No Menu Item is Selected.....");
 	f.addMouseListener(this);
 	f.add(lb,BorderLayout.NORTH);
 	f.add(pm);
 	f.setSize(500,500);
 	f.setVisible(true); 	
 }
 
 public void mouseClicked(MouseEvent e)
 {
 	pm.show(f,e.getX(),e.getY());
 }
 public void actionPerformed(ActionEvent e)
 {
 	MenuItem mi=(MenuItem)e.getSource();
 	lb.setText(mi.getLabel()+" is Selected.....");
 }
 public void itemStateChanged(ItemEvent e)
 {
 	CheckboxMenuItem cmi=(CheckboxMenuItem)e.getSource();
 	lb.setText(cmi.getLabel()+" is Selected.....");
 	
 }			
}	