public class EnumT2
{
 private static enum Week
 {
  Sunday,
  Monday,
  Tuesday,
  Wednesday,
  Thursday,
  Friday
  {
   public String toString()
   {
   	return "�U�l�d�P����";	
   }	
  }
  ,
  Saturday
 }
 public static void main(String argv[])
 {
 	for(Week w:Week.values())
 	{
 		
 	 System.out.print(w+" : "); 	
 	 switch(w)
 	 {
 	  case Sunday:
 	   System.out.println("�P���@�U�l��s��");
 	   break;
    case Monday:
  	 System.out.println("�P���G�U�l�{�l�j");
  	  break;
  	case Friday:
  	 System.out.println();
  	 System.out.println("==========================");
  	 System.out.print(Week.Friday);
  	 System.out.println("�O�u����...............");
  	 System.out.println("==========================");
  	 break;  
 	  default:
 	   System.out.println("�i�o�A�g�F�r.......��");
 	   break; 	
 	 }	
 	}
 }
} 