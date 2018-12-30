public class MyObjectv6 implements Cloneable
{
 public int data;
 public MyObjectv6(int i)
 {
  data=i;
 }
 public boolean equals(Object obj)
 {
  if(obj!=null && (obj instanceof MyObjectv6))
   if (this.data==((MyObjectv6)obj).data)
     return true;
   
    return false;    
 }
  public int hashCode()
  {
    return(new Integer(data).hashCode());
  }
  
  
 public Object clone()
 {
  try
   {
    return super.clone();
   }
  catch (CloneNotSupportedException e)
  {
    System.out.println(e);
    return null;
  } 
 } 
}