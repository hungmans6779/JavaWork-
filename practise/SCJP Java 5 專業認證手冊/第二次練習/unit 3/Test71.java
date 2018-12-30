public class Test71
{
 public static void main(String argv[])
 {
  Long l2=Long.parseLong("101010",2);
  System.out.println("l2="+l2);
  Long l3=Long.valueOf("101010",2);
  System.out.println("l3="+l3);
 }
}