import java.awt.*;
import java.awt.event.*;
public class AnonymousInnerClassExample2 
{
 public static void main(String argv[])
 {
  Frame f=new Frame("AnonymousInnerClassExample2");
  f.addWindowListener(new WindowListener()
  {
  	public void windowClosing(WindowEvent e)
  	{ 
  	 System.exit(0);	
  	}
  	public void windowActivated(WindowEvent e)
  	{ }
    public void windowIconified(WindowEvent e)
  	{ }
    public void windowOpened(WindowEvent e)
  	{ }
    public void windowClosed(WindowEvent e)
  	{
  	 System.exit(0);	
  	}
    public void windowDeiconified(WindowEvent e)
  	{ }
    public void windowDeactivated(WindowEvent e) 
    { }
  });
  f.pack();
  f.setVisible(true);   
 }
 public void windowClosing(WindowEvent e)
  {
   System.exit(0);	
  }	
}	