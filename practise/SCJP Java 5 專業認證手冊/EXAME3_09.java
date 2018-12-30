public class EXAME3_09
{
 static  final long tooth=343L;
 static long doIt(long tooth)
 {
 	tooth=1;
  System.out.print(++tooth+" ");
  return ++tooth;
 }
 public static void main(String argv[])
 {
  System.out.print(tooth+" ");
  final long tooth=340L;
  new EXAME3_09().doIt(tooth);
  System.out.println(tooth);
 }
}