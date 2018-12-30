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
  l=new JLabel("JLabel 元件");
  l.setHorizontalAlignment(JLabel.CENTER);
  b=new JButton("在我上面作實驗吧");
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
   //l.setText("滑鼠被按下了");	
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
    case MouseEvent.BUTTON1: f.setTitle("按下左鍵"); break;
    case MouseEvent.BUTTON2: f.setTitle("按下滾輪"); break;
    case MouseEvent.BUTTON3: f.setTitle("按下右鍵"); break;
    default: f.setTitle("未定義的滑鼠按鍵"); break;	
   }	
  }	
  public void mouseReleased(MouseEvent me)
  {
   f.setTitle("cSwingTest17");
   l.setText("放開滑鼠...");	
  }	
 }	
}