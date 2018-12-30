class Plant
{
 String getName(){ return "plant"; }
 Plant getType() {return this; }
}
class Flower extends Plant
{
 //Plant getType() {return this; }
 //Flower getType() {return this; }
 Tulip getType() {return new Tulip();}
}

class Tulip extends Flower
{

}

public class EXAME2_08
{
 public static void main(String argv[])
 {
 
 }
}