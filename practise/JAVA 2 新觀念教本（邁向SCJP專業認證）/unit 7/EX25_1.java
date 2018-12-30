//此範例是錯誤的
public class EX25_1
{
 public static void main(String argv[])
 {
  System.out.println(StaticTest.st.i);
 }
}

class StaticTest
{
 int i=3;
 static StaticTest st;
 static
 {
  System.out.println("已載入StaticTest類別");
  //錯誤的原因在於此！！！
  //因為StaticTest()建構子有表出一個例外..........
  st=new StaticTest();
 }
 
 public StaticTest() throws Exception
 { 
 }

}
