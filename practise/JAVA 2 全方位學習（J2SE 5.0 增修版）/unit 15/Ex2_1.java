import java.awt.*;
import java.awt.event.*;

public class Ex2_1 extends WindowAdapter implements ActionListener
{
 Frame f;	
 TextArea tf;
 String buffer1;
 int buffern1=0,buffern2=0,result=0;
 static int tt=0,count=0,senconcount=0;
 public static void main (String argv[])
 {
 	new Ex2_1();
 }	
 public Ex2_1()
 {
  f=new Frame("Ex2_1 ----- 洪嘉宏於95年06月16日設計的程式");
  f.addWindowListener(this);
  f.setLayout(new BorderLayout(10,10));

  Panel p1=new Panel(new BorderLayout(10,1));
  tf=new TextArea("0",1,10,TextArea.SCROLLBARS_NONE);
  p1.add(tf,BorderLayout.CENTER);
    
  Panel p2=new Panel(new GridLayout(4,1,3,3));
  Button b1[]=new Button[4];
  String str1[]={"MC","MR","MS","M+"};
  for(int i=0;i<b1.length;i++)
  {
   b1[i]=new Button(str1[i]);	
   b1[i].setActionCommand(str1[i]);
   b1[i].addActionListener(this);
   b1[i].setEnabled(false);
   p2.add(b1[i]);
  }	
   
  Panel p3=new Panel(new GridLayout(4,5,3,3));
  String str2[]={"7","8","9","/","sqrt","4","5","6","*","%",
                 "1","2","3","-","1/x","0","+/-",".","+","="};
  Button b2[]=new Button[20];               
  for (int j=0;j<b2.length;j++)
  {
   b2[j]=new Button(str2[j]);
   if(j==4 || j==9 || j==14 || j==16 || j==17)
   {
   	b2[j].setEnabled(false);
   }	
   b2[j].setActionCommand(str2[j]);
   b2[j].addActionListener(this);
   p3.add(b2[j]);	
  }
  
  f.add(p1,BorderLayout.NORTH);
  f.add(p2,BorderLayout.WEST);
  f.add(p3,BorderLayout.EAST);
  f.pack();
  Color c=new Color(232,241,3);
  f.setBackground(c);
  f.setResizable(false);
  f.setVisible(true);
 }
 
 public void actionPerformed(ActionEvent e)
 {
 	try 
 	{
 		if(count==0)
 		{
 		 tf.setText("");
 		 count++;	
 	  }		 		
 		if(senconcount==0)
 		{
 	   tt=Integer.parseInt(e.getActionCommand());
 		}
 		if((tt>0 && tt<=9) && senconcount==0)
 		{
 	    tf.append(e.getActionCommand());
 	  }
 	  
 	  System.out.println("===================");
 		System.out.println("執行到運算元的部份");
 		System.out.println("count = "+count);
 		System.out.println("senconcount = "+senconcount);
 		System.out.println("buffern1 ="+buffern1);
 		System.out.println("===================");  
 	}
 	
 	
 	//處理運算子的例外
 	catch(NumberFormatException nfe)
 	{
 	senconcount++;	
   if(senconcount==0)
   {
    buffern1=Integer.parseInt(tf.getText());
   }
   else
   {
    System.out.print("+");	
    String str=e.getActionCommand();
    if(str=="+")
    {
    	result=buffern1+(Integer.parseInt(tf.getText()));
    	count=0;
    	System.out.print("+");
    }	
    else
    {
     if(str=="-")
     {
   	  result=buffern1-(Integer.parseInt(tf.getText()));	
   	  count=0;
     }	
   	 else
   	 {
   	  if(str=="*")
   	  {
   	   result=buffern1*(Integer.parseInt(tf.getText()));	
   	   count=0;
   	  }	
   	  else
   	  {
   	   if(str=="/")
   	  	{
   	  	 result=buffern1/(Integer.parseInt(tf.getText()));	
   	 	 count=0;
   	  	}	
   	   else
   	   {
   	 	  tf.setText(Integer.toString(result));	
   	 	  count=0;
   	 	 }	
   	  }	 	
   	 }
   	} 
   }	
   
    System.out.println("===================");
    System.out.println("執行到運算子的部份");
 	  System.out.println("count = "+count);
   	System.out.println("senconcount = "+senconcount);
   	System.out.println("buffern1 ="+buffern1);
 		System.out.println("===================");
  }	 	
 }	
 
 
 
 
 
 public void windowClosing(WindowEvent e)
 {
 	System.exit(0);
 }	
}