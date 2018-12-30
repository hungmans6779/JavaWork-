import java.util.*;
public class EX9
{
 public static void main(String argv[])
 {
  String names[]={"Carl","Jones","Kelly","Andy","Edward","Sophia","Monica","Albert","Jason"};
  Arrays.sort(names);
  List<String>list=Arrays.asList(names);
  System.out.println(list);
  System.out.println(Arrays.binarySearch(names,"Carl"));
  System.out.println(Arrays.binarySearch(names,"Daphne"));
 }
}