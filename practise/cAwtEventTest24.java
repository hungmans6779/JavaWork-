import java.awt.*;
import java.awt.event.*;
public class cAwtEventTest24 extends WindowAdapter implements AdjustmentListener
{
 Frame f;	
 Button btn;
 Panel p;
 Scrollbar sbH;
 Scrollbar sbV;
 int x=0,y=0;
 public static void main(String argv[])
 {
  new cAwtEventTest24();
 }
 public cAwtEventTest24()
 {
 	f=new Frame("Scrollbar的運用");
 	f.setLayout(new BorderLayout());
 	f.addWindowListener(this);
 	f.setLocation(300,300);
 	f.setSize(500,500);
 	f.addWindowListener(this);
 	btn=new Button("我會自己移動喔");
 	p=new Panel(null);
 	btn.setSize(200,20);
 	btn.setLocation(x+20,y);
 	p.add(btn);
 	sbH=new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,200);
 	sbH.addAdjustmentListener(this);
 	sbV=new Scrollbar(Scrollbar.VERTICAL,0,10,0,200);
 	sbV.addAdjustmentListener(this);
 	f.add(p,BorderLayout.CENTER);
 	f.add(sbH,BorderLayout.SOUTH);
 	f.add(sbV,BorderLayout.EAST);
 	f.setVisible(true);
 	
 }	
 public void windowClosing(WindowEvent we)
 {
  System.exit(0);	
 }	
 public void adjustmentValueChanged(AdjustmentEvent ae)
 {
 	Scrollbar sb=(Scrollbar)ae.getSource();
 	if(sb.getOrientation()==Scrollbar.HORIZONTAL)
    x=sb.getValue();
  else
    y=sb.getValue();
  System.out.print(x+","+y);
  btn.setLocation(x,y);	
 }	
}