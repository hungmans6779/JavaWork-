enum Week
{
 Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday
}
public class EnumTest6
{
 public static void main(String argv[])
 {
  switch(Week.Sunday)
  {
   case Sunday:
    System.out.println("�P���@");
    break;
   case Monday:
    System.out.println("�P���G");
    break;
   case Tuesday:
    System.out.println("�P���T");
    break;
   default:
    System.out.println("�z��J����ƿ��~..........");
    break; 	
  	
  }	
 }
}