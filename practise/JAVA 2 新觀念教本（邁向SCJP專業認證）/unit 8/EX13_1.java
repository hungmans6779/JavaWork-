public class EX13_1
{
 public static void main(String argv[])
 {
  Vertebrate a[]=new Vertebrate[3];
  a[0]=new Vertebrate();
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