import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Hanoi extends Frame
{
 int count=0;
 int rX=0,rY=200; //設定轉折角
 int endAY=600,endBY=600,endCY=600;
 int endPos=1;
 TextField tf; 
 Label [] disk;
 Label currentDisk;
 Stack<Label> sA,sB,sC;
 public static void main(String argv[])
 {
  new Hanoi();
 }
 public Hanoi()
 {
 	sA=new Stack<Label>();
 	sB=new Stack<Label>();
 	sC=new Stack<Label>();
 	currentDisk=new Label();
 	setLayout(null);
 	Label label=new Label("請輸入您的盤子數");
 	label.setSize(new Dimension(100,20));
 	label.setLocation(700,50);
 	tf=new TextField("3");
 	tf.setSize(new Dimension(50,20));
 	tf.setLocation(800,50);
 	final Button buttonRun=new Button("開始執行");
 	final Button buttonClear=new Button("清除畫面");
 	buttonRun.setLocation(850,50);
 	buttonRun.setSize(new Dimension(80,20));
 	buttonRun.addActionListener(new ActionListener()
 	{
 	 public void actionPerformed(ActionEvent ae)
 	 {
 	 	if(tf.getText().matches("\\d*"))
 	 	{
 	 	 buttonClear.setEnabled(true);	
 	 	 buttonRun.setEnabled(false);
     disk=new Label[Integer.parseInt(tf.getText())];   
     for(int i=0;i<disk.length;i++)
     {
     	int hasDisk=disk.length;
     	int width=100-10*i;
     	int height=30;
      disk[i]=new Label(String.valueOf(disk.length-i),Label.CENTER);
      disk[i].setForeground(Color.WHITE);
      disk[i].setFont(new Font("dialog",Font.BOLD,12));
      disk[i].setLocation(205-width/2,570-height*i);
      disk[i].setSize(new Dimension(width,height));
      //disk[i].setBackground(new Color(i*(255/hasDisk),20*i>=255?255:20*i,20*i>=255?255:20*i));
      disk[i].setBackground(new Color(100,20*i>=255?255:20*i,20*i>=255?255:20*i));
      sA.push(disk[i]);
      add(disk[i]);	
     }
     endAY=600-30*(disk.length);
     count=0;	
     hun(disk.length,'A','B','C');
    }  
 	 	else
 	 	 setTitle("您輸入的格式錯誤！請重新輸入阿拉伯數字！！！");
 	 }		
 	});
  buttonClear.setEnabled(false);
  buttonClear.setLocation(930,50);
 	buttonClear.setSize(new Dimension(80,20));
 	//清除畫面
 	buttonClear.addActionListener(new ActionListener()
 	{
 	 public void actionPerformed(ActionEvent ae)
 	 {
 	 	endAY=600;
 	 	endBY=600;
 	 	endCY=600;
 	 	buttonRun.setEnabled(true);
 	 	for(int i=0;i<disk.length;i++)
 	 	 remove(disk[i]);
 	 }		
 	});	
  add(label); 
 	add(tf);
 	add(buttonRun);
  add(buttonClear);
  	
 	addWindowListener(new WindowAdapter()
 	{
 	 public void windowClosing(WindowEvent we)
 	 {
 	  System.exit(0);	
 	 }		
 	});	
 	setTitle("河內塔程式(動畫版)---洪嘉宏於2007年07月23日製作");
 	setLocation(100,0);
 	setResizable(false);
  setSize(new Dimension(1050,700));	
  show();
 }	
 //河內塔方法
 public void hun(int n,char a,char b,char c)
 {
 	repaint();
  if(n==1)
  {
   //System.out.println("kk第 "+(++count)+" 次===>"+"from "+a+" to "+c);	
   //開始搬運
   switch(a)
   {
    case 'A':  currentDisk=sA.pop(); endAY=(endAY>=600?570:endAY+30); break;	
    case 'B':  currentDisk=sB.pop(); endBY=(endBY>=600?570:endBY+30); break;	
    case 'C':  currentDisk=sC.pop(); endCY=(endCY>=600?570:endCY+30); break;	
   }
   int width=(int)currentDisk.getSize().getWidth(); 
   //目地的
   switch(c)
   {
   	case 'A': sA.push(currentDisk); rX=205-width/2; endAY-=30; endPos=1; break;	
    case 'B': sB.push(currentDisk); rX=505-width/2; endBY-=30; endPos=2; break;
    case 'C': sC.push(currentDisk); rX=805-width/2; endCY-=30; endPos=3; break;
   }
  runDisk();
  } 
  else
  {
   hun(n-1,a,c,b);
   //System.out.println("第 "+(++count)+" 次===>"+"from "+a+" to "+c);	
   //開始搬運
   switch(a)
   {
    case 'A':  currentDisk=sA.pop(); endAY=(endAY>=600?570:endAY+30); break;	
    case 'B':  currentDisk=sB.pop(); endBY=(endBY>=600?570:endBY+30); break;	
    case 'C':  currentDisk=sC.pop(); endCY=(endCY>=600?570:endCY+30); break;	
   }
   int width=(int)currentDisk.getSize().getWidth(); 
   //目地的
   switch(c)
   {
   	case 'A': sA.push(currentDisk); rX=205-width/2; endAY-=30; endPos=1; break;	
    case 'B': sB.push(currentDisk); rX=505-width/2; endBY-=30; endPos=2; break;
    case 'C': sC.push(currentDisk); rX=805-width/2; endCY-=30; endPos=3; break;
   }
   runDisk();
   hun(n-1,b,a,c);	
  }	
 }
 public void runDisk()
 {
   int x=(int)currentDisk.getLocation().getX();
   int y=(int)currentDisk.getLocation().getY();
   //Y座標的移動
   for(int i=y;i>=rY;i--)
   {
   	for(int j=0;j<=999999;j++);
   	currentDisk.setLocation(x,i);   	
   }	
   //x座標的移動
   if(x<rX)
   {
    for(int i=x;i<=rX;i++)
    {
   	 for(int j=0;j<=999999;j++);
   	 currentDisk.setLocation(i,rY);
    }
   }
   else
   {
   	for(int i=x;i>=rX;i--)
    {
   	 for(int j=0;j<=999999;j++);
   	 currentDisk.setLocation(i,rY);
    }
   }	
   //Y座標的移動
   for(int i=rY;i<=(endPos==1?endAY:(endPos==2?endBY:endCY));i++)
   {
   	for(int j=0;j<=999999;j++);
   	currentDisk.setLocation(rX,i);   	 
   }	
 }	
 public void paint(Graphics g)
 {
  g.setFont(new Font("dialog",Font.BOLD,24));
  g.setColor(Color.RED);	
 	g.fillRect(110,600,190,10); //畫出底盤
 	g.drawString("A盤",190,650);	
 	g.fillRect(410,600,190,10); //畫出底盤
 	g.drawString("B盤",490,650);
 	g.fillRect(710,600,190,10); //畫出底盤
 	g.drawString("C盤",790,650);
 }	
}