import java.awt.*;
import java.awt.event.*;
public class EX26
{
 public static void main(String argv[])
 {
  Frame f=new Frame("�o�O�@�Ӯج[");
  Button b=new Button("�������}");
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