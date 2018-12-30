import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class cSwingTest45
{
 public static void main(String argv[])
 {
 	new cSwingTest45();
 }	
 public cSwingTest45()
 {
 	JFrame frame=new JFrame("cSwingTest45");
 	frame.addWindowListener(new WindowAdapter()
 	{
 	 public void windowClosing(WindowEvent we)
 	 {
 	 	System.exit(0);
 	 }		
 	});	
 	Container contentPane=frame.getContentPane();
 	contentPane.setLayout(new BorderLayout());
 	JLabel label=new JLabel(new ImageIcon("04.jpg"));
 	label.setText("¥i·Rªº­w­wºµ");
 	label.setForeground(Color.red);
 	label.setIconTextGap(5);
 	label.setHorizontalAlignment(JLabel.CENTER);
 	label.setVerticalAlignment(JLabel.TOP);
 	contentPane.add(label,BorderLayout.CENTER);
 	frame.setLocation(200,200);
 	//frame.setSize(new Dimension(600,600));
 	frame.pack();
 	frame.show();
 }	
}