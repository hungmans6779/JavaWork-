import java.awt.*;
import java.awt.event.*;
public class Ex2 extends MouseAdapter implements ItemListener,AdjustmentListener,MouseMotionListener,TextListener
{
 Frame f;
 MyCanvasEx2 myc;	
 Checkbox chRect,chOval,chLine;
 Scrollbar sred,sgreen,sblue;	
 Checkbox chDrawFill;
 TextField tf;
 String str;
 int startX=0,startY=0;
 int endX=0,endY=0;
 int red=0,green=0,blue=0;
 int kind=1;
 int drawfill=0;
 public static void main(String argv[])
 {
  new Ex2();
 }
 public Ex2()
 {
  f=new Frame("Ex2(畫圖形 vs. 加上文字輸入功能) 第一版本 --- 洪嘉宏於95年06月20日設計的程式");
  Panel p=new Panel(new GridLayout(1,3));
  
  //設定圖形的樣式
  //**********************************************
  Panel p1=new Panel(new GridLayout(3,1));
  CheckboxGroup cbg1=new CheckboxGroup();
  chLine=new Checkbox("畫線條",cbg1,true);
  chLine.addItemListener(this);
  chRect=new Checkbox("畫矩形",cbg1,false);
  chRect.addItemListener(this);
  chOval=new Checkbox("畫橢圓",cbg1,false);
  chOval.addItemListener(this);
  p1.add(chLine);
  p1.add(chRect);
  p1.add(chOval);
  //**********************************************
  
  
  //設定是否圖形填色
  //**********************************************
  Panel p2=new Panel(new GridLayout(3,1));
  chDrawFill=new Checkbox("填色",false);
  tf=new TextField("測試用文字");
  tf.addTextListener(this);
  p2.add(chDrawFill);
  p2.add(new Label("請輸入您的文字"));
  p2.add(tf);
  
  //**********************************************
  
  
  //設定顏色值
  //**********************************************
  Panel p3=new Panel(new GridLayout(3,2));
  sred=new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,255);
  sred.addAdjustmentListener(this);
  sgreen=new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,255);
  sgreen.addAdjustmentListener(this);
  sblue=new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,255);
  sblue.addAdjustmentListener(this);
  p3.add(new Label("紅 色 值  (0 ∼ 255) :"));
  p3.add(sred);
  p3.add(new Label("綠 色 值  (0 ∼ 255) :"));
  p3.add(sgreen);
  p3.add(new Label("藍 色 值  (0 ∼ 255) :"));
  p3.add(sblue);
  p.add(p1);
  p.add(p2);
  p.add(p3);
  //**********************************************
  
  myc=new MyCanvasEx2();
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
 	myc.changeValue(red,green,blue,startX,startY,endX,endY,kind,drawfill,str);
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
  if(cbox.getLabel()=="畫線條")
 	{
 	 kind=1;	
 	}	
 	else
 	{
 	 if(cbox.getLabel()=="畫矩形")
 	 {
 	 	kind=2;
 	 }		
 	 else
 	 {
 	 	kind=3;
 	 }	
 	}
 }		
 public void textValueChanged(TextEvent e)
 { 
 	TextField tt=(TextField)e.getSource();
  str=tt.getText();
  System.out.println(str);
  myc.changeValue(red,green,blue,startX,startY,endX,endY,kind,drawfill,str);
  myc.repaint();
 }	
}

class MyCanvasEx2 extends Canvas
{
 int changeRed,changeGreen,changeBlue;
 int changeStartX,changeStartY;
 int changeEndX,changeEndY;
 int changeKind;
 int changedrawfill;
 String changeStr="測試用文字";
 public MyCanvasEx2()
 {
 	setSize(500,450);
 }			
 public void changeValue(int red,int green,int blue,int startX,int startY,int endX,int endY,int kind,int drawfill,String str)
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
 	changeStr=str;
 }	
 public void paint(Graphics g)
 {
 	int differenceX=changeEndX-changeStartX;
 	int differenceY=changeEndY-changeStartY;
 	g.setColor(new Color(changeRed,changeGreen,changeBlue));
 	g.drawString(changeStr,10,20);
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