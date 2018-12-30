interface Car{}
class Mazda implements Car{}

public class ArrayTest6_2
{
 public static void main(String argv[])
 {
  Car c[];
  Mazda m[]=new Mazda[3];
  c=m;
  //m=c;
 }
}