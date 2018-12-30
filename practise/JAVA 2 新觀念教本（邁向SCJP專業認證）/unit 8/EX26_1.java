import java.awt.*;
import java.awt.event.*;
public class EX26_1
{
 public static void main(String argv[])
 {
  Frame f=new Frame("這是一個小框架");
  Button b=new Button("請按我結束此程式");
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