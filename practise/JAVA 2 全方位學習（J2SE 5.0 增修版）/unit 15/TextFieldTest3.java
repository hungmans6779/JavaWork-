import java.awt.*;
import java.awt.event.*;
public class TextFieldTest3 implements TextListener,ActionListener
{
 Frame f;
 Label lb;
 TextField tf;
 Button b;
 public static void main(String argv[])
 {
  new TextFieldTest3();
 }
 public TextFieldTest3()
 {
  f=new Frame("TextFieldTest1");
  lb=new Label(" ");
  tf=new TextField(" ",20);
  tf.setEchoChar('a');
  tf.addTextListener(this);
  tf.addActionListener(this);
  b=new Button("按我取得選取字元");
  b.addActionListener(this);
  f.add(tf,BorderLayout.NORTH);
  f.add(b,BorderLayout.CENTER);
  f.add(lb,BorderLayout.SOUTH);
  f.pack();
  f.setVisible(true);
 }
 public void actionPerformed(ActionEvent e)
 {
  //lb.setText(tf.getText());
  lb.setText(String.valueOf(tf.getEchoChar()));
 }
 public void textValueChanged(TextEvent e)
 {
 // lb.setText(tf.getText());
 }

}