public class EX11
{
 public static void main(String argv[])
 {
  if(argv.length<2)
  {
   System.out.println("�п�J��Ӿ�ư����k�B��");
   return;
  }
  double m=Double.parseDouble(argv[0]);
  double n=Double.parseDouble(argv[1]);
  double r=m/n;
  assert !Double.isNaN(r):"�Ӥ��O�ƭ�";
  System.out.println(r);
 }
}