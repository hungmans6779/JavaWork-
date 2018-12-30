import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class cSwingTest21
{
 JFrame frame;
 JLabel label;
 JTextField tf;
 String str="";
 public static void main(String argv[])
 {
  new cSwingTest21();
 }
 public cSwingTest21()
 {
  frame=new JFrame("cSwingTest21");
  Container contentPane=frame.getContentPane();
  contentPane.setLayout(new GridLayout(3,1));
  frame.addWindowListener(new WindowAdapter()
  {
   public void windowClosing(WindowEvent we)
   {
    System.exit(0);	
   }		
  });	
  label=new JLabel();
  tf=new JTextField();
  tf.addKeyListener(new MyEventHandler());
  tf.requestFocus();
  JButton button=new JButton("清除");
  button.addActionListener(new MyEventHandler());
  contentPane.add(label);
  contentPane.add(tf);
  contentPane.add(button);
  frame.setLocation(300,500);
  frame.setSize(300,300);
  frame.show();
  
 }
 class MyEventHandler extends KeyAdapter implements ActionListener
 {
  public void keyTyped(KeyEvent ke)
  {
   char c=ke.getKeyChar();
   if(c=='o')
   {
   	JFrame f=new JFrame("新視窗");
   	f.setLocation(300,300);
   	f.setSize(100,100);
   	f.show();
   }
   str+=c;
   label.setText(str);		
  }
  public void actionPerformed(ActionEvent ae)
  {
   str="";
   label.setText("");
   tf.setText("");
   tf.requestFocus();
  }			
 }	
}