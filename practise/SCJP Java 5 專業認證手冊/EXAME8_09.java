public class EXAME8_09
{
 public static void main(String argv[])
 {
  Object o=new Object()
  {
   public boolean equals(Object obj)
   {
    return true;	
   }		
  }
  System.out.println(o.equals("Frend"));	
 }
}