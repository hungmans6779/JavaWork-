public class Zoo
{
 public static void main(String argv[])
 {
  System.out.println("\n�γ������O�h�ŧi�A���O�O�ξm�����ͪ���.....");
  System.out.println("Bird bird=new Ostrich()");
  System.out.print("�ҥH�m�����ʤ覡�� ") ;
  Bird bird=new Ostrich();
  //((Bird)ostrich).move();
  //((Animal)ostrich).move();
  bird.move();
  System.out.print("�m�����S��欰 ") ;
  bird.hideHead();
  
  System.out.print("\n�p�����ʤ覡�� ") ;
  Bird bird1=new Bird();
  bird1.move();
  System.out.print("�p�����S��欰 ") ;
  bird1.hideHead();
  
  System.out.print("\n�m�����ʤ覡�� ") ;
  Ostrich ostrich=new Ostrich();
  ostrich.move();

  System.out.print("\n��l���ʤ覡�� ") ;
  Lion lion=new Lion();
  lion.move();
  System.out.print("\n���ಾ�ʤ覡�� ") ;  
  Fish fish=new Fish();
  fish.move();
 }
}