class Animal
{
 Object getN()
 {
  return "Animal";
 }
}

class OverrideTest1 extends Animal
{
 String getN()
 {
  return "OverrideTest1";
 }
 public static void main(String argv[])
 {
  Animal a=new OverrideTest1();
  System.out.println(a.getN());
 }
}