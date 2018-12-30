public class EX15
{
 public static void main(String argv[])
 {
 	//父類別的物件不能轉換成子類別的參考
 //	Animal aa=new Animal();
 //	Fish ff=(Fish)aa;
  Fish f=new Fish();
  Animal a=f;
  Vertebrate v=(Vertebrate)a;
  //Vertebrate v1=a;
  Fish f2=(Fish)a;
  //Fish f3=a;
  System.out.println("a = "+a);
  System.out.println("v = "+v);
  System.out.println("f2 = "+f2);
 }
}

class Animal{}
class Vertebrate extends Animal{}
class Fish extends Vertebrate{}