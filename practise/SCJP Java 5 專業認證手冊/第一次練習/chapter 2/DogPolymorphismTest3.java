//import java.io.*;
class Animal 
{
 public void eat() 
 {
  System.out.println("Animal eat");
  //File f=new File("1.txt");
 }
}
public class DogPolymorphismTest3 extends Animal
{
 public void eat() throws ArrayIndexOutOfBoundsException
 {
 	//File f=new File("2.txt");
  System.out.println("Dog eat");
 }
 public static void main(String argv[]) throws Exception
 {
  Animal a=new DogPolymorphismTest3();
  a.eat();
 }
}