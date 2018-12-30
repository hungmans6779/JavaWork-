public class MyObject implements Cloneable
{
 public int data;
 public MyObject(int i)
 {
  data=i;
 }
 public boolean equals(Object obj)
 {
  if(obj!=null && (obj instanceof MyObject ))
   if (this.data==((MyObject)obj).data)
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
  public String toString()
 {
  return "\nThis is a MyObject class's object.\n"+
         "Which with an int field 'data' with value= "+data;
         
 }
 //public void finalize()
// {
//  System.out.println("GC : "+data);
// }
}