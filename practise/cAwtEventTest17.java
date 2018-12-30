import java.awt.*;
import java.awt.event.*;
public class cAwtEventTest17 extends WindowAdapter implements ItemListener,ActionListener
{
 Frame f;
 Checkbox [] cb=new Checkbox[3];	
 public static void main(String argv[])
 {
  new cAwtEventTest17();
 }
 public cAwtEventTest17()
 {
 	f=new Frame("cAwtEventTest17");
 	f.setLayout(new GridLayout(1,3));
 	f.addWindowListener(this);
 	f.setLocation(300,300);
 	for(int i=0;i<cb.length;i++)
 	{
 	 cb[i]=new Checkbox(String.valueOf(i+1));	
 	 cb[i].addItemListener(this);
 	 f.add(cb[i]);
 	}	
 	Button button=new Button("顯示目前Checkbox有被選取的是哪些元件");
 	button.addActionListener(this);
 	f.add(button);
 	f.pack();
 	f.setVisible(true);
 }
 public void windowClosing(WindowEvent we)
 {
 	System.exit(0);
 }		
 public void itemStateChanged(ItemEvent ie)
 {
 	String label=((Checkbox)ie.getSource()).getLabel();
 	if(ie.getStateChange()==ItemEvent.SELECTED)
 	 System.out.println(label+" SELECTED");
 	else
 	 System.out.println(label+" DESELECTED");
 }	
 public void actionPerformed(ActionEvent ae)
 {
 	System.out.println("===========================================");
  for(int i=0;i<cb.length;i++)
  {
   if(cb[i].getState())
   {
    System.out.println(cb[i].getLabel()+" 是被選取的");	
   } 
  }		
 }	
}