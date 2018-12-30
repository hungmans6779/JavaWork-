class Puppy1
{
 static String dogType="拉布拉多犬";
 static String dogName="小黃";
 static String color="米黃";
 public static void skill()
 {
 	System.out.println("他每天都會幫我拿報紙和拎拖鞋");
 }	
}

public class PetStore
{
 public static void main(String argv[])
 {
 	String dogName=Puppy1.dogName;
 	String dogType=Puppy1.dogType;
 	String color=Puppy1.color;
 	System.out.println("我有一隻"+dogType+",牠的名字叫"+dogName+Puppy1.skill());
 }		
}	