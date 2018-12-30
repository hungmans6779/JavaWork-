import java.awt.*;
import java.awt.event.*;
public class cAwtEventTest30 extends WindowAdapter implements AdjustmentListener
{
 Frame f;
 Label label;
 Scrollbar sbR,sbG,sbB;
 Checkbox cbFore,cbBack;
 
 public static void main(String argv[])
 {
  new cAwtEventTest30();
 }	
 public cAwtEventTest30()
 {
 	f=new Frame("cAwtEventTest30");
 	f.addWindowListener(this);
 	f.setLayout(new BorderLayout());
 	f.setLocation(500,300);
 	sbR=new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,255);
 	sbG=new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,255);
 	sbB=new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,255);
 	sbR.addAdjustmentListener(this);
 	sbG.addAdjustmentListener(this);
 	sbB.addAdjustmentListener(this);
 	Panel p1=new Panel(new GridLayout(3,2));
 	p1.add(new Label("紅色值"));
 	p1.add(sbR);
 	p1.add(new Label("綠色值"));
 	p1.add(sbG);
 	p1.add(new Label("藍色值"));
 	p1.add(sbB);
 	label=new Label("Color Test");
 	label.setFont(new Font("monospaced",Font.BOLD,30));
 	label.setAlignment(Label.CENTER);
 	CheckboxGroup cbg=new CheckboxGroup();
 	cbFore=new Checkbox("前景顏色",cbg,true);
 	cbBack=new Checkbox("背景顏色",cbg,false);
 	Panel p2=new Panel(new GridLayout(1,2));
 	p2.add(cbFore);
 	p2.add(cbBack);
 	f.add(p1,BorderLayout.NORTH);
 	f.add(label,BorderLayout.CENTER);
 	f.add(p2,BorderLayout.SOUTH);
 	f.pack();
 	f.setVisible(true);
 	
 }
 public void windowClosing(WindowEvent we)
 {
 	System.exit(0);
 }		
 public void adjustmentValueChanged(AdjustmentEvent ae)
 {
 	int r=sbR.getValue();
 	int g=sbG.getValue();
 	int b=sbB.getValue();
 	System.out.println("RGB的顏色值各為 r="+r+",g="+g+",b="+b);
 	if(cbFore.getState())
 	 label.setForeground(new Color(r,g,b));
 	else
 	 label.setBackground(new Color(r,g,b));
 }	
}	