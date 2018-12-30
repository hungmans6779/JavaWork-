class Puppy2
{
 static String name="小黃";
 static String type="拉布拉多犬";
 static String color="米黃";
 static String skill()
 {
  //System.out.println("拿報紙與拎拖鞋");
  return "拿報紙與拎拖鞋";
 }
}

public class PeStore
{
 public static void main(String argv[])
 {
  String dogName=Puppy2.name;
  String dogKind=Puppy2.type;
  System.out.println("我有一隻聰明的"+dogKind+"犬，名字叫"+dogName+",它會"+Puppy2.skill());	
 }		
}	