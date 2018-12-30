enum Week
{
 Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday
}
public class EnumTest4
{
 public static void main(String argv[])
 {
  System.out.println(Week.Sunday);
  System.out.println("========================");
  Week w1=Week.Sunday;
  System.out.println(w1.Monday);
  System.out.println("========================");
  Week w2[]=Week.values();
  for(Week w:w2)
  {
   System.out.print(w+"\t");	
  }	
  System.out.println();
  System.out.println("========================");
  Week w3[]=Week.values();
  for(int i=0;i<w3.length;i++)
  {
   System.out.print(w3[i]+"\t");	
  }	
  System.out.println();
  System.out.println("========================"); 
  System.out.println(Week.valueOf("Tuesday"));
  System.out.println("========================"); 
  System.out.println(Week.valueOf(Week.class,"Wednesday"));
 }
}