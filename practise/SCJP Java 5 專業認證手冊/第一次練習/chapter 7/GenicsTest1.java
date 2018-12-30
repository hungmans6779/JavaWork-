import java.util.*;
//�b��ƪ��޼Ʀ����w�x��������U�A�ǤJ�ȥu�ର�Ӫx��
//�����O�]�x���O����d�h���^
//�b�~�Ӫ����Y����U�ACollection�i�H�s��l���O������
class Animal
{
 public void eat()
 {
  System.out.println("Animal eat");
 }
}

class Dog extends Animal
{
 public void eat()
 {
  System.out.println("Dog eat");
 }
}

public class GenicsTest1
{
 public static void main(String argv[])
 {
  List<Animal> animal=new ArrayList<Animal>();
  List<Dog> dog=new ArrayList<Dog>();
  animal.add(new Animal());
  animal.add(new Dog());
  dog.add(new Dog());
  dog.add(new Dog());
  test(animal);
  test(dog);
 }
 public static void test(List<?>list)
 {
  for(Object a:list)
  {
   if(a instanceof Animal)
   {
    ((Animal)a).eat();
   }
  }
 }
}