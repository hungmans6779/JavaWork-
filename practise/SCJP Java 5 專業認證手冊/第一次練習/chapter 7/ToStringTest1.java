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
 	return "我的名字叫 : "+name+" 今年 : "+age+" 歲了";
 }	
}