public class EX3
{
 public static void main(String argv[])
 {
  try
  {
   int i=Integer.parseInt(argv[0]);
   int j=Integer.parseInt(argv[1]);
   int k=i%j;
   System.out.println(i+"%"+j+" = "+k);
  }
  catch(ArithmeticException ae)
  {
   System.out.println("���Ƥ��i��0");
  }
  catch(ArrayIndexOutOfBoundsException aie)
  {
   System.out.println("�Х[�W��Ӿ�ưѼƥH���D�l�ƪ��B��");	
  }	
  catch(NumberFormatException ne)
  {
   System.out.println("�Х[�W��ӡi��ơj�Ѽ�");	
  }	
  catch(RuntimeException re)
  {
   System.out.println("�o�Ͱ���ɴ��ҥ~ : "+re);	
  }	
 }
}