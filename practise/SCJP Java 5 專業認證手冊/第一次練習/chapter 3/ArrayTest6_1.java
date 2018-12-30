class Car{}
class Mazda extends Car{}

public class ArrayTest6_1
{
 public static void main(String argv[])
 {
  Car c[];
  Mazda m[]=new Mazda[3];
  c=m;
  //m=c;
 }
}