import java.awt.*;
import java.awt.event.*;
public class ChoiceTest1 implements ItemListener
{
 Frame f;
 Choice ch;
 public static void main(String argv[])
 {
  new ChoiceTest1(argv);
 }
 public ChoiceTest1(String argv[])
 {
  f=new Frame("ChoiceTest1");
  f.setLayout(new BorderLayout());
  ch=new Choice();
  ch.addItemListener(this);
  for(int i=0;i<argv.length;i++)
  {
   ch.add(argv[i]);
  }
  f.add(ch,BorderLayout.NORTH);
  f.pack();
  f.setVisible(true);
  System.out.println("Total "+ch.getItemCount()+" Items");
 }
 public void itemStateChanged(ItemEvent e)
 {
 	System.out.println("\n\n====================================");
  System.out.println("Selected Item Index : "+ch.getSelectedIndex());
  System.out.println("Selected Item : "+ch.getSelectedItem());
 }

}