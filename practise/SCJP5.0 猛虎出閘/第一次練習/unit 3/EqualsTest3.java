import java.util.*;
import org.apache.commons.lang.builder.HashCodeBuilder;
class Ball
{
 String name;
 String kind;
 String color;
 
 public Ball(String name,String kind,String color)
 {
  this.name=name;
  this.kind=kind;
  this.color=color;
 }
 
 public boolean equals(Object obj)
 {
  if(this==obj) return true;
  if(obj!=null && this.getClass()==obj.getClass())
  {
   if(obj instanceof Ball)
   {
   	Ball ball=(Ball)obj;
   	if(name.equals(ball.name) && kind.equals(ball.kind) && color.equals(ball.color))
   	{
   	 return true;	
   	} 
   }		
  }		
 	return false;
 }
 
 public int hashCode()
 {
 	
 	return new HashCodeBuilder(17,47).append(name).append(kind).append(color).toHashCode();
 	
 }		
 
}


public class EqualsTest3
{
 public static void main(String argv[])
 {
  Ball b1=new Ball("JAVA","SCJP","COOL");
  Ball b2=new Ball("JAVA","SCJP","COOL");
  System.out.println("b1 == b2 : "+(b1==b2));
  System.out.println("b1.equals(b2) : "+b1.equals(b2));
  System.out.println("b1.hashCode() : "+b1.hashCode());
  System.out.println("b2.hashCode() : "+b2.hashCode());
  //HashMap h=new HashMap();
  //h.put(new Ball("JAVA","SCJP","COOL"),"ABC");
  //System.out.print("HashMap 元素的內容 = ");
  //System.out.println(h.get(new Ball("JAVA","SCJP","COOL")));


  
  //釋放資源的方法.....
  System.gc();
  Runtime.getRuntime().gc();
  System.runFinalization();
  Runtime.getRuntime().runFinalization();
 }
}