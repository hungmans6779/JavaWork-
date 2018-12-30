import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class cSwingTest24
{
 public static void main(String argv[])
 {
 	new cSwingTest24();
 }	
 public cSwingTest24()
 {
 	JFrame frame=new JFrame("cSwingTest24");
 	frame.addWindowListener(new WindowAdapter()
 	{
 	 public void windowClosing(WindowEvent we)
 	 {
 	 	System.exit(0);
 	 }		
 	});	
  Integer [] layerContainer={JLayeredPane.DEFAULT_LAYER,JLayeredPane.PALETTE_LAYER,new Integer(101),
                             JLayeredPane.MODAL_LAYER,new Integer(201),JLayeredPane.POPUP_LAYER,
                             JLayeredPane.DRAG_LAYER};
  Color []color={Color.red,Color.blue,Color.magenta,Color.cyan,Color.yellow,Color.green,Color.pink};                            
  JLayeredPane layeredPane=frame.getLayeredPane();
  Point position=new Point(10,10);
  JLabel [] label=new JLabel[7];
  for(int i=0;i<7;i++)
  {
   String str="²Ä "+(i+1)+" ¼h";
   label[i]=createLabel(str,position,color[i]);
   position.x+=20;
   position.y+=20;
   layeredPane.add(label[i],layerContainer[i]);
   System.out.println(str+"ªº¼h¯Å¬O : "+layeredPane.getLayer(label[i]));
  }	
  frame.setSize(new Dimension(280,280));
  frame.setLocation(500,300);
  frame.setVisible(true);
 }
 public JLabel createLabel(String title,Point position,Color color)
 {
 	JLabel l=new JLabel(title,JLabel.CENTER);
 	l.setVerticalAlignment(JLabel.TOP);
 	l.setForeground(Color.BLACK);
 	l.setBackground(color);
 	l.setOpaque(true);
 	l.setBounds(position.x,position.y,100,100);
 	return l;
 }		
}