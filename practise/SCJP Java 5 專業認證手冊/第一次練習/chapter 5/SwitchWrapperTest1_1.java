public class SwitchWrapperTest1_1
{
 public static void main(String argv[])
 {
  switch(new Integer(10))
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
    System.out.println("生我之時我是誰！生我之前誰是我");	
  }	
 }
}