import java.util.*;
import org.apache.commons.lang.builder.HashCodeBuilder;
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
 public int hashCode()
 {
  return new HashCodeBuilder(17,37).append(tradeMark).append(kind).append(color).toHashCode();
 }	
}

public class EqualTest4
{
 public static void main(String argv[])
 {
  Ball b1=new Ball("斯伯丁","籃球","紅");
  Ball b2=new Ball("斯伯丁","籃球","紅");
  System.out.println("b1==b2:"+(b1==b2));
  System.out.println("b1.equals(b2) :"+(b1.equals(b2)));
  System.out.println("b1.hashCode()="+b1.hashCode());
  System.out.println("b2.hashCode()="+b2.hashCode());
  HashMap h=new HashMap();
  h.put(new Ball("斯伯丁","籃球","紅"),"ABC");
  System.out.print("HashMap 元素內容=");
  System.out.println(h.get(new Ball("斯伯丁","籃球","紅")));
 }
}