enum Grade 
{
 A
 {
  public String toString()
  {
   return "Greet";
  }
 } 
  ,B,C,D
}

public class EnumTest1
{
 public static void main(String argv[])
 {
  System.out.println(Grade.B);
  System.out.println(Grade.A);
  System.out.println(Grade.C.toString());
 }
}