class Test2
{
 public static void main(String argv[])
 {	
   final int a=5;
  char c='A';
  switch(c)
  {
   case 1:
    System.out.println("1");
    break;	
   case '��':
    System.out.println("��");
    break;
   case 'A':
    System.out.println("A");
    break;	
   case a:
    System.out.println("5");
    break; 
   default:
    System.out.println("�S���z�ҫ��w���ﶵ");
    break; 
  }	
 } 
}