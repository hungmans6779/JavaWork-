import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class cSwingTest18
{
 JFrame f;
 JLabel l;
 JButton b;
 public static void main(String argv[])
 {
  new cSwingTest18();
 }
 public cSwingTest18()
 {
  f=new JFrame("cSwingTest18");
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
  b.addMouseMotionListener(new MyEventHandler());
  contentPane.add(l);
  contentPane.add(b);
  f.setLocation(500,200);
  f.setSize(300,100);
  f.show();
 }
 class MyEventHandler extends MouseAdapter implements MouseMotionListener
 {
  public void mouseClicked(MouseEvent me)
  {
   if(me.getClickCount()==2)
   {
   	JFrame f1=new JFrame("�s����");
   	f1.setLocation(500,300);
   	f1.setSize(100,100);
   	f1.show();
   }	
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
    case MouseEvent.BUTTON1: f.setTitle("���U����,�y�Ь�("+me.getX()+","+me.getY()+")"); break;
    case MouseEvent.BUTTON2: f.setTitle("���U�u��,�y�Ь�("+me.getX()+","+me.getY()+")"); break;
    case MouseEvent.BUTTON3: f.setTitle("���U�k��,�y�Ь�("+me.getX()+","+me.getY()+")"); break;
    default: f.setTitle("���w�q���ƹ�����"); break;	
   }	
  }	
  public void mouseReleased(MouseEvent me)
  {
   f.setTitle("cSwingTest18");
   l.setText("��}�ƹ�...");	
  }	
  public void mouseDragged(MouseEvent me)
  {
  }
  public void mouseMoved(MouseEvent me)
  {
   f.setTitle("�ثe�ƹ����y�ЬO("+me.getX()+","+me.getY()+")");	
  }	
 }	
}