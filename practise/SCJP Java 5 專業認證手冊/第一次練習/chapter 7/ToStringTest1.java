public class ToStringTest1
{
 String name;
 int age;	
 public static void main(String argv[])
 {
  ToStringTest1 tst=new ToStringTest1("Hong",29);
  System.out.println(tst);
 }
 ToStringTest1(String name,int age)
 {
 	this.name=name;
 	this.age=age;
 }	
 public String toString()
 {
 	return "�ڪ��W�r�s : "+name+" ���~ : "+age+" ���F";
 }	
}