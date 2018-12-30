import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class cSwingTest42
{
 public static void main(String argv[])
 {
 	File file=new File("02.jpg");
 	try
 	{
   FileInputStream fis=new FileInputStream(file);
   byte [] images=new byte[(int)file.length()];
   fis.read(images);
   Icon icon=new ImageIcon(images);
   JLabel label=new JLabel(icon,JLabel.CENTER);
   JFrame frame=new JFrame("cSwingTest42");
   frame.addWindowListener(new WindowAdapter()
   {
   	public void windowClosing(WindowEvent we)
   	{
   	 System.exit(0);	
   	}	
   });	
   Container contentPane=frame.getContentPane();
   contentPane.add(label);
   frame.setLocation(500,300);
   frame.setSize(new Dimension(500,500));
   frame.show();
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();	
  }	 
 }
}