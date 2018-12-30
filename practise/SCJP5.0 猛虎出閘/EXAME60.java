public class EXAME60
{
 public void testIfA()
 {
  if(testIfB("true"))
  {
   System.out.println("True");
  }
  else
  {
   System.out.println("Not True");
  }
 }
 public Boolean testIfB(String str)
 {
  return Boolean.valueOf(str);
 }
 public static void main(String argv[])
 {
 
 }
}