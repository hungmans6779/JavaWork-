class Puppy1
{
 static String dogType="�ԥ��Ԧh��";
 static String dogName="�p��";
 static String color="�̶�";
 public static void skill()
 {
 	System.out.println("�L�C�ѳ��|���ڮ����ȩM���c");
 }	
}

public class PetStore
{
 public static void main(String argv[])
 {
 	String dogName=Puppy1.dogName;
 	String dogType=Puppy1.dogType;
 	String color=Puppy1.color;
 	System.out.println("�ڦ��@��"+dogType+",�e���W�r�s"+dogName+Puppy1.skill());
 }		
}	