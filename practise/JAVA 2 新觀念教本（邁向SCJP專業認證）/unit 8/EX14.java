public class EX14
{
 public static void main(String argv[])
 {
  Fish �p��=new Fish();
  Animal �j��=new Animal();
  System.out.println("�p���O��հʪ� : "+(�p�� instanceof 	Vertebrate));
  System.out.println("�p���O�ʪ� : "+(�p�� instanceof Animal));
  System.out.println("�j���O��հʪ� : "+(�j�� instanceof Vertebrate));
  System.out.println("�j���O�� : "+(�j�� instanceof Fish));
 }
}

class Animal{}
class Vertebrate extends Animal{}
class Fish extends Vertebrate{}