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
  System.out.print("�п�J�z�ҭn�������Ƽƥ� = ");
  try
  {
   do
   {
    if (projectCount==0)
    {
     figure=Integer.parseInt(br.readLine());
     System.out.println("�z�`�@�n��� "+figure+" �ƥءI");
     System.out.println("\n�z��J���d��ȥu��b-2147483648 �� 2147483647 ��...");
    }
    else
    {
     int inputCount[]=new int[figure];
     long value=0;
     for (int i=0;i<figure;i++)
     {
      System.out.print("�п�J�z���� "+(i+1)+" �ӼƦr =");
      value=Long.parseLong(br.readLine());
      if(value>=2147483647 || value<=-2147483648)
      {
       System.out.println("\n===================================================");
       System.out.println("�z��J���ȥu��b-2147483648 �� 2147483647 ���d��...");
       System.out.println("�Э��s��J�z���ƭȧa�I�I�I");
       System.out.println("===================================================");
       i--;
      }
      else
      {
       inputCount[i]=(int)value;
      } 
     }
     System.out.println("\n\n\n\n\n");
     System.out.print("�z��J�� "+figure+" �ӼƦr���O���G");
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
     System.out.println("��I�̤j�ȴN�O = "+max); 
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