class Dog {}
class Beagle extends Dog {}

public class EXAME2_13
{
 public static void main(String argv[])
 {
  Beagle b1=new Beagle();
  Dog dog1=new Dog();
  Dog dog2=b1;
  Beagle b2=(Beagle)dog1; //�sĶ�|�L�A������ɴ��|�o�ͫ��O�ഫ���~
  Beagle b3=(Beagle) dog2;
  // Beagle b4=dog2; //�sĶ���|�L
 }
}