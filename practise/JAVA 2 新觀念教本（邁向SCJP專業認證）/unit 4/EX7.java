class EX7
{
 public static void main(String argv[])
 {
  if(argv.length<1)
  {
   System.out.println("請輸入參數，以點選您要的水果......");
   System.out.println("(a)蘋果(b)香蕉(c)鳳梨");
   System.exit(0);
  }
  char c=argv[0].charAt(3);
  switch(c)
  {
   case 'a':
    System.out.println("您點了蘋果");
    break;
   default:
    System.out.println("您不點喔！！！");
    break;
   case 'b':
    System.out.println("您點了香蕉");
    break;
   case 'c':
    System.out.println("您點了鳳梨");
    break;
  }	
 }
}