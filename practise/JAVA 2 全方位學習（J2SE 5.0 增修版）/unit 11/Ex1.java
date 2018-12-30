import java.io.*;
public class Ex1
{
 static int a,b,sum;
 static int inputCount=0;
 public static void main(String argv[])
 {
  Author.showAuthor();
  System.out.println("請依序分別輸入您的a及b值");
  InputStreamReader ir=new InputStreamReader(System.in);
  BufferedReader br=new BufferedReader(ir);
  do
  {
   try
   {
    if(inputCount==0)
    { 
     System.out.print("您輸入的 a 值 = ");
     a=Integer.parseInt(br.readLine()); 
    }
    else
    {
     System.out.print("您輸入的 b 值 = ");
     b=Integer.parseInt(br.readLine());
    }
    inputCount++; 
   }
   catch(IOException e)
   {
    e.printStackTrace();
   }
  }while (inputCount < 2); 
  
  if(a>b)
  {
   for (int i=b;i<=a;i++)
   {
     sum+=i;
   }
   System.out.println("計算 "+a+" 到 "+b+" 的總和是 "+sum);
  }
  else
  {
   if (a<b)
   {
    for (int i=a;i<=b;i++)
    {
     sum+=i;
    }
    System.out.println("計算 "+a+" 到 "+b+" 的總和是 "+sum);
   }
   else
   {
    System.out.println("您很無聊喔！結果是0呀..........！");
   }
  }
 }
}