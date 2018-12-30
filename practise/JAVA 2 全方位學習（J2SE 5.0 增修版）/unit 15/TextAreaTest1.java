import java.awt.*;
import java.awt.event.*;
public class TextAreaTest1 
{
 public static void main(String argv[])
 {
  Frame f=new Frame("TextAreaTest1");
  f.setLayout(new GridLayout(4,1));
  String str="111342342523462562652576325476245762547254624652";
  TextArea ta1=new TextArea(str,2,10,TextArea.SCROLLBARS_NONE);
  TextArea ta2=new TextArea(str,2,10,TextArea.SCROLLBARS_BOTH);
  TextArea ta3=new TextArea(str,2,10,TextArea.SCROLLBARS_HORIZONTAL_ONLY);
  TextArea ta4=new TextArea(str,2,10,TextArea.SCROLLBARS_VERTICAL_ONLY);
  f.add(ta1);
  f.add(ta2);
  f.add(ta3);
  f.add(ta4);
  f.pack();
  f.setVisible(true);
 }

}