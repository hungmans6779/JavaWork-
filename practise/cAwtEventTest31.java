import java.awt.*;
import java.awt.event.*;
public class cAwtEventTest31 extends MouseAdapter implements ItemListener,ActionListener
{
 Frame f;
 Label label;
 PopupMenu pm;	
 public cAwtEventTest31()
 {
 	f=new Frame("cAwtEventTest31");
 	f.addMouseListener(this);
 	MenuItem item1_1=new MenuItem("Item1_1");
 	MenuItem item1_2=new MenuItem("Item1_2");
 	MenuItem item1_3=new MenuItem("Item1_3");
 	item1_1.addActionListener(this);
 	item1_2.addActionListener(this);
 	item1_3.addActionListener(this);
 	Menu item1=new Menu("Item1");
 	item1.add(item1_1);
 	item1.add(item1_2);
 	item1.add(item1_3);
 	MenuShortcut ms=new MenuShortcut(KeyEvent.VK_A,false);
 	MenuItem item2=new MenuItem("Item2",ms);
 	item2.addActionListener(this);
 	
 	CheckboxMenuItem cmi=new CheckboxMenuItem("Item3",false);
 	cmi.addItemListener(this);
 	
 	MenuItem item4=new MenuItem("Â÷¶}");
 	item4.addActionListener(this);
 	
 	Menu menu1=new Menu("Menu1");
 	menu1.add(item1);
 	menu1.add(item2);
 	menu1.addSeparator();
 	menu1.add(cmi);
 	menu1.add(item4);
 	//menu1.insert(new MenuItem("123"),0);
 	//menu1.insert("456",1);
 	menu1.insertSeparator(0);
 	menu1.remove(0);
 	MenuItem popup1=new MenuItem("popup1");
 	MenuItem popup2=new MenuItem("popup2");
 	MenuItem popup3=new MenuItem("Â÷¶}");
 	popup1.addActionListener(this);
 	popup2.addActionListener(this);
 	popup3.addActionListener(this);
 	pm=new PopupMenu();
 	pm.add(popup1);
 	pm.add(popup2);
 	pm.add(popup3);
 	MenuBar mb=new MenuBar();
 	mb.add(menu1);
 	f.setMenuBar(mb);
 	label=new Label("No MenuItem Selected.");
 	f.add(pm);
 	f.add(label,BorderLayout.NORTH);
 	f.setSize(300,300);
 	//System.out.print(menu1.getItemCount());
 	//System.out.print(pm.getItemCount());
 	f.setVisible(true);
 	
 }	
 public static void main(String argv[])
 {
  new cAwtEventTest31();
 }
 public void itemStateChanged(ItemEvent ie)
 {
 	CheckboxMenuItem cmi=(CheckboxMenuItem)ie.getSource();
 	label.setText(cmi.getLabel()+" Selected.");
 }
 public void actionPerformed(ActionEvent ae)
 {
 	MenuItem mi=(MenuItem)ae.getSource();
 	label.setText(mi.getLabel()+" Selected.");
 	if(mi.getLabel().equals("Â÷¶}"))
 	 System.exit(0);
 	
 }	
 public void mouseClicked(MouseEvent me)
 {
 	pm.show(f,me.getX(),me.getY());
 }				
}	