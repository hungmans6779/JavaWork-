public class InnerEnumTest2
{
 public enum Week
 {Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday}
 public static void main(String argv[])
 {
  switch(Week.Monday)
  {
   case Monday:
    System.out.println("�P���@ �U�l��s��");
    break;
    
   case Tuesday:
    System.out.println("�P���G �U�l�h�N��");
    break;
   
   case Wednesday:
    System.out.println("�P���T �U�l�h���s");
    break;
   
   default:
    System.out.println("�������F....");
    break;
  
  }
 }

}