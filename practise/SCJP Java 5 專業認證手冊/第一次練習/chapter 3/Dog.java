class Animal
{
 int age=10;
 private String color="Yellow";
 private void eat()
 { System.out.println("Animal eat.......");}	
 static void run()
 { System.out.println("會動........."); }
}
class Dog extends Animal
{
 int age=20;	
 String color="Blue";
 static void eat()
 { System.out.println("Dog eat........."); }		
 static void run()
 { System.out.println("追著您跑........."); }
 public static void main(String argv[])
 {
  Animal a=new Dog();
  //System.out.println(a.color);
  System.out.println(a.age);
  //a.eat();
  a.run();
 }
}