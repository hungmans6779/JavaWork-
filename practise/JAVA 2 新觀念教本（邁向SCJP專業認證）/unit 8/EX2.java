public class EX2
{ 
 public static void main(String argv[])
 {
  學生 a=new 學生();
  System.out.println(a.學號);
  System.out.println(a.姓名);
  System.out.println(a.生日);
  a.showAtt();
 }
}

class 個人 
{
 String 姓名="李小明";
 String 生日="1990-01-01";
 void showAtt()
 {
  System.out.println("姓名 : "+姓名+",生日 : "+生日);
 }
}

class 學生 extends 個人
{
 int 學號=9012345;
}