import java.io.*;
public class Index
{
 static int max=0;
 public static void main(String argv[])
 { 
  Author.showAuthor();
  System.out.print("請輸入您要尋找的質因數範圍值 = ");
  InputStreamReader ir=new InputStreamReader(System.in);
  BufferedReader br=new BufferedReader(ir);
  try
  {
   max=Integer.parseInt(br.readLine());
  }
  catch(IOException e)
  {
   e.printStackTrace();
  }
  int integer1=0,integer2=0,integer3=0,integer4=0;
  System.out.print("Prime Number=");
  int i=0;
  for (i=1;i<=max;i++)
  { 
   if (i>=10)
   {
    integer1=i%2;
    integer2=i%3;
    integer3=i%5;
    integer4=i%7;
    if (integer1!=0 && integer2!=0 && integer3!=0 && integer4!=0)
     System.out.print(i+",");
   }  
   else
   {
     int aa,bb=0;    
     for (int k=2;k<=7;k+=2)
     {  
      aa=i/k;
      bb=i%k;
      if (aa==1 && bb==0)
      {
       System.out.print(i+","); 
      }
      if(k==2)
      {
       k--;
      } 
     } 
    }
  }
 }
}