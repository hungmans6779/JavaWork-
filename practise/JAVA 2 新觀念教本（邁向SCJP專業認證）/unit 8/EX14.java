public class EX14
{
 public static void main(String argv[])
 {
  Fish 小紅=new Fish();
  Animal 大黃=new Animal();
  System.out.println("小紅是脊椎動物 : "+(小紅 instanceof 	Vertebrate));
  System.out.println("小紅是動物 : "+(小紅 instanceof Animal));
  System.out.println("大紅是脊椎動物 : "+(大黃 instanceof Vertebrate));
  System.out.println("大紅是魚 : "+(大黃 instanceof Fish));
 }
}

class Animal{}
class Vertebrate extends Animal{}
class Fish extends Vertebrate{}