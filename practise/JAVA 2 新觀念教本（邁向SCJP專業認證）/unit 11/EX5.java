public class EX5
{
 public static void main(String argv[])
 {
  try
  {
   double i=Double.parseDouble(argv[0]);
   double j=Math.sqrt(i);
   System.out.println(i+" ������ڬ� "+j);
  }
  catch(ArrayIndexOutOfBoundsException aie)
  {
   System.out.println("�Х[�W�@�ƭȰѼƥH�D�����");
  }
  finally
  {
   System.out.println("���{����hong �s�@");
  }
 }
}