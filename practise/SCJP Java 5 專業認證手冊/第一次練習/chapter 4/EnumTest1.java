public class EnumTest1
{
 enum Color{Red,Yellow,Blue}
 public static void main(String argv[])
 {
  Color c1=Color.Red;
  Color c2=Color.Red;
  if(c1==c2)
  {
   System.out.println("c1==c2 : "+(c1==c2));	
  }	
  if(c1.equals(c2))
  {
   System.out.println("c1.equals(c2) : "+(c1.equals(c2)));	
  }	
 }
}