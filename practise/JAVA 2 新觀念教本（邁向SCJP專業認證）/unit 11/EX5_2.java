public class EX5_2
{
 public static void main(String argv[])
 {
  try
  {
   if(argv.length<1)
    throw new ArrayIndexOutOfBoundsException("�Х[�W�@�ƭȰѼƥH�D�����");
   double i=Double.parseDouble(argv[0]);
   double j=Math.sqrt(i);
   System.out.println(i+" ������ڬ� "+j);
  }
  catch(ArithmeticException aie)
  {
   System.out.println("�ƭȿ��~");
  }
  finally
  {
   System.out.println("���{����hong �s�@");
  }
 }
}