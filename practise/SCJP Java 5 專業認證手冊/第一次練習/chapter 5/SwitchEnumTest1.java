public class SwitchEnumTest1
{
 enum Week{Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday}
 public static void main(String argv[])
 {
  Week w=Week.Friday;
  switch(w)
  {
   case Monday :
    System.out.println("�P���@");
    break;
   case Tuesday :
    System.out.println("�P���G");
    break;
   case Wednesday:
    System.out.println("�P���T");
    break;
   case Thursday:
    System.out.println("�P���|");
    break;
   case Friday:
    System.out.println("�P����");
    break;
   case Saturday :
    System.out.println("�P����");
    break;
   case Sunday:
    System.out.println("�P����");
    break;
   default:
    System.out.println("�z�O�~�P�Ӫ��ܡH");
  }	
 }
}