class Car{}
class Honda extends Car{}
public class Test4
{
 public static void main(String argv[])
 {
  Car h[]={new Car(),new Honda()};
  for(Car cc:h)
   System.out.println(cc);
 }
}