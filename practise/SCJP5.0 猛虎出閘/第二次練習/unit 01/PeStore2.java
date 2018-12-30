class Puppy
{
 static String name="小黃";
 static String kind="拉布拉貝犬";
 static void skill1()
 {
  System.out.println("拿報紙與拎拖鞋"); 
  //return "test";
  return;
 }
 static String skill2()
 {
  String skill="會跑會叫";
  return skill;
 }
}

public class PeStore2
{
 public static void main(String argv[])
 {
  String dogName=Puppy.name;
  String dogKind=Puppy.kind;
  String skill=Puppy.skill2();
  System.out.println("它是"+dogKind+"，名字叫"+dogName+",它會"+skill);
  Puppy.skill2();
  Puppy.skill1();
 }
}