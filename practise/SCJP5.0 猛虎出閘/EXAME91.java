public class EXAME91
{
 public static void main(String argv[])
 {
 	Object o=new Object();
 	o=null;
  new EXAME91().someMethod(o);
 }
 public void someMethod(Object value)
 {
  //assert value==null;
  if(value==null) 
  {
   throw new IllegalArgumentException("value is null");	
  }	
  System.out.println(value.getClass());	
 }
}