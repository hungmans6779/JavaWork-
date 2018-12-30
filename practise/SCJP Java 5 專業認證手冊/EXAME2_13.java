class Dog {}
class Beagle extends Dog {}

public class EXAME2_13
{
 public static void main(String argv[])
 {
  Beagle b1=new Beagle();
  Dog dog1=new Dog();
  Dog dog2=b1;
  Beagle b2=(Beagle)dog1; //編譯會過，但執行時期會發生型別轉換錯誤
  Beagle b3=(Beagle) dog2;
  // Beagle b4=dog2; //編譯不會過
 }
}