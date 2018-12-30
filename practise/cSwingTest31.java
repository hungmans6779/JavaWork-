import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class cSwingTest31
{
 public static void main(String argv[])
 {
 	new cSwingTest31();
 }
 public cSwingTest31()
 {
 	JFrame frame=new JFrame("cSwingTest31");
 	frame.addWindowListener(new WindowAdapter()
 	{
 	 public void windowClosing(WindowEvent we)
 	 {
 	 	System.exit(0);
 	 }	
 	});	
 	Container contentPane=frame.getContentPane();
 	JLabel label1=new JLabel("JLabel1",JLabel.CENTER);
 	label1.setBackground(Color.green);
 	label1.setOpaque(true);
 	label1.setVerticalAlignment(JLabel.TOP);
 	JLabel label2=new JLabel("JLabel2",JLabel.CENTER);
 	label2.setBackground(Color.pink);
 	label2.setOpaque(true);
 	label2.setVerticalAlignment(JLabel.TOP);
 	JSplitPane split1=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,false,label1,label2);
 	split1.setDividerLocation(0.3);
 	split1.setDividerSize(10);
 	split1.setOneTouchExpandable(true);
 	
 	JLabel label3=new JLabel("JLabel3",JLabel.CENTER);
 	label3.setBackground(Color.red);
 	label3.setOpaque(true);
 	label3.setVerticalAlignment(JLabel.TOP);
 	
 	JSplitPane split2=new JSplitPane(JSplitPane.VERTICAL_SPLIT,true,split1,label3);
 	split2.setDividerLocation(35);
 	split2.setDividerSize(5);
 	split2.setOneTouchExpandable(false);
 	contentPane.add(split2);
 	frame.setLocation(200,200);
 	frame.setSize(500,500);
 	frame.show();
 }			
	
}	