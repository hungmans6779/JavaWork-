public class SwitchTest2
{
 public static void main(String argv[])
 {
  char c='A';
  switch(c)
  {
   case 1:
    System.out.println("A");
    break;
   case '1':
    System.out.println("B");
    break;
   case 'A':
    System.out.println("C");
    break;
   case '¤¤':
    System.out.println("D");
    break;
   default:
    System.out.println("E");
    break;
  } 
 }
}