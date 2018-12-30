import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
public class cSwingTest39
{
 public static void main(String argv[])
 {
 	new cSwingTest39();
 }
 public cSwingTest39()
 {
 	JFrame frame=new JFrame("cSwingTest39");
 	frame.addWindowListener(new WindowAdapter()
 	{
 	 public void windowClosing(WindowEvent we)
 	 {
 	 	System.exit(0);
 	 }		
 	});	
 	Container contentPane=frame.getContentPane();
 	JLabel label=new JLabel();
 	//label.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
 	//label.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
 	//label.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED,Color.red,Color.green));
 	//label.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED,Color.red,Color.green,Color.blue,Color.cyan));
 	//label.setBorder(BorderFactory.createEmptyBorder());
 	//label.setBorder(BorderFactory.createEmptyBorder(10,10,100,100));
 	//label.setBorder(BorderFactory.createEtchedBorder());
 	//label.setBorder(BorderFactory.createEtchedBorder(Color.red,Color.green));
 	//label.setBorder(BorderFactory.createLineBorder(Color.red));
 	//label.setBorder(BorderFactory.createLineBorder(Color.green,10));
 	//label.setBorder(BorderFactory.createLoweredBevelBorder());
 	//label.setBorder(BorderFactory.createMatteBorder(5,10,10,5,Color.red));
 	//label.setBorder(BorderFactory.createMatteBorder(60,60,60,60,new ImageIcon("01.jpg")));
 	//label.setBorder(BorderFactory.createCompoundBorder());
 	//label.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.pink,20),BorderFactory.createMatteBorder(80,80,80,80,new ImageIcon("02.jpg"))));
 	//label.setBorder(BorderFactory.createRaisedBevelBorder());
 	//label.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.blue,10),"Line Border",TitledBorder.CENTER,TitledBorder.TOP));
 	//label.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.blue,10)));
 	//label.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.blue,10),"Titled Border"));
 	//label.setBorder(BorderFactory.createTitledBorder("Titled"));
 	//label.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.green,10),"Titled",TitledBorder.CENTER,TitledBorder.TOP,new Font("SansSerif",Font.ITALIC,14))); 	
 	label.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.green,10),"Titled",TitledBorder.CENTER,TitledBorder.TOP,new Font("SansSerif",Font.ITALIC,14),Color.red));
 	

 	contentPane.add(label);
 	frame.setLocation(500,200);
 	frame.setSize(new Dimension(500,500));
 	frame.setVisible(true);
 }		
}	