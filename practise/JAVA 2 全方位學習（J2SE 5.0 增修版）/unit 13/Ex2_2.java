import java.awt.*;
public class Ex2_2
{
 public static void main(String argv[])
 {
  Frame f=new Frame("¬x¹Å§»ªº¤pºâ½L");
  f.setLayout(new BorderLayout(10,10));

  Panel p1=new Panel(new BorderLayout(10,10));
  TextField tf=new TextField("0.");
  p1.add(tf,BorderLayout.CENTER);
  
  
  
  Panel p2=new Panel(new GridLayout(4,1,3,3));
  Button b1[]=new Button[4];
  String str1[]={"MC","MR","MS","M+"};
  for(int i=0;i<b1.length;i++)
  {
   b1[i]=new Button(str1[i]);	
   p2.add(b1[i]);
  }	
   
  Panel p3=new Panel(new GridLayout(4,5,3,3));
  String str2[]={"7","8","9","/","sqrt","4","5","6","*","%",
                 "1","2","3","-","1/x","0","+/-",".","+","="};
  Button b2[]=new Button[20];               
  for (int j=0;j<b2.length;j++)
  {
   b2[j]=new Button(str2[j]);
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
}