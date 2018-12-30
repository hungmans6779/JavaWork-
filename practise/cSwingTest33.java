import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class cSwingTest33
{
 public static void main(String argv[])
 {
  new cSwingTest33();
 }
 public cSwingTest33()
 {
  JFrame frame=new JFrame("cSwingTest33");
  frame.addWindowListener(new WindowAdapter()
  {
   public void windowClosing(WindowEvent we)
   {
    System.exit(0);	
   }		
  });	
  Container contentPane=frame.getContentPane();
  JLabel label11=new JLabel(new ImageIcon("01.jpg"));
  JLabel label12=new JLabel("看我們表演特技..厲害吧！",JLabel.CENTER);
  label12.setVerticalAlignment(JLabel.TOP);
  label12.setBackground(Color.pink);
  label12.setOpaque(true);
  JPanel p1=new JPanel(new BorderLayout());
  p1.add(label11,BorderLayout.CENTER);
  p1.add(label12,BorderLayout.NORTH);
  
  JLabel label21=new JLabel(new ImageIcon("02.jpg"));
  JLabel label22=new JLabel("我們是可愛的小貓咪",JLabel.CENTER);
  label22.setVerticalAlignment(JLabel.TOP);
  label22.setBackground(Color.green);
  label22.setOpaque(true);
  JPanel p2=new JPanel(new BorderLayout());
  p2.add(label21,BorderLayout.CENTER);
  p2.add(label22,BorderLayout.NORTH);
  
  JLabel label31=new JLabel(new ImageIcon("03.jpg"));
  JLabel label32=new JLabel("我們是狗兒四賤客",JLabel.CENTER);
  label32.setVerticalAlignment(JLabel.TOP);
  label32.setBackground(Color.yellow);
  label32.setOpaque(true);
  JPanel p3=new JPanel(new BorderLayout());
  p3.add(label31,BorderLayout.CENTER);
  p3.add(label32,BorderLayout.NORTH);
  
  JTabbedPane ta=new JTabbedPane(JTabbedPane.LEFT);
  ta.addTab("表演特技的貓",p1);
  ta.addTab("可愛的貓咪",p2);
  ta.addTab("狗兒四賤客",p3);
  contentPane.add(ta);
  frame.setLocation(500,200);
  frame.pack();
  frame.show();
  
 }
}