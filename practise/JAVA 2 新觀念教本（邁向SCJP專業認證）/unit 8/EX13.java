public class EX13
{
 public static void main(String argv[])
 {
  Animal a[]=new Animal[3];
  a[0]=new Animal();
  a[1]=new Vertebrate();
  a[2]=new Fish();
  for(int i=0;i<3;i++)
  {
   System.out.println("a[ "+i+"] = "+a[i]);	
  }	
 }
}


class Animal{}
class Vertebrate extends Animal{}
class Fish extends Vertebrate{}