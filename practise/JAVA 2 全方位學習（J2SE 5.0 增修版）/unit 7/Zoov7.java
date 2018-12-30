public class Zoov7
{
 public static void main(String argv[])
 { 
  Fishv7 fish1=new Fishv7(); 
  Fishv7 fish2=new Fishv7(); 
  Fishv7 fish3=new Fishv7(); 
  Fishv7 fish4=new Fishv7();   
  Birdv7 bird1=new Birdv7();
  Birdv7 bird2=new Birdv7();
  Ostrichv7 ostrich1=new Ostrichv7();
  Lionv7 lion1=new Lionv7();
  Lionv7 lion2=new Lionv7();
  System.out.println("Animal Class Production object has "+Animalv7.getCount());
  System.out.println("Fish Class Production object has "+Fishv7.getCount());
  System.out.println("Bird Class Production object has "+Birdv7.getCount());
  System.out.println("Lion Class Production object has "+Lionv7.getCount());
 }
}