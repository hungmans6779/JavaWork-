interface Dog {}
class Dog1 implements Dog{}
class Dog2 implements Dog{}
class Dog3 extends Dog1{}
class Dog4{}
public class ArrayTest5_1
{
 public static void main(String argv[])
 {
  Dog d[]={new Dog1(),new Dog2(),new Dog3()};
 }
}