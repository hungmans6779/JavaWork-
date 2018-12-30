class Animal
{
 static void doStuff()
 {
  System.out.println("a");
 }
}

public class StaticOverrideTest21 extends Animal
{
 static void doStuff()
 {
  System.out.println("b");	
 }		
 public static void main(String argv[])
 {
  Animal animal[]={new Animal(),new StaticOverrideTest2(),new Animal()};
  for(int i=0;i<animal.length;i++)
  {
   animal[i].doStuff();	
  }	
 }
}