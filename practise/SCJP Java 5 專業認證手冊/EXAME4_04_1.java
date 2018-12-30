public class EXAME4_04_1
{
 public static void main(String argv[])
 {
  if(argv.length==1 || argv[1].equals("test"))
  {
   System.out.println("test case");	
  }
  else
  {
   System.out.println("production "+argv[0]);	
  }	
 }
}