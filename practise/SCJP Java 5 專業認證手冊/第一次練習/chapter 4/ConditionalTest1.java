public class ConditionalTest1
{
 public static void main(String argv[])
 {
 	int size=10;
  int numof=3;
  String status=(numof>4)?"Pet count OK":(size>8)?"Pet limit on the edge":"too many pets";
  System.out.println("Pet status is "+status);
 }
}