class Puppy
{
 static String name="�p��";
 static String kind="�ԥ��Ԩ���";
 static void skill1()
 {
  System.out.println("�����ȻP���c"); 
  //return "test";
  return;
 }
 static String skill2()
 {
  String skill="�|�]�|�s";
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
  System.out.println("���O"+dogKind+"�A�W�r�s"+dogName+",���|"+skill);
  Puppy.skill2();
  Puppy.skill1();
 }
}