import java.awt.*;
import java.awt.event.*;
public class ColorTest1 implements AdjustmentListener
{
 Frame f;
 Scrollbar red,green,blue;
 Checkbox fore,back;
 Label lb;
 public static void main(String argv[])
 {
  new ColorTest1();
 }
 public ColorTest1()
 {
  f=new Frame("ColorTest1");
  f.setLayout(new GridLayout(3,1));
  
  Panel p1=new Panel(new GridLayout(3,2));
  red=new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,255);
  red.addAdjustmentListener(this);
  green=new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,255);
  green.addAdjustmentListener(this);
  blue=new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,255);
  blue.addAdjustmentListener(this);
  p1.add(new Label("紅色值 ： "));
  p1.add(red);
  p1.add(new Label("綠色值 ： "));
  p1.add(green);
  p1.add(new Label("藍色值 ： "));
  p1.add(blue);
  
  lb=new Label("Color Test");
  lb.setFont(new Font("monospaced",Font.BOLD,24));
  
  Panel p2=new Panel(new GridLayout(1,2));
  CheckboxGroup cbg=new CheckboxGroup();
  fore=new Checkbox("前景顏色",true,cbg);
  back=new Checkbox("背景顏色",false,cbg);
  p2.add(fore);
  p2.add(back);
  
  f.add(p1);
  f.add(lb);
  f.add(p2);
  f.pack();
  f.setVisible(true);
 }
 public void adjustmentValueChanged(AdjustmentEvent e)
 {
  int r=red.getValue();
  int g=green.getValue();
  int b=blue.getValue();
  if(fore.getState())
  {
   lb.setForeground(new Color(r,g,b));
  }	
  else
  {
  	lb.setBackground(new Color(r,g,b));
  }	
 }
}