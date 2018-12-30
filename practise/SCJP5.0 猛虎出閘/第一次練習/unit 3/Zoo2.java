class Animal
{
 public void move()
 {
  System.out.println("²¾°Ê......");
 } 
}

class Bird extends Animal
{
 public void move()
 {
  System.out.println("­¸......");
 }
}

class Cat extends Animal
{
 public void move()
 {
  System.out.println("¶]¶]¸õ¸õ.....");
 }
 public void skill()
 {
  System.out.println("¬~¾þ.....");
 }
}

class Tiger extends Cat
{
 public void skill()
 {
  System.out.println("¬¼Ây.....");
 }
}

public class Zoo2
{
 public static void main(String argv[])
 {
  Animal a=new Tiger();
  if (a instanceof Bird)
  {
   ((Bird)a).move();
  }
  else 
  {
   System.out.println("a instanceof Bird : "+(a instanceof Bird));
   System.out.println("µLªkÂà´«");	
  }	 
 }	
}