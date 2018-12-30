import java.util.*;
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

public class EqualTest3
{
 public static void main(String argv[])
 {
  Ball b1=new Ball("���B�B","�x�y","��");
  Ball b2=new Ball("���B�B","�x�y","��");
  System.out.println("b1==b2:"+(b1==b2));
  System.out.println("b1.equals(b2) :"+(b1.equals(b2)));
  System.out.println("b1.hashCode()="+b1.hashCode());
  System.out.println("b2.hashCode()="+b2.hashCode());
  HashMap h=new HashMap();
  h.put(new Ball("���B�B","�x�y","��"),"ABC");
  System.out.print("HashMap �������e=");
  System.out.println(h.get(new Ball("���B�B","�x�y","��")));
 }
}