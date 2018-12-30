public class TestExercise21
{
 public static void main(String argv[])
 {
  String score[]={"¥³","¥³","¥³","¥³","¥³","¥³","¤B","¤þ","¤A","¥Ò"} ;
  System.out.println("Please input your score:");
  int inputData=Integer.parseInt(argv[0]);
  int value=inputData/10;
  System.out.println("Your score="+score[value]);
 }
}