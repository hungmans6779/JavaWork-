import java.io.*;;
class Food implements Serializable {int good = 3; }
class Fruit extends Food {int juice=5; }
public class EXAME95 extends Fruit
{
 int yellow=4;
 public static void main(String argv[])
 {
  EXAME95 b=new EXAME95();
  EXAME95 b2=new EXAME95();
  b.serializeBanana(b);
  b2=b.deserializeBanana();
  System.out.println("restore :"+b2.yellow+b2.juice+b2.good);
 }	
}