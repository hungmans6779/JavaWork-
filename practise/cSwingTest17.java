import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class cSwingTest17
{
 JFrame f;
 JLabel l;
 JButton b;
 public static void main(String argv[])
 {
  new cSwingTest17();
 }
 public cSwingTest17()
 {
  f=new JFrame("cSwingTest17");
  f.addWindowListener(new WindowAdapter()
  {
   public void windowClosing(WindowEvent we)
   {
    System.exit(0);
   }
  });
  Container contentPane=f.getContentPane();
  contentPane.setLayout(new GridLayout(2,1));
  l=new JLabel("JLabel ����");
  l.setHorizontalAlignment(JLabel.CENTER);
  b=new JButton("�b�ڤW���@����a");
  b.addMouseListener(new MyEventHandler());
  contentPane.add(l);
  contentPane.add(b);
  f.setLocation(500,200);
  f.pack();
  f.show();
 }
 class MyEventHandler extends MouseAdapter
 {
  public void mouseClicked(MouseEvent me)
  {
   //l.setText("�ƹ��Q���U�F");	
  }		
  public void mouseEntered(MouseEvent me)
  {
   l.setText("�ƹ��i�J�F");	
  }	
  public void mouseExited(MouseEvent me)
  {
   l.setText("�ƹ����}�F");
  }	
  public void mousePressed(MouseEvent me)
  {
   l.setText("����ƹ�����...");	
   switch(me.getButton())
   {
    case MouseEvent.BUTTON1: f.setTitle("���U����"); break;
    case MouseEvent.BUTTON2: f.setTitle("���U�u��"); break;
    case MouseEvent.BUTTON3: f.setTitle("���U�k��"); break;
    default: f.setTitle("���w�q���ƹ�����"); break;	
   }	
  }	
  public void mouseReleased(MouseEvent me)
  {
   f.setTitle("cSwingTest17");
   l.setText("��}�ƹ�...");	
  }	
 }	
}