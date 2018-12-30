public class EX31
{
 enum YourColor
 {
  PINK,IVORY,ORANGE,WHITE,GOLDEN
 }
 public static void main(String argv[])
 {
  for(YourColor yc:YourColor.values())
  {
   System.out.print(yc+"\t");
  }
 }
}