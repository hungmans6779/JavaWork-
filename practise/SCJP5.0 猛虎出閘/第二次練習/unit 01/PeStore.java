class Puppy2
{
 static String name="�p��";
 static String type="�ԥ��Ԧh��";
 static String color="�̶�";
 static String skill()
 {
  //System.out.println("�����ȻP���c");
  return "�����ȻP���c";
 }
}

public class PeStore
{
 public static void main(String argv[])
 {
  String dogName=Puppy2.name;
  String dogKind=Puppy2.type;
  System.out.println("�ڦ��@���o����"+dogKind+"���A�W�r�s"+dogName+",���|"+Puppy2.skill());	
 }		
}	