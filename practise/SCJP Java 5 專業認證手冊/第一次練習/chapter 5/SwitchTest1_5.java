public class SwitchTest1_5
{
 public static void main(String argv[])
 {
  double i=10;
  switch((int)i)
  {
   case 2:
    System.out.println("2");
    break;
   case 10:
    System.out.println("10");
    break;
   case 12:
    System.out.println("12");
    break;
   default:
    System.out.println("我不知道了呀");
    break;
  }
 }
}