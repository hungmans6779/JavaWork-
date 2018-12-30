public class AssertTest4
{
 public static void main(String argv[])
 {
  boolean enableA=false;
  assert(enableA=true);
  if(enableA)
   System.out.println("Assertion 已經打開了");
  else
   System.out.println("Assertion 尚未打開");	
 }
}