public class EXAME8_11
{
 public static void main(String argv[])
 {
  class Horse
  {
   String name;	
   public Horse(String s)
   {
   	name=s;
   }		
  }
  Object o=new Horse("zippo");
  Horse h=(Horse)o;
  System.out.println(o.name);	 	
 }	
}