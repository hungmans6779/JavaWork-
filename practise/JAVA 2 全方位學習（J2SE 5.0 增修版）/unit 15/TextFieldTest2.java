import java.awt.*;
import java.awt.event.*;
public class TextFieldTest2 implements TextListener,ActionListener
{
 Frame f;
 Label lb;
 TextField tf;
 Button b;
 public static void main(String argv[])
 {
  new TextFieldTest2();
 }
 public TextFieldTest2()
 {
  f=new Frame("TextFieldTest1");
  lb=new Label(" ");
  tf=new TextField(" ",20);
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
  //tf.setText("");
  //Button bb=(Button)e.getSource();
  //String str=tf.getSelectedText();
  //lb.setText(str);
  //tf.selectAll();
  lb.setText(tf.getText());
 }
 public void textValueChanged(TextEvent e)
 {
 // lb.setText(tf.getText());
 }

}