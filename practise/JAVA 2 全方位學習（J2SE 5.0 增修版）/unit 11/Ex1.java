import java.io.*;
public class Ex1
{
 static int a,b,sum;
 static int inputCount=0;
 public static void main(String argv[])
 {
  Author.showAuthor();
  System.out.println("�Ш̧Ǥ��O��J�z��a��b��");
  InputStreamReader ir=new InputStreamReader(System.in);
  BufferedReader br=new BufferedReader(ir);
  do
  {
   try
   {
    if(inputCount==0)
    { 
     System.out.print("�z��J�� a �� = ");
     a=Integer.parseInt(br.readLine()); 
    }
    else
    {
     System.out.print("�z��J�� b �� = ");
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
   System.out.println("�p�� "+a+" �� "+b+" ���`�M�O "+sum);
  }
  else
  {
   if (a<b)
   {
    for (int i=a;i<=b;i++)
    {
     sum+=i;
    }
    System.out.println("�p�� "+a+" �� "+b+" ���`�M�O "+sum);
   }
   else
   {
    System.out.println("�z�ܵL���I���G�O0�r..........�I");
   }
  }
 }
}