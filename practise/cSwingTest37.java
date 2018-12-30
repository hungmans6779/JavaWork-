import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class cSwingTest37
{
 JScrollBar sbV;
 JScrollBar sbH;	
 JLabel text;
 public static void main(String argv[])
 {
 	new cSwingTest37();
 }	
 public cSwingTest37()
 {
 	JFrame frame=new JFrame("cSwingTest37");
 	frame.addWindowListener(new WindowAdapter()
 	{
 	 public void windowClosing(WindowEvent we)
 	 {
 	  System.exit(0);	
 	 }	
 	});	
 	Container contentPane=frame.getContentPane();
 	sbV=new JScrollBar(JScrollBar.VERTICAL,0,10,0,100);
 	sbV.setUnitIncrement(1);
 	sbV.setBlockIncrement(10);
 	sbV.addAdjustmentListener(new MyEventHandler());
 	
 	sbH=new JScrollBar();
 	sbH.setOrientation(JScrollBar.HORIZONTAL);
 	sbH.setValue(0);
 	sbH.setVisibleAmount(20);
 	sbH.setMinimum(0);
 	sbH.setMaximum(100);
 	sbH.setUnitIncrement(1);
 	sbH.setBlockIncrement(5);
 	sbH.addAdjustmentListener(new MyEventHandler());
 	
 	JLabel label=new JLabel(new ImageIcon("02.jpg"));
 	text=new JLabel("刻度",JLabel.CENTER);
 	
 	contentPane.add(sbH,BorderLayout.SOUTH);
 	contentPane.add(sbV,BorderLayout.EAST);
 	contentPane.add(text,BorderLayout.NORTH);
 	contentPane.add(label,BorderLayout.CENTER);
 	
 	frame.setLocation(500,300);
 	frame.setSize(new Dimension(300,300));
 	frame.show();
 }	
 class MyEventHandler implements AdjustmentListener
 {
 	public void adjustmentValueChanged(AdjustmentEvent ae)
 	{
 	 if((JScrollBar)ae.getSource()==sbV)
 	 {
 	 	text.setText("垂直刻度是 : "+ae.getValue());
 	 }
 	 else
 	 {
 	 	text.setText("水平刻度是 ： "+ae.getValue());
 	 }			
 	}	
 }	
}