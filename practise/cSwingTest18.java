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
  l=new JLabel("JLabel 元件");
  l.setHorizontalAlignment(JLabel.CENTER);
  b=new JButton("在我上面作實驗吧");
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
   	JFrame f1=new JFrame("新視窗");
   	f1.setLocation(500,300);
   	f1.setSize(100,100);
   	f1.show();
   }	
  }		
  public void mouseEntered(MouseEvent me)
  {
   l.setText("滑鼠進入了");	
  }	
  public void mouseExited(MouseEvent me)
  {
   l.setText("滑鼠離開了");
  }	
  public void mousePressed(MouseEvent me)
  {
   l.setText("按住滑鼠不放...");	
   switch(me.getButton())
   {
    case MouseEvent.BUTTON1: f.setTitle("按下左鍵,座標為("+me.getX()+","+me.getY()+")"); break;
    case MouseEvent.BUTTON2: f.setTitle("按下滾輪,座標為("+me.getX()+","+me.getY()+")"); break;
    case MouseEvent.BUTTON3: f.setTitle("按下右鍵,座標為("+me.getX()+","+me.getY()+")"); break;
    default: f.setTitle("未定義的滑鼠按鍵"); break;	
   }	
  }	
  public void mouseReleased(MouseEvent me)
  {
   f.setTitle("cSwingTest18");
   l.setText("放開滑鼠...");	
  }	
  public void mouseDragged(MouseEvent me)
  {
  }
  public void mouseMoved(MouseEvent me)
  {
   f.setTitle("目前滑鼠的座標是("+me.getX()+","+me.getY()+")");	
  }	
 }	
}