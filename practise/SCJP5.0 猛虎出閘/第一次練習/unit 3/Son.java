class Father
{
 String name="Father";
 String getName()
 {
 	return name;
 }		
 String geeting()
 {
 	return "class Father";
 }	
}	

public class Son extends Father
{
 String name="Son";
 String geeting()
 {
 	return "class Son";
 }		
 public static void main(String argv[])
 {
 	System.out.println("�H���˪��[�I�ݤ��˦ۤv");
 	Father father=new Father();
 	System.out.println(father.geeting()+","+father.name+","+father.getName());
 	System.out.println();
 	System.out.println("�H���˪��[�I�ݨ�l");
 	Father father1=new Son();
 	System.out.println(father1.geeting()+","+father1.name+","+father1.getName());
 }	
}	