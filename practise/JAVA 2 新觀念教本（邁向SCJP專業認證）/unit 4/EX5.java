class EX5
{
 public static void main(String argv[])
 {
  int age,sex;
  if(argv.length<2)
  {
   System.out.println("�п�J�z���~���ΩʧO");
   System.out.println("�ʧO�H0(�k��)��1�]�k�͡^���");
   System.exit(0);
  }
  age=Integer.parseInt(argv[0]);
  sex=Integer.valueOf(argv[1]).intValue();
  if(age>=12)
  {
   if(sex==0)
   {
   	System.out.println("�k�Ͳ��� : 50��");
   }		
   else
   {
   	System.out.println("�k�Ͳ���  :60��");
   }	
  }
  else
  {
   System.out.println("�~���Ӥp����i�J..........");	
  }		
 }
}