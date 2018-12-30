import java.awt.*;
import java.awt.event.*;
public class AwtTest004 implements ActionListener
{
 Frame f;
 CardLayout card;	
 public static void main(String argv[])
 {
  new AwtTest004();
 }
 public AwtTest004()
 {
 	Button b1=new Button("one");
 	Button b2=new Button("two");
 	Button b3=new Button("three");
 	f=new Frame("CardLayout´ú¸Õ...");
 	b1.addActionListener(this);
 	b2.addActionListener(this);
 	b3.addActionListener(this);
 	card=new CardLayout();
 	f.setLayout(card);
 	f.add(b1,"1");
 	f.add(b2,"2");
 	f.add(b3,"3");
 	f.pack();
 	f.setVisible(true);
 }	
 public void actionPerformed(ActionEvent e)
 {
 	card.next(f);
 }	
}