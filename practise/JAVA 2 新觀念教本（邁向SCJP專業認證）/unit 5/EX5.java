class EX5
{
 public static void main(String argv[])
 {
 	String s[]={"�W�H","�{�q�L","�j��H","����T"};
  if(argv.length<1)
  {
   System.out.println("�жǤJ�z�̳߷R��Xman:");
   System.out.println("(0)�W�H (1)�{�q�L (2)�j��H (3)����T");
   System.exit(0);
  }
  int ch=Integer.parseInt(argv[0]);
  if(ch<0 || ch>=s.length)
  {
   System.out.println("�z����ܶW�X�d��I�A�Э��s���");
   System.exit(0);
  }
  System.out.println("�z��ܪ��O : "+s[ch]);
 }
}