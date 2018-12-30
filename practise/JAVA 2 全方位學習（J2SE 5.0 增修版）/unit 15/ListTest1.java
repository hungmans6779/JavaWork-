import java.awt.*;
import java.awt.event.*;
public class ListTest1 implements ItemListener
{ 
 public static void main(String argv[])
 {
  new ListTest1(argv); 
 }
 public ListTest1(String argv[])
 {
  Frame f=new Frame("ListTest1");
  f.setLayout(new BorderLayout());
  List ls=new List(Integer.parseInt(argv[0]),Boolean.valueOf(argv[1]).booleanValue());
  ls.addItemListener(this);
  for(int i=2;i<argv.length;i++)
  {
   ls.add(argv[i]);
  }
  f.add(ls,BorderLayout.CENTER);
  f.pack();
  f.setVisible(true);
  System.out.println("Total Items Count : "+ls.getItemCount()+" Items.....");
 } 
 public void itemStateChanged(ItemEvent e)
 {
  System.out.println("\n\n==================");
  List l=(List)e.getSource();
  int index[]=l.getSelectedIndexes();
  String str[]=l.getSelectedItems();
  for(int j=0;j<index.length;j++)
  {
   System.out.println(index[j]+"  "+str[j]);	
  }	
 }

}