class Animal
{
 int legs=2;	
 void aMethod()
 {
  System.out.println(2);
 }
 void bMethod(String s,int i)
 {
 	 System.out.println(1);
   System.out.println("s= "+s+"i= "+i);	
 }
}
public class DogTest2 extends Animal
{
 int legs=4;
 void aMethod()
 {
 	System.out.println(22);
 }
 String aMethod(String s)
 {return s; }
 void aMethod(int i)
 {}
 void bMethod(String s,int i)
 {
 	System.out.println(2);
  System.out.println("s= "+s+",i= "+i);	
 }
 void bMethod(int i,String s)
 {
  System.out.println(3);
  System.out.println("s= "+s+",i= "+i);		
 }
 public static void main(String argv[])
 {
 	DogTest2 d=new DogTest2();
  d.aMethod();
  d.bMethod("dog",3);
  d.bMethod(4,"cat");
  ((Animal)d).bMethod("lion",5);
  //((Animal)d).bMethod(5,"bird");
  System.out.println(d.legs);
  System.out.println(((Animal)d).legs);
 }	
}