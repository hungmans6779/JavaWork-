import java.awt.*;
import java.awt.event.*;
import java.util.*;
 class MyClock2 implements Runnable
{
 Frame f;
 Label l;	
 public static void main(String argv[])
 {
  new MyClock2();	
 }	
 public MyClock2()
 {
 	f=new Frame("MyClock2");
 	f.addWindowListener(new WindowAdapter()
 	{
 	 public void windowClosing(WindowEvent e)
 	 {
 	 	System.exit(0);
 	 }		
 	}
 	);	
 	l=new Label(getTime());
 	l.setFont(new Font("Arial",Font.PLAIN,36));
  f.add(l);
  f.setResizable(false);
  f.pack();
  f.setVisible(true);
  Thread t1=new Thread(this);
  t1.start();
 }	
 public String getTime()
 {
 	GregorianCalendar gc=new GregorianCalendar();
 	return gc.get(GregorianCalendar.HOUR)+":"+
 	       gc.get(GregorianCalendar.MINUTE)+":"+
 	       gc.get(GregorianCalendar.SECOND);
 }	
 public void run()
 {
  while(true)
  {
   try
   {
   	Thread.sleep(1000);
   	l.setText(getTime());
   }		
   catch(InterruptedException ie)
   {
   	ie.printStackTrace();
   }  	
  }		
 }
}