public class EX1
{
 public static void main(String argv[])
 {
  MyDog dog=new MyDog("小仔");
  System.out.println("我的愛太叫 ; "+dog.name);
  System.out.println("小仔的叫聲為 : "+dog.getSound());
  System.out.println("小仔跑的速度為 : "+dog.getSpeed());
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
  return "旺旺";
 }
 public int getSpeed()
 {
  return fast;
 }

}
