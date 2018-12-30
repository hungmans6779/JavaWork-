class Animal
{
 void makeNoise()
 {
  System.out.println("geteric noise");
 }
}

class Dog extends Animal
{
 void makeNoise()
 {
  System.out.println("back");
 }
 void playDead()
 {
  System.out.println("roll over");
 }
}

public class CastingTest1
{
 public static void main(String argv[])
 {
 	Animal a[]={new Animal(),new Dog(),new Animal()};
 	for(Animal animal:a)
 	{
 	 animal.makeNoise();
 	 if(animal instanceof Dog)
 	 {
 	 	((Dog)animal).playDead();
 	 }		
 	}	
 }		
}