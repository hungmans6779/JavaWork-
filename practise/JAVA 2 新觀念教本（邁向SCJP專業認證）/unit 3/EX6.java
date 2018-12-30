class EX6
{
 public static void main(String argv[])
 {
  char level=65;
  System.out.println(level>=60?"恭禧，您過了！":"沒過，您要加油喔！");
  level=level<60?'丁':level;
  level=level<70?'丙':level;
  level=level<80?'乙':level;
  level=level<90?'甲':level;
  level=level<=100?'優':level;
  System.out.println("您的成績是 : "+level);
 }
}