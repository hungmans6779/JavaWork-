public class EX12
{
 public static void main(String argv[])
 {
  Fish a=new Fish();
  Vertebrate b=new Fish();
  Animal c=new Fish();
  System.out.println("a = "+a);
  System.out.println("b = "+b);
  System.out.println("c = "+c);
 }
}

class Animal{}
class Vertebrate extends Animal{}
class Fish extends Vertebrate{}