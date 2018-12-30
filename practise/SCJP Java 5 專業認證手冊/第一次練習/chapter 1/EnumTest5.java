public class EnumTest5
{
 enum CoffeeSize
 {
  BIG,HUGE,OVERWHELMING
 }
 public static void main(String argv[])
 {
  CoffeeSize v[]=CoffeeSize.values();
  for(CoffeeSize k:v)
  {
   System.out.print(k+"\t");	
  }	
 }

}