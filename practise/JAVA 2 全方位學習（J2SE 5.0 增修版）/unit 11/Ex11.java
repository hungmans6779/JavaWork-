import java.io.*;
public class Ex11
{
 static int projectCount=0;
 static int figure=0;
 public static void main(String argv[])
 {
  Author.showAuthor();
  InputStreamReader ir=new InputStreamReader(System.in);
  BufferedReader br=new BufferedReader(ir);
  System.out.print("請輸入您所要比較的資料數目 = ");
  try
  {
   do
   {
    if (projectCount==0)
    {
     figure=Integer.parseInt(br.readLine());
     System.out.println("您總共要比較 "+figure+" 數目！");
     System.out.println("\n您輸入的範圍值只能在-2147483648 ～ 2147483647 喔...");
    }
    else
    {
     int inputCount[]=new int[figure];
     long value=0;
     for (int i=0;i<figure;i++)
     {
      System.out.print("請輸入您的第 "+(i+1)+" 個數字 =");
      value=Long.parseLong(br.readLine());
      if(value>=2147483647 || value<=-2147483648)
      {
       System.out.println("\n===================================================");
       System.out.println("您輸入的值只能在-2147483648 ～ 2147483647 的範圍...");
       System.out.println("請重新輸入您的數值吧！！！");
       System.out.println("===================================================");
       i--;
      }
      else
      {
       inputCount[i]=(int)value;
      } 
     }
     System.out.println("\n\n\n\n\n");
     System.out.print("您輸入的 "+figure+" 個數字分別為：");
     for (int i=0;i<figure-1;i++)
     {
      System.out.print(inputCount[i]+" , ");
     } 
     System.out.print(inputCount[figure-1]);
     int max=inputCount[0];
     for(int i=0;i<figure;i++)
     {
      if(inputCount[i]>=max)
      {
       max=inputCount[i];
      }
     }
     System.out.println("\n");
     System.out.println("嗯！最大值就是 = "+max); 
    }
    projectCount++;
   }while(projectCount<2);
  
  }
  catch(IOException e)
  {
   e.printStackTrace();
  }
 
 }

}