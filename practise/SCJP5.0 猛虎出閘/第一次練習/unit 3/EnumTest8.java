enum Week
{
 Sunday
 {
 	public String toString()
 	{
 	 return "�p���J";
 	}	
 }	
 ,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday
}
public class EnumTest8
{
 public static void main(String argv[])
 {
 	Week ww[]=Week.values();
 	for(Week w:ww)
 	{
   switch(w)
   {
    case Sunday:
     System.out.println(Week.Sunday);
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
}