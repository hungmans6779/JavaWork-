public class Zoov9
{
 public static void main(String argv[])
 { 
  Ostrichv9 ostrich=new Ostrichv9();
  ostrich.move();
  ((Birdv9)ostrich).move();
  ((Animalv9)ostrich).move();
 }
}