public class SwitchTest1
{
 public static void main(String argv[])
 {
  int x=2;
  switch(x)
  {
   case 0:
    System.out.println("x=0");
    break;
   case 1:
    System.out.println("x=1");
    break;
   case 2:
    System.out.println("x=2");
    break;
   default:
    System.out.println("x<0�Ϊ�x>2");
    break;
   } 
 }
}