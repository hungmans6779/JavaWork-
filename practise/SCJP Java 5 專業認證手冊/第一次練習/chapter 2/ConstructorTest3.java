class Animal
{
 String name;
 Animal(String name)
 {
  this.name=name;
 }
 Animal()
 {
  this(randomName());
 }
 static String randomName()
 {
  int x=(int)(Math.random()*5);
  String name=new String[]{"One","Two","Three","Four","Five"}[x];
  return name;
 }
}

public class ConstructorTest3
{
 public static void main(String argv[])
 {
  Animal a=new Animal("Flower");
  System.out.println(a.name);
  Animal b[]=new Animal[10000];
  for(int i=0;i<9999;i++)
  {
   b[i]=new Animal();
   System.out.println(b[i].name);
  } 
 }
}