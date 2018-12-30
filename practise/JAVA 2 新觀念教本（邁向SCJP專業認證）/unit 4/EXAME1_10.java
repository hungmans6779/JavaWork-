class EXAME1_10
{
 public static void main(String argv[])
 {
  char ch='C';
  switch(ch-1)
  {
   case 'C'-2: System.out.println("AAA"); break;
   case 'C'-1: System.out.println("BBB"); break;
   case 'C'-0: System.out.println("CCC"); break;
   default: System.out.println("DDD"); break;
  }
 }
}