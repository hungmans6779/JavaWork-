import java.awt.*;
import java.awt.event.*;
public class TextFieldTest1 implements TextListener,ActionListener
{
 Frame f;
 Label lb;
 TextField tf;
 public static void main(String argv[])
 {
  new TextFieldTest1();
 }
 public TextFieldTest1()
 {
  f=new Frame("TextFieldTest1");
  lb=new Label(" ");
  tf=new TextField(" ",20);
  tf.addTextListener(this);
  tf.addActionListener(this);
  f.add(tf,BorderLayout.NORTH);
  f.add(lb,BorderLayout.SOUTH);
  f.pack();
  f.setVisible(true);
 }
 public void actionPerformed(ActionEvent e)
 {
  tf.setText("");
 }
 public void textValueChanged(TextEvent e)
 {
  lb.setText(tf.getText());
 }

}