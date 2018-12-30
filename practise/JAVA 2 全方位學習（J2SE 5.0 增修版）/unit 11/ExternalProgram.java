public class ExternalProgram
{
 public static void main(String argv[])
 {
  int i=Integer.parseInt(argv[0]);
  Runtime.getRuntime().exit(i);
  //System.exit(i);
 }
}