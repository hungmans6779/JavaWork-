import Impact.OutClassEnum.Week;
public class ImportStaticTest3
{
 public static void main(String argv[])
 {
  System.out.println(Week.Sunday);
  Week w1[]=Week.values();
  for(Week w:w1)
  {
   System.out.print(w+"\t");	
  }	
 }
}