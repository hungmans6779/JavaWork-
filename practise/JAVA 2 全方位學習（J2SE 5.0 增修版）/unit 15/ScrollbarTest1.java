import java.awt.*;
import java.awt.event.*;
public class ScrollbarTest1 implements AdjustmentListener
{
 Frame f;
 Button b;
 Scrollbar sbv,sbh;
 Panel p;	
 int x=0,y=0;
 public static void main(String argv[])
 {
 	new ScrollbarTest1();
 }		
 public ScrollbarTest1()
 {
 	f=new Frame("ScrollbarTest1");
 	b=new Button("Button");
 	b.setSize(50,30);
 	b.setLocation(x,y);
 	p=new Panel(null);
 	p.add(b);
 	sbv=new Scrollbar(Scrollbar.VERTICAL,0,10,0,200);
 	sbh=new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,200);
 	sbv.addAdjustmentListener(this);
 	sbh.addAdjustmentListener(this);
 	f.add(p,BorderLayout.CENTER);
 	f.add(sbv,BorderLayout.EAST);
 	f.add(sbh,BorderLayout.SOUTH);
 	f.setSize(800,600);

 	f.setVisible(true);	
 }	
 public void adjustmentValueChanged(AdjustmentEvent e)
 {
 	Scrollbar sbb=(Scrollbar)e.getSource();
 	if(sbb.getOrientation()==Scrollbar.HORIZONTAL)
 	{
 	 x=sbb.getValue();	
 	}	
 	else
 	{
 		y=sbb.getValue();
 	}	
 	b.setLocation(x,y);
 }	
	
}	