//���d�ҬO���~��
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
  System.out.println("�w���JStaticTest���O");
  //���~����]�b�󦹡I�I�I
  //�]��StaticTest()�غc�l����X�@�Өҥ~..........
  st=new StaticTest();
 }
 
 public StaticTest() throws Exception
 { 
 }

}
