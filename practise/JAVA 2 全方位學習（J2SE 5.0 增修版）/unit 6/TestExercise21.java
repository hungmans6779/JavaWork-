public class TestExercise21
{
 public static void main(String argv[])
 {
  String score[]={"コ","コ","コ","コ","コ","コ","�B","��","�A","ヒ"} ;
  System.out.println("Please input your score:");
  int inputData=Integer.parseInt(argv[0]);
  int value=inputData/10;
  System.out.println("Your score="+score[value]);
 }
}