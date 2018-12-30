import java.io.*;
public class EXAME2_2
{
  int next;
  String name;
  String mobile;
  String email;
  EXAME2_2 ex;
  public static void main(String argv[])
  {
   int num=1;
   int num1=1;
   InputStreamReader in=new InputStreamReader(System.in);
   BufferedReader bin=new BufferedReader(in);
   try
   {
    System.out.print("請輸入要鏈結的資料數目 ： ");
    String str=bin.readLine(); 
    num=Integer.parseInt(str);
    num1=num;
   }
   catch(IOException ioe)
   {
    ioe.printStackTrace();
   }
   EXAME2_2 ex=new EXAME2_2();
   EXAME2_2 obj=ex;
   int count=1;
   while(num>0)
   {
    ex.next=count;
    ex.name="name "+String.valueOf(count);
    ex.mobile="mobile "+String.valueOf(count);
    ex.email="email "+String.valueOf(count);
    ex.ex=new EXAME2_2();
    count++;
    num-=1;
  }
  listData(obj,num1);
 }
  public static void listData(EXAME2_2 ex,int num1)
  {
   for(int i=0;i<num1;i++)
   {
    System.out.print(ex.next+"\t"+ex.name+"\n");
    ex=ex.ex;
   }
  }



}