import java.applet.Applet;
import java.awt.*;
public class RunMessage extends Applet
{
 int x=0;
 int y=20;
 boolean right=true;
 boolean top=true;
 public void init()
 {
 	setBackground(Color.GREEN);
 	setForeground(Color.RED);
 }
 
 public void start()
 {
  new Thread()
  {
   public void run()
   {
    while(true)
    {
     try
     {	
     	Thread.currentThread().setPriority(1);
     	sleep(150);
      repaint();
     }
     catch(InterruptedException ie){} 
    }		
   }		
  }	
  .start();	
 }

 public void paint(Graphics g)
 {
 	g.setFont(new Font("Serief",Font.BOLD,95));
 	g.drawString("�w��Ө� JAVA Applet�@��",0,280);
 	g.setFont(new Font("Serief",Font.BOLD,20));
 	g.setColor(Color.white);
 	g.drawString("�ۥѤH",x,y); 	
 	
 	
 	if(right) //�V�k�]
 	{
 	 x+=10;
 	 if(x>1130)
 	  right=false;	
 	  runTopBoom();
 	}
 	else //�V���]
 	{
 	 x-=10; 
 	 if(x<0)
 	  right=true;	
 	  runTopBoom();
 	}		
 
 }	
 public void runTopBoom()					
 {
 	if(top)
 	  {
 	   y-=10;
 	   if(y<25)
 	    top=false;	
 	  }
 	  else
 	  {
 	   y+=10;	
 	   if(y>585)
 	    top=true;
 	  }		
 }	
}	

	