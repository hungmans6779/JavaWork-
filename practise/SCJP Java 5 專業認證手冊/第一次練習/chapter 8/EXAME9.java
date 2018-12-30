public class EXAME9
{
 public static void main(String argv[])
 {
  Object o=new Object()
  {
   public boolean equals(Object o)
   {
    return true;
   }
  };
  System.out.println(o.equals("FF"));
 }
}