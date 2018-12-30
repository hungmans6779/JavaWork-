class Dog {}
class Beagle extends Dog {}
public class EXAME13
{
 public static void main(String argv[])
 {
  Beagle b1=new Beagle();
  Dog dog1=new Dog();
  Dog dog2=b1;
  Beagle b2=(Beagle)dog1;
  Beagle b3=(Beagle)dog2;
  //Beagle b4=dog2;
 }
}