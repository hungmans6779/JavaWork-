import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class cSwingTest23 extends JFrame
{
 public static void main(String argv[])
 {
 	new cSwingTest23();
 }		
 public cSwingTest23()
 {
 	super("cSwingTest23");
  Integer []layerContainer={JLayeredPane.DEFAULT_LAYER,JLayeredPane.PALETTE_LAYER,new Integer(101),
                          JLayeredPane.MODAL_LAYER,new Integer(201),JLayeredPane.POPUP_LAYER,JLayeredPane.DRAG_LAYER};
  Color [] color={Color.red,Color.blue,Color.magenta,Color.cyan,Color.yellow,Color.green,Color.pink};
  JLayeredPane layeredPane=getLayeredPane();
  Point position=new Point(10,10);
  JLabel [] label=new JLabel[7];
  for(int i=0;i<7;i++)
  {
   String labelText="²Ä "+(i+1)+" ¼h";
   label[i]=createLabel(labelText,position,color[i]);
   position.x=position.x+20;
   position.y=position.y+20;	
   layeredPane.add(label[i],layerContainer[i]);
  }	
  setSize(new Dimension(280,280));
  show();
  addWindowListener(new WindowAdapter()
  {
   public void windowClosing(WindowEvent we)
   {
   	System.exit(0);
   }		
  });	
 }
 public JLabel createLabel(String title,Point position,Color color)
 {
 	JLabel l=new JLabel(title,JLabel.CENTER);
 	l.setVerticalAlignment(JLabel.TOP);
 	l.setBackground(color);
 	l.setForeground(Color.BLACK);
 	l.setOpaque(true);
 	l.setBounds(position.x,position.y,100,100);
 	return l;
 }		
}	