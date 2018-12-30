import java.awt.*;
import java.awt.event.*;
public class EX26
{
 public static void main(String argv[])
 {
  Frame f=new Frame("這是一個框架");
  Button b=new Button("按我離開");
  b.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent e)
   {
    System.exit(0);
   }
  });
  f.add(b);
  f.setSize(200,100);
  f.setVisible(true);
 }
}