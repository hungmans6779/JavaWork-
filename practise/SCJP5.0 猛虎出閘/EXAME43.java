class Test
{
 public enum Direction {NORTH,SOUTH,EAST,WEST}
}

public class EXAME43
{
 public static void main(String argv[])
 {
  Test.Direction d=Test.Direction.NORTH;
  System.out.println("d = "+d);
 }
}