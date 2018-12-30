class Dog {}
class Dog1 extends Dog{}
class Dog2 extends Dog{}
class Dog3 extends Dog1{}
public class ArrayTest5
{
 public static void main(String argv[])
 {
  Dog d[]={new Dog(),new Dog1(),new Dog2(),new Dog3()};
 }
}