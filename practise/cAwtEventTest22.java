import java.awt.*;
import java.awt.event.*;
public class cAwtEventTest22 extends WindowAdapter implements ItemListener,ActionListener
{
 Frame f;
 List list;	
 static int cc=1;
 public cAwtEventTest22()
 {
 	f=new Frame("cAwtEventTest21");
  f.addWindowListener(this);
  f.setLocation(300,300);
  f.setLayout(new BorderLayout());
  list=new List(8,true);
  for(int i=1;i<=20;i++)
  {
   list.add("Item"+i);
   list.addItemListener(this);	
   list.addActionListener(this);
  }
  System.out.println("目前共有: "+list.getItemCount()+" 筆資料");
  System.out.println("可顯示: "+list.getRows()+" 行");
  f.add(list,BorderLayout.CENTER);
  f.pack();
  f.setVisible(true);
 }	
 public static void main(String argv[])
 {
 	new cAwtEventTest22();
 }
 public void itemStateChanged(ItemEvent ie)
 {
 	System.out.println("=====================");
 	List list=(List)ie.getSource();
 	int [] indexs=list.getSelectedIndexes();
 	String [] items=list.getSelectedItems();
 	for(int i=0;i<items.length;i++)
 	 System.out.println(cc+"次run index:"+indexs[i]+" = "+items[i]+" Selected");		
 	 cc++;
 }
 public void actionPerformed(ActionEvent ae)
 {
 	List list=(List)ae.getSource();
 	int  index=list.getSelectedIndex();
 	String data=list.getItem(index);
 	System.out.println(data+" Action...");
 }	
 public void windowClosing(WindowEvent we)
 {
 	System.exit(0);
 }		
}