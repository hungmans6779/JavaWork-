public class Zoo
{
 public static void main(String argv[])
 {
  System.out.println("\n用鳥的類別去宣告，但是是用駝鳥產生物件.....");
  System.out.println("Bird bird=new Ostrich()");
  System.out.print("所以駝鳥移動方式為 ") ;
  Bird bird=new Ostrich();
  //((Bird)ostrich).move();
  //((Animal)ostrich).move();
  bird.move();
  System.out.print("駝鳥的特殊行為 ") ;
  bird.hideHead();
  
  System.out.print("\n小鳥移動方式為 ") ;
  Bird bird1=new Bird();
  bird1.move();
  System.out.print("小鳥的特殊行為 ") ;
  bird1.hideHead();
  
  System.out.print("\n駝鳥移動方式為 ") ;
  Ostrich ostrich=new Ostrich();
  ostrich.move();

  System.out.print("\n獅子移動方式為 ") ;
  Lion lion=new Lion();
  lion.move();
  System.out.print("\n魚兒移動方式為 ") ;  
  Fish fish=new Fish();
  fish.move();
 }
}