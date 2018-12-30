import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class cSwingTest26
{
 JLayeredPane layeredPane=null;
 public static void main(String argv[])
 {
 	new cSwingTest26();
 }	
 public cSwingTest26()
 {
 	JFrame frame=new JFrame("cSwingTest26");
 	frame.addWindowListener(new WindowAdapter()
 	{
 	 public void windowClosing(WindowEvent we)
 	 {
 	 	System.exit(0);
 	 }		
 	});	
 	layeredPane=frame.getLayeredPane();
 	Color []color={Color.red,Color.blue,Color.magenta,Color.cyan,Color.yellow,Color.green,Color.pink};
 	Integer [] layeredContainer={new Integer(-100),JLayeredPane.PALETTE_LAYER,new Integer(101),JLayeredPane.MODAL_LAYER,
 	                            new Integer(201),JLayeredPane.POPUP_LAYER,JLayeredPane.DRAG_LAYER};
 	JButton button[]=new JButton[7];
 	Point position=new Point(10,10);
 	for(int i=0;i<7;i++)
 	{
 	 button[i]=createButton("�� "+(i+1)+" �h",position,color[i]);
 	 button[i].setActionCommand(String.valueOf(i+1));
 	 button[i].addActionListener(new MyEventHandler());
 	 position.x+=20;
 	 position.y+=20;
 	 layeredPane.add(button[i],layeredContainer[i]);
 	}	                             	                
 	Container contentPane=frame.getContentPane();
 	contentPane.setLayout(new GridLayout(2,2));
 	JButton b1=new JButton("���s�@");
 	JButton b2=new JButton("���s�G");
 	JButton b3=new JButton("���s�T");
 	JButton b4=new JButton("���s�|");
 	contentPane.add(b1);
 	contentPane.add(b2);
 	contentPane.add(b3);
 	contentPane.add(b4);
 	System.out.println("ContentPane �h�ŬO:"+layeredPane.getLayer(contentPane));
 	System.out.println("���s�@���h�ŬO�G"+layeredPane.getLayer(b1));
 	System.out.println("���s�G���h�ŬO�G"+layeredPane.getLayer(b2));
 	System.out.println("Button1���h�ŬO�G"+layeredPane.getLayer(button[0]));
 	System.out.println("Button2���h�ŬO�G"+layeredPane.getLayer(button[1]));
 	System.out.println("Button3���h�ŬO�G"+layeredPane.getLayer(button[2]));
 	frame.setLocation(500,200);
 	frame.setSize(new Dimension(280,280));
 	frame.show();
 }
 class MyEventHandler implements ActionListener
 {
 	public void actionPerformed(ActionEvent ae)
 	{
 	 JButton button=(JButton)ae.getSource();
 	 System.out.println("�ثe�O�� "+button.getActionCommand()+" �h���s�Q����F");
 	 System.out.println("�����s���h�ŬO:"+layeredPane.getLayer(button));
 	 System.out.println("�����s��position�O�G"+layeredPane.getPosition(button));
 	 System.out.println("==========================================");
 	}	
 }	
 public JButton createButton(String text,Point position,Color color)
 {
 	JButton button=new JButton(text);
 	button.setVerticalAlignment(JButton.CENTER);
 	button.setForeground(Color.BLACK);
 	button.setBackground(color);
 	button.setOpaque(true);
 	button.setBounds(position.x,position.y,100,100);
 	return button;
 	
 }		

}