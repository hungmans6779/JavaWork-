import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class hEx2_5 
{
 public static void main(String argv[])
 {
 	new hEx2_5().aFrame();
 }		
 public void aFrame()
 {
  JFrame F=new JFrame("Swing application");
  JLabel label=new JLabel("Hello are your??");
  F.getContentPane().add(label,BorderLayout.CENTER);
  F.pack();
  F.show();
  F.addWindowListener(new WindowAdapter()
  {
   public void windowClosing(WindowEvent we)
   {
    System.exit(0);
   }
  });
 }
}