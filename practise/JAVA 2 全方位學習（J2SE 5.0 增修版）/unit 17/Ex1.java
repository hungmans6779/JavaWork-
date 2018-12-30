import java.awt.*;
import java.awt.event.*;
public class Ex1 extends MouseAdapter implements ItemListener,AdjustmentListener,MouseMotionListener
{
 Frame f;
 MyCanvasEx1 myc;	
 Checkbox chRect,chOval,chLine;
 Scrollbar sred,sgreen,sblue;	
 Checkbox chDrawFill;
 int startX=0,startY=0;
 int endX=0,endY=0;
 int red=0,green=0,blue=0;
 int kind=1;
 int drawfill=0;
 public static void main(String argv[])
 {
  new Ex1();
 }
 public Ex1()
 {
  f=new Frame("Ex1(�e�ϧ�) �Ĥ@���� --- �x�ŧ���95�~06��20��]�p���{��");
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
  //**********************************************
  
  myc=new MyCanvasEx1();
 	myc.addMouseListener(this);
 	myc.addMouseMotionListener(this);
  
  f.add(p,BorderLayout.NORTH);
  f.add(myc,BorderLayout.CENTER);
  f.setResizable(false);
  f.pack();
  f.setVisible(true); 
 }	
 public void mousePressed(MouseEvent e)
 {
 	if(e.getButton()==MouseEvent.BUTTON1)
 	{
 	 startX=e.getX();
 	 startY=e.getY();
 	}	
 }
 public void mouseMoved(MouseEvent e)
 {
 
 }		
 public void mouseDragged(MouseEvent e)
 {
 	endX=e.getX();
 	endY=e.getY();
 	if(chDrawFill.getState())
 	{ drawfill=1;	}	
 	else
 	{ drawfill=0;	}	
 	myc.changeValue(red,green,blue,startX,startY,endX,endY,kind,drawfill);
  myc.repaint();
 }			

 public void adjustmentValueChanged(AdjustmentEvent e)
 {
 	red=sred.getValue();
 	green=sgreen.getValue();
 	blue=sblue.getValue();
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
}

class MyCanvasEx1 extends Canvas
{
 int changeRed,changeGreen,changeBlue;
 int changeStartX,changeStartY;
 int changeEndX,changeEndY;
 int changeKind;
 int changedrawfill;
 public MyCanvasEx1()
 {
 	setSize(500,450);
 }			
 public void changeValue(int red,int green,int blue,int startX,int startY,int endX,int endY,int kind,int drawfill)
 {
 	changeRed=red;
 	changeGreen=green;
 	changeBlue=blue;	
 	changeStartX=startX;
 	changeStartY=startY;
 	changeEndX=endX;
 	changeEndY=endY;
 	changeKind=kind;	
 	changedrawfill=drawfill;
 }	
 public void paint(Graphics g)
 {
 	int differenceX=changeEndX-changeStartX;
 	int differenceY=changeEndY-changeStartY;
 	g.setColor(new Color(changeRed,changeGreen,changeBlue));
 	switch(changeKind)
 	{
 	 case 1:
 	 	 g.drawLine(changeStartX,changeStartY,changeEndX,changeEndY); 
 	  break;
 	 case 2: 
 	   if(changedrawfill==0)
 	   {
 	    g.drawRect(changeStartX,changeStartY,differenceX,differenceY);
 	   }
 	   else
 	   {
 	   	g.fillRect(changeStartX,changeStartY,differenceX,differenceY);
 	   }	 
 	  break;
 	 case 3: 	
 	   if(changedrawfill==0)
 	   {
 	    g.drawOval(changeStartX,changeStartY,differenceX,differenceY);
 	   }
 	   else
 	   {
 	   	g.fillOval(changeStartX,changeStartY,differenceX,differenceY);
 	   }	 
 	  break; 		
 	}	
 }		
}		