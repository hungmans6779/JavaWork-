public class EX25
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
  try
  {
   st=new StaticTest();
  }
  catch(Exception e)
  {
  
  }
 }
 
 public StaticTest() throws Exception
 {
 
 }

}