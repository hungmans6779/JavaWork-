public class Zoov6
{
 public static void main(String argv[])
 {
  Animalv6 ostrich=new Ostrichv6();
  System.out.println(ostrich.getKind()+ " has "+ ostrich.getLegs() + " legs");
  ostrich.move();
  
  ((Ostrichv6)ostrich).hideHead();
  //Ostrichv6 ostrich1=new Ostrichv6();
 // ostrich1.hideHead();
  
  Birdv6 bird=new Birdv6();
  Fishv6 fish=new Fishv6();
  Lionv6 lion=new Lionv6();
  //測試bird的物件繼承關係.......
  System.out.print("bird object Inheritance Bird class =");
  System.out.println(bird instanceof Birdv6);
  System.out.print("bird object Inheritance Ostrich class =");
  System.out.println(bird instanceof Ostrichv6);  
  System.out.print("bird object Inheritance Animal class =");
  System.out.println(bird instanceof Animalv6);
  //測試ostrich的物件繼承關係.......
  System.out.print("ostrich object Inheritance Fish class =");
  System.out.println(ostrich instanceof Fishv6);
  System.out.print("ostrich object Inheritance Ostrich class =");
  System.out.println(ostrich instanceof Ostrichv6);
  System.out.print("ostrich object Inheritance Bird class =");
  System.out.println(ostrich instanceof Birdv6);
  System.out.print("ostrich object Inheritance Animal class =");
  System.out.println(ostrich instanceof Animalv6);
  //測試fish的物件繼承關係.......
  System.out.print("fish object Inheritance Fish class =");
  System.out.println(fish instanceof Fishv6);
  System.out.print("fish object Inheritance Animal class =");
  System.out.println(fish instanceof Animalv6);
  //測試lion的物件繼承關係.......
  System.out.print("lion object Inheritance Lion class =");
  System.out.println(lion instanceof Lionv6);
  System.out.print("lion object Inheritance Animal class =");
  System.out.println(lion instanceof Animalv6);
  
  //以下的程式段會產成invonvertible type (不能變換的轉型)的錯誤
  //以致不能編譯.....................................
  //System.out.print("bird object Inheritance Fish class =");
  //System.out.println(bird instanceof Fishv6);
  //System.out.print("bird object Inheritance Lion class =");
  //System.out.println(bird instanceof Lionv6);
 }
}