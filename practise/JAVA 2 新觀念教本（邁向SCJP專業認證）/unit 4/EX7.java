class EX7
{
 public static void main(String argv[])
 {
  if(argv.length<1)
  {
   System.out.println("�п�J�ѼơA�H�I��z�n�����G......");
   System.out.println("(a)ī�G(b)����(c)���");
   System.exit(0);
  }
  char c=argv[0].charAt(3);
  switch(c)
  {
   case 'a':
    System.out.println("�z�I�Fī�G");
    break;
   default:
    System.out.println("�z���I��I�I�I");
    break;
   case 'b':
    System.out.println("�z�I�F����");
    break;
   case 'c':
    System.out.println("�z�I�F���");
    break;
  }	
 }
}