import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class cSwingTest7 
{
 JFrame f;
 JButton b;	
 GridBagLayout gbl;
 GridBagConstraints gbc;
 public static void main(String argv[])
 {
  new cSwingTest7();
 }
 public cSwingTest7()
 {
  f=new JFrame("cSwingTest7");
  Container contentPane=f.getContentPane();
  gbl=new GridBagLayout();
  contentPane.setLayout(gbl);
  f.addWindowListener(new WindowAdapter()
  {
   public void windowClosing(WindowEvent we)
   {
    System.exit(0);	
   }		
  });	
  b=new JButton("one");
  gbc=new GridBagConstraints(0,0,1,1,10,1,GridBagConstraints.CENTER,GridBagConstraints.HORIZONTAL,new Insets(0,0,0,0),0,0);
  gbl.setConstraints(b,gbc);
  contentPane.add(b);
  b=new JButton("Two");
  gbc=new GridBagConstraints(1,0,2,1,1,1,GridBagConstraints.CENTER,GridBagConstraints.HORIZONTAL,new Insets(0,0,0,0),50,0);
  gbl.setConstraints(b,gbc);
  contentPane.add(b);
  b=new JButton("Three");
  gbc=new GridBagConstraints(0,1,1,1,1,1,GridBagConstraints.CENTER,GridBagConstraints.HORIZONTAL,new Insets(10,0,0,0),0,50);
  gbl.setConstraints(b,gbc);
  contentPane.add(b);
  
  b=new JButton("Four");
  gbc=new GridBagConstraints(1,1,1,1,1,1,GridBagConstraints.CENTER,GridBagConstraints.HORIZONTAL,new Insets(0,0,0,0),0,0);
  gbl.setConstraints(b,gbc);
  contentPane.add(b);
  
  b=new JButton("This ia a last JButton");
  gbc=new GridBagConstraints(2,1,1,2,1,1,GridBagConstraints.SOUTH,GridBagConstraints.HORIZONTAL,new Insets(0,0,0,0),0,0);
  gbl.setConstraints(b,gbc);
  contentPane.add(b);
  
  f.pack();
  f.setVisible(true);

 }
 
}