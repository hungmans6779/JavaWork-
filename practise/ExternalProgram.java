public class ExternalProgram
{
 public static void main(String argv[])
 {
  int i=Integer.parseInt(argv[0]);
  System.out.println("我被執行到了.....");
  System.exit(i);
 }
}