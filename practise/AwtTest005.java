import java.awt.*;
import java.awt.event.*;
public class AwtTest005 implements ActionListener
{
 Frame f;
 CardLayout card;	
 public static void main(String argv[])
 {
  new AwtTest005();	
 }	
 public AwtTest005()
 {
  f=new Frame("CardLayout ªº´ú¸Õ1");
  card=new CardLayout();
  f.setLayout(card);
  Button b1=new Button("One");
  Button b2=new Button("Two");
  Button b3=new Button("Three");
  b1.addActionListener(this);
  b2.addActionListener(this);	
  b3.addActionListener(this);
  f.add(b1,"1");
  f.add(b2,"2");
  f.add(b3,"3");
  f.pack();
  f.setVisible(true);
 }	
 public void actionPerformed(ActionEvent e)
 {
  card.show(f,"3");	
 }	
}