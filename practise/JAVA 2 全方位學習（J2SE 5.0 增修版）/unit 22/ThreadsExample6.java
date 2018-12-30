import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.*;
public class ThreadsExample6
{
 Frame f;
 Button btnStart,btnStop,btnSuspend,btnCountinue;
 Label l;	
 Control6 con;
 public static void main(String argv[])
 {
 	new ThreadsExample6();
 }	
 public ThreadsExample6()
 {
 	f=new Frame("ThreadsExample6");
 	f.addWindowListener(new WindowAdapter()
 	{
 	 public void windowClosing(WindowEvent e)
 	 {
 	 	System.exit(0);
 	 }		
 	}
 	);	
 	l=new Label("0",Label.CENTER);
 	l.setFont(new Font("Arial",Font.PLAIN,36));
 	btnStart=new Button("¶}©l");
 	btnStart.addActionListener(new ActionListener()
 	{
 	 public void actionPerformed(ActionEvent e)
 	 {
 	 	con=new Control6(l);
 	 	con.start();
 	 	btnStart.setEnabled(false);
 	 	btnStop.setEnabled(true);
 	 	btnSuspend.setEnabled(true);
 	 	btnCountinue.setEnabled(false);
 	 } 
 	});
 	btnStop=new Button("°±¤î");
 	btnStop.setEnabled(false);
 	btnStop.addActionListener(new ActionListener()
 	{
 	 public void actionPerformed(ActionEvent e)
 	 {
 	 	con.setState(Control6.STOP);
 	 	btnStart.setEnabled(true);
 	 	btnStop.setEnabled(false);
 	 	btnSuspend.setEnabled(false);
 	 	btnCountinue.setEnabled(false);
 	 }		
 	});	
 	btnSuspend=new Button("¼È°±");
 	btnSuspend.setEnabled(false);
 	btnSuspend.addActionListener(new ActionListener()
 	{
 	 public void actionPerformed(ActionEvent e)
 	 {
 	 	con.setState(Control6.SUSPEND);
 	  btnStart.setEnabled(false);
 	  btnStop.setEnabled(false);
 	  btnSuspend.setEnabled(false);
 	  btnCountinue.setEnabled(true);	 
 	 }		
 	});
 	btnCountinue=new Button("Ä~Äò");
 	btnCountinue.setEnabled(false);
 	btnCountinue.addActionListener(new ActionListener()
 	{
 	 public void actionPerformed(ActionEvent e)
 	 {
 	 	btnStart.setEnabled(false);
 	 	btnStop.setEnabled(true);
 	 	btnSuspend.setEnabled(true);
 	 	btnCountinue.setEnabled(false);	 	
 	 }		
 	});	
 	Panel p=new Panel(new GridLayout(1,4));
 	p.add(btnStart);
 	p.add(btnStop);
 	p.add(btnSuspend);
 	p.add(btnCountinue);
 	f.add(l,BorderLayout.CENTER);
 	f.add(p,BorderLayout.SOUTH);
 	f.pack();
 	f.setResizable(false);
 	f.setVisible(true);
 }
}
 
class Control6 extends Thread
{

 static final int COUNTINUE = 0;
 static final int SUSPEND = 1;
 static final int STOP = 2;
 private int state = COUNTINUE;
 private int i;
 Label l;	
 public Control6(Label ll)
 {
 	l=ll;
 }		
 public synchronized void setState(int s)
 {
 	state=s;
 	if(state==COUNTINUE)
 	 notify();
 }	
 public synchronized boolean checkState()
 {
 	while(state==SUSPEND)
 	{
 	 try
 	 {
 	 	wait();
 	 }		
 	 catch(InterruptedException ie)
 	 {
 	 	ie.printStackTrace();
 	 }			
 	}
 	if(state==STOP)
 	{ return false; }
 	else
 	{ return true; }
 	 
 	 	
 }		
 public void run()
 {
 	while(true)
 	{
 	 i++;
 	 l.setText(String.valueOf(i));
 	 try
 	 {
 	  //sleep(100);	
 	  TimeUnit.SECONDS.sleep(1);
 	 }	
 	 catch(InterruptedException ie)
 	 {
 	  ie.printStackTrace();	
 	 }	
 	 if(!checkState())
 	  break;
 	} 
 }		
}	