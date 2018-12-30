import java.awt.*;
import java.awt.event.*;
public class Ex11 extends Canvas implements ItemListener,AdjustmentListener,MouseMotionListener,MouseListener
{
 int startX=0,startY=0;
 int endX=0,endY=0;
 int red=0,green=0,blue=0;
 int kind=1;
 int drawfill=0;	
 Scrollbar sred,sgreen,sblue;
 Checkbox chLine,chRect,chOval;
 Checkbox chDrawFill;
 static Frame f;
 static Ex11 myCanvas;
 public static void main(String argv[])
 {
  myCanvas=new Ex11();
  myCanvas.addMouseListener(myCanvas);
  myCanvas.addMouseMotionListener(myCanvas);
  f.add(myCanvas,BorderLayout.CENTER);
  f.pack();
  f.setResizable(false);
  f.setVisible(true);
 }
 public Ex11()
 {
 	setSize(500,450);
 	f=new Frame("Ex11(�e�ϧ�) �ĤG���� --- �x�ŧ���95�~06��20��]�p���{��");
  Panel p=new Panel(new GridLayout(1,3));
  
  //�]�w�ϧΪ��˦�
  //**********************************************
  Panel p1=new Panel(new GridLayout(3,1));
  CheckboxGroup cbg1=new CheckboxGroup();
  chLine=new Checkbox("�e�u��",cbg1,true);
  chLine.addItemListener(this);
  chRect=new Checkbox("�e�x��",cbg1,false);
  chRect.addItemListener(this);
  chOval=new Checkbox("�e���",cbg1,false);
  chOval.addItemListener(this);
  p1.add(chLine);
  p1.add(chRect);
  p1.add(chOval);
  //**********************************************
  
  
  //�]�w�O�_�ϧζ��
  //**********************************************
  Panel p2=new Panel(new BorderLayout());
  chDrawFill=new Checkbox("���",false);
  p2.add(chDrawFill);
  //**********************************************
  
  
  //�]�w�C���
  //**********************************************
  Panel p3=new Panel(new GridLayout(3,2));
  sred=new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,255);
  sred.addAdjustmentListener(this);
  sgreen=new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,255);
  sgreen.addAdjustmentListener(this);
  sblue=new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,255);
  sblue.addAdjustmentListener(this);
  p3.add(new Label("�� �� ��  (0 �� 255) :"));
  p3.add(sred);
  p3.add(new Label("�� �� ��  (0 �� 255) :"));
  p3.add(sgreen);
  p3.add(new Label("�� �� ��  (0 �� 255) :"));
  p3.add(sblue);
  p.add(p1);
  p.add(p2);
  p.add(p3);
  f.add(p,BorderLayout.NORTH);
  //**********************************************   


 }	

 public void itemStateChanged(ItemEvent e)
 {
 	Checkbox cbox=(Checkbox)e.getSource(); 
  if(cbox.getLabel()=="�e�u��")
 	{
 	 kind=1;	
 	}	
 	else
 	{
 	 if(cbox.getLabel()=="�e�x��")
 	 {
 	 	kind=2;
 	 }		
 	 else
 	 {
 	 	kind=3;
 	 }	
 	}
 }
 
 
 public void adjustmentValueChanged(AdjustmentEvent e)
 {
 	red=sred.getValue();
 	green=sgreen.getValue();
 	blue=sblue.getValue();
 }
 
 public void mousePressed(MouseEvent e)
 {
  if(e.getButton()==MouseEvent.BUTTON1)
 	{
 	 startX=e.getX();
 	 startY=e.getY();
 	}	
 }
 
 public void mouseDragged(MouseEvent e)
 {
  endX=e.getX();
 	endY=e.getY();
 	if(chDrawFill.getState())
  { drawfill=1;	}	
  else
  { drawfill=0;	}	
  repaint(); 
 }
 
 public void paint(Graphics g)
 {
  int differenceX=endX-startX;
 	int differenceY=endY-startY;
 	g.setColor(new Color(red,green,blue));
 	switch(kind)
 	{
 	 case 1:
 	 	 g.drawLine(startX,startY,endX,endY); 
 	  break;
 	 case 2: 
 	   if(drawfill==0)
 	   {
 	    g.drawRect(startX,startY,differenceX,differenceY);
 	   }
 	   else
 	   {
 	   	g.fillRect(startX,startY,differenceX,differenceY);
 	   }	 
 	  break;
 	 case 3: 	
 	   if(drawfill==0)
 	   {
 	    g.drawOval(startX,startY,differenceX,differenceY);
 	   }
 	   else
 	   {
 	   	g.fillOval(startX,startY,differenceX,differenceY);
 	   }	 
 	  break; 		
 	}	
 }	
 
 public void mouseClicked(MouseEvent e)
 {  }	
 public void mouseEntered(MouseEvent e)
 { }
 public void mouseExited(MouseEvent e)
 { }
 public void mouseReleased(MouseEvent e)
 { }
 public void mouseMoved(MouseEvent e)
 { }
}	