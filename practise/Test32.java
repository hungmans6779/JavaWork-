public class Test32
{
 int i=10;   //實例變數
 static int si=20; //類別變數
 public static void main(String argv[])
 {
  int i=30;
  System.out.println(i);

  for(i=1;i<=40;i++)
  {
   System.out.println(i);	
  }	
 }
 public int getValue()
 {
  return i;
 }
}


/*
變數有4個等級
1.類別變數
2.實例變數
3.方法變數
4.區域變數
*/