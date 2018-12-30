//Integer 只會在byte的範圍-128～127的資料內都會重複使用
//也就是heap區的資料指向同一筆............
//但是new Integer()產生的物件是無法使用其資料的..........
public class EqualsCompareTest2
{
 public static void main(String argv[])
 {
  Integer a1=Integer.valueOf(100);
  Integer a2=Integer.valueOf(100);
  Integer a3=100;
  Integer a4=100;
  
  System.out.println("Integer a1=Integer.valueOf(100);");
  System.out.println("Integer a2=Integer.valueOf(100);");
  System.out.println("Integer a3=100; ");
  System.out.println("Integer a4=100; ");
  System.out.println();
  System.out.println("其結果如下所示:");
  System.out.println("========================================");
  System.out.println("a1 == a2 : "+(a1==a2));
  System.out.println("a1.equals(a2) = "+a1.equals(a2));
  System.out.println("a3 == a4 : "+(a3==a4));
  System.out.println("a3.equals(a4) = "+a3.equals(a4));
  System.out.println("a1 == a3 : "+(a1==a3));
  System.out.println("a1.equals(a3) = "+a1.equals(a3));
 }
}