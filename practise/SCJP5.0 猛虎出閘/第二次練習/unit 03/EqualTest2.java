class Ball
{
 String tradeMark;
 String kind;
 String color;
 Ball(String t,String k,String c)
 {
  tradeMark=t;
  kind=k;
  color=c;
 }
 public boolean equals(Object obj)
 {
  if(this==obj)  
  { return true; }
  if(obj!=null && getClass()==obj.getClass())
  {
   if(obj instanceof Ball)
   {
   	Ball ball=(Ball)obj;
   	if(tradeMark.equals(ball.tradeMark) && kind.equals(ball.kind) && color.equals(ball.color))
   	{
   	 return true;	
   	}	
   }		
  }
  return false;	
 }
}

public class EqualTest2
{
 public static void main(String argv[])
 {
  Ball b1=new Ball("´µ§B¤B","Äx²y","¬õ");
  Ball b2=new Ball("´µ§B¤B","Äx²y","¬õ");
  System.out.println("b1==b2:"+(b1==b2));
  System.out.println("b1.equals(b2) :"+(b1.equals(b2)));
 }
}