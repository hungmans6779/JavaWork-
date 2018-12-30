class Target
{
 //private int i=0;
 private Integer i=0;
 public int addOne()
 {
  return ++i;
 }
}

public class EXAME145
{
 public static void main(String argv[])
 {
  System.out.println(new Target().addOne());
 }
}