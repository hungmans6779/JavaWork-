import java.awt.*;
import java.awt.event.*;
public class EX26_1
{
 public static void main(String argv[])
 {
  Frame f=new Frame("�o�O�@�Ӥp�ج[");
  Button b=new Button("�Ы��ڵ������{��");
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