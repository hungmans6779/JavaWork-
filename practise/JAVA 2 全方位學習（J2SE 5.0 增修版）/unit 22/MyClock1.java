import java.awt.*;
import java.awt.event.*;
import java.util.*;
class MyClock1 implements Runnable
{
 static Frame f;
 static Label l;
 public static void main(String argv[])
 {
  f=new Frame("MyClock1");
  f.addWindowListener(new WindowAdapter()
  {
   public void windowClosing(WindowEvent e)
   {
   	System.exit(0);
   }		
  });	
  l=new Label();
 	l.setFont(new Font("Arial",Font.PLAIN,36));
 	l.setText(getTime());
 	f.add(l,BorderLayout.CENTER);
 	f.setResizable(false);
 	f.pack();
 	f.setVisible(true);
 	Thread t1=new Thread(new MyClock1());
 	t1.start();
 }		
 public static String getTime()
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
 	 }
 	 catch(InterruptedException  ie)
 	 {
 	  ie.printStackTrace();	
 	 }		 
 	 l.setText(getTime());
 	}
 }	
}	
