class Plant
{
 String getName(){ return "plant"; }
 Plant getType() {return this; }
}
class Flower extends Plant
{
 Plant getType() {return this; }
 //Flower getType() {return this; }
 //Tulip getType() {return new Tulip();}
 
 // �H�W�{���X���i�H�sĶ�L
}

class Tulip extends Flower
{

}

public class EXAME2_08_1
{
 public static void main(String argv[])
 {
  System.out.println(new Flower().getType());
 }
}