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
   case '中':
    System.out.println("中");
    break;
   case 'A':
    System.out.println("A");
    break;	
   case a:
    System.out.println("5");
    break; 
   default:
    System.out.println("沒有您所指定的選項");
    break; 
  }	
 } 
}