public class PetStore2
{
 public static void main(String argv[])
 {
 	String dogName=Puppy2.dogName;
 	String dogType=Puppy2.dogType;
 	String color=Puppy2.color;
 	System.out.println("我有一隻"+dogType+",牠的名字叫"+dogName+","+Puppy2.skill());
 	String str=Puppy2.skill();
 	System.out.println(str);
 }		
}	