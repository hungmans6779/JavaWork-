public class EX1
{
 public static void main(String argv[])
 {
  MyDog dog=new MyDog("�p�J");
  System.out.println("�ڪ��R�ӥs ; "+dog.name);
  System.out.println("�p�J���s�n�� : "+dog.getSound());
  System.out.println("�p�J�]���t�׬� : "+dog.getSpeed());
 }
}

class Animal
{
 public String name;
 Animal(String name)
 {
  this.name=name;
 }
}
interface Pet
{
 int slow=4;
 int midspeed=12;
 int fast=20;
 String getSound();
 int getSpeed();
}

class MyDog extends Animal implements Pet
{
 MyDog(String name)
 {
  super(name);
 }
 public String getSound()
 {
  return "����";
 }
 public int getSpeed()
 {
  return fast;
 }

}
